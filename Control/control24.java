// If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of basic salary.
// If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
// If the employee's salary is input through the keyboard write a program to find his gross salary.

public class control24 
{
    public static void main(String[] args) 
    {
        int basic_salary = 1200;
        float HRA ,DA;
        System.out.println(basic_salary + " = Basic salary");

        if (basic_salary<1500) 
        {
            HRA = basic_salary * 0.10f;
            DA = basic_salary * 0.90f;
            System.out.println(HRA+ " = HRA");
            System.out.println(DA+ " =DA");
        }
        else
        {
            HRA =500;
            DA = basic_salary * 0.98f;
            System.out.println(HRA+ " = HRA");
            System.out.println(DA+ " = DA");
        }
        
        System.out.println((basic_salary + HRA + DA) + " = Gross Salary");
    }
}
