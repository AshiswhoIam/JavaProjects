package testrnadlast;
import java.util.*;

public class stufftext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r=6;
		int c=6;
		char grid[][]= new char[r][c];
		
		for(int i=0;i<grid.length;i++){

			for(int j=0;j<grid[i].length;j++){

				grid[i][j]=(char)(Math.random()*(2)) ;


				System.out.print("|"+grid [i][j]+"|");
			}
			System.out.println();

		}
		
		char a= 'a';
		a=(char) (Math.random()*(2)) ;
		System.out.println(a);
	}

}
