/*
 * Ashiqur Rahman 40096265
 * Assignment 2 comp 352
 * 10/25/2020
 * 
 * The following program was meant to create a magic board with random numbers in each square of it using a 2d array. 
 * 
 */

import java.util.*;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//display message
		System.out.println("Welcome to the magic board game");

		Scanner key= new Scanner(System.in);

		//size selector
		System.out.println("Enter desired size");
		int d;
		d= key.nextInt();

		//2d array
		int [] [] board= new int[d][d];
		int value;


		//variable for multi purposes
		int countz=0;
		int count=0;
		boolean stop=true;
		String position="";
		int circle= 0;
		int c1=0;
		
		//start of the board with for loop for rows
		for(int r=0;r<board.length;r++){

			count++;

	
		//for loop for the collums
			for(int c=0;c<board[r].length;c++){

				//implementing random number to each elements 
				board [r][c]=(int)(Math.random()*(1)) ;

				//taking in count if theres more than 1 zero
				if(board [r][c]==0){
					countz++;
				}

				//change the random number if more than 1 zero
				if((countz>=1)&&(board [r][c]==0)){

					/*
						while((board [r][c]==0)&&(countz>=1)){
						board [r][c]=(int)(Math.random()*(d+1)) ;
						}*/
					board [r][c]=(int)(Math.random()*(2)) ;
				}
				
				//to ensure a zero on the board
				if(((r==board.length-1)&&(c==board.length-1))&&(countz==0)){

					board [r][c]=0;
				}

				//display of the board
				System.out.print("|"+board [r][c]+"|");
			}
			System.out.println();


			//continuation to start 
			if(count==d){
				
				
				
				System.out.println();
				System.out.println("The above is the given magic board");
				System.out.println();
				System.out.println("Now below for the game to begin");
				System.out.println("Please enter the position you would like to start the game with : A,B,C or D");
				
				//choice of the corner to staty
				position=key.next();


				if(position.equalsIgnoreCase("A")==true){

					//starting at north ouest corner
					circle=board[0][0];
					System.out.println("Your start value is: " + circle);


				// creating a while loop to keep looping until we get a zero
				while(circle!=0){
					//making a temp value to save the initial
					c1= circle;
					//moving by the number of value correponding to where circle is
					circle=board[0][circle];
					//moving to another way to another position
					circle=board[circle][c1];
					//System.out.print("|"+board [r][c]+"|");
			}
				}

				if(position.equalsIgnoreCase("B")==true){
					circle=board[d][0];
					
					System.out.println("Your start value is: " + circle);


				while(circle!=0){
					c1= circle;
					circle=board[0][circle-1];
					circle=board[circle-1][c1];				
					
					
					//System.out.print("|"+board [r][c]+"|");
			}
				}
				if(position.equalsIgnoreCase("C")==true){

					circle=board[0][d];
					
					System.out.println("Your start value is: " + circle);


				while(circle!=0){
					c1= circle;
					circle=board[0][circle-1];
					circle=board[circle-1][c1];	
					//System.out.print("|"+board [r][c]+"|");
			
			}
				}
				if(position.equalsIgnoreCase("D")==true){

					circle=board[d][d];
					
					System.out.println("Your start value is: " + circle);


				while(circle!=0){
					c1= circle;
					circle=board[0][circle-1];
					circle=board[circle-1][c1];
					//System.out.print("|"+board [r][c]+"|");
					
								
			}
				}


			}
		}

	}

}
