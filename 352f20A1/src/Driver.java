/**
 * Ashiqur Rahman
 * 40096265
 * Comp 352 A1
 */

/*
 * The following program was suppose to be a recursive method which takes in a string to then replace 
 * the the non 0 and 1 value by 0 and 1through all their combinations possible. Due to a misjudgment 
 * on the timing of the assignemnt the methods were not properly implemented and most of the program does not function
 * and is incomplete.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Welcome to assginment 1 part 2");
		System.out.println("Enter the desired String");


		Scanner key = new Scanner(System.in);

		String user=key.nextLine();
		String saver="";

		System.out.println();
		//calling method

		//time function
		long st=System.nanoTime();
		RevealStr(user);
		long isend=System.nanoTime();
		long duration=(isend-st);

		
		
		try{
			File somefile=new File("out.txt");
			if(somefile.createNewFile()){
				System.out.println("File created!");
			}
			else{
				System.out.println("File exists!!");
			}
		}catch (Exception e){
			System.out.println("filenotfoundexception/created ....");
		}
		


		//file reader class used to read file
		FileReader file = null;
		try {
			file = new FileReader("C:/Users/Ashiqur Rahman/workspace/352f20A1/out.txt");
		} catch (FileNotFoundException e) {
			
			System.out.println("filenotfoundexception ....");
		}
		//buffered reader to read files
		BufferedReader reader = new BufferedReader(file);
		//some string to output the txt file in
		String text="";

		String line = null;
		try {
			//reads line
			line = reader.readLine();
		} catch (IOException e) {
			
			System.out.println("IOException was caught");
		}
		//while loop through each text piece in the txt file
		while(line!=null){

			text+=line+"\n";

			try {
				line=reader.readLine();
			} catch (IOException e) {
				
				System.out.println("IOException was caught here for reading the lines");
			}

		}
		System.out.println("\n"+text);


	}


	public static void RevealStr(String s){

		//use of variables to save the different strings
		String tosave="";
		String tosave1="";
		String tosave2="";
		String tosave3="";
		String reset="";
		//if method to check if string has *
		if(s.contains("*")){


			reset=s;
			//Basic case of replacing all by 0 and 1s
			System.out.println(s.replace('*', '0'));		
			tosave=s.replace('*', '0');
			System.out.println(s.replace('*', '1'));
			tosave1=s.replace('*', '1');

			//for loop to iterate through the string and replace * by 0 and 1s
			for(int i=0;i<s.length();i++){

				if(s.charAt(i)=='*'){

					s.replace('*', '1');
					for(int j=0;i<s.length();j++){
						if(s.charAt(i)=='*'){
							tosave2=s.replace('*', '0');
							
							
						}
					}					
				}
				if(s.charAt(i)=='*'){

					s.replace('*', '0');
					for(int j=0;i<s.length();j++){
						if(s.charAt(i)=='*'){
							tosave3=s.replace('*', '1');
						}
						
					}					
				}
				System.out.println(tosave2+" "+tosave3);

				System.out.println(s);	
			}


		}
		
		try{
			File somefile=new File("out.txt");
			if(somefile.createNewFile()){
				System.out.println("File created!");
				
				
			}
			else{
				System.out.println("File exists!!");
			}
		}catch (Exception e){
			System.out.println("filenotfoundexception/created ....");
			
			
		}
		
	}
}
