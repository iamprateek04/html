//  << -- signed left shift (*)
//  >> -- signed right shift (/)
// >>> -- unsigned right shift , there is no unsigned left shift and no negative sign no.

public class shift 
{
  public static void main(String[] args) 
  {
    // int x=4;
    // System.out.println(x<<10); //4096

    // left/right shift doesnt apply on decimal no.

    // general formula for left shift operator
    // 2^n * integer(int) ; where n is 10th bit and integer =4

    // int y =2;
    // System.out.println(y<<3); //16
    // n is 3rd bit and integer =2

    // int u = 0b01000000000000000000000000000000;
    // System.out.println(u<<1);  //0

    // u is negative no. 1 is displaced from the front so we get ans zero as Msb is 1 so we ge negative no.
    // if we shift <<32 then we get zero due to cyclic, similarly <<33 means one , <<34 means 2 and so on

    // int z = 0b00000000000000000000000000000001;  //negative no. 
    // System.out.println(z<<31);

    // int k = 0b00000000000000000000000000000001;
    // System.out.println(k<<32);

    // int l = 0b00000000000000000000000000000001;
    // System.out.println(l<<34);


    // int g = 8;
    // System.out.println(g>>0);
    // System.out.println(g>>1);

    // general formula for right shift
    // (2^n)/2

    int x = 0b10000000000000000000000000000000;
    System.out.println(x>>0);
    System.out.println(x>>1);
    System.out.println(x>>2);
    System.out.println(x>>31);
    System.out.println(x>>32);  // similar to x>>0
    System.out.println(x>>33); //similar to x>>1

    // when shifting to the right the vacant bits get filled with 1 because we use compliment in negative no. 
    // and when shifting left vacant bits filled with 0 in right side.

}  
}
