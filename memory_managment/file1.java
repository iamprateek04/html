public class file1 
{
    public static void main(String[] args)
    {
        pqr();         //calling data
        file1.pqr();
        xyz();
        file2.abc();
    }
    static int pqr()         //create static method outside main
    //  static return_datatype name_of_method()

    {
        System.out.println("pqr executed");
        return 0;
    }
    static int xyz()
    {
        System.out.println("xyz executed");
        return 0;
    }
    
}
 class file2
{

    static int abc()
    {
        System.out.println("file2 executed");
        return 0;
    }
}

