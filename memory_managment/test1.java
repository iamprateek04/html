public class test1 
{
    int h =89; // instance variable it is created/stored in heap and outside main method
    public static void main(String[] args) 
    {
        int f = 89;  // local variable  , it is inside/stored the stack  of main method 
        test1 x = new test1();
        test1.A y = x.new A();
        A k= x.new A();
        test1.A.B h = k.new B();
        System.out.println(x.h);
        System.out.println(h.b);
        new non_static();
        x.prateek();

    }
     int prateek()
    {
        return 10;
    }
    class A
    {
        class B
        {
            int b =8;   //instance variable 
        }
        
    }
}
