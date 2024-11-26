package Shapes;

public class Rect extends Shape {
	
	
 public Rect(int h,int w)
 {
	 super(h,w);
 }
 
 
 public void draw(){
	 
	 for(int x=0;x<super.getH();x++)
	 {		 
	 
		 
	 for(int i=0;i<super.getW();i++)
	 {//can use this insteda of super
		 
		 System.out.print(this.getPattern());
	 }
	 System.out.println();
 
 }
}
}