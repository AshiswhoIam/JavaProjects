// ----------------------------------------------------- 
// Assignment 2 
// Question: 1
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
/*
 * In General the program is suppose to print out all the information that was hardcoded in this case,
 * using the methods in the different packages. It also demonstrates the use of the equals methods.
 * In addition, there's a process to search for the games with the most players, the least time played
 * and as well if they are from similar studios. This was done using a for loop and verify each case with another;
 * Lastly there's the static method which was suppose to duplicate an array and when calling it would
 * it presumably would have duplicated the array of 14 that was in the main driver and display its contents.
 * However it was not the case for me as It is incomplete.
 */
/**
 * * @author Ashiqur Rahman (40096265)
 */
import java.util.*;

//Importing all necessary Packages
import Packageone.Game;
import Packagetwo.VideoGame;
import Packagethree.EducationalGame;
import Packagethree.RPGGame;
import Packagefour.BoardGame;
import Packagefive.CardGame;
import Packagetwo.VideoGame.gamingPlatform;



public class Maindriver {

	//Static method with Game Object as array required at the end to duplicate contents of an array and display them
	public static Game gameSimilarTo(Game[] Game){
		int u=14;
		Game[] newGameArray= new Game[u];
		for(int t=0;t<15;t++){


			newGameArray[u]=Game[u];
			System.out.println(newGameArray[u]+"\n");

		}

		return newGameArray[u];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner key= new Scanner (System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Ash's software application that helps explore the gaming demographic in canada.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		//Creating the required variables for the Game objects
		String ttt="TicTacToe";
		int nbpg1=2;
		int gameTimeg1=3;
		String connect4="Connect four";
		int nbpg2=2;
		int gameTimeg2=6;
		String Minesweeper="Minesweeper";
		int nbpg3=1;
		int gameTimeg3=10;

		//Creating the required variables for the VideoGame Objects
		String AB="AngryBrids";
		int playerAB=1;
		int timeAB=8;
		int priceAB=3;
		String studioAB="Rovio Entertainment";
		gamingPlatform gamePlat1= gamingPlatform.IOS;

		String S="Slither";
		int playerS=10;
		int timeS=20;
		int priceS=5;
		String studioS="Lowtech Studios";
		gamingPlatform gamePlat2= gamingPlatform.ANDROID;

		String Halo="Halo 3";
		int playerHalo=1;
		int timeHalo=3470;
		int priceHalo=59;
		String studioHalo="Bungie";
		gamingPlatform gamePlat3= gamingPlatform.XBOXONE;

		
		//Creating the required variables for the EducationalGame Objects
		String MB="Match Blitz";
		int playerMB=4;
		int timeMB=30;
		int priceMB=1;
		String studioMB="Shiny Things";
		gamingPlatform gamePlat4= gamingPlatform.IOS;
		String SubLearn="Perception/Concentration";

		String MP="Math Party";
		int playerMP=2;
		int timeMP=15;
		int priceMP=1;
		String studioMP="Nicolas Lehovetzki";
		gamingPlatform gamePlat5= gamingPlatform.IOS;
		String SubLearn2="Math";

		//Creating the required variables for the RPGGame Objects
		String P5="Persona 5";
		int playerP5=1;
		int timeP5=6000;
		int priceP5=29;
		String studioP5=" Atlus P Studio";
		gamingPlatform gamePlat6= gamingPlatform.PS4;
		String GameWorld="The Real World";

		String D="Diablo III";
		int playerD=4;
		int timeD=790;
		int priceD=49;
		String studioD=" Blizzard Entertainment";
		gamingPlatform gamePlat7= gamingPlatform.PS4;
		String GameWorld2="Fantasy World";

		//Creating the required variables for the BoardGame Objects
		String chess="Chess";
		int playersChess=2;
		int gameTimeChess=25;
		boolean turnsChess=true;

		String Ludo="Ludo";
		int playersLudo=4;
		int gameTimeLudo=30;
		boolean turnsLudo=true;

		//Creating the required variables for the CardGame Objects
		String Uno="Uno";
		int playersUno=5;
		int gameTimeUno=19;
		int nbCardsUno=108;
		int nbCardTypeUno=4;

		String Poker="Poker";
		int playersPoker=7;
		int gameTimePoker=45;
		int nbCardsPoker=52;
		int nbCardTypePoker=4;

		
		//Creation of multiple objects from all 6 different classes with variables respect to their constructors.
		
		Game g1= new Game(ttt,nbpg1,gameTimeg1);
		Game g2= new Game(connect4,nbpg2,gameTimeg2);
		Game g3= new Game(Minesweeper,nbpg3,gameTimeg3);



		VideoGame v1= new VideoGame(AB,playerAB,timeAB,priceAB,studioAB,gamePlat1);
		VideoGame v2= new VideoGame(S,playerS,timeS,priceS,studioS,gamePlat2);
		VideoGame v3= new VideoGame(Halo,playerHalo,timeHalo,priceHalo,studioHalo,gamePlat3);


		EducationalGame e1= new EducationalGame(MB,playerMB,timeMB,priceMB,studioMB,gamePlat4,SubLearn);
		EducationalGame e2= new EducationalGame(MP,playerMP,timeMP,priceMP,studioMP,gamePlat5,SubLearn2);

		RPGGame r1=new RPGGame(P5,playerP5,timeP5,priceP5,studioP5,gamePlat6,GameWorld);
		RPGGame r2=new RPGGame(D,playerD,timeD,priceD,studioD,gamePlat7,GameWorld2);

		BoardGame b1=new BoardGame(chess,playersChess,gameTimeChess,turnsChess);
		BoardGame b2=new BoardGame(Ludo,playersLudo,gameTimeLudo,turnsLudo);

		CardGame c1=new CardGame(Uno,playersUno,gameTimeUno,nbCardsUno,nbCardTypeUno);
		CardGame c2=new CardGame(Poker,playersPoker,gameTimePoker,nbCardsPoker,nbCardTypePoker);


		//Creating of the Game Object array which holds 14 objects
		Game GameObj[]=new Game[14];
		//Giving each array to store an object
		GameObj[0]=g1;
		GameObj[1]=g2;
		GameObj[2]=g3;
		GameObj[3]=v1;
		GameObj[4]=v2;
		GameObj[5]=v3;
		GameObj[6]=e1;
		GameObj[7]=e2;
		GameObj[8]=r1;
		GameObj[9]=r2;
		GameObj[10]=b1;
		GameObj[11]=b2;
		GameObj[12]=c1;
		GameObj[13]=c2;




		//Displaying all necessary contents
		System.out.println();
		System.out.println(	g1.toString());
		System.out.println();
		System.out.println(	g2.toString());
		System.out.println();
		System.out.println(	g3.toString());
		System.out.println();
		System.out.println(	v1.toString());
		System.out.println();
		System.out.println(	v2.toString());
		System.out.println();
		System.out.println(	v3.toString());
		System.out.println();
		System.out.println(	e1.toString());
		System.out.println();
		System.out.println(	e2.toString());
		System.out.println();
		System.out.println(	r1.toString());
		System.out.println();
		System.out.println(	r2.toString());
		System.out.println();
		System.out.println(	b1.toString());
		System.out.println();
		System.out.println(	b2.toString());
		System.out.println();
		System.out.println(	c1.toString());
		System.out.println();
		System.out.println(	c2.toString());
		System.out.println();

		//Displaying the equals method with different objects
		System.out.println("Here are some demonstrations of equals method of different objects: ");
		System.out.println();
		System.out.println(c1.equals(c1));
		System.out.println(c1.equals(c2));
		System.out.println(v1.equals(g1));
		System.out.println(g1.equals(b2));
		System.out.println(e1.equals(e1));
		System.out.println(r1.equals(v3));
		System.out.println();

		

		//Use of for loop to search each game to find which has the most players in it using getNumPlayers
		for(int x=0;x<GameObj.length;x++)
		{
			if(GameObj[x].getNumPlayers()>GameObj[0].getNumPlayers()){
				GameObj[0]=GameObj[x];
			}

		}
		System.out.println("The game with the most players is:"+ GameObj[0].getName()+"\nIts details are: \n"+ GameObj[0].toString());

		System.out.println();
		
		//Use of for loop to search each game to find which has the least game time played
		for(int i=0;i<GameObj.length;i++)
		{
			if(GameObj[i].getGameTime()<GameObj[0].getGameTime()){
				GameObj[0]=GameObj[i];
			}

		}
		System.out.println("The game with the least amount of game time is:"+ GameObj[0].getName()+"\nIts details are: \n"+ GameObj[0].toString());

		System.out.println();




		//Creation of VideoGame array object
		//PS I tried using the GameObj and Casting it but it did not work so i resorted to this
		VideoGame[] VdArray=new VideoGame[14];
		VdArray[3]=v1;
		VdArray[4]=v2;
		VdArray[5]=v3;
		VdArray[6]=e1;
		VdArray[7]=e2;
		VdArray[8]=r1;
		VdArray[9]=r2;
		//Setting loop values to games which have studio names displayed
		//Using equals with getGameStudio to find similarities
		for(int j=3;j<9;j++)
		{

			if(VdArray[j].getGameStudio().equals(VdArray[9].getGameStudio()))
			{
				System.out.println("The similar studio games are:"+VdArray[0].getGameStudio()+" and "+VdArray[j].getGameStudio()+"\nThe details are: \n"+VdArray[0].toString()+VdArray[j].toString()+"at index"+j+" and "+0);

			}
			else
			{
				if(j==8)
					System.out.println("All the games are from different studios.");

			}			
		}
		
		
		//Creating array of 14 for part 2
		GameObj[0]=g1;
		GameObj[1]=g2;
		GameObj[2]=g3;
		GameObj[3]=v1;
		GameObj[4]=v2;
		GameObj[5]=v3;
		GameObj[6]=e1;
		GameObj[7]=e2;
		GameObj[8]=r1;
		GameObj[9]=r2;
		GameObj[10]=b1;
		GameObj[11]=b2;
		GameObj[12]=c1;
		GameObj[13]=c2;

		
		//Trying to use gameSimilarTo() method
		try{
			for(int y=0;y<15;y++){
				gameSimilarTo(GameObj);				
			}

		}
		catch(Exception e){
			System.out.println("Copy did not work.");
		}


		//Trying to print out the copied objects using the gameSimilarTo() method
		try{
			for(int y=0;y<15;y++){
				System.out.println(gameSimilarTo(GameObj));				
			}

		}
		catch(Exception e){
			System.out.println("Copy did not work to print out.");
		}

	}

}
