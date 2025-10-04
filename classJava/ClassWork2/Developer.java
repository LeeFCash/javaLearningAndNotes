/*
Developer subclass
	Additional attributes: programmingLanguage, level (e.g., Junior, Senior).
	Override the toString () method to include programming details.

*/
/**
 * public class Developer subclass
 * @author LeeCash
 */
public class Developer extends Employee {// used AI to help with @ <--
	/**
	 *make private Strings is programmingLange and level
	 */
	private String programmingLanguage;
	private String level;
	/**
	 * constructor Developer made 
	 *
	 * @param name      developer name
	 * @param employeeId      developer id
	 * @param salary      developer money made
	 * @param programmingLanguage      developer what they use like java or javascript
	 * @param level      developer level
	 */
	Developer() {
	}
	Developer(String name, int employeeId, double salary, String programmingLanguage, String level){
//		super(name,employeeId,salary,department,bonus);
		super(name,employeeId,salary);
		this.programmingLanguage = programmingLanguage;
		this.level = level;
	}
	// getters down 
	/**
	 * getters made 
	 *
	 * @return pL and level
	 */
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public String getLevel() {
		return level;
	}
	// setters down 
	/**
	 * setters made 
	 *
	 * @param pLAndLevel and level
	 */
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	// toStrings 
	/**
	 * toString made also override 
	 *
	 * @return info strings
	 */
	@Override
	public String toString() {
		String stringAll = super.getName()+" "+programmingLanguage+" "+level;
		return stringAll;
	}
}
