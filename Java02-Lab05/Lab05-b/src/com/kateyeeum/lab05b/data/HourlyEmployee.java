package com.kateyeeum.lab05b.data;
/**
 * @author KateYeEumLee
 * @version 5.1
 */
public class HourlyEmployee extends Employee {
	private double workedHours;
	private final double hourlyWage = 30.00;
	
	/**
	 * Default constructor
	 */
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Overloaded Constructor
	 * @param name The name of employee.
	 * @param workedHours The worked hours of employee.
	 */
	public HourlyEmployee(String name, double workedHours) {
		super(name);
		setWorkedHours(workedHours);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method to get the worked hours.
	 * @return the workedHours as double.
	 */
	public double getWorkedHours() {
		return workedHours;
	}

	/**
	 * Method to set the worked hours.
	 * @param workedHours the workedHours to set
	 */
	public void setWorkedHours(double workedHours) {
		if(workedHours > 0.0){
			this.workedHours = workedHours;
		}
	}
	
	/**
	 * Method to get the hourly wage.
	 * @return the hourlyWage as double.
	 */
	public double getHourlyWage() {
		return hourlyWage;
	}

	/* (non-Javadoc)
	 * @see Employee#calculateMonthlyEarnings()
	 */
	@Override
	public double calculateMonthlyEarnings() {
		// TODO Auto-generated method stub
		return workedHours * hourlyWage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HourlyEmployee [workedHours=" + workedHours + ", hourlyWage=" + hourlyWage + ", toString()="
				+ super.toString() + "]";
	}

	
}
