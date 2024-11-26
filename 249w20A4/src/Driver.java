// ----------------------------------------------------- 
// Assignment 4 
// Question: 1
// Written by:  Ashiqur Rahman (40096265)
// -----------------------------------------------------
/*
 * In this assignment we were required to open any txt files and take elements from them to create a dictionary.
 * This is done through manipulation of i/o. Besides the displayment of information, the other parts were not 
 * completed properly due to time. Following, it was required to create a link list and utilize the methods
 * as well as use i/o with the given txt to see if they were functional. The methods tested seem to work sort of....
 * They were not all properly implemented and require additinonal work.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner key= new Scanner (System.in);
		System.out.println("-------------------------------------------------");
		System.out.println("Welcome To Ashiqur's SubDictionary & Cell Records");
		System.out.println("-------------------------------------------------");

		ArrayList<String> sd = new ArrayList<String>();

		int count=0;
		try {


			//using the file class and giving the directory to read the file later
			//creating a file array and using listfiles 
			File folder = new File("C:/Users/Ashiqur Rahman/workspace/249w20A4");
			File[] lf = folder.listFiles();

			if (lf.length > 0) {

				for (int i = 0; i < lf.length; i++ ) {
					//incrementing everytime a file is read
					count++;
					//checking if theres a file and if there is proceeding to read it
					if (lf[i].isFile()) {

						//using the buffereader with read line in the while loop to continuously loop and read it all
						BufferedReader bread = new BufferedReader(new FileReader(lf[i].getName()));
						String lines = "";
						while((lines = bread.readLine())!= null) {
							System.out.println(lines);
						}
						bread.close();
					}
					//if the file doesnt exist identifying the file and terminating the program
					if(count>0&&lf[i].exists()==false){
						System.out.println("Exception while reading file at position:" + count);
						System.exit(0);
					}

				}

			}
		} catch(Exception e) {
			System.out.println("Exception while reading file at number:" + count);
		}
		System.out.println();
		System.out.println("Enter the desired file to test the method on");
		String filePath="";
		filePath=key.nextLine();
		BufferedReader br=null;
		br= new BufferedReader(new FileReader(filePath));

		String line="";
		while ((line=br.readLine())!=null){
			//line below is used to store the text file info in array list
			sd.add(line);
			System.out.println(line);
		}
		br.close();
		System.out.println();


		try{
			specificsText(filePath,sd);
		}catch (Exception e){
			System.out.println("An error occured when using the sub-dictionnary creation method specficsText");
		}

		System.out.println("Below is to show that the text is stored in the array list");
		System.out.println(sd);
		System.out.println();
		//Start of the part 2 with Linked list

		//Creating two Empty CellLists
		CellList c1= new CellList();
		CellList c2= new CellList();
		//Creating a CellPhone object
		CellPhone c= new CellPhone(10012,"Guicci",1996,50.5);
		CellPhone cp1= new CellPhone(9999,"adds",2030,1313.43);
		CellPhone cp2= new CellPhone(99,"ad",20,131.4);
		CellPhone cp3= new CellPhone(232,"d",2,1.4);
		CellPhone cp4= new CellPhone(111,"zzzz",111,22.44);
		c1.addToStart(c);
		c1.addToStart(cp2);
		c1.addToStart(cp1);
		c2.addToStart(cp3);
		c2.addToStart(cp4);
		c2.addToStart(c);
		System.out.println();

		c1.showContents();
		c2.showContents();

		System.out.println("Enter two Serial numbers for searching purposes");
		long user;
		long user2;
		user=key.nextLong();
		//key.nextLine();
		System.out.println("Enter the second one");
		user2=key.nextLong();
		long temp=user2;


		System.out.println();
		c1.find(user);
		System.out.println();
		c2.find(temp);

		System.out.println();

		System.out.println();
		c1.deleteFromStart();
		System.out.println();
		c2.replaceAtIndex(c, 2);
		System.out.println();
		c1.insertAtIndex(cp4, 1);
		
		c2.deleteFromIndex(0);

		try{
			System.out.println(c2.contains(9999));
		}catch(Exception e){
			System.out.println("contains method failed to execute");
		}

		System.out.println();
	}


	public static void specificsText(String s, ArrayList<String> a) throws IOException{

		BufferedReader br2= new BufferedReader(new FileReader(s));
		String lines;
		String temp="";
		int count = 0;
		while ((lines=br2.readLine())!=null){
			//line below is used to store the text file info in array list
			a.add(lines);
			System.out.println(lines);
		}

		for(int i=0;i<a.size();i++){

			if(lines==temp){
				count++;
			}
			if(count>=15&&count<16){
				temp.toUpperCase();
				if(temp.contains("!")||temp.contains(".")||temp.contains(",")||temp.contains("?")){
					temp=temp.substring(0,temp.length()-1);
				}

				if(temp.matches("[0-9]+")){
					temp="";
				}
				if(temp.length()==1&& ((temp!="a")||(temp!="i"))){
					temp="";
				}
				if(temp.matches("s")||temp.matches("m")){
					temp=temp.replace("s", "");
					temp=temp.replace("m", "");
				}

				//this was suppose to be the method to sort alphabetically
				if(temp!=""){
					System.out.println("\n ==");
				}
				System.out.println(temp);



			}

			temp=lines;
		}

	}

}




