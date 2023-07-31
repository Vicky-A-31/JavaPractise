public class Factorial {
    public static void main(String[] args) {
        int num = 6,i = 1;
        int fact = 1;
        while(i <= num)
        {
            fact = fact * i;
            i ++;
        }
        System.out.println("Factorial of "+num+" is "+fact+".");
    }
}
