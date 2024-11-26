import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key= new Scanner(System.in);
		System.out.println("Welcome to lab 11");
		System.out.println();
		
		LinkedList lister=new LinkedList();
	
		Player p=new Player("2000","Alex");
		Player p1=new Player("3333","Kaylea");
		Player p2=new Player("9999","Goku");
		
		
		lister.insert(p);
		System.out.println();
		lister.insert(p1);
		System.out.println();
		lister.insert(p2);
		System.out.println();
		
		
		System.out.println(p.toString());
		System.out.println();
		System.out.println(p1.toString());
		System.out.println();
		System.out.println(p2.toString());
		
		System.out.println();
		
		lister.remove(p);
		
		
	}

}
