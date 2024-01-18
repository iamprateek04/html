// Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
// equilateral = all sides equal 
// isosceles = only 2 side equal
// scalene = all 3 sides unequal



public class control16 
{
    public static void main(String[] args) 
    {
        int x =50;
        int y =60;
        int z =70;

        if (x==y && y==z) 
        {
            System.out.println("Equilateral Triangle");   
        }
        else if (x==y || y==z || z==x) 
        {
            System.out.println("Isosceles Triangle");
        }
        else if (x!=y && y!=z && z!=x) 
        {
            System.out.println("Scalene Triangle");
        }
    
    }
}