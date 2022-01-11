package Dec14;

class Employee
{
	private String fname;
	private String lname;
	private double salary;
	
	Employee()         //Constructor
	{
	fname=null;
	lname=null;
	if(salary>=0)
	{
		salary=0.0;
	}
	}
	
	//getter setter methods
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
public class EmployeeTest {

	public static void main(String[] args)
	{
		Employee e=new Employee();
		Employee e2=new Employee();
		e.setFname("Sahil ");
		e.setLname("Vyas");
		e.setSalary(400000.0);
		
		e2.setFname("John ");
		e2.setLname("Doe");
		e2.setSalary(600000.0);
		
		System.out.println("Employee "+e.getFname()+e.getLname()+" , Salary = "+e.getSalary());
		System.out.println("Employee "+e2.getFname()+e2.getLname()+" , Salary = "+e2.getSalary());
		
		System.out.println("\n\nAfter salary raised\n");
		System.out.println("Employee "+e.getFname()+e.getLname()+" , Salary = "+e.getSalary()*1.1);
		System.out.println("Employee "+e2.getFname()+e2.getLname()+" , Salary = "+e2.getSalary()*1.1);
		
		
	}

}
