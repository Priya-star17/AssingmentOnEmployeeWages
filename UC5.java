package com.ass23;

public class UC5 {
	public static void main(String[] args) 
 	{ 
 		 int is_Part_Time=1; 
 		 int is_Full_Time=2; 
 		 int empHrs=0; 
 		 int emp_Rate_Per_Hrs=20; 
 		 int num_Of_Working_Days=20; 
 		 int empWage=0; 
 		 int total_EmpWage=0; 
 		 
 		for(int i=1;i<=num_Of_Working_Days;i++) 
 		{ 
	 			int check=(int)Math.floor(Math.random()*10)%3; 
	 			switch(check) 
	 			{ 
	 				case 1: 
	 					empHrs=8; 
	 					System.out.println("IS FULL TIME");
	 					break; 
	 				case 2: 
	 					empHrs=4; 
	 					System.out.println("IS PART TIME");
	 					break; 
	 				default: 
	 					empHrs=0; 
	 			} 
	 			empWage=empHrs*emp_Rate_Per_Hrs; 
	 			total_EmpWage=empWage+total_EmpWage; 
	 			System.out.println("EmpWage for Day "+ i +" is ="+empWage); 
	 		} 
	 		System.out.println("Total Emp Wage = "+total_EmpWage); 
	 
	} 
	 	} 



