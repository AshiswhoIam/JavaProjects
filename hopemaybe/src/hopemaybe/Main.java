package hopemaybe;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome to magic board");
		int size = 0;		
		int countz=0;
		int count=0;
		boolean stop=true;
		String position="";
		int circle= 0;
		int c1=0;
		List<List<Integer>> listOfLists = new ArrayList<List<Integer>>(size); 
		
		
		for(int r=0;r<size;r++){

			count++;

	
		//for loop for the collums
			for(int c=0;c<List[r].length;c++){

				//implementing random number to each elements 
				board [r][c]=(int)(Math.random()*(d+1)) ;

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
					board [r][c]=(int)(Math.random()*(d-1)) ;
				}
				
				//to ensure a zero on the board
				if(((r==board.length-1)&&(c==board.length-1))&&(countz==0)){

					board [r][c]=0;
				}

				//display of the board
				System.out.print("|"+board [r][c]+"|");
			}
			System.out.println();
		
	}

}
