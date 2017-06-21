/**
 * @author KateYeEumLee
 * @version 3.2
 */
public class Driver {
	private Instructor instructor;
	private Student student1;
	private Student student2;
	private Database data;
	
	/**
	 * 
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
		instructor = new Instructor("Judy", "Paul", "judy@bcit.ca", "A001", 30);
		student1 = new Student("Rose" , "Wood" , "rose@bcit.ca" , "A002");
		student2 = new Student("Daisy" , "John" , "daisy@bcit.ca" , "A003");
		data = new Database();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().run();

	}

	public void run(){
		
		//add new courses
		student1.addNewCourses("Java", 90);
		student1.addNewCourses("Applied Math", 95);
		student2.addNewCourses("C++", 96);
		student2.addNewCourses("Applied Math", 73);
		student2.addNewCourses("Business", 83);
		
		//add instructor and student to the database.
		data.addPerson(instructor);
		data.addPerson(student1);
		data.addPerson(student2);
		
		System.out.println(student1.calculateAverageGrade());
		System.out.println(student2.calculateAverageGrade());
		
	}
}
