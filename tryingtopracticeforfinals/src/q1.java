import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min =0;
		int max=0;
		int temp;
		int count =0;

		ObjectInputStream inputStream;

		try {

			inputStream = new ObjectInputStream(new FileInputStream("question11.dat"));


			try {
				min=max=inputStream.readInt();

				count++;
			}

			catch(Exception e) {

				System.out.println("exception was caught ending prgram");
				System.exit(0);
			}

			try {

				while(true) {
					temp=inputStream.readInt();
					count++;
					if(temp<min)
					{
						min= temp;
					}
					if(temp>max) {
						max=temp;
					}
				}
			}
			catch(EOFException e) {
				System.out.println("eofexception was caught but this is a technique");
				System.out.println(min+" "+max);

			}
			inputStream.close();



		}
		catch(IOException e) 
		{
			System.out.println("exception was caught");

		}
	
		finally{

		System.out.println("Finally over.");

	}
	}
}
