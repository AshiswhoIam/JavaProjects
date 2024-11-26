import java.util.*;
public class MainDriverLetsPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key= new Scanner(System.in);

		System.out.println("*************************************");
		System.out.println("Welcome to Crazy Nancy's Garden Game!");
		System.out.println("*************************************");
		System.out.println("To win this game you need some luck with the dice and a bit of strategy.  ");
		System.out.println("Your garden is an NxN lot. You can plant flowers or trees. A flower takes one spot ");
		System.out.println(". A tree takes 4 spots (2x2).  ");
		System.out.println("You roll the dice and based on the outcome you get to plant a pre-set number of trees and flowers. ");


		//garden size
		System.out.println("The default garden size is a 3x3 square. You can use this default board size or change the size");
		System.out.println("Enter 0 for the default or any number to choose");
		int choosegarden=key.nextInt();
		if(choosegarden==0)
		{
			System.out.println("You have chosen the default, Enter 3");

		}
		if(choosegarden!=0)
		{
			System.out.println("You have decided to choose your own enter the number");
		}
		int usergardensize=key.nextInt();

		//Add while statement in if to loop
		//player number
		System.out.println("How many gardeners will there be (minimum 2 required to play, max allowed 10)? ");
		int userinput=key.nextInt();

		System.out.println("You have chosen: "+userinput+" people to play with");
		System.out.println("Enter their names pls");


		//Some default size to change after


		Player [] Players = new Player[userinput];

		for(int i=0;i<userinput;i++)
		{
			String playernames=key.next();


			Player p1= new Player(playernames,usergardensize);

			Players[i]=p1;

			System.out.println("Player is: "+p1.getName());

			Players[i].showGarden();			

		}	
		System.out.println();

		//Dice [] SomeD = new Dice[userinput];
		int []Dices =new int[userinput];

		boolean hasDuplicates = true;

		while(hasDuplicates){
			for(int i=0;i<userinput;i++)
			{

				Dice UserDice=new Dice();

				Dices[i]=UserDice.rollDice();

				System.out.println("Player "+Players[i].getName()+" rolled : "+Dices[i]);

			}
			hasDuplicates = false;
			for(int i=0;i<Dices.length-1;i++)
			{
				for(int j=i+1;j<Dices.length;j++)
				{
					if(Dices[i]==Dices[j])
					{
						System.out.println("The dices will be rolled again because of same values");
						hasDuplicates = true;
						break;
					}
				}
			}
		}
		int max=0;		
		int indexmax=0;

		max	=Dices[0];
		for(int i=0;i<userinput;i++){

			if(Dices[i]>max)
			{
				max=Dices[i];	
				indexmax=i;
			}

		}

		System.out.println();
		System.out.println("The highest roll for who to start with : "+max+" by: "+Players[indexmax].getName());

		//Doing who in the array will start and continuing with the person
		//is it ok to use same array???
		int i =indexmax;
		boolean stop=false;
		do{				

			int numrounds=0;
			numrounds++;
			Dice UserDice=new Dice();

			Dices[i]=UserDice.rollDice();

			System.out.println(Players[indexmax].getName()+" Rolled :"+Dices[i]);
			System.out.println();

			if(Dices[i]==3)
			{

				System.out.print("Enter the coordinates to plant a tree: ");
				int r=key.nextInt();
				int c=key.nextInt();
				System.out.println();
				Players[i].plantTreeInGarden(r, c);


				System.out.print("Enter coordinates to plant a  flower: ");
				r=key.nextInt();
				c=key.nextInt();
				System.out.println();
				Players[i].plantFlowerInGarden(r, c);



			}

			if(Dices[i]==6)
			{
				System.out.print("Enter coordinates to plant a  flower: ");
				int r=key.nextInt();
				int c=key.nextInt();
				System.out.println();
				Players[i].plantFlowerInGarden(r, c);

				System.out.print("Enter coordinates to plant a  flower again: ");
				r=key.nextInt();
				c=key.nextInt();
				System.out.println();
				Players[i].plantFlowerInGarden(r, c);


			}
			if(Dices[i]==12)
			{

				System.out.print("Enter the coordinates to plant a tree: ");
				int r=key.nextInt();
				int c=key.nextInt();
				System.out.println();
				Players[i].plantTreeInGarden(r, c);


				Players[i].whatisPlanted( r, c);
				System.out.print("Enter the coordinates to plant a tree: ");
				r=key.nextInt();
				c=key.nextInt();
				System.out.println();
				Players[i].plantTreeInGarden(r, c);

			}

			if(Dices[i]==5||Dices[i]==10)
			{
				if(Players[i].howManyFlowersPossible() == Math.pow(userinput,2)){
				System.out.print("Nothing to eat");
				continue;
				}			
				
				int r=(int) (Math.random()*userinput);
				int c=(int) (Math.random()*userinput);

				System.out.print("r = " + r + " c = " + c);
				Players[i].eatHere(r, c);
				
				/*if(Players[i].isGardenEmpty())
				{
					System.out.print("Testing to see if working");

					while(Players[i].whatisPlanted(r,c) == '-')
					{	
						r= ((int)Math.random()*userinput);
						c= ((int)Math.random()*userinput);
					}	
					
					Players[i].eatHere(r, c);
			}	*/			
				
			}			
			
			if(Dices[i]==2||Dices[i]==4||Dices[i]==8)
			{			
				System.out.print("Enter the coordinates to plant a tree: ");
				System.out.println("There are: "+Players[i].howManyTreesPossible()+" Trees");
				
				int r=key.nextInt();
				int c=key.nextInt();
				if(Players[i].whatisPlanted( r, c)!='-'&&Players[i].whatisPlanted( r+1, c)!='-'&&Players[i].whatisPlanted( r, c)+1!='-'&&Players[i].whatisPlanted( r+1, c+1)!='-')
				{

					System.out.println("No space to plant tress Your turn skipped");
					continue;
				}
				else
					Players[i].plantTreeInGarden(r, c);
				
				
			}
			
			
			if(Dices[i]==7||Dices[i]==9||Dices[i]==11)
			{
				System.out.print("Enter coordinates to plant a flower: ");
				System.out.println("There are : "+Players[i].howManyFlowersPossible()+"Places");
				
				
				
				int r=key.nextInt();
				int c=key.nextInt();
				System.out.println();
				Players[i].plantFlowerInGarden(r, c);
								

			}

			System.out.println("Player "+Players[i].getName());
			System.out.println();
			Players[i].showGarden();


			if(Players[i].isGardenFull()==true)
			{
				stop=true;
				System.out.println("The Winner is : "+ Players[i].getName()+" it took "+ "x" +" Rounds");
				System.out.println("Nice Garden");
				System.out.println("Hope you had fun!!");
			}


			i=(i+1)%userinput;

		}while(stop!=true);



		//Creating the if statement for if it<s full for trees
		/*	boolean varstop=true;
		do{
			int r=(int) (Math.random()*userinput);
			int c=(int) (Math.random()*userinput);

			if(Players[i].whatisPlanted(r, c)=='t')
			{
				System.out.println("Cannot fit trees in that space");
				varstop=false;
			}			
		}while(varstop!=false);
		 */
		/*Try2
 if(Players[i].whatisPlanted(int r,int c)!='-'&&Players[i].whatisPlanted(int r+1,int c)!='-'&&Players[i].whatisPlanted(int r,int c)+1!='-'&&Players[i].whatisPlanted(int r+1,int c+1)!='-')
 {
 System.out.println("There<s not enough space turn skipped");
 } 



		 */
		key.close();
	}


}
