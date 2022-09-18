/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public interface EmpWageCalculationFunctions {

	public abstract int calculateEmployeeWage(CompanyEmpWage companyEmpWage);
	
	public abstract void addCompanyEmpWage(String companyName, int wagePerHr, int maximumDays, int maximumHrs);

	public void displayCompanyEmpWage();
}
