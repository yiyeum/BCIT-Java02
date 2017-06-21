/**
 * 
 */
package com.kateyeeum.lab04b.data;

/**
 * @author KateYeEumLee
 * @version 4.1
 */
public class Animal {
	private String breed;
	private double weight;
	
	/**
	 * Default Constructor
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Overloaded Constructor
	 * @param breed The breed of animal as String.
	 * @param weight The weight of animal as double.
	 */
	public Animal(String breed, double weight) {
		setBreed(breed);
		setWeight(weight);
	}


	/**
	 * Method to get the breed of animal.
	 * @return the breed as String.
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * Method to set the breed of animal.
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		if(breed != null && breed.trim().length() > 0){
			this.breed = breed;
		}
	}

	/**
	 * Method to get the weight of animal.
	 * @return the weight as double.
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Method to set the weight of animal.
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		if(weight > 0.0){
			this.weight = weight;
		}
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", weight=" + weight + "]";
	}
	

}
