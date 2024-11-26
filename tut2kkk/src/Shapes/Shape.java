package Shapes;

public class Shape {

	private int h;
	private int w;
	private char pattern = '*';
	
	public Shape(int h,int w){
		
		this.h=h;
		this.w=w;
	}
	
	public void draw(){
		return;
	}
	
		
	
	public char getPattern() {
		return pattern;
	}

	public void setPattern(char pattern) {
		this.pattern = pattern;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}


	public int getW() {
		return w;
	}


	public void setW(int w) {
		this.w = w;
	}








	public String toString(){
		return"Width is:"+w+"\n height is :"+ h;
	}
}
