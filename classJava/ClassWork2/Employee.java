/*
Create the Base Class: Employee
Define attributes common to all employees, such as:
	name (String)
	employeeID (int)
	salary (double or float)
Include:
	A constructor to initialize the attributes.
	Getter and setter methods for each attribute.
	A toString() method that prints employee details.
*/
/**
 * @author LeeCash
 **/
public class Employee {// I used AI to help with the @ <-- stuff 
	/**
	 *make private String, int and double is name, employeeId and salary
	 */
	private String name;
	private int employeeId;
	private double salary;
	/**
	 * constructor Employee made 
	 *
	 * @param name the employee name
	 * @param employeeId the employee id
	 * @param salary the employee salary
	 */
	Employee() {
	}
	Employee(String name, int employeeId, double salary){
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	// getters down 
	/**
	 * getters made 
	 *
	 * @return the employee name, id and salary
	 */
	public String getName() {
		return name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public double getSalary() {
		return salary;
	}
	// setters down 
	/**
	 * setters made 
	 *
	 * @param this set them when called 
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	// toStrings 
	/**
	 * toString made 
	 *
	 * @return name
	 */
	public String toString() {
		String stringName = name;
		return stringName;
	}
}
