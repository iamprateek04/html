// Write a program to find all roots of a quadratic equation

// Roots of a quadratic equation are determined by the following formula: x = [-b±(√b*b-4ac)]/2a



public class control17 
{
    public static void main(String[] args) 
    {
        int a =4;
        int b =7;
        int c =2;
        double d = (b*b)-4*a*c;
        double X = Math.sqrt(d);
        double e = 2*a;

        if (X>0) 
        {
           double root1 = (X-b)/e;
           double root2 = (-X-b)/e; 
           System.out.println( "roots are");
           System.out.println(root1);
           System.out.println(root2);
        }


    }
}
