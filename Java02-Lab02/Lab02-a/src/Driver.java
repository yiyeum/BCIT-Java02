/**
 * @author KateYeEumLee
 * @version 2.1
 */
public class Driver {

	/**
	 * 
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().run();
	}

	public void run(){
		StudentDatabase database = new StudentDatabase();
		
		//student added in the database (HashMap).
		database.addStudent("KATE");
		database.addStudent("TIMO");
		database.addStudent("bean");
		
		//changed quiz mark for each student.
		database.changeQuizMark("KATE", 2, 80);
		database.changeQuizMark("TIMO", 6, 90);
		database.changeQuizMark("bean", 8, 50);
		
		//get quiz of just bean student.
		System.out.println("The quiz mark of student, Bean :");
	
		int[] test = database.getQuizzes("BEAN");
		database.showStudentMarks(test);
		System.out.println("");
		
		//display all makrs of all students in database.
		System.out.println("Display all quiz marks of all students : ");
		database.showQuizMarks();
		System.out.println("");
		
	}
}
