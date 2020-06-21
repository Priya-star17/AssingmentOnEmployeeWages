package com.ass23;

public class UC4 {
	public static void main(String[] args) 
	{ 
	 		final int is_Part_Time=1; 
	 		final int is_Full_Time=2; 
	 		int empHrs=0; 
	 		int empWage=0; 
	 		int rate=20; 
	 
	 
	 		int check=(int)Math.floor(Math.random()*10)%3; 
	 		switch(check) 
	 		{ 
	 			case is_Part_Time: 
	 				empHrs=8;
	 				System.out.println("Is Part Time");
	 				break; 
	 			case is_Full_Time: 
	 				empHrs=16; 
	 				System.out.println("Is Full Time");
	 				break;
	 			default:	 
	 				empHrs=0; 
	 		} 
	 		empWage=empHrs*rate; 
	 		System.out.println("EmpWage = " +empWage); 
	} 
}
