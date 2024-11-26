import java.util.*;
public class apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classes tut
		mango mymangoobj= new mango();
		mymangoobj.easymsg();
		
		// method with param
		Scanner key = new Scanner(System.in);
		
		mango easyobj2= new mango();
		System.out.println("Enter name:");

		String name = key.nextLine();
		
		//in the class mango use a method called easy2 that takes arg as name
		easyobj2.easy2(name);
		
		//methods and instances
		System.out.println("Enter name of first g here");


		String temp=key.nextLine();
		mango mangogobj= new mango();
		mangogobj.setName(temp);
		mangogobj.say();
		
		//array table base
		System.out.println("index \t value");
		int arr[]={32,21,321,442,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"\t"+arr[i]);
			
		}
		
		
	}

}
