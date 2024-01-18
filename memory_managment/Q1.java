public class Q1 
{
    public static void main(String[] args) 
    {
        int x = 20;
        int y = 30;
        int z = 40;
        if (x>y) 
        {
            System.out.println("first if");
        }
        if (x<y) 
        {
            System.out.println("second if");
            if (x>y) 
            {
              System.out.println("third if");  
            }
            else if (z>y) 
            {
               System.out.println("first elif after third if"); 
            }
            if (y<z) 
            {
               System.out.println("fourth if"); 
            }
        }
        if (y>z) 
        {
            System.out.println("fifth if");
        }
        else if (z>x) 
        {
            System.out.println("second elif after fifth if");
        }
        System.out.println("outside of if body");
    }
}
