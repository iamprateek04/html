public class file 
{
    public static void main(String[] args) 
    {
        file8.vbn();
    }
}
class file8
{
    static int vbn()
    {
        System.out.println("this is vbn");
        vbn();
        System.out.println("hello");
        return 0;
    }
}
// getting same result (this is vbn) due to stack overflow
// recursion - method inside calling another method
