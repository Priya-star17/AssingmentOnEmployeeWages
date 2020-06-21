package com.ass23;

public class UC3 {
	public static void main(String[] args) 
	 	{ 
	 		int is_Full_Time=1; 
	 		int is_Part_Time=2; 
	 		int rate=20; 
	 		int empHrs=0; 
	 		int empWage=0; 
	 
	 		int check=(int)Math.floor(Math.random()*10)%3; 
	 		if(check==is_Full_Time) {
	 			System.out.println("Is Part Time");
	 			empHrs=4; }
	 		else if(check==is_Part_Time) {
	 			empHrs=8; 
	 			System.out.println("Is Full Time");}
	 		else	 
	 			empHrs=0; 
	 		empWage=empHrs*rate; 
	 		System.out.println("EmpWage = "+empWage); 

		}

}
