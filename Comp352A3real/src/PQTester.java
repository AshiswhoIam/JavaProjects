import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * Ashiqur Rahman
 * 40096265
 * Comp 352 A3
 */
/*
 * The Following assignment was meant for us to create an Entry interface which would take in consideration
 * 4 different types of priority queues to which we have to implement their methods with the given conditions and then
 * test trial the methods. We were to test the time of remove min and insert methods for each. However due to poor
 * implementation on my behalf there were many discrepencies that prevented the program from functioning.
 */
public class PQTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Display message
		System.out.println("Welcome to Assignment 3");

		//locating files through path
		File f1 = new File("C:/Users/Ashiqur Rahman/workspace/Comp352A3real/elements_test_file1.txt");
		Scanner s1 = null;
		try {
			s1 = new Scanner(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f2 = new File("C:/Users/Ashiqur Rahman/workspace/Comp352A3real/elements_test_file2.txt");
		Scanner s2 = null;
		try {
			s2 = new Scanner(f2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f3 = new File("C:/Users/Ashiqur Rahman/workspace/Comp352A3real/elements_test_file3.txt");
		Scanner s3 = null;
		try {
			s3 = new Scanner(f3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//creating test runs for each of 4 class
		MyPQUnsortedArray<Integer,String> pq1 = new MyPQUnsortedArray<Integer,String>();
		MyPQSortedArray<Integer,String> pq2 = new MyPQSortedArray<Integer,String>();
		MyPQUnsortedList<Integer,String> pq3 = new MyPQUnsortedList<Integer,String>();
		MyPQSortedList<Integer,String> pq4 = new MyPQSortedList<Integer,String>();

		Scanner key = new Scanner(System.in);
		// user input
		System.out.println("Enter THe N you desire");
		int stop=1;

		int N = key.nextInt();
		
		//time start
		long s = System.nanoTime();

		//method start
		if(N>1 && N<100000){
			while(s1.hasNextLine()) {
				pq1.removeMin(stop, s1.nextLine());
				++stop;
			}
		}
		if(N>10000 && N<100000){
			while(s2.hasNextLine()) {
				pq1.removeMin(stop, s2.nextLine());
				
			}
		}
		
		if(N>100000 && N<1000000){
			while(s3.hasNextLine()) {
				pq1.removeMin(stop, s3.nextLine());
				
			}
		}
		//end of time for method
		long et = System.nanoTime();			
		double duri = (double) (et - s);
		System.out.println("the time it has taken to run the program was"+duri);
		
		
		//Doing the same for  insert method
		long s22 = System.nanoTime();
		if(N>1 && N<100000){
			while(s1.hasNextLine()) {
				pq1.insert(stop, s1.nextLine());
				++stop;
			}
		}
		if(N>10000 && N<100000){
			while(s2.hasNextLine()) {
				pq1.insert(stop, s2.nextLine());
				
			}
		}
		
		if(N>100000 && N<1000000){
			while(s3.hasNextLine()) {
				pq1.insert(stop, s3.nextLine());
				
			}
		}
		long et2 = System.nanoTime();			
		double duri2 = (double) (et2 - s22);
		System.out.println("the time it has taken to run the program was"+duri2);
		//closing scanners
		s1.close();
		s2.close();
		s3.close();
		System.out.println("The program has now ended");
	}

}
