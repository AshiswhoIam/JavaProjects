import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Maindriver {

	private static String[] menu ={

		"Write interger File",
		"Read integer File",
		"View Employees",
		"write to emploesemosme to file",
		"Read to empleess form file",
		"Exit"
	};

	private static Scanner userInput;
	private static ArrayList<Employee> employees;

	private static void displayMenu(){

		for(int i=0; i<menu.length;i++){
			System.out.printf("[%d] %s \n", i,menu[i]);
		}

	}

	private static int selectOption(){

		return getUserInput("Please select a menu option",0,menu.length-1);
	}

	private static int getUserInput(String msg,int lower,int upper){
		boolean valid=false;
		int value =-1;
		while(!valid){
			System.out.println(msg+" > ");
			try{
			value = userInput.nextInt();	
			if(value>=lower && value<= upper){
					valid=true;
			}
			userInput.nextLine();
		}
			catch(Exception e){
				System.out.println("try again..........");
				userInput.nextLine();
				}
			}
		return value;
	}
	
	private static void createIntFile(){
		PrintWriter p =null;
		
		try{
			p =new PrintWriter("IntegerFile.txt");
			for(int i=0;i<100;i++){
				
				p.print(i);
				p.print(" ");
			}
		p.flush();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		finally{
			if(p!=null){
				p.close();
			}
		}
	}

	
	private static void readIntFile()
	{
		Scanner fileInput= null;
		
		try{
			 fileInput= new Scanner(new FileInputStream("IntegerFile.txt"));
			 
			 while(fileInput.hasNextInt()){
					System.out.printf("%d ", fileInput.nextInt());
			 }
			 
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		finally{
			if(fileInput!=null){
				fileInput.close();
				}
		}
		
	}
	
	public static void viewEmployees(){
		for(Employee e: employees){
			System.out.print(e);
		}
	}
	
	private static void writetoEmployeesToFile(){
		
		ObjectOutputStream oos=null;
		try{
			oos= new ObjectOutputStream(new FileOutputStream("objects.ser"));
			for(Employee e:employees){
				System.out.println("Writing empleoes"+e);
				oos.writeObject(e);
			}
		}
		catch(Exception e){
			System.out.print(e);
		}
		
		finally{
			if(oos!=null){
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	private static void readEmployeesFromFile(){
		employees.clear();
		ObjectInputStream ois=null;
		try{
			ois= new ObjectInputStream(new FileInputStream("objects.ser"));
			
			while(true){
				
				Employee newEmp= (Employee)ois.readObject();
				System.out.println("Read back employee"+ newEmp);
				employees.add(newEmp);
				
				
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			
			if(ois!=null){
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		userInput= new Scanner(System.in);
		
		employees= new ArrayList<Employee>();
		employees.add(new Employee("name1",1234));

		employees.add(new Employee("name2",2234));
		
		employees.add(new Employee("name3",4444));
		while(true){

			displayMenu();
			int userChoice= selectOption();
			
			switch(userChoice){
			case 0:
				createIntFile();
		
			break;
			case 1:
				readIntFile();
				break;
			case 2:
				viewEmployees();
			case 3:
				writetoEmployeesToFile();
			case 4:
				readEmployeesFromFile();
			case 5:
			System.exit(1);
			}
			
			
		}

	}

}
