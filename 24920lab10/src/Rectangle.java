import java.io.FileWriter;
import java.io.IOException;


public class Rectangle implements Fillable{

	double x1;
	double x2;
	double y1;
	double y2;
	
	
	
	public Rectangle(double x1, double x2, double y1, double y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	@Override
	public void draw(int color) {
		// TODO Auto-generated method stub
	
		System.out.println("Rectangle drawn with upper-left corner at" +x1+","+y1+ "and lower-rightcorner at "+x2+","+ y2+" and color"+color);
	
		try {
			FileWriter w = new FileWriter("some.txt", true);
			w.write("Rectangle drawn with upper-left corner at" +x1+","+y1+ "and lower-rightcorner at "+x2+","+ y2+" and color "+color);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	@Override
	public void fill(int color) {
		// TODO Auto-generated method stub
		System.out.println("Rectangle filled with upper-left corner at" +x1+","+y1+ " and lower-rightcorner at "+x2+","+ y2+" and color "+color);
	
	
		try {
			FileWriter w = new FileWriter("some.txt", true);
			w.write("Rectangle filled with upper-left corner at" +x1+","+y1+ " and lower-rightcorner at "+x2+","+ y2+" and color "+color);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
