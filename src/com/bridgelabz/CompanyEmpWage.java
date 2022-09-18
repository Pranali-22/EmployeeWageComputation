/**
 *
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
//Class to manage company's total wage
public class CompanyEmpWage {

	public final String companyName;
	public final int wagePerHr;
	public final int maximumDays;
	public final int maximumHrs;
	public int totalWage;

	CompanyEmpWage(String companyName, int wagePerHr, int maximumDays, int maximumHrs){
		this.companyName = companyName;
		this.wagePerHr = wagePerHr;
		this.maximumDays = maximumDays;
		this.maximumHrs = maximumHrs;
	}

}
