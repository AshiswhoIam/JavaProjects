import java.util.*;
import java.awt.Rectangle;
import java.io.*;
public class Mainforfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		PrintWriter o = new PrintWriter(new BufferedWriter(new FileWriter(("tfile.txt"))));
		
		System.out.println("learning fiels");
		
		//ok so bascially these are to write into a file.
		o.println(29.32);
		o.println(new Rectangle(3,12,21,32));
		o.println("ok we learning to print");
		o.write((int) 29.32);
		o.write("idk i doesnt work");
		
		//here we gonna try to print out text files content.
		//BufferedReader b= new BufferedReader(new FileReader ("C:/Users/Ashiqur Rahman/workspace/tryingtopracticeforfinals/tfile.txt"));
		try (BufferedReader br = new BufferedReader(new FileReader("tfile.txt"))) {
			   String line = null;
			   while ((line = br.readLine()) != null) {
			       System.out.println(line);
			   }
			}
		
		System.out.println(o);	
		//System.out.println(texting);	
		o.close();

	}

}
