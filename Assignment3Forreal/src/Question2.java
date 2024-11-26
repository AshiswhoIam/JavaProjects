import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		System.out.print("House1:");
		House Houseobj= new House(50,"Attached",100000.0);
		Houseobj.reString();	
		Houseobj.reAge();

		Houseobj.reCost();

		System.out.println();
		System.out.print("House2:");
		
		House Houseobj2= new House(2000-50,"Attached",100000.0);
		Houseobj2.reString();	
		Houseobj2.reAge();

		Houseobj2.reCost();
		System.out.println();
		System.out.print("House3:");
		
		House Houseobj3= new House(4,"Attached",120000.0);
		
		Houseobj3.reString();
		Houseobj3.reAge();
		Houseobj3.reCost();
		
		System.out.println();
		System.out.print("House4:");
		
		House Houseobj4= new House(2,"Detached",120000.0);

		Houseobj4.reString();
		Houseobj4.reAge();

		Houseobj4.reCost();


		System.out.println();
		System.out.println();
		System.out.print("Accessor Method:");
		Houseobj4.reString();
		Houseobj4.reAge();

		Houseobj4.reCost();
		System.out.println();
		System.out.println();
		//System.out.println("Mutator Method:");
		
		
	
		Houseobj3= new House(3,"semi-detached",240000.0);
		Houseobj3.newreAge();
		Houseobj3.newreString();
		Houseobj3.newreCost();
		
		
		Houseobj3= new House(6,"",245000.0);
		Houseobj3.reAll();
		
		
		Houseobj3= new House(14,"semi-detached",260000.0);
		Houseobj3.reAll2();
		
		System.out.println();
		System.out.println("toString: "+Houseobj3.toString());
		System.out.println();
		
		if(Houseobj.equals(Houseobj2))
		{
			System.out.println("House1 is and House2 are equal is true");			
		}
		else
		{
			System.out.println("House1 is and House2 are equal is false");	
		}
		
		
		key.close();
	}

}
