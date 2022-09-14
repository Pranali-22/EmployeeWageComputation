/**
 * 
 */
package com.bridgelabz;

import java.util.Random;


public class EmployeeWage {

	final int wagePerHr = 20;
	final int totalDays = 20;
	final int totalHrs = 100;
    
    Random randomObj = new Random();

    public void employeeWage(){
        int workingHrs = 0;
        int workingDays = 0;
        while (workingHrs < totalHrs && workingDays < totalDays){
        	int attendance=randomObj.nextInt(3);
        	
			if(attendance==0) {
				workingHrs+=8;			
			}
			else if(attendance==1){
				workingHrs+=4;
			}
			else {
				workingHrs+=0;
			}
		workingDays++;
        }
        System.out.println("Salary of employee for 20 days/100 hours  = "+workingHrs*wagePerHr);
    }

    public static void main(String[] args) {
        
    	EmployeeWage employeeObj = new EmployeeWage();
        employeeObj.employeeWage();
    }
}
