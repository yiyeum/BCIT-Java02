/**
 * @author KateYeEumLee
 * @version 1.2
 */
public class Member {
	private String firstName;
	private String lastName;
	private int month;
	private int year;
	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int CURRENT_YEAR = 2016;
	public static final String DEFAULT_NAME = "Java";
	
	/**
	 * Default Constructor
	 */
	public Member() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Overloaded Constructor
	 * @param firstName First name of member.
	 * @param lastName Last name of member.
	 * @param month joined month of member.
	 * @param year joined year of member.
	 */
	public Member(String firstName, String lastName, int month, int year) {
		setFirstName(firstName);
		setLastName(lastName);
		setMonth(month);
		setYear(year);
	}

	/**
	 * Method to get the first name of member.
	 * @return the firstName in string.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Method to set the first name of member.
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if(firstName != null && firstName.trim().length() > 0){
			this.firstName = firstName;
		}
	}

	/**
	 * Method to get the last name of member.
	 * @return the lastName in String.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Method to set the last name of member.
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if(lastName != null && lastName.trim().length() > 0){
			this.lastName = lastName;
		}
	}

	/**
	 * Method to get the month.
	 * @return the month in integer.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Method to set the month.
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		if(month > 0){
			this.month = month;
		}
	}

	/**
	 * Method to get the year.
	 * @return the year in integer.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Method to set the year.
	 * @param year the year to set
	 */
	public void setYear(int year) {
		if(year > 0){
			this.year = year;
		}
	}
	
	

}
