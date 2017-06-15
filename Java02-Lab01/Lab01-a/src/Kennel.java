import java.util.ArrayList;
import java.util.Random;

/**
 * Class represents Kennel
 * @author KateYeEumLee
 * @version 1.1
 */
public class Kennel {
	private ArrayList<Dog> myDogs;
	
	/**
	 * Constructor
	 */
	public Kennel() {
		// TODO Auto-generated constructor stub
		myDogs = new ArrayList<Dog>();
	}

	/**
	 * Method to add dog to the ArrayList.
	 * @param theDog add to the ArrayList.
	 */
	public void addDog(Dog theDog){
		if(theDog != null){
			myDogs.add(theDog);
		}
	}
	
	/**
	 * Method to display information of all of dogs in ArrayList.
	 */
	public void displayDog(){
		for(Dog d : myDogs){
			System.out.println(d.toString());
		}
	}
	
	/**
	 * Method to get the random dog.
	 * @return the random dog.
	 */
	public Dog getRandomDog(){
		Random r = new Random();
		return myDogs.get(r.nextInt(myDogs.size()));
	}
	
	/**
	 * Method to remove the dog.
	 */
	public void removeDog(Dog theDog){
		if(theDog != null){
			myDogs.remove(theDog);
		}
	}
	
	/**
	 * Method to adopt the the dog removed from ArrayList, and display it. 
	 */
	public void adopt(){
		Dog adoptedDog = getRandomDog();
		removeDog(adoptedDog);
		System.out.println(adoptedDog.toString());
	}
}
