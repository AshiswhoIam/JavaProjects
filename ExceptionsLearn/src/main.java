import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("Prject to test out exception stuff");
		System.out.println("Enter a number");
	
		int n1= key.nextInt();
		
		System.out.println("Enter another one");
	
		int n2= key.nextInt();
		
		System.out.println();
		
		int x;
		try{
		x=n1/n2;
		
		if(n2==0||n1<n2){
			throw new InvalidNumException();
		}
		
		}
		catch(InvalidNumException e){
			System.out.println(e.getMessage());
		}
	
	}

}
