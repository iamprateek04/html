public class ifstm 
{
    public static void main(String[] args)
    {
        int x=90;
        int y=60;
        int z=20;
        if (x>y) 
        {
            System.out.println("aaa");
            if (z<y) 
            {
               System.out.println("bbb"); 
            }
            else if (x!=y)
            {
                System.out.println("ccc");
            }
        }
        if (x>z) 
        {
          System.out.println("ddd");
          if (x==y) 
          {
           System.out.println("eee"); 
          }
          else if (y!=z)
          {
            System.out.println("fff");
          }
        }
        else if (y>z)
        {
            System.out.println("ggg");
        }

        System.out.println("outer of if condition");

        if (x==90) 
        {
            if (y==60)
            {
                System.out.println("if inside if is true");
            }
            else if (z==20)
            {
                System.out.println("if inside if is false");
            }
            if (x!=y) 
            {
               System.out.println("nnn"); 
            }
        }
    }
}
