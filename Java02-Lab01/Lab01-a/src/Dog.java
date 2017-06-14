/**
 * Class represents Dog
 * @author KateYeEumLee
 * @version 1.1
 */
public class Dog {
	private String name;
	private String breed;
	private int age;
	
	/**
	 * Default Constructor
	 */
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Overloaded Constructor
	 * @param name The name of Dog.
	 * @param breed The breed of Dog.
	 * @param age The age of Dog.
	 */
	public Dog(String name, String breed, int age) {
		setName(name);
		setBreed(breed);
		setAge(age);
	}

	/**
	 * Method to get the name of dog.
	 * @return the name in String.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set the name of dog.
	 * @param name the name to set
	 */
	public void setName(String name) {
		if(name != null && name.trim().length() > 0){
			this.name = name;
		}
	}

	/**
	 * Method to get the breed of dog.
	 * @return the breed in String.
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * Method to set the breed of dog.
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		if(breed != null && breed.trim().length() > 0){
			this.breed = breed;
		}
	}

	/**
	 * Method to get the age of dog.
	 * @return the age in integer.
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Method to set the age of dog.
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if(age > 0){
			this.age = age;
		}
	}
	
	
	

}
