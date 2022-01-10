package Oops;

public class Employee {

	int id;
	String name;
	String email;
	Float salary;
	
	public Employee()
	{
	}
	
		public Employee(int id, String name, String email, Float salary)
		{
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		
	}
	
	public Employee(int id) {
		this.id = id;
	}
	 
	public String toString() {
		String str = "(" + id + "," + name + "," + email + "," + salary + ")";
				return str;
	}
	public static void main (String[] args) {
		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "Abdul";
		e1.email = "asdfghjkl";
		e1.salary = 45.34f;
		System.out.println(e1.toString());
		
		Employee e2 = new Employee(102, "abdul", "asdfghjl", 45.67f);
		System.out.println(e2.toString());
		System.out.println(e2.toString());
		;
	}
}
