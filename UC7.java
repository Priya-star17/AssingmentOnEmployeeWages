package com.ass23;

public class UC7 {
		   int is_Part_Time=1; 
	      int is_Full_Time=2; 
	       int emp_Rate_Per_Hrs=20; 
	       int num_Of_Working_Days=20; 
	       int max_Hrs_In_Month=100; 
		 
	 		public  void calculate_EmpWage() 
	 		{ 
	 			 
	 			int empHrs=0,total_Working_Days=0,total_EmpHrs=0,totalEmpWage=0,empWage=0; 
	       while(total_EmpHrs<max_Hrs_In_Month && total_Working_Days<num_Of_Working_Days) 
	       { 
	          total_Working_Days++; 
	          int check=(int)Math.floor(Math.random()*10)%3; 
	          switch(check) 
	          { 
	             case 1: 
	                empHrs=4; 
	                break; 
	             case 2: 
	                empHrs=8; 
	                break; 
	             default: 
	                empHrs=0; 
	                break; 
	          } 
	          total_EmpHrs=total_EmpHrs+empHrs; 
	          empWage=empHrs*emp_Rate_Per_Hrs; 
	          System.out.println("Day "+total_Working_Days +"EmpHrs "+empHrs+" and EmpWage is "+empWage); 
	       } 
	          totalEmpWage=total_EmpHrs*emp_Rate_Per_Hrs; 
	          System.out.println("Total EmpWage is = "+totalEmpWage); 
				System.out.println("Total EmpHrs is = "+total_EmpHrs); 
	 
				} 
	 
	  	public static void main(String[] args) 
	 	{	 
	 	UC7 calEmp=new UC7();
	 	calEmp.calculate_EmpWage();
	 	} 
	 } 



