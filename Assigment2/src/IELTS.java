import java.util.Scanner;
public class IELTS
{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		Scanner keyIn= new Scanner(System.in);
		
		System.out.println("Please select one of the following option: ");
		
		System.out.println(" \t"+"1 - Language Proficiency Requirements for the Applicant");
		
		System.out.println(" \t"+"2 - Evaluation of your English Proficiency");

		
		System.out.println("Please enter the digit corresponding to your case: ");
		
		int casedigit=keyIn.nextInt();
		
		if(casedigit==1)
		{
			System.out.println("- The overall score of IELTS exam of applicants needs to be equal or above 6.5 and the scores");
			System.out.println("for writing and reading skills should not be below 6.0. If your overall score is 6, and your");
			System.out.println("reading and writing scores are at least 6, you will be eligible for conditional admission. So");
			System.out.println("you need to take an English course in the first semester. Otherwise you have to retake the IELTS exam. ");
            System.out.println("Thanks for choosing Concordia.");
			
		}
		
		if(casedigit==2)
		{
		System.out.print("Please enter your listening score: ");
		double listeningscore=keyIn.nextDouble();
		System.out.println();
		System.out.print("Please enter your speaking score: ");
		double speakingscore=keyIn.nextDouble();
		System.out.println();
		System.out.print("Please enter your reading score: ");
		double readingscore=keyIn.nextDouble();
		System.out.println();
		System.out.print("Please enter your writing score: ");
		double writingscore=keyIn.nextDouble();
		System.out.println();
		double overallscore=(listeningscore+speakingscore+readingscore+writingscore);
		System.out.println("Your overall score is: "+overallscore/4);
		System.out.println("Your reading score is: "+readingscore);
		System.out.println("Your writing score is: "+writingscore);
		System.out.println();
		if(overallscore%1<0.25&&overallscore%1>0)
		{
		overallscore=overallscore-overallscore%1;
		}
		if(overallscore%1>0.25||overallscore<0.75)
		{
		overallscore=(overallscore-overallscore%1)+0.5;
		}
		if(overallscore%1>0.75||overallscore%1<1)
		{
		overallscore=(overallscore-overallscore%1)+1;
		}
		if(overallscore/4>=6.5 && readingscore>=6 && writingscore>=6)
		{
		     System.out.println(" Congrats, you are eligible for the admission. ");
		}
		if(overallscore/4>=6.5 && readingscore<6 || writingscore<6)
		{
		     System.out.println(" You are conditionally eligible for the admission. ");
		}
		if(overallscore/4==6 && readingscore>=6 && writingscore>=6)
		{
		     System.out.println(" You are conditionally eligible for the admission. ");
		}
		 if(overallscore/4==6 && readingscore<6 || writingscore<6)
		{
		     System.out.println(" Sorry,retake the test please. ");
		}
		 if(overallscore/4<6)
		{
		     System.out.println(" Sorry,retake the test please. "); 
		}
		 
		}
		 keyIn.close();

	}

}
