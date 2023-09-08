import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CeaserCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Plain Text :");
        String PT = br.readLine();
        PT = PT.toUpperCase();
        
        char letters[] = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        int ptNumber[] = new int[PT.length()];
        for(int i=0; i<PT.length(); i++){
            for(int j=0; j<letters.length; j++){
                if(PT.charAt(i) == letters[j]){
                    ptNumber[i] = j;
                }
            }
        }

        int len = ptNumber.length;
        int[] encode = EncryptNumber(ptNumber,len);
        char[] CT = Encryption(encode,len,letters);
        int[] decode = DecryptNumber(encode,len);
        char[] OriginalMsg = Decryption(decode,len,letters);

        System.out.println("---------------------After Encryption----------------------");
        System.out.println("Plain Text is "+PT);
        System.out.print("Cipher Text is ");
        for(int i=0; i<CT.length; i++){
            System.out.print(CT[i]);
        }
        
        System.out.println();
        System.out.println("---------------------After Decryption----------------------");
        System.out.print("The Original Message is ");
        for(int i=0; i<OriginalMsg.length; i++){
            System.out.print(OriginalMsg[i]);
        }
    }

    static int[] EncryptNumber(int[] encode,int x){
        
        int[] ctNumber = new int[x];
        for(int i=0; i<x; i++){
            ctNumber[i] = (encode[i] + 3) % 26;
        }
        return ctNumber;
    }

    static char[] Encryption(int[] encode,int x,char[] letters){
        
        char[] array = new char[x];
        int a;
        for(int i=0; i<x; i++){
            a = encode[i]; 
            array[i] = letters[a];
        }
        return array;
    }

    static int[] DecryptNumber(int[] decode,int x){
        
        int[] ctNumber = new int[x];
        int j;
        for(int i=0; i<x; i++){
            j = decode[i] - 3;
            if(j<0){
                ctNumber[i] = (26+j) % 26;
            }
            else{
                ctNumber[i] = (j) % 26;
            }
        }
        return ctNumber;
    }

    static char[] Decryption(int[] decode,int x,char[] letters){
        
        char[] array = new char[x];
        int a;
        for(int i=0; i<x; i++){
            a = decode[i]; 
            array[i] = letters[a];
        }
        return array;
    }

}
