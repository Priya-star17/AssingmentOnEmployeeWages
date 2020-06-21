package com.ass23;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWage12 implements CompanyInterfaceImpl12{
			 	public static final int Part_Time = 1; 
		 	public static final int Full_Time = 2; 
		 
		 
		 	List<UC12> companyEmpwage = new ArrayList<UC12> (); 
		 
		 
		 	public void addCompanyEmpWage(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){ 
		 		UC12 employee = new UC12(company_name , emp_rate_per_hour , working_days , max_hours_per_month); 
		 		companyEmpwage.add(employee); 
		 	} 
		 	public void empWage(){ 
		 		for(int i = 0; i < companyEmpwage.size(); i++){ 
		 			companyEmpwage.get(i).setTotalEmpwage(this.empWage(companyEmpwage.get(i))); 
		 			System.out.println(companyEmpwage.get(i)); 
		 		} 
		 	} 
		 	public int empWage(UC12 companyEmpwageUC12){ 
		 		int hrs=0 , totalhrs=0, totalworkingdays=0; 
		 		while(totalhrs <= companyEmpwageUC12.max_hours_per_month && totalworkingdays < companyEmpwageUC12.working_days){ 
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
		 			totalhrs += hrs; 
		 			System.out.println("Day :" + totalworkingdays + " " + "Emphrs :" + hrs ); 
		 		} 
		 		return totalhrs * companyEmpwageUC12.emp_rate_per_hour; 
		 	} 
		 	public static void main(String[] args){ 
		 		EmployeeWage12 empwagebuilder = new EmployeeWage12(); 
		 		empwagebuilder.addCompanyEmpWage("Alibaba",20,22,100); 
		 		empwagebuilder.addCompanyEmpWage("Amazon",40,26,200); 
		 		empwagebuilder.empWage(); 
		 
		 
	 	} 
		 
	}

