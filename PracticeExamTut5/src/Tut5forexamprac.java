import java.util.*;
public class Tut5forexamprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1
		
		Scanner myKeyboard = new Scanner(System.in);
		System.out.print("Enter the String req");
		String msg = myKeyboard.next(); 
		
		int x = 0;
		int y = 10;
		int z = 100;
		switch(msg.charAt(0))
		{
		 case 'a' :
		 case 'b' :
		 System.out.println("case 1");
		 x = (msg.equals("abc") ? (5 + y++) : (--y + z--));
		 break;
		 case 'c' :
		 System.out.println("case 2");
		 y /= 5;
		 default:
		 System.out.println("default");
		 
		}
		
		System.out.println(x + " " + y + " " + z);
	
		
	
		//Question 2
		
		short age;
		double rebate = 0;
		boolean isAStudent=true;
		int workExperience;

		System.out.print("Enter the values req");
		age=myKeyboard.nextShort();
		workExperience=myKeyboard.nextInt();
		if ((age < 10) || (age>70))
			 rebate = 20;
			if ((age < 20)&&(isAStudent)&&(workExperience > 4))
				rebate=15;
			
			System.out.print(rebate);
			
		//Question 3
			System.out.println();
			boolean qwe=true;
			for(int i =0;i<5;i++)
			{
				qwe=!qwe;
				for(int e=0;e<5;e++)
				{
					if(qwe=true)
					{
						System.out.print("a");	
					}
					else
					{
						System.out.print("b");
					}
				}
				System.out.println();
			}
			
			
			
		//Question 4
			
		
	}
	

}
