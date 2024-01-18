// If the ages of Ram, Shyam and Ajay are input through the keyboard,
//  write a program to determine the youngest of the three

public class control29 
{
    public static void main(String[] args) 
    {
        int age1 = 21;
        int age2 = 14;
        int age3 = 17;

        if (age1<age2 && age1<age3) 
        {
            System.out.println("Ram is youngest");
        }

        else if (age2<age1 && age2<age3) 
        {
            System.out.println("shyam is youngest");
        }

        else if (age3<age1 && age3<age2) 
        {
            System.out.println("ajay is youngest");
        }
    }
}
