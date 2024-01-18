// Write a program to input angles of a triangle and check whether triangle is valid or not


public class control14 
{
    public static void main(String[] args) 
    {
        int angle_x = 90;
        int angle_y = 50;
        int angle_z = 40;

        if (angle_x + angle_y + angle_z == 180 && angle_x>0 && angle_y>0 && angle_z>0) 
        {
            System.out.println("triangle is valid");
        } 
        else if (angle_x + angle_y + angle_z !=180) 
        {
            System.out.println("not valid triangle");
        }
    }
}
