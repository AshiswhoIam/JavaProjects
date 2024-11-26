
public class Apartement extends Accomadation{

	int nOfFloors =23;
	boolean renovated=true;
	
	public Apartement(int size, int basePrice,int nf,boolean renovated) {
		super(size, basePrice);
		this.nOfFloors=nf;
		this.renovated=renovated;
		
	}

	double saveprice;
	@Override
	void TotalPrice() {
		// TODO Auto-generated method stub
		
		if(renovated==true){
			saveprice=basePrice*1.2+100;
			System.out.println("Total price is"+saveprice);
			
		}
		else{
			saveprice=basePrice+100;
			System.out.println("Total price is"+saveprice);
		}
		
	}

	@Override
	void ad() {
		// TODO Auto-generated method stub
	
		System.out.println("The appartement is :" + size+"sq meters and the building has "+ nOfFloors+" floors. The base is:"+"and the appartement is: renovated"+renovated+"so the toal price is:"+saveprice);
	}

	public String toString(){
		return "The floors:"+nOfFloors+"  renovated:"+renovated;
	}
}
