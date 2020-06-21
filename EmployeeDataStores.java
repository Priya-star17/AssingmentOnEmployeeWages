package com.ass23;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataStores implements EmployeeStoresImpl{
	public static final int Part_Time = 1; 
	public static final int Full_Time = 2; 
	

 	List<UC13> companyEmpwage = new ArrayList<UC13> (); 
 	List<Integer> daily_wages = new ArrayList<Integer> ();
 
 	public void addCompanyEmpWage(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){ 
 		UC13 employee = new UC13(company_name , emp_rate_per_hour , working_days , max_hours_per_month); 
 		companyEmpwage.add(employee); 
 	} 
 	public void empWage(){ 
 		for(int i = 0; i < companyEmpwage.size(); i++){ 
 			companyEmpwage.get(i).setTotalEmpwage(this.computeEmpwage(companyEmpwage.get(i))); 
 			System.out.println(companyEmpwage.get(i)); 
 		} 
 	} 


	

	public void printDailyWage(){ 
		for(int i=0;i<daily_wages.size();i++){ 
			System.out.println(daily_wages.get(i)); 
		} 
	} 


	public int computeEmpwage(UC13 companyEmpwageUC13){ 
		int hrs=0 , totalhrs=0, totalworkingdays=0; 
		while(totalhrs <= companyEmpwageUC13.max_hours_per_month && totalworkingdays < companyEmpwageUC13.working_days){ 
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
			daily_wages.add(hrs*20); 
			System.out.println("Day :" + totalworkingdays + "    " + "Emphrs :" + hrs +"     "+ "Daily wage=" + (hrs*20)); 
		} 
		return totalhrs * companyEmpwageUC13.emp_rate_per_hour; 
	} 
	public static void main(String[] args){ 
		EmployeeDataStores employee = new EmployeeDataStores(); 
		employee.addCompanyEmpWage("DMart",20,22,100); 
		employee.addCompanyEmpWage("Sephora",40,26,200); 
		employee.empWage(); 
		System.out.println("Daily wages:" );employee.printDailyWage();  
		
	}
}	

	 
	 



