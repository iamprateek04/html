// Write a program to check whether a triangle is valid or not, 
// A triangle is valid if the sum of all the three angles is equal to 180 degrees


public class control30 
{
    public static void main(String[] args) 
    {
        int x = 60;
        int y = 80;
        int z = 65;
        int sum;
        sum = x + y + z;

        if (sum==180)
        {
            System.out.println(sum+ " :Triangle is valid");
        }

        else if (sum!=180)
        {
            System.out.println(sum+ " :Triangle is not valid");
        }
    }
}

