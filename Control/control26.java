public class control26 
{
    public static void main(String[] args) 
    {
        int age = 26;
        String gender = "female";
        String status ="unmarried";

        if (status=="married" && (gender=="male" || gender=="female")) 
        {
            System.out.println("Driver insured Married/Male");
        }

        else if (status=="unmarried" && gender=="male" && age>30) 
        {
            System.out.println("Driver insured M/UM/30+");
        }

        else if (status=="unmarried" && gender=="female" && age>25) 
        {
            System.out.println("Driver insured UM/F/25+");
        }
    }
}
