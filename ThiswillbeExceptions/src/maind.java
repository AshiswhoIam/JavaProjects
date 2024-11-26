import java.util.*;
public class maind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;

		Scanner k= new Scanner(System.in);
		
		chi c= new chi();
		c.kk();

		do{
			try{

				System.out.println("Enter a number1 of your choice");
				int one=k.nextInt();
				System.out.println("Enter a number2 of your choice");
				int two=k.nextInt();

				int sum=one/two;
				System.out.println(sum);
				x=20;

			}

			catch (Exception e){
				System.out.println("Nah u caant do that fam");
			}

		}while(x==1);
		
	}

}
