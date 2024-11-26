import java.util.Scanner;
public class Match 

{

	public static void main(String[] args)
	
	
	
	{
		// TODO Auto-generated method stub

		Scanner keyIn= new Scanner(System.in);
		int o;
		String[] teams16 = {"Uruguay", "Portugal", "France", "Argentina", "Brazil", "Mexico",
				"Belgium", "Japan", "Spain", "Russia", "Croatia", "Denmark", "Sweden", "Switzerland",
				"Colombia", "England"};
		
		System.out.println("Enter your desired team to win:");
		
		System.out.println(teams16[0]+teams16[1]);
			String fav=keyIn.nextLine();
		
				
		if(fav.toLowerCase().equals(teams16[o].toLowerCase()))
		{
			System.out.print("kk");
		}
		else
		System.out.println("Your team is not in the Round of 16");
		
		
		
		
		keyIn.close();
	}

}
