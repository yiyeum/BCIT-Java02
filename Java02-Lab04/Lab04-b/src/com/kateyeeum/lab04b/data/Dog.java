/**
 * 
 */
package com.kateyeeum.lab04b.data;

/**
 * @author KateYeEumLee
 * @version 4.1
 */
public class Dog extends Animal {
	private boolean likeToWalk;
	
	/**
	 * Default Constructor 
	 */
	public Dog() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Overloaded Constructor
	 * @param breed The breed of animal as String.
	 * @param weight The weight of animal as double.
	 * @param likeToWalk
	 */
	public Dog(String breed, double weight, boolean likeToWalk) {
		super(breed, weight);
		setLikeToWalk(likeToWalk);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method to check if the dog likes to walk
	 * @return the likeToWalk as boolean
	 */
	public boolean isLikeToWalk() {
		return likeToWalk;
	}

	/**
	 * Method to set if the dog likes to walk
	 * @param likeToWalk the likeToWalk to set
	 */
	public void setLikeToWalk(boolean likeToWalk) {
		this.likeToWalk = likeToWalk;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [likeToWalk=" + likeToWalk + ", toString()=" + super.toString() + "]";
	}

	
}
