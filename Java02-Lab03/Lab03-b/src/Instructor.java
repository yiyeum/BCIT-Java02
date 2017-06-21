/**
 * @author KateYeEumLee
 * @version 3.2
 */
public class Instructor extends Person {
	private double hourlyWage;
	
	/**
	 * Default constructor
	 */
	public Instructor() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Overloaded Constructor
	 * @param firstName
	 * @param lastName
	 * @param emailAddress
	 * @param schoolID
	 */
	public Instructor(String firstName, String lastName, String emailAddress, String schoolID, double hourlyWage) {
		super(firstName, lastName, emailAddress, schoolID);
		setHourlyWage(hourlyWage);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method to get the hourly wage.
	 * @return the hourlyWage as double.
	 */
	public double getHourlyWage() {
		return hourlyWage;
	}

	/**
	 * Method to set the hourly wage.
	 * @param hourlyWage the hourlyWage to set
	 */
	public void setHourlyWage(double hourlyWage) {
		if(hourlyWage > 0.00){
			this.hourlyWage = hourlyWage;
		}
	}
	
	

}
