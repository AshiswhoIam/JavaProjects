
public class Car {

	String make;
	String model;
	int year;
	int price;
	static int nbobj=0;
	static String mk;
	static String md;
	static int min;
	static int max;
/**
 * This is a parametrized constructor
 * @param ma
 * @param mod
 * @param y
 * @param p
 */
	public Car(String ma, String mod,int y,int p){
		
		make=ma;
		model=mod;
		year=y;
		price=p;
		
		nbobj+=1;
	}
/**
 * This sets the make of the car
 * @param ma
 */
	public void setMake(String ma){
		this.make=ma;
	}
	
	public void setModel(String mod){
		this.model=mod;
	}
	public void setYear(int y){
		this.year=y;
	}
	public void setPrice(int p){
		this.price=p;
	}
	public String getMake(){
		
		return make;
	}
	public String getModel(){
		return model;
	}
	public int getYear(){
		return year;
	}
	public int getPrice(){
		return price;
	}
	public String toString(){
		
		
		return "The make of the car is: "+this.make+" The model of it is: "+this.model+" The year is: "+this.year+"The price of it is of: "+this.price+"$";
	}
	public static void setnbobj(int nb){
		nbobj=nb;
	}
	public static int getnboj(){
		return nbobj;
	}
	
	public static int findNumberOfCreatedCars(){
		
		if(nbobj==0)
		{
			System.out.println("The number of car obj created was : ");
			return 0;
		}
		else 
			return nbobj;
	}

	public boolean equals(Object maker,Object modeler){
		
		if(maker instanceof Car && modeler instanceof Car){
			return true;
		}
		return false;
		
	}
	public String toString1(){
		return "The make of the car is: "+this.make+" The model of it is: "+this.model+" The year is: "+this.year+"The price of it is of: "+this.price+"$";
	}
	
	public static String findCarBy(String make,String model){
		mk=make;
		md=model;
		return "the make is: "+mk + "The model is: "+md;
	}
	public static int findCarsWithinPriceRange(int mini,int maxi){
		min=mini;
		max=maxi;
		return min + max;
	}
}
