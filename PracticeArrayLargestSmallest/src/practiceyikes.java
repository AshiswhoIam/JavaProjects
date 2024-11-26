import java.util.*;
public class practiceyikes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []somearray=new int [5];
		
		int max =0;
		
		for (int i=0;i<somearray.length;i++)
		{
			int x=(int) (Math.random()*20);
		
			somearray[i]=x;
			System.out.print(somearray[i]+"  ");
		}


		max=somearray[0];

		for (int i=1;i<somearray.length;i++)
		{
			
			if(max<somearray[i]);
			{
				max=somearray[i];
			}
		}
		
		System.out.println("The largest num is: "+max);
		

	}
}
