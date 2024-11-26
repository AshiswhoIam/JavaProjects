// Assignment (1)
// Written by: Ashiqur Rahman Id:40096265
// For COMP 248 Section-(E-X)-Fall 2018

import java.util.Scanner;

public class BMICalculator
{

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		
		/* This program will calculate your Body Mass Index(BMI)
		by dividing your weight in (kg) by your height squared in (m) */
		
		Scanner myKeyb =new Scanner(System.in);
		
		// Displaying Greetings
		System.out.println("Welcome to Ash's BMI Calculator");
		
		// Identifying my variables and displaying to warn user to enter a value
		System.out.println("Please enter your weight in (kg) then hit enter:");
		double weight=myKeyb.nextDouble();
		
		System.out.println("Please enter your height in (m) then hit enter");
		double height=myKeyb.nextDouble();
		
		// The division oh weight over height squared to calculate the BMI
		double bodyMassIndex=weight/(height*height);
		
		// Creating an output for the variables
		System.out.println("Your weight:"+weight);
		System.out.println("Your height:"+height);
		System.out.println("Your BMI:"+bodyMassIndex);

		//Closing sentence followed by termination of the program
		System.out.println("Thank you for using my BMI calculator :)");
		
		myKeyb.close();
	}

}
