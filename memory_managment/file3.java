public class file3 
{
    int x = 45;
    int y =90;
    
    public static void main(String[] args) 
    {
        int x =45;
        int y =90;
        if (x<0) 
        {
            xcv();
        }
        
        System.out.println(x);
        System.out.println(y);
    }
    static int xcv ()
    {
        System.out.println("my name is xcv");
        file3 x =new file3();    //refrence variable as it has same class name with x , refrencing the address of object
        System.out.println(x.x);
        System.out.println(x.y);
        return 0;
    }
}
