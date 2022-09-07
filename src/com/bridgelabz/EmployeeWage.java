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
		final int fullDayHr=8, partDayHr=4, wagePerHr=20;;
		int salary; 
				
		switch (a%3) {
			case 0:
				System.out.println("Employee is present");
				salary=wagePerHr * fullDayHr;
				System.out.println("Daily Wage = "+salary);
				break;
				
			case 1:
				System.out.println("Employee is present parttime");
				salary=wagePerHr * partDayHr;
				System.out.println("Daily Wage = "+salary);
				break;
				
			case 2:
				System.out.println("Employee is absent");
				System.out.println("Daily Wage = "+0);
				break;
			
			
		}
		
	}

}
