/**
 * 
 */
package com.kateyeeum.lab04b.data;

/**
 * @author KateYeEumLee
 * @version 4.1
 */
public class Cat extends Animal {
	private boolean hunts;
	
	/**
	 * Default Constructor
	 */
	public Cat() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Overloaded Constructor
	 * @param breed The breed of animal as String.
	 * @param weight The weight of animal as double.
	 * @param hunts 
	 */
	public Cat(String breed, double weight, boolean hunts) {
		super(breed, weight);
		setHunts(hunts);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method to check if the cat hunts
	 * @return the hunts as boolean.
	 */
	public boolean isHunts() {
		return hunts;
	}

	/**
	 * Method to set if the cat hunts.
	 * @param hunts the hunts to set
	 */
	public void setHunts(boolean hunts) {
		this.hunts = hunts;
	}
	
	/* (non-Javadoc)
	 * @see com.kateyeeum.lab04b.data.Animal#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		if(isHunts() == true){
			System.out.println("This is a hunter!");
		}else{
			System.out.println("This is one lazy cat!");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat [hunts=" + hunts + ", toString()=" + super.toString() + "]";
	}

	
}
