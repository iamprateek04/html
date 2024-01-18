

public class control19 
{
    public static void main(String[] args) 
    {
        int physics =95;
        int chemistry = 77;
        int biology = 64;
        int mathes = 82;
        int computer = 54;
        int total = physics + chemistry + biology + mathes + computer;
        float percentage = total/5;

        System.out.println(total+ " :total");
        System.out.println(percentage+ " :percentage");

        if (percentage>=90) 
        {
            System.out.println("Grade A");
        }
        else if (percentage>=80) 
        {
            System.out.println("Grade B");
        }
        else if (percentage>=70) 
        {
            System.out.println("Grade C");
        }
        else if (percentage>=60) 
        {
            System.out.println("Grade D");
        }
        else if (percentage>=40) 
        {
            System.out.println("Grade E");
        }
        else if (percentage<40) 
        {
            System.out.println("Grade F");
        }
    }
}
