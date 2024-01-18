public class non_static 
{
    public static void main(String[] args) 
    {
        non_static h = new non_static();
        new non_static();
        new joy();
        h.fgh();   //calling   ( if it is static then fgh(); will written )
        joy.boy();

    }
    int fgh()  //it is non static so [ h.fgh ] will write and 
    //if we write static in front of int fgh() then the calling will written [ fgh(); ] only
    {
        return 0;
    }
}
class joy
{
    static int boy ()
    {
        int x =45;
        System.out.println(x);
        return 0;
    }
}

    

