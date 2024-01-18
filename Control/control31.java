// Find the absolute value of a number entered through the keyboard
// absolute no. is positive of same negative no.
//  -78 = + 78


public class control31 
{
    public static void main(String[] args) 
    {
        int x = -47;
        int y = 95;
        int z;
        // int y = (-1) * x;
        // System.out.println(y);
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(y));

        if (x<0) 
        {
            z = (-1)*x ;
            System.out.println(z);
        }
    }
}
