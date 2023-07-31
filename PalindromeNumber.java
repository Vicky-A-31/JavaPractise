public class PalindromeNumber {
    public static void main(String[]args)
    {
        int n = 123321,temp,rem,sum = 0;
        temp = n;
        while(n > 0)
        {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        if(temp == sum)
        {
            System.out.println(temp + " is a Palindrome Number.");
        }
        else{
              System.out.println(temp + " is not a Palindrome Number.");
        }
    }
}
