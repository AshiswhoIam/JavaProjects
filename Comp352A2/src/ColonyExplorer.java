/**
 * Ashiqur Rahman
 * 40096265
 * Comp 352 A2
 */
/*
 * The following program requires us to work with 2 d arrays to create a grid of 0 and 1s. We then want to colonize 
 * the grid with letters from the alphbet. We create a method ExploreAndLabelColony which takes in an array, rows,columns
 * to where it will colonize the grid with letters randomly. Once finished it must return how many letters in the grid.
 * We can iterate through the arrays through double for loops. This program specifically uses recursion in the method
 * to allow us to colonize the grid.
 * 
 */
import java.util.*;
public class ColonyExplorer {

	
	//method takes in array and row and colums
	public static void ExploreAndLabelColony(int r,int c,char arr[][]){

		//counters to be used later
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;

		//if statement for limiting the array
		if(r<arr.length){
			if(c<arr[r].length){


				if(arr[r][c]==0){
					arr[r][c]='-';


					//recursive call for when we are at the end 
					if(c<arr[r].length-1){
						ExploreAndLabelColony(r+1,c,arr);

						if(r<arr.length-1){
							System.out.print("|"+arr [r][c]+"|");
						}
					}
					//recursive call for when we are at the end 
					ExploreAndLabelColony(r,c+1,arr);

				}
				else{

					//creating random character to colonize
					Random re= new Random();
					char letter=(char)(re.nextInt(26) + 'A');
					arr[r][c]=letter;
					//recurive call to continue colonizing
					ExploreAndLabelColony(r,c+1,arr);
				}

			}
			//recurive call to continue colonizing
			ExploreAndLabelColony(r+1,0,arr);
		}

		
		//Printing out the statements
		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr[i].length;j++){

				System.out.print("|"+arr [i][j]+"|");
			}
			System.out.println();

		}

		//Counting the letters of the alphabet in the grid
		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr[i].length;j++){

				if(arr [i][j]=='A'){
					count++;
				}			
				if(arr [i][j]=='B'){
					count1++;
				}
				if(arr [i][j]=='C'){
					count2++;
				}
				if(arr [i][j]=='D'){
					count3++;
				}
				if(arr [i][j]=='E'){
					count4++;
				}
				if(arr [i][j]=='F'){
					count5++;
				}
				if(arr [i][j]=='G'){
					count6++;
				}

			}
			System.out.println();

		}
		System.out.println("For A There are:"+count+" For B There are:"+count1+" For C There are:"+count2+" For D There are:"+count3+" For E There are:"+count4+" For F There are:"+count5+" For G There are:"+count6);



	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the ColonyExplorer program.");

		Scanner key= new Scanner(System.in);

		System.out.println("Enter the size of the grid you would like starting by row");

		//user input row
		int r= key.nextInt();


		System.out.println("Enter the size of the grid you would like for column");
		//user input columns
		int c= key.nextInt();

		//creating the array to be used in method
		char grid[][]= new char[r][c];
		int grid2[][]= new int[r][c];

		//assigning 1 and 0s to the arrays randomly
		for(int i=0;i<grid2.length;i++){

			for(int j=0;j<grid2[i].length;j++){

				grid2[i][j]=(int)(Math.random()*(2)) ;


				System.out.print("|"+grid2 [i][j]+"|");
			}
			System.out.println();

		}
		System.out.println();
		//assigning 1 and 0s to the arrays randomly
		for(int i=0;i<grid.length;i++){

			for(int j=0;j<grid[i].length;j++){

				grid[i][j]=(char)(Math.random()*(2)) ;


				System.out.print("|"+grid [i][j]+"|");
			}
			System.out.println();

		}

		//For the position of the starting
		System.out.println("Enter the starting position for row");
		int row= key.nextInt();
		System.out.println("Enter the starting position for column");
		int col= key.nextInt();

		System.out.println();
		//calling method 
		ExploreAndLabelColony(row,col,grid);

	}

}
