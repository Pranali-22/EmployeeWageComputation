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
		//final int fullDayHr=8, partDayHr=4;
		int wagePerHr=20, totalDays=20, totalHrs=100;
		int salary=0, workingHrs=0, days=0;
		
		while(days<totalDays && workingHrs<=totalHrs) {
			int attendance=randomObj.nextInt();
			if(attendance%3==0) {
				workingHrs+=8;			
			}
			else if(attendance%3==1){
				workingHrs+=4;
			}
			else {
				workingHrs+=0;
			}
			days++;
		}
		
		salary = salary + wagePerHr*workingHrs;
		
		System.out.println("Salary of employee for 20 days/100 hours  = "+salary);
	}

}
