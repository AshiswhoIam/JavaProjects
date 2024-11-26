import java.util.Scanner;
public class SumCaclOfDigit
{

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		
		Scanner keyIn=new Scanner(System.in);
		
		System.out.println("Welcome to the digit sum calculator!!!");
		
		String re=new String("yes");
		
		do
		{
			
		
		System.out.println("Please enter a digit with 7 digits at most");
		
		int digit=keyIn.nextInt();
		
		int one=digit/1000000;
		int two=digit/100000%10;
		int three=digit/10000%100%10;
		int four=digit/1000%1000%100%10;
		int five=digit/100%10000%1000%100%10;
		int six=digit/10%100000%10000%1000%100%10;
		int seven=digit%1000000%100000%10000%1000%100%10;
		
		int sum=(one+two+three+four+five+six+seven);
		System.out.println("Sum of digits:"+sum);
		System.out.println("Divisors of"+sum+" :");
		int x=0;
		while(x<=sum)
		{
			x++;
		if(sum%x==0)
			
		System.out.println(" "+x+" ");
		
	    }
		
		System.out.println("Type yes to try again or no to stop");
		re=keyIn.next();
		if(re.equalsIgnoreCase("no"));
		{
			System.out.println("Thank you for your cooperation!");
		}
		}while(re.equalsIgnoreCase("yes"));
			
		keyIn.close();
	}

}
