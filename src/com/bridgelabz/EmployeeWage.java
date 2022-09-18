/**
 *
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

/**
 * @author Dell
 *UC13 - storing company name and total wage in hashmap
 */
public class EmployeeWage implements EmpWageCalculationFunctions{

	Random randomObj = new Random();

	public final int FULL_TIME=1;
	public final int PART_TIME=2;

	//Creating array to store company data
    private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
    private Map<String,CompanyEmpWage> companyEmpWageMap;
    
    public EmployeeWage() {
    	companyEmpWageArrayList = new ArrayList<>();
    	companyEmpWageMap = new HashMap<>();
    }

    @Override
	public void addCompanyEmpWage(String companyName, int wagePerHr, int maximumDays, int maximumHrs) {
    	CompanyEmpWage companyEmpWage = new CompanyEmpWage( companyName,  wagePerHr,  maximumDays,  maximumHrs);
    	companyEmpWageArrayList.add(companyEmpWage);
    	companyEmpWageMap.put(companyName, companyEmpWage);

    }


    @Override
	public void displayCompanyEmpWage() {
    	for (CompanyEmpWage element : companyEmpWageArrayList) {
    		element.totalWage = this.calculateEmployeeWage(element);
    		
    		System.out.println("Total Employee Wage of company "+element.companyName+" is "+element.totalWage);
        }
    }

	@Override
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
	
	public void getCompanyWageByName(String companyName) {
		System.out.println("Total wage for company "+companyName+" is "+companyEmpWageMap.get(companyName).totalWage);
	}

    public static void main(String[] args) {

    	Scanner input=new Scanner(System.in);
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyEmpWage("KPIT",30,30,150);

        employeeWage.addCompanyEmpWage("TCS",25,30,100);
        employeeWage.displayCompanyEmpWage();

        System.out.println("Enter name of company to get total wage");
        String name= input.nextLine();
        employeeWage.getCompanyWageByName(name);
        
    }

}
