// ----------------------------------------------------- 
// Assignment 3
// Question: 1
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------

import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.*; 


public class MainDriver {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub



		Scanner key= new Scanner (System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Ash's program that helps practice Exception Handling, and File I/O and other concepts");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		


		System.out.println("Dear user select 1 of 3 options: ");
		System.out.println("1:List files");
		System.out.println("2:Process files");
		System.out.println("3:Exit");
		int user; 

		user = key.nextInt();

		while(user==1||user==2||user==3)
		{

			FileReader file = new FileReader("C:/Users/Ashiqur Rahman/workspace/Comp249A3/log.txt");
		
			BufferedReader reader = new BufferedReader(file);
			File fl= null;
			String [] listfiles;

			String text="";

			String line= reader.readLine();

		


			
			
			
			

			if(user==1){

				System.out.println("Option 1 was chosen");
				fl=new File("C:/Users/Ashiqur Rahman/workspace/Comp249A3/log.txt");

				FileOutputStream fos= new FileOutputStream(fl);
				OutputStreamWriter osw= new OutputStreamWriter(fos);
				Writer word=new BufferedWriter(osw);
				
				
			}

			if(user==2){
				fl=new File("C:/Users/Ashiqur Rahman/workspace/Comp249A3/log.txt");
				
				FileOutputStream fos= new FileOutputStream(fl);
				OutputStreamWriter osw= new OutputStreamWriter(fos);
				Writer word=new BufferedWriter(osw);
				word.write("This file was overridened");
				word.close();
				System.out.println(fl);
				System.out.println("Option 2 was chosen");

				while(line!=null){

					text+=line+"\n";

					line=reader.readLine();

				}

				System.out.println("\n"+text);
				reader.close();

			}


			if(user==3){
				System.out.println("You chose option 3 terminating program.");

				reader.close();
				file.close();
				System.exit(0);

			}
			
			System.out.println("what would u like to do now");
			user=key.nextInt();
		}

		if(user!=1||user!=2||user!=3){
			System.out.println("Your number was not valid ending program.");
		}

		



	}

}
