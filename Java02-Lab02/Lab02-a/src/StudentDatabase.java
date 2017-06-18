import java.util.HashMap;

/**
 * @author KateYeEumLee
 * @version 2.1
 */
public class StudentDatabase {
	private HashMap<String, int[]> quizMarks;
	private static final int NUM_QUIZZES = 10;
	private static final int MIN_GRADE = 0;
	private static final int MAX_GRADE = 100;
	
	/**
	 * Default Constructor
	 */
	public StudentDatabase() {
		// TODO Auto-generated constructor stub
		quizMarks = new HashMap<String, int[]>();
	}

	/**
	 * Method to format the name.
	 * @param name The name of student.
	 * @return formatted name in String.
	 */
	public String formatName(String name){
		String first = "";
		String rest = "";
		if(name != null && name.length() > 0){
			first = name.substring(0,1).toUpperCase();
			if(name.length() > 1){
				rest = name.substring(1).toLowerCase();
			}
		}
		return first + rest;
	}
	
/**
 * Method to add student to the database, and create a new array to hold that student's quiz marks.
 * @param studentName The student name in String.
 */
	public void addStudent(String studentName){
		if(studentName != null && studentName.trim().length() > 1){
			int marks[] = new int[NUM_QUIZZES];
			marks.equals(MIN_GRADE);
			quizMarks.put(studentName, marks);
			
		}
	}
}
