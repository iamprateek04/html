// Write a program to input week number and print week day


public class control11 
{
    public static void main(String[] args) 
    {
        int a = 4;
        // int a = 9;

        if (a==1) 
        {
           System.out.println("sunday"); 
        } 
        else if (a==2) 
        {
            System.out.println("monday");
        }
        else if (a==3)
        {
            System.out.println("tuesday");
        }
        else if (a==4)
        {
            System.out.println("wednesday");
        }
        else if (a==5)
        {
            System.out.println("thursday");
        }
        else if (a==6)
        {
            System.out.println("friday");
        }
        else if (a==7)
        {
            System.out.println("saturday");
        }
        else
        {
            System.out.println("enter no. b/w 1 to 7");
        }
    }
}
