public class test 
{
    public static void main(String[] args) 
    {
        int a = 0b11101;
        System.out.println(a);

        int b = 0b0000000010010101;
        System.out.println(b);


        // (2^31 + 2^2 + 2^1) - 2^32 
        int c = 0b10000000000000000000000000000110;       
        System.out.println(c);

        int d = 0b10001100100100000100000010010100;
        System.out.println(d);

        long x = 0b000000000000000000000000000000010000000000000000000100000110100l; 
        System.out.println(x);

        int e = 25;
        System.out.println(Integer.toBinaryString(e));

        System.out.println(Integer.toBinaryString(118));  // without taking any address and dtatype

        int f = -30;
        System.out.println(Integer.toBinaryString(f));



        
        byte p = 0b00001010;
        System.out.println(p);

        byte q = 0b01111111;      // max no. stored in byte
        System.out.println(q);

        byte z = 0b00000000100110;
        System.out.println(z);

        byte r = 6;                      //max range is 127 for byte 
        System.out.println(Integer.toBinaryString(r));

        byte s = -7;
        System.out.println(Integer.toBinaryString(s));




        short t = 0b110101;
        System.out.println(t);

        // short q = 9;
        // System.out.println(Integer.toBinaryString(q));

        short j = -9;
        System.out.println(Integer.toBinaryString(j));

        short u = 0b0111111111111111; // max no. stored in short 
        System.out.println(u); 

        // long l =9;
        // System.out.println(Integer.toBinaryString(l));
        

    }
}
