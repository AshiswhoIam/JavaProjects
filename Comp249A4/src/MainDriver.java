// ----------------------------------------------------- 
// Assignment 4
// Question: 4
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
/*
 * This program in general was to aid to obtain a better understanding of interfaces,inner classes,linked and
 * other concepts. Given two txt files which are to printed out for their content, we are to take and save the
 * content in an object to later test out methods when the user will input their own schedule times. Several methods were to
 * be tested for their functionality.Nodes were a big part of this program, we are required to use liked list
 * to verify each node and see wether the methods work...My program is incomplete.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Ash's program that helps practice Interfaces, inner classes, linked lists and other concepts");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//for user inputs
		Scanner key= new Scanner(System.in);
		
		//Creating two empty list from activitylist 
		ActivityList al1= new ActivityList();
		ActivityList al2= new ActivityList();
		
		//file reader class used to read files file
		FileReader file = null;
		try {
			file = new FileReader("C:/Users/Ashiqur Rahman/workspace/Comp249A4/MSchedule.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("fnotfoundexception was located ....");
		}
		//buffered reader to help read files
		BufferedReader reader = new BufferedReader(file);
		//some string to output the txt file in
		String text="";

		String line = null;
		try {
			//reads ine
			line = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException was caught here in the open");
		}
		//while loop to go through each text piece in the txt file
		while(line!=null){

			text+=line+"\n";

			try {
				line=reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException was caught here for reading the lines in option 2");
			}

		}
		System.out.println("\n"+text);
		
		
		
		
		FileReader file2 = null;
		try {
			file2 = new FileReader("C:/Users/Ashiqur Rahman/workspace/Comp249A4/MCommitments.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("fnotfoundexception was located ....");
		}
		BufferedReader reader2 = new BufferedReader(file2);
		//some string to output the txt file in
		String text2="";

		String line2 = null;
		try {
			//reads ine
			line2 = reader2.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException was caught here in the open");
		}
		//while loop to go through each text piece in the txt file
		while(line2!=null){

			text2+=line2+"\n";

			try {
				line2=reader2.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException was caught here for reading the lines in option 2");
			}

		}
		System.out.println("\n"+text2);
		
		String a="ABCDE";
		String an="Voleyball";
		double start=11.45;
		double end=13.15;
		
		String b="QWERTY";
		String bn="RendezVous";
		double startb=20.00;
		double endb=23.00;
		

		String d1="GYM101";
		String dn="Gym_Class";
		double startd1=7.00;
		double endd1=8.00;
		
		String p1="SOEN287";
		String pn="Web_Programming";
		double startp1=11.45;
		double endp1=14.15;
		
		
		System.out.println("Testing will start here.");
		System.out.println("Creating activity objects.");
		
		//Creating a few Activity objects to test the methods
		Activity a1=new Activity(a,an,start,end);
		Activity a2=new Activity(b,bn,startb,endb);
		
		Activity d=new Activity(d1,dn,startd1,endd1);
		Activity p=new Activity(p1,pn,startp1,endp1);
		
		System.out.println();
		System.out.println(a2);
		System.out.println();
		System.out.println(a1+"\n");
		System.out.println("testing the times");
		System.out.println(a1.isOnSameTime(a1));
		System.out.println(d.isOnSameTime(a2));
		System.out.println(a1.isOnSameTime(p));
		
		//System.out.println(a1.clone(p1));
		try{
		al1.addStart(a1);
		System.out.println(al1);
		al1.find("ABCDE");
		al2.addStart(d);
		}
		catch (Exception e){
			System.out.println("Opps an exception was caught when trying to start and find a ID");
		}
		
	
		System.out.println("");
		System.out.println(al1.equals(al2));
		System.out.println(al1.equals(al1));
		
		try{
		System.out.println(al1.contains(pn));
		}
		catch(Exception e){
			System.out.println("Opps an exception was caught when trying to search for a ID");
		}
		al1.deleteFromIndex(0);
		System.out.println();
		al1.insertAtIndex(p, 3);
		
	}

}
