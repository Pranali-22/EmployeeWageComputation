/**
 * 
 */
package com.bridgelabz;

import java.util.*;

/**
 * @author Dell
 *
 */
public class EmployeeWage {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// Driving code
		Random r = new Random();
		int a=r.nextInt();
		final int fullDayHr=8, wagePerHr=20;;
		int salary; 
		
		if(a%2==0) {
			System.out.println("Employee is present");
			salary=wagePerHr * fullDayHr;
			System.out.println("Daily Wage = "+salary);
		}
		
		else{
			System.out.println("Employee is absent");
			System.out.println("Daily Wage = "+0);
		}
		
	}

}
