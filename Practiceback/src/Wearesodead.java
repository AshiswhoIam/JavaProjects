import java.util.*;
public class Wearesodead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Key= new Scanner(System.in);
		
		System.out.println("A basic sentence!");

		// some random comment
		
		System.out.println("Usin the input for a numb.");
		
		int itsanumb=Key.nextInt();
		
		System.out.println("numb done");
		
		String testing="Hola";
		
		System.out.println(testing.substring(0,2));
		
		System.out.println("Now a loop, pyramid");
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5-i;j++)
			{
				System.out.print(" ");
				
			}	
			  for(int k=0; k<=i; k++)
			  {
			  
				  System.out.print("*");
			  
			  }
			  System.out.println();
		}
			
		int day=3;
		
		switch(day){
		case 1:
			System.out.println("rip");
			break;
		case 2:
			System.out.println("hibye");
			break;
		case 3:	
			System.out.println("not today");
			break;
			
		
		}
		
		
		
		}
			

		
		
		
		
		
		
	}


