import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key= new Scanner(System.in);
		System.out.println("Welcome to lab 9");
		System.out.println();
		
		int min=5;
		int max=10;
		int number;
		
		
		number=min + (int)(Math.random() * ((max - min) + 1));
		
		
		Tribonacci []tb = new Tribonacci[number];
		
		System.out.println("the random number is:" + number);
		System.out.println();
		
		Tribonacci t = new Tribonacci();
	

		 try {
			FileWriter w = new FileWriter("tribo.txt", true);
			w.write("Numbers: "+String.valueOf(t.displays(number +1)));
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
