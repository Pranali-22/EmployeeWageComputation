/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author Dell
 *
 */
public class EmployeeWage {

	private String companyName;
	private int wagePerHr;
	private int totalDays;
	private int totalHrs;
	private int salary;
	
	EmployeeWage(String name, int wage, int days, int hrs){
		this.companyName = name; 
		this.wagePerHr = wage;
		this.totalDays = days;
		this.totalHrs = hrs;
	}
    
    Random randomObj = new Random();

    public void calculateEmployeeWage(){
        int workingHrs = 0;
        int workingDays = 0;
        
        while (workingHrs < totalHrs && workingDays < totalDays){
        	int attendance = randomObj.nextInt(3);
        	
			if(attendance==0) {
				workingHrs+=8;			
			}
			else if(attendance==1){
				workingHrs+=4;
			}
			else {
				workingHrs+=0;
			}

        }
        salary = workingHrs*wagePerHr;
        
   }

    public static void main(String[] args) {
        
    	EmployeeWage employeeObj1 = new EmployeeWage("KPIT",30,30,150);
    	employeeObj1.calculateEmployeeWage();
    	System.out.println("Salary of employee of compnay "+ employeeObj1.companyName +" for "+ employeeObj1.totalDays +" days / "+ employeeObj1.totalHrs +" hours  = "+employeeObj1.salary);

    	System.out.println();
    	EmployeeWage employeeObj2 = new EmployeeWage("TCS",25,30,100);
        employeeObj2.calculateEmployeeWage();
        System.out.println("Salary of employee of compnay "+ employeeObj2.companyName +" for "+ employeeObj2.totalDays +" days / "+ employeeObj2.totalHrs +" hours  = "+employeeObj2.salary);

    }

}
