import java.util.ArrayList;
/*
 Demonstrate Polymorphism
Create an ArrayList of Employee references.
Store objects of Employee, Manager, and Developer (or your chosen subclasses).
Use a loop to each object and observe how each subclass overrides the toString.
Main Program Requirements
In the main() method:
Create at least one object of Employee, Manager, and Developer.
Call their methods to test inheritance and method overriding.
Demonstrate polymorphism using the collection of employees

*/
/**
 * @author LeeCash
 */
public class Main {
	/**
	 * @param args command-line 
	 */
	public static void main(String[] args) {// used AI help with javadoc @ <-- and some to help with forloop like the order of args 
		Employee ep1 = new Employee("Lee",1,30.00);
		Developer dev1 = new Developer("Lee2",1,30.00,"java","pro");
		Manager m1 = new Manager("Lee3",1,30.00,"something","more money");
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(ep1);
		employees.add(dev1);
		employees.add(m1);
		for(Employee ep : employees) {
			System.out.println(ep.toString()+"     get id and salary -> "+ep.getEmployeeId()+" "+ep.getSalary());
		}
	}
}
