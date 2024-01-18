// The marks obtained by a student in 5 different subjects are input through the keyboard. The student gets a division as per the following rules: Write a program to calculate the division obtained by the student
// • Percentage above or equal to 60 - First division
// • Percentage between 50 and 59 - Second division
// • Percentage between 40 and 49 - Third division
// • Percentage less than 40 – Fail

public class control25 
{
    public static void main(String[] args) 
    {
        int physics = 65;
        int history = 54;
        int maths = 41;
        int chemistry = 56;
        int english = 19;
        int total = physics+maths+english+history+chemistry;
        float percentage = total/5;

        if (percentage>=60) 
        {
            System.out.println("First division");
        }
        else if (percentage<=59 && percentage>=50) 
        {
            System.out.println("Second division");
        }
        else if (percentage<=49 && percentage>=40) 
        {
            System.out.println("Third division");
        }
        else if (percentage<40) 
        {
            System.out.println("Fail");
        }
    }
}
