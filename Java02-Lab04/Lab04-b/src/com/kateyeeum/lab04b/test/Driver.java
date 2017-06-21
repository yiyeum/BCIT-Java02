/**
 * 
 */
package com.kateyeeum.lab04b.test;

import com.kateyeeum.lab04b.data.Cat;
import com.kateyeeum.lab04b.data.Dog;
import com.kateyeeum.lab04b.database.AnimalHotel;

/**
 * @author KateYeEumLee
 * @version 4.1
 */
public class Driver {
	private Dog myDog;
	private Cat myCat;
	private AnimalHotel hotel;
	
	/**
	 * Constructor
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
		myDog = new Dog("Puddle" , 6.0 , true);
		myCat = new Cat("Kitty", 5.0 , false);
		hotel = new AnimalHotel();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().run();
	}

	public void run(){
		//add new animals to hotel
		hotel.addNewAnimals(myCat);
		hotel.addNewAnimals(myDog);
		
		//display detail of all animals in the hotel.
		System.out.println("");
		System.out.println("Display all animals members in the hotel : ");
		hotel.displayDetailOfAllAnimals();
		System.out.println("");
		
		//print the detail of each animal.
		myDog.print();
		System.out.println("");
		myCat.print();
	}
}
