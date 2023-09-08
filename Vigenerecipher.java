import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Vigenerecipher{
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Plain Text :");
        String PT = br.readLine();
        System.out.println("Enter the Key :");
        String KEY = br.readLine();
        PT = PT.toUpperCase();
        KEY = KEY.toUpperCase();
        
        // generate key for plain text length
        int x = PT.length();
        for(int i=0; ;i++){
            if(x == i){
                i = 0;
            }
            if(x == KEY.length()){
                break;
            }
            KEY += KEY.charAt(i);
        }
        
        
        char letters[] = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    

        int ptNumber[] = new int[PT.length()];
        for(int i=0; i<PT.length(); i++){
            for(int j=0; j<letters.length; j++){
                if(PT.charAt(i)==letters[j]){
                    ptNumber[i] = j;
                }
            }
            
        }

        int keyNumber[] = new int[KEY.length()];
        for(int i=0; i<KEY.length(); i++){
            for(int j=0; j<letters.length; j++){
                if(KEY.charAt(i)==letters[j]){
                    keyNumber[i] = j;
                }
            }
            
        }

        // Encryption for Vignere Cipher
        int[] ctNumber = new int[ptNumber.length];
        for(int i=0; i<ptNumber.length; i++){
            ctNumber[i] = (ptNumber[i] + keyNumber[i]) % 26;
        }

        String CT = "";
        for(int i=0; i<ctNumber.length; i++){
            int j = ctNumber[i];
            CT += letters[j];    
        }


        // Decryption for Vignere Cipher
        int[] decode = new int[ctNumber.length];
        for(int i=0; i<ctNumber.length; i++){
            int j = ctNumber[i] - keyNumber[i];
            if(j<0){
                decode[i] = (26 + j) % 26;
            }
            else{
                decode[i] = (j) % 26;
            }
        }

        String OriginalMsg = "";
        for(int i=0; i<decode.length; i++){
            int j = decode[i];
            OriginalMsg += letters[j];    
        }
        
        System.out.println("---------------------After Encryption----------------------");
        System.out.println("Plain Text is "+PT);
        System.out.println("Cipher Text is "+CT);
        System.out.println("---------------------After Decryption----------------------");
        System.out.println("Original Message is "+OriginalMsg);
    }
}