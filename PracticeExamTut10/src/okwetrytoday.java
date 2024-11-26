import java.util.*;
public class okwetrytoday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		pts p1= new pts(0,0);
		pts p2= new pts(2,3);
		
		System.out.println("xvaluesof point 1 is :"+p1.getx());
		System.out.println("yvaluesof point 1 is :"+p1.gety());
	
		System.out.println("xvaluesof point 1 is :"+p2.getx());
		System.out.println("yvaluesof point 1 is :"+p2.gety());
	
		System.out.print(p1.toString());
		System.out.print(p2.toString());
		
		p1.moveby(10, 10);
		System.out.println(p1.toString());
		p2.moveby(8, 7);
		System.out.println(p2.toString());
		
		p1=p2;
		//hmmmmmmmmmmmmmmmmmmmmmmmm
		if(p1.equals(p2))
		{
			System.out.println("Same");
		}
		else{
			System.out.println("DIFFF");
		}
		
	}

}
