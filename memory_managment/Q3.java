public class Q3 
{
    public static void main(String[] args) 
    {
        int a = 100;
        int b = 30;
        int c = 80;
        int d = 200;

        if (a>b) 
        {
            System.out.println("1st if , a is greater than b");

            if (a!=b && a!=c) 
            {
                System.out.println("2nd if , a is not equal to b and c");

                if (d>a || c<d) 
                {
                    System.out.println("3rd if , d is greater and c is lesser");

                    if (b<d != c>b) 
                    {
                        System.out.println("4th if , b is lesser & c is greater");

                        if (a==b) 
                        {
                            System.out.println("5th if , a is equal to b");
                        }
                        
                        else if (a!=b) 
                        {
                            System.out.println("a is not equal to b");
                        }

                        System.out.println("out of else if");
                    }

                    else if (b<c || c<d) 
                    {
                        System.out.println("b is lesser and d is greater");
                    }
                }
                    else if (a==d) 
                    {
                        System.out.println("a is equal to d");
                    }
            }
            if (a>b) 
            {
                System.out.println("6th if true");
            }
        }
        if (c<d) 
        {
            System.out.println("7th if , c is less than d");
        }
        System.out.println("out of if body");
    }
}
