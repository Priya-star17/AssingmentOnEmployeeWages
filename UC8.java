package com.ass23;

public class UC8 {
	static final int is_Part_Time=1; 
	      static final int is_Full_Time=2; 
	 
	 
	 	public static void Calculate_EmpWage(String companyName,int max_Hrs_In_Month,int num_Of_Working_Days,int emp_Rate_Per_Hrs) 
	 	{ 
	 			int empHrs=0,total_Working_Days=0,total_EmpHrs=0,totalEmpWage=0,empWage=0; 
	       while(total_EmpHrs<=max_Hrs_In_Month && total_Working_Days<num_Of_Working_Days) 
	       { 
	          total_Working_Days++; 
	          int check=(int)Math.floor(Math.random()*10)%3; 
	          switch(check) 
	          { 
	             case is_Part_Time: 
	                empHrs=8; 
	                break; 
	             case is_Full_Time: 
	                empHrs=4; 
	                break; 
	             default: 
	                empHrs=0; 
	                break; 
	          } 
	          total_EmpHrs=total_EmpHrs+empHrs; 
	          empWage=empHrs*emp_Rate_Per_Hrs; 
	          System.out.println("Day "+total_Working_Days+ " "  +"EmpHrs "+empHrs+" and EmpWage is "+empWage); 
	       } 
	          totalEmpWage=total_EmpHrs*emp_Rate_Per_Hrs; 
	          System.out.println("Total EmpWage is = "+totalEmpWage); 
	          System.out.println("Total EmpHrs is = "+total_EmpHrs); 
	 
		 	} 
	 	public static void main(String[] args) 
	 	{ 
	 		System.out.println("* Calculate Total Emp Wage For Johnson Company *"); 
	 		Calculate_EmpWage("BridgeLabz",100,20,20); 
	 		System.out.println("\n"); 
	 		System.out.println("* Calculate Total Emp Wage For Himalaya Company *"); 
	        Calculate_EmpWage("VMart",125,25,30); 
	 	} 


}
