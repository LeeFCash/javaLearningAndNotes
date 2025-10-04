public class Company {
	public double calculateAverageSalary(Employee[] employees) { // gets the employee data and makes a var for totol employee in the company 
        double sum = 0; // make sum var 0
        for (Employee emp : employees) { // a for loop to add all the Salarys to get sum
            sum += emp.getSalary();
        }
        double avg = sum / employees.length; // make var avg by sum divided by the totol employees the company has 
        return avg; // not sure but I think this does nothing in this context but it would normally make the var usable publicly in this script
	}
}
