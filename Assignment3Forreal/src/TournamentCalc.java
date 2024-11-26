// Assignment (3)
// Written by: Ashiqur Rahman Id:40096265
// For COMP 248 Section-(E-X)-Fall 2018
import java.util.Scanner;
public class TournamentCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Displaying Welcome message
		System.out.println("Welcome to the World Cup tournament match generator!"+"\n");

		Scanner key= new Scanner(System.in);

		String[] t16 = {"Uruguay", "Portugal", "France", "Argentina", "Brazil", "Mexico",
				"Belgium", "Japan", "Spain", "Russia", "Croatia", "Denmark", "Sweden", "Switzerland",
				"Colombia", "England"}; 	

		//Declaring strings as t with a number for other rounds
		String []t8 = new String[8];
		String []t4 = new String[4];
		String []t2 = new String[2];
		String []twin = new String[1];

		//Declaring array for points as pts for short with the number beside being the amount of teams
		int []pts16 = new int[16];
		int []pts8 = new int[8];
		int []pts4 = new int[4];
		int []pts2 = new int[2];

		
		//initializing variables to be used later
		int n=0;
		int c=0;

		System.out.print("Enter your favorite team: ");
		//String for user to enter their favorite team
		String fteam=key.nextLine();

		//Creating a for loop to check each one of the teams from array

		boolean counter=false;
		for(int x=0;x<16;x++)
		{
			if(fteam.replaceAll("\\s","").equalsIgnoreCase(t16[x]))
			{
				counter=true;
			}	
		}

		//Making the use of boolean with if, to determine the continuation
		if(counter)
		{
			do
			{
				int a=0;
				int b=0;	
				int j=0;
				
				System.out.print("Round of 16:");

				//Assigning the points randomly from 0-4 to 16teams
				for (int x = 0; x < 16; x++) {
					pts16[x] = (int) (Math.random() * 4);
				}

				//using for loop incremented by 2 to make first 2 teams face off
				for (int x = 0; x < 16; x += 2) 
				{
					while(pts16[x]==pts16[x+1])
					{
						int someteam=(int)(Math.random()*2);

						if(someteam==0)
						{
							int somevar=(int)(Math.random()*2);
							if(somevar==1){
								pts16[x]=pts16[x]+1;
							}
						}
						else{
							int somevar=(int)(Math.random()*2);
							if(somevar==1)
							{
								pts16[x]=pts16[x+1]+1;
							}
						}

					}

					System.out.print("[" + t16[x] + " " + pts16[x] +" :"  + pts16[1+x]+" " + t16[1+x]+"]" );

					if(pts16[x]>pts16[x+1])
					{

						t8[a]=t16[x];
						a++;
					}
					else
					{
						t8[a]=t16[x+1];
						a++;
					}

				}
				System.out.println();
				System.out.print("QUARTER FINALS:");
				for (int x = 0; x < 8; x++) 
				{
					pts8[x] = (int) (Math.random() * 4);
				}

				//using for loop incremented by 2 to make first 2 teams face off
				for (int x = 0; x < 8; x += 2) 
				{
					while(pts8[x]==pts8[x+1])
					{
						int someteam=(int)(Math.random()*2);

						if(someteam==0)
						{
							int somevar=(int)(Math.random()*2);
							if(somevar==1){
								pts8[x]=pts8[x]+1;
							}
						}
						else{
							int somevar=(int)(Math.random()*2);
							if(somevar==1)
							{
								pts8[x]=pts8[x+1]+1;
							}
						}

					}

					System.out.print("[" + t8[x] + " " + pts8[x] +" :"  + pts8[1+x]+" " + t8[1+x]+"]" );

					if(pts8[x]>pts8[x+1])
					{

						t4[j]=t8[x];
						j++;
					}
					else
					{
						t4[j]=t8[x+1];
						j++;

					}
				}
				System.out.println();
				System.out.print("SEMI-FINALS:");
				for (int x = 0; x < 4; x++) {
					pts4[x] = (int) (Math.random() * 4);
				}

				//using for loop incremented by 2 to make first 2 teams face off
				for (int x = 0; x < 4; x += 2) 
				{
					while(pts4[x]==pts4[x+1])
					{
						int someteam=(int)(Math.random()*2);

						if(someteam==0)
						{
							int somevar=(int)(Math.random()*2);
							if(somevar==1){
								pts4[x]=pts4[x]+1;
							}
						}
						else{
							int somevar=(int)(Math.random()*2);
							if(somevar==1)
							{
								pts4[x]=pts4[x+1]+1;
							}
						}

					}

					System.out.print("[" + t4[x] + " " + pts4[x] +" :"  + pts4[1+x]+" " + t4[1+x]+"]" );

					if(pts4[x]>pts4[x+1])
					{

						t2[b]=t4[x];
						b++;
					}
					else
					{
						t2[b]=t4[x+1];
						b++;

					}
				}

				System.out.println();
				System.out.print("FINALS:");
				for (int x = 0; x < 2; x++) {
					pts2[x] = (int) (Math.random() * 4);
				}

				//using for loop incremented by 2 to make first 2 teams face off
				for (int x = 0; x < 2; x += 2) 
				{
					while(pts2[x]==pts2[x+1])
					{
						int someteam=(int)(Math.random()*2);

						if(someteam==0)
						{
							int somevar=(int)(Math.random()*2);
							if(somevar==1){
								pts2[x]=pts2[x]+1;
							}
						}
						else{
							int somevar=(int)(Math.random()*2);
							if(somevar==1)
							{
								pts2[x]=pts2[x+1]+1;
							}
						}

					}


					System.out.println("[" + t2[x] + " " + pts2[x] +" :"  + pts2[1+x]+" " + t2[1+x]+"]" );
										
					if(pts2[x]>pts2[x+1])
					{					
						twin[n] =t2[x];
						System.out.println("Tournament: " + c +" The WINNER is: "+twin[n]);
						c++;
						
						
					}
					else
					{
						twin[n]=t2[x+1];
						System.out.println("Tournament: " + c +" The WINNER is: "+twin[n]);
						c++;
											
					}
										
				}					
					 
			}while(!fteam.equalsIgnoreCase(twin[n])&&(c<20));
			if(c<20)
			{System.out.println("It took "+ c +" tournament(s) for " + twin[n] +" to win!!! ");
			}
			else
				System.out.println("Sorry "+fteam+" did not win in 20 tournaments!");
	}
		
		
		else

			System.out.println("Your team is not in the Round of 16");
	
		key.close();
	}

}
