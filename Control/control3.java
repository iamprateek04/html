// Write a program to check whether a number is negative, positive or zero

public class control3 
{
    public static void main(String[] args) 
    {
        int x = 21;
        float y = 31.45f;
        int z = 1;

        // int x = -21;
        // float y = -31.45f;
        // int z = -1;

        // int x = 0;
        // float y = 0f;
        // int z = 0;


        if (x>0 && y>0 && z>0) 
        {
            System.out.println("no. is positive");
        }

        else if (x<0 && y<0 && z<0)
        {
            System.out.println("no. is negative");
        }

        else if (x==0 && y==0 && z==0)
        {
            System.out.println("no.is zero");
        }
    }
}
