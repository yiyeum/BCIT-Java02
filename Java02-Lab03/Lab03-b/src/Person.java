import java.util.ArrayList;

/**
 * @author KateYeEumLee
 * @version 3.2
 */
public class Person {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String schoolID;
	private ArrayList<String> courses;
	
	/**
	 * Default Constructor
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Overloaded Constructor
	 * @param firstName The first name of school person.
	 * @param lastName The last name of school person.
	 * @param emailAddress The email address of school person.
	 * @param schoolID The school ID.
	 * @param courses The course ArrayList.
	 */
	public Person(String firstName, String lastName, String emailAddress, String schoolID) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmailAddress(emailAddress);
		setSchoolID(schoolID);
	}

	/**
	 * Method to get the first name of school person.
	 * @return the firstName as String.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Method to set the first name of Person.
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if(firstName != null && firstName.trim().length() > 0){
			this.firstName = firstName;
		}
	}

	/**
	 * Method to get the last name of Person.
	 * @return the lastName as String.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Method to set the last name of Person.
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if(lastName != null && lastName.trim().length() > 0){ 
			this.lastName = lastName;
		}
	}

	/**
	 * Method to get the email address.
	 * @return the emailAddress as String.
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Method to set the email address.
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		if(emailAddress != null && emailAddress.trim().length() > 0){
			this.emailAddress = emailAddress;
		}
	}

	/**
	 * Method to get the school ID.
	 * @return the schoolID as String.
	 */
	public String getSchoolID() {
		return schoolID;
	}

	/**
	 * Method to set the school ID.
	 * @param schoolID the schoolID to set
	 */
	public void setSchoolID(String schoolID) {
		if(schoolID != null && schoolID.trim().length() > 0){
			this.schoolID = schoolID;
		}
	}

	/**
	 * Method to get the ArrayList of courses.
	 * @return the courses as String.
	 */
	public ArrayList<String> getCourses() {
		return courses;
	}

	
}
