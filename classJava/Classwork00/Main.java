public class Main {
	public static void main(String[] args) {
		//Employee employee1 = new Employee("Lee",77,77.77);
		//Employee employee2 = new Employee("Lee",77,77.77);
		//Employee employee3 = new Employee("Lee",77,77.77);
		//I did use ai to help understand how to do the work/fix errors when I don't understand
		int index = 0; // for the arrey shows at any given time
		int index2 = 1; // for the arrey shows at any given time
		int index3 = 2; // for the arrey shows at any given time
		Employee[] allEmployees = {new Employee("Lee",77,76.76), new Employee("Franklin",77,77.77), new Employee("Cash",77,77.78)}; // makes all employees
		Company company = new Company(); // gets the uses of Company class
	        double avg = company.calculateAverageSalary(allEmployees);// gets the avg from Company
		System.out.println(allEmployees[index].getName()+" "+allEmployees[index].getId()+" "+allEmployees[index].getSalary()+"\n"+allEmployees[index2].getName()+" "+allEmployees[index2].getId()+" "+allEmployees[index2].getSalary()+"\n"+allEmployees[index3].getName()+" "+allEmployees[index3].getId()+" "+allEmployees[index3].getSalary()); // display all Employees 
		System.out.println("avg is = "+avg); // shows avg 
		//employee.setName("LeeCash");
		//employee.setId(77);
		//employee.setSalary(77.77);
		//employee.setId(12);
		/* help notes
		 for(student s : students2){}
		 students[2] = new Student(name, age, score);
		 public static double calaculateAvg(student[] students){
		 double sum = 0;
		 for int i = 0; i < students.length; i++
		 sum += students[i].getScore();
		 }
		 double average = sum / students.length;
		 return average;
		 }
		 */
	}
}
