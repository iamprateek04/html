public class control32 
{
    public static void main(String[] args) 
    {
        int length = 5;
        int breadth = 4;
        int width = 3;

        int area = length*breadth;
        int perimeter = 2*(length + width);
        
        System.out.println(area);
        System.out.println(perimeter);

        if (area>perimeter) 
        {
            System.out.println("area of rectangle is greater than its perimeter");
        }

        else if (area<perimeter) 
        {
            System.out.println("perimeter of rectangle is greater than its area");
        }
    }
}
