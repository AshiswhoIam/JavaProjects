// ----------------------------------------------------- 
// Final Exam 
// Written by:  Ashiqur Rahman (40096265)
// -----------------------------------------------------
/*
 * The program below starts by requiring the user to create several objects and manipulate them through
 * properly understanding with hiearchy and creation of several methods.Afterwards, it is required to create an
 * arraylist and store the array object into that list and proceed to do other tasks. It follows up by the creation of
 * a txt file and manipulation of i/o to take info from the created objects and put them in the files and read later.
 * Lastly, the usage of linked list were used to see how the methods of it would
 * function with the array object created at the start.
 */
package FX_W20PKG;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import CargoAirport.CargoAirport;
import CommercialAirport.CommercialAirport;

public class Infrastructure {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------");
		System.out.println("Welcome to Ash's Final exam Structure program");
		System.out.println("---------------------------------------------");
		
		System.out.println();
		
		System.out.println("This is task 3 A. Creating the objects");
		//Here is the creation of various objects as instructed of the different classes
		Overpass o1= new Overpass(1991,12000.0 , 500 , 100,5000);
		Overpass o2= new Overpass(2009,23000.0 , 1500 , 700,2000.3);
		Overpass o3= new Overpass(999,4999.4 , 888 , 200,199);
		Overpass o4= new Overpass(2040,90000.0 , 5400 , 1200,60000);
		Overpass o5= new Overpass(12,43 , 900 , 50,30);
		Overpass o6= new Overpass(9999,9999 , 9999 , 9999,9999);
		
		HighRise hr1= new HighRise(1991, 700000.0, 500000, "cement", 900);
		HighRise hr2= new HighRise(1111, 33330.0, 42232, "bricks", 56);
		HighRise hr3= new HighRise(5454, 444444.0, 77770, "plastic", 3400);
		HighRise hr4= new HighRise(2040, 900000.0, 900000, "rocks", 19900);
		HighRise hr5= new HighRise(3000, 1000000.0, 3000, "paper", 100);
		HighRise hr6= new HighRise(333, 5555.0, 7766, "wood", 31);
	
		House h1= new House(2080, 300000, 4000, "cement", 8, 10.5, 6);
		House h2= new House(555, 300, 4000, "straw", 14, 2, 1);
		House h3= new House(9999, 999999.99, 99999, "obsidian", 9, 99.5, 99);
		House h4= new House(11, 10, 100, "mud", 5, 2.5, 2);
		House h5= new House(2020, 500000, 5000, "bricks", 5, 7.5, 3);
		House h6= new House(1965, 50000, 3000, "wood", 21, 5.5, 3);
		
		CondoBuilding c1= new CondoBuilding(2020,600000,6000,"wood",5,3);
		CondoBuilding c2= new CondoBuilding(2000,200000,8000,"cement",8,4);
		CondoBuilding c3= new CondoBuilding(1990,100000,5000,"granite",3,3);
		CondoBuilding c4= new CondoBuilding(2220,900000,9000,"wood",10,4);
		CondoBuilding c5= new CondoBuilding(3330,400000,5500,"bricks",5,2);
		CondoBuilding c6= new CondoBuilding(2026,700000,6000,"rocks",5,1);

		CommercialAirport co1= new CommercialAirport(1940, 500000, 8, "sauce", 25);
		CommercialAirport co2= new CommercialAirport(1941, 600000, 5, "secret", 22);
		CommercialAirport co3= new CommercialAirport(2240, 7700040, 23, "plane", 35);
		CommercialAirport co4= new CommercialAirport(4444, 4444444, 15, "sos", 44);
		CommercialAirport co5= new CommercialAirport(2002, 1100000, 34, "yikes", 12);
		CommercialAirport co6= new CommercialAirport(2020, 343343, 12, "rip", 15);
		
		CargoAirport ca1= new CargoAirport(1991, 200000,11 , "cargo", 3000);
		CargoAirport ca2= new CargoAirport(2020, 340000,14 , "cargo2", 4000);
		CargoAirport ca3= new CargoAirport(2021, 430000,15 , "cargo3", 6000);
		CargoAirport ca4= new CargoAirport(2301, 450000,17 , "cargo4", 7000);
		CargoAirport ca5= new CargoAirport(1400, 90600,10 , "cargo5", 1000);
		CargoAirport ca6= new CargoAirport(4000, 1100000,22 , "cargo6", 9000);
		
		Building b1= new Building (1999, 89999, 3333, "cement");
		Building b2= new Building (1998, 22229, 1212, "wood");
		Building b3= new Building (1997, 13239, 5454, "rocks");
		Building b4= new Building (1996, 663999, 4343, "glass");
		Building b5= new Building (1995, 77999, 22222, "plastic");
		Building b6= new Building (1994, 39999, 1111, "paper");
		
		System.out.println();
		System.out.println("The objects have been created Task 3 A ended.");
		System.out.println();
		System.out.println("Starting Task 3 B.");
		//Making an array object strArr[] and putting the objects created inside it
		Structure StrArr[]= new Structure[42];
		
		StrArr[0]=o1;
		StrArr[1]=o2;
		StrArr[2]=hr2;
		StrArr[3]=o4;
		StrArr[4]=hr1;
		StrArr[5]=o3;
		StrArr[6]=hr3;
		StrArr[7]=hr4;
		StrArr[8]=o5;
		StrArr[9]=o6;
		StrArr[10]=hr5;
		StrArr[11]=hr6;
		StrArr[12]=h1;
		StrArr[13]=h2;
		StrArr[14]=h3;
		StrArr[15]=h4;
		StrArr[16]=c1;
		StrArr[17]=c2;
		StrArr[18]=c3;
		StrArr[19]=c4;
		StrArr[20]=h5;
		StrArr[21]=h6;
		StrArr[22]=c5;
		StrArr[23]=c6;
		StrArr[24]=co1;
		StrArr[25]=co2;
		StrArr[26]=co3;
		StrArr[27]=ca1;
		StrArr[28]=ca2;
		StrArr[29]=ca3;
		StrArr[30]=co4;
		StrArr[31]=co5;
		StrArr[32]=co6;
		StrArr[33]=ca4;
		StrArr[34]=ca5;
		StrArr[35]=ca6;
		StrArr[36]=b1;
		StrArr[37]=b2;
		StrArr[38]=b3;
		StrArr[39]=b4;
		StrArr[40]=b5;
		StrArr[41]=b6;
		
		
		System.out.println();
		System.out.println("Task 3 B is now ending");
		System.out.println();
		System.out.println("Commencing task 3 C");
		System.out.println();
		//calling the method to search through the array for tallest highrise
		double x=findTallestHighRise(StrArr);
		if(x!=1)
		{
			System.out.println("Tallest HighRise was found at index "+ (int)x+ " Here is the info for that object ");
			System.out.println(StrArr[(int) x]);
			System.out.println();
			System.out.println("Task 3 C is now ending");
			
		}
			else{
			System.out.println("No HighRise Objects found in the array");
			System.out.println(StrArr[(int) x]);
			System.out.println();
			System.out.println("Task 3 C is now ending");
		}
		
		
		System.out.println();
		System.out.println("Task 3 D is now Starting");
		System.out.println("Due to using void in my static method, there wasnt a possibility For the test case here");
		System.out.println();
	
		//displaying information with the displayBuildingInfo method
		showBuildingInfo(StrArr);
		System.out.println();
		System.out.println("Task 3 D is now ending");
		System.out.println();
		System.out.println("Task 3 E is now commencing");
		System.out.println("Due to using void in my static method, there wasnt a possibility For the test case here");
		System.out.println();
		displayAllObjects(StrArr);
		System.out.println();
		System.out.println("Task 3 E now ending");
		System.out.println();
		System.out.println("Task 3 F now commencing");
		System.out.println();
	

		//Creating a copy array to replicate the values of the existing one
		//Calling the method to perform the task
		Structure copyarr[]=copyStructures(StrArr);
		displayAllObjects(copyarr);
		System.out.println("Task 3 F now ending ");
		System.out.println();
		System.out.println("Task 4 A now commencing");
		System.out.println();
		//creating an arraylist of Structure
		ArrayList <Structure> strArrLst= new ArrayList<Structure>(30);
		System.out.println("Task 4 A now ending strArrLst initialized");	
		System.out.println();
		System.out.println("Task 4 B now commencing");
		System.out.println();
		//implementing the information of the StrArr to the arraylist
		for(int i=0;i<42;i++){
			strArrLst.add(StrArr[i]);
		
		}
		System.out.println(strArrLst);
		System.out.println();
		System.out.println("Task 4 B now ending");
		System.out.println();
		System.out.println("Task 4 C now commencing");
		System.out.println();
		//testing out the remove from arraylists
		strArrLst.remove(2);
		strArrLst.remove(32);
		strArrLst.remove(16);
		strArrLst.remove(1);
		strArrLst.remove(37);
		System.out.println(strArrLst);
		System.out.println();
		System.out.println("Array was printed to check if removed.");
		System.out.println();
		System.out.println("Task 4 C now Ending");
		System.out.println();
		System.out.println("Task 4 D now commencing");
		System.out.println();
		
		System.out.println("Testing of deleted element");
		//using the built in method contains to check if the element still exists
		if(strArrLst.contains(o2)){
			System.out.println("The element o2 was suppose to be deleted but it seems to be there");
			System.out.println("Found at index 1");
		}
		else{
			System.out.println("There is no element of such as it was removed");
		}
		System.out.println();
		System.out.println("Testing of existing element");
		if(strArrLst.contains(o5)){
			System.out.println("The element o5 is suppose to be here and will exist if this statement is printed ");
			System.out.println("it is found at index: "+8);
		}
		else{
			System.out.println("It seems a misshap has occured since element o5 does exist");
		}
		System.out.println();
		System.out.println("Task 4 D is now ended");
		System.out.println();
		System.out.println("Task 5 A now commencing");
		System.out.println();
		
		PrintWriter pw;

		//creating a file AirportCodes
		pw= new PrintWriter(new FileOutputStream("AirportCodes.txt"));
		
		System.out.println("Task 5 A now ending, file was created");
		System.out.println();
		System.out.println("Task 5 B now commencing");
		System.out.println();
		System.out.println("The method has stored the codes in the txt file");
		System.out.println();
		System.out.println("Task 5 B now Ending");
		System.out.println();
		System.out.println("Task 5 C now Commencing");
		System.out.println();
		//Searching file with the method for codes of the airplane objects
		findExistingAirportCodes(pw,StrArr);
		System.out.println("Task 5 C now Ending the method was called");
		System.out.println();
		
		System.out.println("Task 5 D now starting");
		System.out.println();
		//Using bufferedreader to read the file
		BufferedReader br=null;
		br= new BufferedReader(new FileReader("AirportCodes.txt"));
		String line="";
		while ((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		
		System.out.println();
		System.out.println("Task 5 D now Ending");
		System.out.println();
		System.out.println("Task 5 E now starting");
		System.out.println();
		System.out.println("The method displaying airport codes is created ");
		
		System.out.println();
		System.out.println("Task 5 E now Ending");
		System.out.println();
		System.out.println("Task 5 F now Starts");
		System.out.println();
		displayAirportCodes(br);
		System.out.println("The method was not able to display the codes with read(), however using readline they were displayed in 5 D");
		System.out.println();
		System.out.println("Task 5 F now Ending");
		br.close();
		
		System.out.println();
		System.out.println();
		System.out.println("Starting Task 6 D, ABC were done in the StructureList class");
		System.out.println();
		StructureList s1= new StructureList();
		StructureList s2= new StructureList();
		StructureList s3= new StructureList();
		
		s1.addToStart(b6);
		s1.addToStart(o4);
		s1.addAtEnd(ca1);
		
		s2.addToStart(b3);
		s2.addToStart(o6);
		s2.addAtEnd(ca3);
		
		//The append method was not completed.
		//s1.append(s2);
		
		s3=s2.clone();
		
		s1.showListsContents();
		s2.showListsContents();
		s3.showListsContents();
		System.out.println();
		System.out.println("Ending Task 6");
		System.out.println();
		System.out.println("Thank you for using the program!");
	}

	//The findTallestHighRise method is used to identify the tallest highrise
	//The creation of a temporary value is required to compare which building is taller
	//when going through the array with for loop. the getHeight method is used to obtain the height value.
	//Task 3 C
	public static double findTallestHighRise(Structure strArr[]){
		double temp=( strArr[0]).getHeight();
		int index=0;
		for(int i=0; i<42;i++){
			if(( strArr[i]).getHeight()>temp){
				temp=( strArr[i]).getHeight();
				index=i;
			}
		}
		return index;
	}
	
	//This method is to display specifically building informations
	//For the purpose of the displayement ive simply chosen values the buildings had to identify
	//them and display their info. A for loop was used to iterate through the array.
	//Task 3 D
	public static void showBuildingInfo(Structure srtArr[]){
		
		for(int i=0;i<42;i++){
			
			if(srtArr[i].getYearOfCreation()==1999||srtArr[i].getYearOfCreation()==1998||srtArr[i].getYearOfCreation()==1997||srtArr[i].getYearOfCreation()==1996||srtArr[i].getYearOfCreation()==1995||srtArr[i].getYearOfCreation()==1994){
				System.out.println(srtArr[i]);
			}
		}
		
	}
	//This method was required to display information recursively
	//The information was displayed backwards
	//it was too late before i realized my mistake as i didnt call the function to recursively display
	//,hence left it as it is...
	//Task 3 E
	public static void displayAllObjects(Structure strArr[]){
		
		for(int i=42;i>=1;i--){
			if(i==42){
				System.out.println("Start from the back");
			}
			else{
				System.out.println(strArr[i-1]);
				System.out.println();
			}
		}
	}
	//This method allows to create a copy of an array due to the usage of the clone method.
	//Creating a copyarray and iterating it through the for loop
	//with the clone method allows each array index to be copied.
	//Task 3 F
	public static Structure[] copyStructures(Structure strArr[]){
		
		Structure[] tocopyarray=new Structure[42];
		for(int i=0;i<42;i++){
			tocopyarray[i]= strArr[i].clone();
		}
		return tocopyarray;
		
		
	}
	//The following method was to find the airport codes
	//Essentially i iterated through the array with for loop 
	//checking which values had the code and print them if they werent null
	//Task 5 B
	public static void findExistingAirportCodes(PrintWriter pw, Structure [] s){
		
		for(int i=0;i<42;i++){
			if(s[i].getCode()!=null){
				
		
				pw.println("The code is: "+s[i].getCode());
			
			}
		}
		pw.close();
		}
	//The following code was to display airport codes using the read() method
	//However, the code did not function as seen in the compiler hence,.
	//Alternatively i used readline in 5 D to display the info
	//Task 5 E
	public static void displayAirportCodes(BufferedReader br) throws IOException{
		
		int i=0;
		while((i=br.read())!=-1){	
			char a= (char)i;
			System.out.println(a);
		}
		
		
	}
}
