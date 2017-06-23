package com.kateyeeum.lab05b.test;

import com.kateyeeum.lab05b.data.CommissionEmployee;
import com.kateyeeum.lab05b.data.HourlyEmployee;

/**
 * @author KateYeEumLee
 * @version 5.1
 */
public class Driver {
	private CommissionEmployee commissionEmployee;
	private HourlyEmployee hourlyEmployee;
	
	/**
	 * Constructor
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
		commissionEmployee  = new CommissionEmployee("Katie" , 3.0 , 1500);
		hourlyEmployee = new HourlyEmployee("Timothy" , 40.5);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().run();

	}
	
	public void run(){
		System.out.println("The monthly earning of commission employee : " + commissionEmployee.calculateMonthlyEarnings());
		System.out.println("The monthly earning of hourly employee : " + hourlyEmployee.calculateMonthlyEarnings());
	}

}
