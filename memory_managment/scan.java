import java.util.Scanner;
public class scan 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);   // scanner - class , sc - object , new - class name

        System.out.println("enter the no. in integer ");
        int a = sc.nextInt();
        System.out.print(a+5);

        System.out.println("enter float no.");
        float f = sc.nextFloat();   // uses for float
        float y = sc.nextInt();
        System.out.println(y+4);
        
        double d = sc.nextDouble();  //uses for double

        sc.next();     //uses for string
        sc.nextLine();   //uses for string

    
        sc.next().charAt(0);  //uses for character
    
    }

   }

