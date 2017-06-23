/**
 * @author KateYeEumLee
 * @version 5.1
 */
public abstract class Employee {
	private String name;
	
	/**
	 * Default Constructor 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Overloaded Constructor
	 */
	public Employee(String name){
		setName(name);
	}

	/**
	 * Method to get the name of employee.
	 * @return the name in String.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set the name of employee.
	 * @param name the name to set
	 */
	public void setName(String name) {
		if(name!= null && name.trim().length() > 0){
			this.name = name;
		}
	}
	
	/**
	 * Method to calculate the monthly earnings.
	 */
	public abstract double calculateMonthlyEarnings();
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}