import java.util.Arrays;

public class Variable {
    public static void main(String[]args){
        int a = 10;
        int b= a;
        System.out.println(a+" "+b);
        b = 20;
        System.out.println(a+" "+b);

        int ar[] = {1,2,3,4,5};
        int br[] = ar;
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(br));

        br[2] = 222;
       System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(br)); 
    }
}
