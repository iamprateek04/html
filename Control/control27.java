public class control27 
{
    public static void main(String[] args) 
    {
        String gender = "female";
        String qualification = "post-graduate" ;
        int year_of_service = 11;
        int salary;

        if (gender=="male" && year_of_service>=10 && qualification=="graduate") 
        {
            salary = 15000;
            System.out.println(salary);
        }

        else if (gender=="male" && year_of_service>=10 && qualification=="graduate" ||gender=="male" && year_of_service<10 && qualification=="post-graduate"
        || gender=="female" && year_of_service<10 && qualification=="post-graduate")
        {
            salary = 10000;
            System.out.println(salary);
        }

        else if (gender=="male" && year_of_service<10 && qualification=="graduate") 
        {
            salary = 7000;
            System.out.println(salary);
        }

        else if (gender=="female" && year_of_service>=10 && qualification=="post-graduate") 
        {
            salary = 12000;
            System.out.println(salary);
        }

        else if (gender=="female" && year_of_service>=10 && qualification=="graduate") 
        {
            salary = 9000;
            System.out.println(salary);
        }

        else if (gender=="female" && year_of_service<10 && qualification=="graduate")
        {
            salary = 6000;
            System.out.println(salary);
        }

    }
}
