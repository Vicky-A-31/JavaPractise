import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
    public static void main(String[] args) throws IOException{
        int arr[] = new int[] {12,43,65,78,83,90,102,124,145,150,169};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Key for Search : ");
        int key = Integer.parseInt(br.readLine());
        boolean flag = true;

        int start=0, end=arr.length-1;
        System.out.println("Array Size is : "+arr.length);
        while(start<=end)
        {
            int mid = (start+end)/2;
            System.out.println("middle element : "+arr[mid]);
            if(arr[mid]==key)
            {
                System.out.println("The Key is Found at "+mid+"th Position.");
                flag = false;
                break;
            }
            if(arr[mid]>key)
            {
                end = mid - 1;
            }
            if(arr[mid]<key)
            {
                start = mid + 1;
            }
        }

        if(flag == true)
        {
            System.out.println("The Key is not Found.");
        }
    }
}
