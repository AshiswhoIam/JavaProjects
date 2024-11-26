import java.io.FileWriter;
import java.io.IOException;


public class Circle implements Fillable{

	
	double x;
	double y;
	double radius;
	
	
	public Circle(double x, double y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	@Override
	public void draw(int color) {
		// TODO Auto-generated method stub
		
		System.out.println("Circle drawn at "+x+","+y+" with radius "+radius+", and color "+color);
		try {
			FileWriter w = new FileWriter("some.txt", true);
			w.write("Circle drawn at "+x+","+y+" with radius "+radius+", and color "+color);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void fill(int color) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter w = new FileWriter("some.txt", true);
			w.write("Circle filled at "+x+","+y+" with radius "+radius+", and color "+color);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Circle filled at "+x+","+y+" with radius "+radius+", and color "+color);
	}
	
	
}
