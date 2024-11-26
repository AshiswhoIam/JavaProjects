import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key= new Scanner(System.in);
		System.out.println("Welcome to lab 10");
		System.out.println();
		
		Fillable [] f= new Fillable[5];
		
		Circle c1= new Circle(5,5,5);
		Circle c2= new Circle(3,3,3);
		Rectangle r1=new Rectangle(1,2,1,2);
		Rectangle r2=new Rectangle(3,2,3,2);
		Rectangle r3=new Rectangle(4,5,4,5);
		
		f[0]=c1;
		f[1]=c2;
		f[2]=r1;
		f[3]=r2;
		f[4]=r3;
		
		for(int x=0;x<f.length;x++){
			f[x].draw(x);
			f[x].fill(x);
		}
	}

}
