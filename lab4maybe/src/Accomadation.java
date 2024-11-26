
abstract public class Accomadation {

	int size=0;
	int basePrice=0;
	
	
	public Accomadation(int size,int basePrice){
		this.size=size;
		this.basePrice=basePrice;
	}
	
	abstract void TotalPrice();
	abstract void ad();
	
	public String toStirng(){
		
		return "size is: "+size+" baseprice is: "+ basePrice;
	}
}
