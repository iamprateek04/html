// while purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100.
// If quantity and price per item are input through the keyboard, write a program to calculate the total expenses.

public class control22 
{
    public static void main(String[] args)
    {
        int quantity = 55;
		int amount = 50;
		float expenses;
		if(quantity>100)
		{
			expenses = quantity * amount; 
			expenses = expenses-(expenses * 0.1f);
		}
		else
		{
			expenses = quantity * amount; 
		}		
		System.out.println("Total Expenses is : "+expenses);
    }
}
