// Write a Java program that accepts three numbers and check All numbers are equal or not

public class control36 
{
    public static void main(String[] args) 
    {
        int a = 15;
        int b = 69;
        int c = 15;

        if (a==b && b==c && c==a) 
        {
            System.out.println("All numbers are equal");
        }
        else if (a==b || a==c || b==c) 
        {
            System.out.println("2 are equal 1 is different");
        }
        else
        {
            System.out.println("All are different no.");
        }
    }
}
