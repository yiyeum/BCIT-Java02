/**
 * 
 */
package com.kateyeeum.lab04b.database;

import java.util.ArrayList;

import com.kateyeeum.lab04b.data.Animal;

/**
 * @author KateYeEumLee
 * @version 4.1
 */
public class AnimalHotel {
	private ArrayList<Animal> animals;
	
	/**
	 * Default Constructor
	 */
	public AnimalHotel() {
		// TODO Auto-generated constructor stub
		animals = new ArrayList<Animal>();
	}

	/**
	 * Method to add new animal to arrayList.
	 * @param newAnimal
	 */
	public void addNewAnimals(Animal newAnimal){
		if(newAnimal != null){
			animals.add(newAnimal);
		}
	}
	
	/**
	 * Method to display detail of all animals in arrayList.
	 */
	public void displayDetailOfAllAnimals(){
		for(Animal a : animals){
			System.out.println(a.toString());
		}
	}
}
