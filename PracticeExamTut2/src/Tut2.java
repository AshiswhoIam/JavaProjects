import java.util.*;
public class Tut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key=new Scanner (System.in);
		
		System.out.println();
		

		//Question 1 easy
		
		//Question 2 easy
		
		//Question 3
		
		int iResult, num1 = 25, num2 = 40, num3 = 17, num4 = 5;
		
		double fResult, val1 = 17.0, val2 = 12.78;
		
		iResult = num1 / num4; // 5
		fResult = num1 / num4; // 5.0
		iResult = num3 / num4; // 3
		fResult = num3 / num4; // 3.0
		fResult = val1 / num4; // 3.4
		fResult = val1 / val2; // 1.3302034428794993
		iResult = num1 / num2; // 0
		iResult= num3 % num4; // 2
		iResult= num2 % num3; // 6
		iResult= num3 % num2; // 17
		iResult= num2 % num4; // 0
		
		//Question 4a
		
		String s1, s2, s3;
		s1 = "Quest for the holy Grail";
		s2 = s1.toLowerCase();
		s3 = s1 + " " + s2;
		System.out.println(s3.replace('h', 'z'));
		
		//4b
		
		String somestring="mississipi";
		
		System.out.println(somestring.length());
		System.out.println(somestring.length()-1);
		System.out.println(somestring.substring(0, somestring.length()));
		
		//4c
		
		String s="Agent";
		System.out.println(s+s.length());
		
		//4d
		
		String name = "Your Name Here";
		System.out.println(name.substring(9));
		System.out.println(name.substring(1,6));
		System.out.println(name.substring(1, name.length()-1));
		System.out.println(name.length());
		System.out.println(name.indexOf('r'));
		System.out.println(name.indexOf('n'));
		
		
		//Question 5
		
		System.out.println("result: 3+4"); // result: 3+4
		System.out.println("result: " + 3+4); // result: 34
		System.out.println("result: " + 3+"4"); // result: 34
		System.out.println("result: " + (3+4)); // result: 7
		
		
		//Question 5b
		//Not finished must implement quotes
		System.out.println("The file is in c:\\Temp\\theFile.txt");
		
		//Question 5c
		//Weird af
		/*C- Suppose that the variable in is a Scanner object that reads from System.in,
		 * and your program calls: String name = in.next();
		 * What is the value of name if the user enters John Q. Public?
		 * name = "John"*/
		
		//Question 6 & 7 must look at the sheet..
		
		
	}

}
