// The current year and the year in which the employee joined the organization are entered through the keyboard.
// If the number of years for which the employee has served the organization is greater than 3 then a bonus of Rs. 2500/-
// is given to the employee. If the years of service are not greater than 3, then the program should do nothing

public class control23 
{
    public static void main(String[] args) 
    {
        int current_year = 2023;
        int joined_year = 2020;

        if (current_year - joined_year >=3) 
        {
            System.out.println("Bonus of rs 2500/- ");
        }
        else if (current_year -joined_year <3) 
        {
            System.out.println("No bonus");
        }
    }
}
