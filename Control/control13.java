// Write a program to count total number of notes in given amount


public class control13 
{
    public static void main(String[] args) 
    {
        int amount = 5478;
        int n1,n5,n10,n20,n50,n100,n200,n500,n2000;
        n1=n5=n10=n20=n50=n100=n200=n500=n2000=0;
        if (amount>=2000) 
        {
            n2000 = amount/2000;
            amount -= n2000*2000;
            System.out.println(n2000+ "  X 2000");
        }
        if (amount>=500) 
        {
            n500 = amount/500;
            amount -= n500*500;
            System.out.println(n500+ "  X 500");
        }
        if (amount>=200) 
        {
            n200 = amount/200;
           amount -= n200*200; 
           System.out.println(n200+ "  X 200");
        }
        if (amount>=100) 
        {
            n100 = amount/100;
            amount -= n100*100;
            System.out.println(n100+ "  X 100");
        }
        if (amount>=50)
        {
            n50 =amount/50;
            amount -= n50*50;
            System.out.println(n50+ "  X 50");
        }
        if (amount>=20) 
        {
           n20 = amount/20;
            amount -= n20*20;
           System.out.println(n20+ "  X 20"); 
        }
        if (amount>=10) 
        {
            n10 = amount/10;
            amount -= n10*10;
            System.out.println(n10+ "  X 10");
        }
        if (amount>=5) 
        {
            n5 = amount/5;
            amount -= n5*5;
            System.out.println(n5+ "  X 5");
        }
        if (amount>=1) 
        {
            n1 = amount/1;
            amount -= n1*1;
            System.out.println(n1+ "  X 1");
        }
    }
}
