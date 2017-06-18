import java.util.HashMap;
import java.util.Map.Entry;

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
		int marks[] = new int[NUM_QUIZZES];
		
		if(studentName != null && studentName.trim().length() > 1){
			formatName(studentName);
			marks.equals(MIN_GRADE);
			
			quizMarks.put(studentName, marks);
			
		}
	}
	
	/**
	 * Method to get the quiz array of specified student.
	 * @param studentName The student name.
	 * @return quiz marks in array.
	 */
	public int[] getQuizzes(String studentName){
		
		if(studentName != null && studentName.trim().length() > 1){
			formatName(studentName);
			return quizMarks.get(studentName);
		} // if
		return null;
	}
	
	/**
	 * Method to change the quiz mark.
	 * @param studentName The student name.
	 * @param whichQuiz The quiz which is going to changed.
	 * @param newMark The new mark.
	 */
	public void changeQuizMark(String studentName, int whichQuiz, int newMark){
		if(studentName != null && studentName.trim().length() > 0){
			formatName(studentName);
			if(whichQuiz >=0 && whichQuiz < quizMarks.get(studentName).length){
				if(newMark >= MIN_GRADE && newMark <= MAX_GRADE){
					quizMarks.get(studentName)[whichQuiz] = newMark;
				}
			}
		}
	}
	
}
