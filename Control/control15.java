// Write a program to input all sides of a triangle and check whether triangle is valid or not


public class control15 
{
    public static void main(String[] args) 
    {
        int x =70;
        int y =30;
        int z =80;

        if ((x+y>z && y+z>x && z+x>y) || x+y+z==180) 
        {
            System.out.println("Triangle is valid");
        }
        else
        {
            System.out.println("not valid triangle");
        }
    }
}
