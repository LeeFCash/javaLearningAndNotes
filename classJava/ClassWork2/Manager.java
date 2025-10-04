/*
Manager subclass
Additional attributes: department, bonus.
Override the toString () method to include department and bonus.

*/
/**
 * public class Manager subclass
 *
 * @author LeeCash
 */
public class Manager extends Employee {// used AI to help with @ <--
	/**
	 *make private Strings is department and bonus
	 */
	private String department;
	private String bonus;
	/**
	 * constructor Manager made 
	 *
	 * @param name      developer name                                                             
         * @param employeeId      developer id                                                         
         * @param salary      developer money made                                                     
         * @param department      manager department              
         * @param bonus       the bonus amount 
	 */
	Manager() {
	}
	Manager(String name, int employeeId, double salary, String department, String bonus){
		super(name,employeeId,salary);
		this.department = department;
		this.bonus = bonus;
	}
	// getters down 
	/**
	 * getters made 
	 *
	 * @return allVars
	 */
	public String getDepartment() {
		return department;
	}
	public String getBonus() {
		return bonus;
	}
	// setters down 
	/**
	 * setters made 
	 *
	 * @param setAllVars set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	// toStrings 
	/**
	 * toString made also override 
	 *
	 * @return info for manager 
	 */
	@Override
	public String toString() {
		String stringAll = super.getName()+" "+department+" "+bonus;
		return stringAll;
	}
}
