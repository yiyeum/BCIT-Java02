/**
 * 
 */
package com.kateyeeum.lab05b.data;

/**
 * @author KateYeEumLee
 * @version 5.2
 */
public class SalariedEmployee extends Employee {
	private double yearlySalary;
	private int numberOfWeeksPerYearWorked;
	
	/**
	 * Default Constructor
	 */
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Overloaded Constructor
	 * @param name The name of employee.
	 * @param yearlySalary The yearly salary of salaried employee.
	 * @param numberOfWeeksPerYearWorked The number of weeks per year worked.
	 */
	public SalariedEmployee(String name, double yearlySalary, int numberOfWeeksPerYearWorked) {
		super(name);
		setYearlySalary(yearlySalary);
		setNumberOfWeeksPerYearWorked(numberOfWeeksPerYearWorked);
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Method to get the yearly salary.
	 * @return the yearlySalary as double.
	 */
	public double getYearlySalary() {
		return yearlySalary;
	}

	/**
	 * Method to set the yearly salary.
	 * @param yearlySalary the yearlySalary to set
	 */
	public void setYearlySalary(double yearlySalary) {
		if(yearlySalary > 0.0){
			this.yearlySalary = yearlySalary;
		}
	}

	/**
	 * Method to get the number of weeks per year worked
	 * @return the numberOfWeeksPerYearWorked as integer.
	 */
	public int getNumberOfWeeksPerYearWorked() {
		return numberOfWeeksPerYearWorked;
	}

	/**
	 * Method to set the number of weeks per year worked.
	 * @param numberOfWeeksPerYearWorked the numberOfWeeksPerYearWorked to set
	 */
	public void setNumberOfWeeksPerYearWorked(int numberOfWeeksPerYearWorked) {
		if(numberOfWeeksPerYearWorked > 0){
			this.numberOfWeeksPerYearWorked = numberOfWeeksPerYearWorked;
		}
	}

	/* (non-Javadoc)
	 * @see com.kateyeeum.lab05b.data.Employee#calculateMonthlyEarnings()
	 */
	@Override
	public double calculateMonthlyEarnings() {
		// TODO Auto-generated method stub
		return (yearlySalary / numberOfWeeksPerYearWorked) * (52/12) ;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SalariedEmployee [yearlySalary=" + yearlySalary + ", numberOfWeeksPerYearWorked="
				+ numberOfWeeksPerYearWorked + ", toString()=" + super.toString() + "]";
	}

	
}
