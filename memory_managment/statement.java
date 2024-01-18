public class statement
 {
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
    {
        if (b>a)   //true and false also
        {
            System.out.println("if executed");
            System.out.println("second line ");

            if (a==b)     // inner if
            {
              System.out.println("condition executed");
            }
           System.out.println("outside of if coindition"); 
        }
    }
}
}
