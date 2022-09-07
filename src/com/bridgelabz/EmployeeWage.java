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
		//final int fullDayHr=8, partDayHr=4;
		int wagePerHr=20;;
		int salary=0,hrPerDay;
		
		for(int i=0;i<20;i++) {
			int a=r.nextInt();
			if(a%3==0) {
				hrPerDay=8;			
			}
			else if(a%3==1){
				hrPerDay=4;
			}
			else {
				hrPerDay=0;
			}
			salary = salary + wagePerHr*hrPerDay;
		}
		
		System.out.println("Salary of employee for 20 days = "+salary);
	}

}
