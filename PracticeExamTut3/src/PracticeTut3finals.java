import java.util.*;
public class PracticeTut3finals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question 1 preecincrement does it right away like 
		//f=5 ++f=6
		//Postincreement does it have
		//f=5 f++=5

		//Question 2 Easy

		//Question 3

		/*int iResult, num1 = 25, num2 = 40, num3 = 17, num4 = 5;
		 * double fResult, val1 = 17.0, val2 = 12.78;
		 *a) fResult = (double) num1 / num2; // 0.625
		 *b) fResult = num1 / (double) num2; // 0.625
		 *c) fResult = (double) (num1 / num2); // 0.0
		 *d) iResult = (int) (val1 / num4); // 3
		 *e) fResult = (int) (val1 / num4); // 3.0
		 *f) fResult = (int) ((double)num1 / num2); // 0.0
		 *g) iResult= num3 % num4; // 2
		 *h) iResult= num2 % num3; // 6
		 *i) iResult= num3 % num2; // 17
		 *j) iResult= num2 % num4 // 0*/
		
		//Question 4 easy
		
		//Question 5 ok understanble
		int i=0;
		int j=0;
		for( i=2;i<=4;i++)
		{
			System.out.println("i is really now new "+ i);
			for( j=6;j<=7;j++)
			{
				System.out.println("j is now "+ j+"and test "+(i+1));
			}
			System.out.println("j is now new "+ j);
			System.out.println("i is now new "+ i);
		}

		System.out.println("i is now  "+ i);
		
		
		for(int r=1;r<=5;r++)
		{
			for(i =1;i<=5-r;i++){
				System.out.print(" ");
				
			}
			//IT RESTARTS FROM SCRATCH THATS WHY IT PRINTS MANY OK :D
			for(i =1;i<=r;i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
