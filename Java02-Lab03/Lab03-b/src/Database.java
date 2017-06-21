import java.util.ArrayList;

/**
 * @author KateYeEumLee
 * @version 3.2
 */
public class Database {
	private ArrayList<Person> schoolPeople;
	
	/**
	 * Constructor
	 */
	public Database() {
		// TODO Auto-generated constructor stub
		schoolPeople = new ArrayList<Person>();
	}

	/**
	 * Method to add person to the database.
	 * @param newPerson
	 */
	public void addPerson(Person newPerson){
		if(newPerson != null){
			schoolPeople.add(newPerson);
		}
	}
	
	/**
	 * Method to display the detail of person in the ArrayList.
	 */
	public void displayDetailOfPerson(){
		for(Person person : schoolPeople){
			System.out.println("Name : " + person.getFirstName() + ", Email : " + person.getEmailAddress());
		}
	}
}
