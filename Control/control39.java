// Write a Java program to create a simple calculator

public class control39 
{
    public static void main(String[] args) 
    {
        int a = 20;
        int b = 10;
        int result;
        String operation = "*";

        if (operation=="+") 
        {
            result = a + b;
            System.out.println(result);
        }

        else if (operation=="-") 
        {
            result = a - b;
            System.out.println(result);
        }

        else if (operation=="*") 
        {
            result = a * b;
            System.out.println(result);
        }

        else if (operation=="/") 
        {
            result = a / b;
            System.out.println(result);
        }

    }
}
