/**
 * 
 */
package com.kateyeeum.lab05b.database;
import java.util.ArrayList;
import com.kateyeeum.lab05b.data.Employee;

/**
 * @author KateYeEumLee
 * @version 5.2
 */
public class Company {
	private ArrayList<Employee> employees;
	
	/**
	 * Constructor 
	 */
	public Company() {
		// TODO Auto-generated constructor stub
		employees = new ArrayList<Employee>();
	}

	/**
	 * Method to add employee to arrayList.
	 * @param newEmployee
	 */
	public void addEmployee(Employee newEmployee){
		if(newEmployee != null){
			employees.add(newEmployee);
		}
	}
	
	/**
	 * Method to remove employee from the arrayList.
	 * @param index as integer.
	 */
	public void removeEmployee(int index){
		if(index >= 0 && index < employees.size()){
			employees.remove(index);
		}
	}
	
	/**
	 * Method to display all employees.
	 */
	public void displayAllEmployees(){
		for(Employee s : employees){
			System.out.println(s.toString());
		}
	}
}
