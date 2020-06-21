package com.ass23;

 
 public class EmployeeWageOfMultipleCompany implements CompanyWageImpl11 { 
 	public static final int Part_Time = 1; 
 	public static final int Full_Time = 2; 
  
 	private int numOfCompany = 0; 
 	private UC11[] companyEmpwage;  
  
 	public EmployeeWageOfMultipleCompany(){ 
 		companyEmpwage = new UC11[5]; 
 	} 
 
 	public void addCompanyEmpWage(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){ 
 		companyEmpwage[numOfCompany] = new UC11(company_name , emp_rate_per_hour , working_days , max_hours_per_month); 
 		numOfCompany++; 
 	} 
 	public void empWage(){ 
 		for(int i = 0; i < numOfCompany; i++){ 
 			companyEmpwage[i].setTotalEmpwage(this.computeEmpwage(companyEmpwage[i])); 
 			System.out.println(companyEmpwage[i]); 
 		} 
 	} 
 	public int computeEmpwage(UC11 companyEmpwageUC11){ 
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
 			System.out.println("Day :" + totalworkingdays + " " + "Emphrs :" + hrs ); 
 		} 
 		return totalhrs * companyEmpwageUC11.emp_rate_per_hour; 
 	} 
 	public static void main(String[] args){ 
 		EmployeeWageOfMultipleCompany empwagrbuilder = new EmployeeWageOfMultipleCompany(); 
 		empwagrbuilder.addCompanyEmpWage("DMart",20,22,100); 
 		empwagrbuilder.addCompanyEmpWage("GlobeStyle",40,26,200); 
 		empwagrbuilder.empWage(); 

 
 	}

	

 
 } 
