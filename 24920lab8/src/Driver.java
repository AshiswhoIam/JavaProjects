import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key= new Scanner(System.in);
		System.out.println("Welcome to lab 8");
		System.out.println();
		
		Record [] r= new Record[10];
		Record r1= new Record("Johny","help me",2020,10,1234);
		Record r2= new Record("Adel","hello",2025,10,1111);
		Record r3= new Record("JB","bb",2220,10,2222);
		Record r4= new Record("EM","afraid",2620,10,3333);
		Record r5= new Record("ED","cries",1020,10,4444);
		Record r6= new Record("KAren","manager",5020,10,5555);
		Record r7= new Record("Reddit","memes",8020,10,1232);
		Record r8= new Record("home","not alone",2050,10,1999);
		Record r9= new Record("yikes","yikesssss",2330,10,2123);
		Record r10= new Record("t1","no mana",2055,10,7677);
		
		String nameOfFile;		
		System.out.println("Enter file name");

		nameOfFile=key.nextLine();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try{
		oos = new ObjectOutputStream(new FileOutputStream(nameOfFile));
		r2.setName("Adele");
		r10.setName("Tyler");
		r1.setSong("pls really help me");
		r4.setSong("not afraid");
		r5.setSong("Cry me a river");
		oos.writeObject(r1);
		oos.writeObject(r2);
		oos.writeObject(r3);
		oos.writeObject(r4);
		oos.writeObject(r5);
		oos.writeObject(r6);
		oos.writeObject(r7);
		oos.writeObject(r8);
		oos.writeObject(r9);
		oos.writeObject(r10);
		
		
		
		oos.close();
		}
		catch (IOException e){
			System.out.println("Err on file: " + nameOfFile + ".");
			System.out.println("Termination...");
			System.exit(0);		

		}
		
		try {
			
		
			ois = new ObjectInputStream(new FileInputStream(nameOfFile));
			Record record;
			int count=1;
			
			System.out.println("Info will now display: "+nameOfFile);
			System.out.println();
			
			try{
				while(true){
					
					
					record=(Record)ois.readObject();
					
					System.out.println("Heres the info for obj: "+count++);
					System.out.println();
					System.out.println(record);
				}
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
	
	

}
