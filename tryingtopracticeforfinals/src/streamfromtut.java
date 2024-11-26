import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class streamfromtut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream myOutputStream= null;
		Scanner key = new Scanner(System.in);
		int num,count=0;
		System.out.println("how many numb u want");
		count =key.nextInt();
		
		try {
			
			myOutputStream = new ObjectOutputStream(new FileOutputStream("question11.dat"));
			System.out.println("enter the number");
			for(int i=1;i<=count;i++)
				
			{
				num=key.nextInt();
				myOutputStream.writeInt(num);
			}
			myOutputStream.close();
		}
		
		
		
		
	catch(Exception e) {
		System.out.println("Exception caught"+e.getMessage());
	}
		System.out.println("File question11.dat successfully created");
		
		key.close();
	}

}
