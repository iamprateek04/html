// Write a program to input basic salary of an employee and calculate its Gross salary
// • Basic Salary <= 10000 : HRA = 20%, DA = 80%
// • Basic Salary <= 20000 : HRA = 25%, DA = 90%
// • Basic Salary > 20000 : HRA = 30%, DA = 95%



class control20
{
	public static void main(String[] args)
	{
		
		int basicsalary = 18000;
		float hra,da;
		if(basicsalary<=10000)
		{			
			hra = basicsalary*0.2f;
			da = basicsalary*0.8f;
		}
		else if(basicsalary<=20000)
		{
			hra = basicsalary*0.25f;
			da = basicsalary*0.9f;
		}
		else 
			 
		{
			hra = basicsalary*0.3f;
			da = basicsalary*0.95f;
		}

		System.out.println("Gross Salary : "+(basicsalary+hra+da));
	}
}