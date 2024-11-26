
public class pts {

	private int xval;
	private int yval;
	
	public pts(int x,int y){
		
		xval=x;
		yval=y;
	}
	public void setx(int x) {
		this.xval=x;

	}
	public void sety(int y) {
		this.yval=y;

	}
	
	public int getx(){
		return xval;
	}
	public int gety(){
		return yval;
	}
	
	public boolean equal(pts p)
	{

		if(this.xval==p.xval && this.yval==p.yval)

		{
			return true;	
		}
		else

		{
			return false;
		}
	}
	
	public void moveby(int a,int b)
	{
		this.xval=this.xval +a;
		this.yval=this.yval +b;
	}

	public String toString() {
		return "coordinates of point are ("+this.xval + ","+this.yval+")"; 
	}
}
