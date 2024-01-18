//  Write a program to find maximum between three numbers


public class control2 
{
    public static void main(String[] args) 
    {
        int a =47;
        int b =9;
        int c =101;

        if (a>=b && a>=c) 
        {
            System.out.println(a + "is greater");
        }

        else if (b>=a && b<=c) 
        {
            System.out.println(b + "is greater");
        }

        else if (c>=a && c>=b)
        {
            System.out.println(c+ "is greater");
        }

        else
        {
            System.out.println(a + "none1");
            System.out.println(b + "none2");
            System.out.println(c + "none3");
        }


    }
}
