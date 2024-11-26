
public class VIlla extends Accomadation{

	
	int yardSize=500;
	int yardPrice=900;
	
	public VIlla(int size, int basePrice,int s,int sp) {
		super(size, basePrice);
		this.yardPrice=sp;
		this.yardSize=s;
		// TODO Auto-generated constructor stub
	}
double savep;
	@Override
	
	void TotalPrice() {
		// TODO Auto-generated method stub
	
		savep=basePrice+yardPrice*1.1+300;
		System.out.println("Total price is"+savep);
	}

	@Override
	void ad() {
		// TODO Auto-generated method stub
		System.out.println("The villa is:"+size+"sq meters and it has a yard size of:"+yardSize+"The yard price is "+yardPrice+"$ adn the total price is:"+savep);
		
	}
	
	public String toString(){
		return "Yard seize is:"+yardSize+" the price is: "+yardPrice;
	}
	

}
