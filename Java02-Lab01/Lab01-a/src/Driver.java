/**
 * Method to test.
 * @author KateYeEumLee
 * @version 1.1
 */
public class Driver {
	
	/**
	 * Constructor 
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
		Dog dog1 = new Dog("general", "brownie", 6);
		Dog dog2 = new Dog("red", "morango", 4);
		Dog dog3 = new Dog("yellow", "pineapple", 5);
		Kennel kennel = new Kennel();
		
		kennel.addDog(dog1);
		kennel.addDog(dog2);
		kennel.addDog(dog3);
		
		
		System.out.println("Display All Dogs in the ArrayList :");
		kennel.displayDog();
		System.out.println("");
		
		
		System.out.println("Adopt the random dog from ArrayList :");
		kennel.getRandomDog();
		kennel.adopt();
		System.out.println("");

		
		System.out.println("Display ArrayList dogs :");
		kennel.displayDog();
		
	}
	
}
