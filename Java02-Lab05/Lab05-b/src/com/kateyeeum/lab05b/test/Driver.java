package com.kateyeeum.lab05b.test;

import com.kateyeeum.lab05b.data.CommissionEmployee;
import com.kateyeeum.lab05b.data.HourlyEmployee;
import com.kateyeeum.lab05b.data.SalariedEmployee;
import com.kateyeeum.lab05b.database.Company;

/**
 * @author KateYeEumLee
 * @version 5.1
 */
public class Driver {
	private CommissionEmployee commissionEmployee;
	private HourlyEmployee hourlyEmployee;
	private SalariedEmployee salariedEmployee;
	private Company company;
	
	/**
	 * Constructor
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
		commissionEmployee  = new CommissionEmployee("Katie" , 3.0 , 1500);
		hourlyEmployee = new HourlyEmployee("Timothy" , 40.5);
		salariedEmployee = new SalariedEmployee("Judy", 50000 , 48);
		company = new Company();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().run();

	}
	
	public void run(){
		//test override abstract method.
		System.out.println("Testing the override abstract method : ");
		System.out.println("The monthly earning of commission employee : " + commissionEmployee.calculateMonthlyEarnings());
		System.out.println("The monthly earning of hourly employee : " + hourlyEmployee.calculateMonthlyEarnings());
		System.out.println("The monthly earming of salaried employee : " + salariedEmployee.calculateMonthlyEarnings());
		System.out.println("");
		
		//employees added.
		company.addEmployee(commissionEmployee);
		company.addEmployee(hourlyEmployee);
		company.addEmployee(salariedEmployee);
		
		//display all employees in company arrayList
		System.out.println("Display all employees in company : ");
		company.displayAllEmployees();
		System.out.println("");
		
		//removed index 1 of arrayList
		company.removeEmployee(2);
		
		System.out.println("Display all employees again after index 2 employee has been removed : ");
		company.displayAllEmployees();
	}

}
