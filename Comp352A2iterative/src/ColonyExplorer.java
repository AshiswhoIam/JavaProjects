/**
 * Ashiqur Rahman
 * 40096265
 * Comp 352 A2
 */
/*
 * The following program requires us to work with 2 d arrays to create a grid of 0 and 1s. We then want to colonize 
 * the grid with letters from the alphbet. We create a method ExploreAndLabelColony which takes in an array, rows,columns
 * to where it will colonize the grid with letters randomly. Once finished it must return how many letters in the grid.
 * We can iterate through the arrays through double for loops. This program will be done iteratively through the use of stacks.
 * 
 */
import java.util.*;


public class ColonyExplorer {

	//ExploreAndLabelColony method
	public static<E> void ExploreAndLabelColony(int r,int c, E arr[][]){

		//implementing a stack
		Stack<E> stacker = new Stack<>();

		//adding - to all 0
		if(arr[r][c]=="0"){

			stacker.push((E) "-");


		}
		//
		//adding letter 
		else{
			Random re= new Random();
			char letter=(char)(re.nextInt(26) + 'A');

			//stacker.push(letter);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intro msg
		System.out.println("Welcome to the ColonyExplorer program.");

		Scanner key= new Scanner(System.in);

		//let user enter grid size
		System.out.println("Enter the size of the grid you would like starting by row");

		int r= key.nextInt();


		System.out.println("Enter the size of the grid you would like for column");
		int c= key.nextInt();

		//create 2d array grid
		int grid[][]= new int[r][c];

		//loop for random 0 and 1
		for(int i=0;i<grid.length;i++){

			for(int j=0;j<grid[i].length;j++){

				grid[i][j]=(int)(Math.random()*(2)) ;


				System.out.print("|"+grid [i][j]+"|");
			}
			System.out.println();



		}

		//start position for user
		System.out.println("Enter the starting position for row");
		int row= key.nextInt();
		System.out.println("Enter the starting position for column");
		int col= key.nextInt();

		Stack<Integer> stacks = new Stack<>();

		//call function
		try {
			//ExploreAndLabelColony(row,col,grid[row][col]);
		}
		catch (Exception e){
			System.out.println("The method did not work.");
		}
		// call function didnt work so i implemented another way...
		for(int i=0;i<grid.length;i++){

			for(int j=0;j<grid[i].length;j++){

				//ExploreAndLabelColony(i,j, grid);

				Random re= new Random();
				char letter=(char)(re.nextInt(26) + 'A');
				grid [i][j]=letter;
				System.out.print("|"+grid [i][j]+"|");
			}
			System.out.println();



		}

	}


}
