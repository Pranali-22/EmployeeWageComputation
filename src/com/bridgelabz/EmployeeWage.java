/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class EmployeeWage {

	/**
	 * @param args
	 */
	public void employeeIsPresentOrNot() {
		double a = Math.random();
		
		if(a>=0.5) {
			System.out.println("Employee is present");
		}
		else{
			System.out.println("Employee is absent");
		}
	}
	public static void main(String[] args) {
		// Driving code
		EmployeeWage e1 = new EmployeeWage();
		e1.employeeIsPresentOrNot();
		
		}

}
