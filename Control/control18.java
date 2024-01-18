// Write a program to calculate profit or loss in java



public class control18 
{
    public static void main(String[] args) 
    {
        double cost_price = 1500;
        double selling_price = 1870;

        if (cost_price-selling_price>0) 
        {
            System.out.println((cost_price-selling_price)+ " Loss");
        }
        else if (cost_price-selling_price<0)
        {
            System.out.println((selling_price-cost_price)+ " Profit");
        }
        else 
        {
            System.out.println("no profit or loss");
        }
    }
}
