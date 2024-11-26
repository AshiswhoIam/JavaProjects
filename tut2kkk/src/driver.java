import Shapes.*;
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s=new Shape(5, 10);
		System.out.println(s);
		
		Rect r= new Rect(4,8);
		r.draw();
		
		Square s1= new Square(3);
		System.out.println(s1);
		s1.draw();
		
		
		Shape s11= new Rect(3,11);
		System.out.println(s11);
		s11.draw();
	}

}
