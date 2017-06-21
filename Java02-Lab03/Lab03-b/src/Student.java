import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author KateYeEumLee
 * @version 3.2
 */
public class Student extends Person {
	private HashMap<String,Double> courses;
	
	/**
	 * Default Constructor
	 */
	public Student() {
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
	public Student(String firstName, String lastName, String emailAddress, String schoolID) {
		super(firstName, lastName, emailAddress, schoolID);
		courses = new HashMap<String,Double>();
	}

	/**
	 * Method to add new courses to HashMap.
	 * @param newCourse 
	 * @param grade
	 */
	public void addNewCourses(String newCourse, double grade){
		if(newCourse != null && newCourse.trim().length() > 0){
			if(grade >= 0.00){
				courses.put(newCourse, grade);
			}
		}
	}
	
	/**
	 * Method to calculate the average grade
	 * @return average grade.
	 */
	public double calculateAverageGrade(){
		double sum = 0;
		
		if(courses.size() > 0){
			for(Entry<String, Double> s : courses.entrySet()){
				sum =+ s.getValue();
			}
			return sum / courses.size();
		}else{
			return 0;
		}
		
	}
}
