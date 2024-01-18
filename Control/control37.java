// Write a Java program that reads an positive integer and count the number of digits

public class control37 
{
    public static void main(String[] args) 
    {
        int d = 24681;
        int digits;

        if (d<0) 
        {
            System.out.println("negative no.");
        }

        if (d>=1 && d<10) 
        {
            digits = 1;
            System.out.println(digits+ " : no.of digits");
        }

        else if (d>=10 && d<100) 
        {
            digits = 2;
            System.out.println(digits+ " : no.of digits");
        }

        else if (d>=100 && d<1000) 
        {
            digits = 3;
            System.out.println(digits+ " : no.of digits");
        }

        else if (d>=1000 && d<10000) 
        {
            digits = 4;
            System.out.println(digits+ " : no.of digits");
        }

        else if (d>=10000 && d<100000) 
        {
            digits = 5;
            System.out.println(digits+ " : no.of digits");
        }
    }
}
