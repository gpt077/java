class Employee{
	float salary = 40000;
	void incrementSalary()
	{
		System.out.println("The Employee incremented salary is: "+(salary+(salary*0.2)));
	}
	
}
class TemporaryEmp extends Employee
{
	double hike = 0.35;
	void incrementSalary()
	{
		System.out.println("The Employee incremented salary is: "+(salary+(salary*0.35)));

	}
}
class PermanentEmp extends Employee
{
	double hike = 0.5;
	void incrementSalary()
	{
		System.out.println("The Employee salary is: "+(salary+(salary*0.5)));
	}
}
public class AccountEmp
{
	public static void main(String args[])
	{
		Employee em = new Employee();
		em.incrementSalary();
	}
}