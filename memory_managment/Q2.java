public class Q2 
{
    public static void main(String[] args) 
    {
        int a = 51;
        int b = 91;
        int c = 13;
        int d = 85;

        if (a==b) 
        {
            System.out.println("1st if , a is not equal to b");
        }
        if (a<b) 
        {
            System.out.println("2nd if , a is less than b");

            if (b>a) 
            {
                System.out.println("3rd if , b is greater than a");
            }
            else if (c<b) 
            {
                System.out.println("1st elif , c is less than b");
            }
        } 
        if (c>a) 
        {
            System.out.println("4th if , c is greater htan a");
        }
        else if (a<b)
        {
            System.out.println("2nd elif , a is less than b");
            if (a<=b) 
            {
                System.out.println("5th if , a is less than or equal to b");
            }
            if (b!=c) 
            {
                System.out.println("6th if , b is not equal to c");

                if (d==b) 
                {
                    System.out.println("7th if , d is equal to b");
                }
                else if (c!=a) 
                {
                    System.out.println("3rd elif , c is not equal to a");
                }
            }
        }
    }
}
