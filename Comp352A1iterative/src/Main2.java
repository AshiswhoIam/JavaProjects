/**
 * Ashiqur Rahman
 * 40096265
 * Comp 352 A1
 */
/*
 *The following below is the program done iteratively where we have to find all the possibilities given an X and O #.
 *The method used in this case was trying couting the # and multiplying to then put in a while loop as a limitation to
 *which it would print out all possible combinations however, that did not proceed as planned.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class Main2 {


	//method to make the possibilities
	public static void UnHide(char arr [],int position){

		// counter for #
		int count=0;
		// for loop to count #
		for (int i =0;i<arr.length;i++)
			if(arr[position]=='#'){

				count++;
			}
		int count2=0;
		//Maximize the possibilities
		count=count*count;
		//While loop used to iterate through all possibilities and print them out
		while(count2!=count&&arr[position]=='#'){

			count2++;
			if(arr[position]=='#'){
				arr[position]='X';
				System.out.println(arr);
				arr[position]='O';
				System.out.println(arr);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner
		Scanner key = new Scanner(System.in);
		//Dipslay msg
		System.out.println("Welcome to the iterative part");

		//Prompt user
		System.out.println("Enter your desired sequence of X O and #");
		String input= key.nextLine();

		//Array of characters
		char [] arr= new char[input.length()];
		//For loop to turn string into characters
		for (int i = 0; i < input.length(); i++) { 
			arr[i] = input.charAt(i); 
		} 
		System.out.println("The program will now commence");

		//creation of out.txt
		try{
			File somefile=new File("out.txt");
			if(somefile.createNewFile()){
				System.out.println("File created!");
			}
			else{
				System.out.println("File exists!!");
			}
		}catch (Exception e){
			System.out.println("filenotfoundexception.");
		}
		

		//Call of method
		//timing of method as well
		long start = System.nanoTime();
		
		for(int i =0;i<input.length();i++){
			UnHide(arr, i);
		}
		long end = System.nanoTime();

		long duration = (end - start);
		
		System.out.println("The method took "+duration+ " milliseconds");
		//writing on the file
		try{
			FileWriter w = new FileWriter("out2.txt");
			w.write(arr);
			w.close();
			System.out.println("It has been written on the file");
		}catch (Exception e){
			System.out.println("error.");
		}		
	}

}
