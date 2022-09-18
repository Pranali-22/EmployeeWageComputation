/**
 * 
 */
package com.bridgelabz;

import java.util.*;

/**
 * @author Dell
 *UC10
 */
public class EmployeeWage {

	Random randomObj = new Random();
	
	public final int FULL_TIME=1;
	public final int PART_TIME=2;	
    
	int numOfCompany=0;    
    
	//Creating array to store company data
    private CompanyEmpWage[] companyEmpWageArray;
    
    public EmployeeWage() {
    	companyEmpWageArray = new CompanyEmpWage[2];
    	
    }
    
    private void addCompanyEmpWage(String companyName, int wagePerHr, int maximumDays, int maximumHrs) {
    	companyEmpWageArray[numOfCompany] = new CompanyEmpWage( companyName,  wagePerHr,  maximumDays,  maximumHrs);
    	
    	numOfCompany++;
    }
	
    
    public void displayCompanyEmpWage() {
    	for(int i=0; i<numOfCompany; i++) {
    		companyEmpWageArray[i].totalWage = this.calculateEmployeeWage(companyEmpWageArray[i]);
    		//companyEmpWageArray[i].displayCompanyWage();
    		System.out.println("Total Employee Wage of company "+companyEmpWageArray[i].companyName+" is "+companyEmpWageArray[i].totalWage);
        }
    }
    
	public int calculateEmployeeWage(CompanyEmpWage companyEmpWage){
        int workingHrs = 0;
        int workingDays = 0;
        int empSalary;
        while (workingHrs <= companyEmpWage.maximumHrs && workingDays < companyEmpWage.maximumDays){
        	int attendance = randomObj.nextInt(3);
        	
			if(attendance==FULL_TIME) {
				workingHrs+=8;			
			}
			else if(attendance==PART_TIME){
				workingHrs+=4;
			}
			else {
				workingHrs+=0;
			}
			
			 workingDays++;
        }
        empSalary = workingHrs*companyEmpWage.wagePerHr;
        
        return empSalary;
   }

    public static void main(String[] args) {
        
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyEmpWage("KPIT",30,30,150);
        
        employeeWage.addCompanyEmpWage("TCS",25,30,100);
        employeeWage.displayCompanyEmpWage(); 
 
    }

}
