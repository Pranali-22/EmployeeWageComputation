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
		Random randomObj = new Random();
		int time=randomObj.nextInt();
		final int fullDayHr=8, partDayHr=4, wagePerHr=20;;
		int salary; 
		
		if(time%3==0) {
			System.out.println("Employee is present");
			salary=wagePerHr * fullDayHr;
			System.out.println("Daily Wage = "+salary);
		}
		else if(time%3==1) {
			System.out.println("Employee is present parttime");
			salary=wagePerHr * partDayHr;
			System.out.println("Daily Wage = "+salary);
		}
		else{
			System.out.println("Employee is absent");
			System.out.println("Daily Wage = "+0);
		}
		
	}

}
