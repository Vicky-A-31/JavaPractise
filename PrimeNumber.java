public class PrimeNumber {
    public static void main(String[]args)
    {
        int table,m,checknum = 17;
        int flag;
        flag = 0;

        

        // m denotes the table limit 
        m = checknum/2;
        if(checknum == 0 || checknum == 1)
        {
            System.out.println(checknum+" is not a Prime Number.");
        }
        else if(checknum == 2)
        {
            System.out.println(checknum+" is a Prime Number.");
        }
        else
        {
            // tables incrementation
            for(table = 2; table <= m; table++)
            {
                if(checknum % table == 0)
                {
                    // only print the number is prime
                    System.out.println(checknum+" is not a Prime Number.");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            {
                // only print the number is not prime
                System.out.println(checknum +" is a Prime Number.");
            }
        }
    }
}
