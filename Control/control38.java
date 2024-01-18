// Write a java program that accepts three numbers and check if numbers are in "increasing" or "decreasing" order

public class control38 
{
    public static void main(String[] args) 
    {
        int x = 47;
        int y = 58;
        int z = 67;

        if (x<y && y<z) 
        {
            System.out.println("no. is in increasing order");
        }

        else if (x>y && y>z) 
        {
            System.out.println("no. is in decreasing order");
        }
        else
        {
            System.out.println("neither increasing nor decreasing");
        }
    }
}
