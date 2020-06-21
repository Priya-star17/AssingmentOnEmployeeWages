package com.ass23;

public class EmpWageArray10 {
	
	public static final int Part_Time = 1; 
 	public static final int Full_Time = 2; 
 
 
 	private int numOfCompany = 0; 
 	private CompanyWage10[] companyEmpwageArray;  
 
 
 	public EmpWageArray10(){ 
 		companyEmpwageArray = new CompanyWage10[5]; 
 	} 
 
 
 	public void addCompanyEmpWage(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){ 
 		companyEmpwageArray[numOfCompany] = new CompanyWage10(company_name , emp_rate_per_hour , working_days , max_hours_per_month); 
 		numOfCompany++; 
 	} 
 	public void computeEmpwage(){ 
 		for(int i = 0; i < numOfCompany; i++){ 
 			companyEmpwageArray[i].setTotalEmpage(this.computeEmpwage(companyEmpwageArray[i])); 
 			System.out.println(companyEmpwageArray[i]); 
 		} 
 	} 
 	public int computeEmpwage(CompanyWage10 companyEmpwageUC11){ 
 		int hrs=0 , totalhrs=0, totalworkingdays=0; 
 		while(totalhrs <= companyEmpwageUC11.max_hours_per_month && totalworkingdays < companyEmpwageUC11.working_days){ 
 			totalworkingdays++; 
 			int empcheck = (int) Math.floor(Math.random()*10)%3; 
 			switch(empcheck){ 
 				case Part_Time: 
 					hrs=4; 
 					break; 
 				case Full_Time:
 					hrs=8; 
					break; 
 				default: 
 					hrs=0; 
 			} 
 			totalhrs =totalhrs+ hrs;
 			System.out.println("Day:" +totalworkingdays + "   " + "Emphrs :" + hrs ); 
 		} 
 		return totalhrs * companyEmpwageUC11.emp_rate_per_hour; 
 	} 
 	public static void main(String[] args){ 
 		EmpWageArray10 empwagrbuilder = new EmpWageArray10(); 
 		empwagrbuilder.addCompanyEmpWage("Myntra",25,22,150); 
 		empwagrbuilder.addCompanyEmpWage("Max Fashion",40,26,200); 
 		empwagrbuilder.computeEmpwage(); 
	}
 }
 