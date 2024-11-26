package onePack;
import ForFly.flyingObjs;

/**
 * @author Ashiqur Rahman 40096265
 * COMP 249
 * Assignment 2
 * Due February 25th 2020
 *
 */
public class Airplane extends flyingObjs{

	/**
	 * These are just general attributes
	 */
	String brand ="Plane";
	double price =123;
	int horsepower =1200;
	
	/**
	 * Here we have a parameterized constructor
	 * @param brand is of type string for the brand 
	 * @param price is double for the price
	 * @param hp is the horsepower
	 */
	public Airplane(String brand,double price,int hp){
		
		this.brand=brand;
		this.price=price;
		this.horsepower=hp;
	}
	/**
	 * This is a default constructor
	 */
	public Airplane(){
		
		this.brand="Default";
		this.price=19090;
		this.horsepower=9000;
	}
	
	/**
	 * Here we have our copy contructor
	 * @param a is an Airplane obj
	 */
	public Airplane(Airplane a)
	{
		this.brand=a.brand;
		this.price=a.price;
		this.horsepower=a.horsepower;
	}
	
	/**
	 *Here is a getter for brand
	 * @return brand to get the brand;
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * Here we have a setter for brand
	 * @param brand is used to be a setter
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * its the get price method
	 * @return price to get price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * Here is a way to set the price
	 * @param price is used to set price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * its a getter!
	 * @return horsepower to return the variable horsepower
	 */
	public int getHorsepower() {
		return horsepower;
	}
	/**
	 * heres a setter
	 * @param horsepower horsepower used as a variable to obtained horsepower
	 */
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	
	/** (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * Here we have a equals method comparing if objects are equal or not
	 */
	public boolean equals(Object o){
		if(this.getBrand()==((Airplane)o).getBrand()&&this.getHorsepower()==((Airplane)o).getHorsepower()&&this.getPrice()==((Airplane)o).getPrice())
		{
			return true;
		}
		
		else
			return false;
	}
	/**
	 * This is a toString method to display information
	 * @return displays the info
	 */
	public String toString(){
		return"The brand for the Airplane is: "+brand+"\nThe price for the Airplane is: "+price+"\nThe horsepower of the airplane is: "+horsepower;
		}
	
}
