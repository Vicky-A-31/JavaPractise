
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Linearsearch {
    public static void main(String[] args) throws IOException {
        int arr[] = new int[] {86,35,51,28,92,19,98,60,72,43,67,98};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Key for Search : ");
        int key = Integer.parseInt(br.readLine());
        boolean flag = true;
        
        for(int i=0; i<arr.length; i++)
        {
            if(key==arr[i])
            {
                System.out.println("The key is found at "+i+"th position.");
                flag = false;
            }
        }
        if(flag==true)
        {
            System.out.println("The Key is not found.");
        }
    }
}
