import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class somemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader file = null;
		try {
			file = new FileReader("C:/Users/Ashiqur Rahman/workspace/Comp249A3R2/log.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("fnotfoundexception was located ....");
		}
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
	}

}
