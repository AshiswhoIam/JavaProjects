package threePack;
import twoPack.Helicopter;
/**
 * @author Ashiqur Rahman 40096265
 * COMP 249
 * Assignment 2
 * Due February 25th 2020
 *
 */

public class Multirotor extends Helicopter{

	int numberOfRotors=4;
	
	/**
	 * this is a default constructor
	 */
	public Multirotor(){
		super();
		this.numberOfRotors=9;
	}
	/**
	 * This is a parameterized constructor
	* @param brand is a string type for brand
	 * @param price is double to get price
	 * @param hp is an int for horsepower
	 * @param noc is an int for the number of cylinders
	 * @param yc is an int the year created 
	 * @param pc is an int for the passenger capacity
	 * @param n is a int for the number of rotors
	 */
	public Multirotor(String brand, double price, int hp,int noc,int yc,int pc,int n){
		super(brand,price,hp,noc,yc,pc);
		this.numberOfRotors=n;
	}
	
	/**
	 * Here we have a copy constructor
	 * @param m q is an object used as a parameter
	 */
	public Multirotor(Multirotor m){
		
		this.numberOfRotors=m.numberOfRotors;
	}
	
	/**
	 * Getter
	 * @return the number of rotors
	 */
	public int getNumberOfRotors() {
		return numberOfRotors;
	}
	/**
	 * This is a setter
	 * @param numberOfRotors it sets the number of rotors
	 */
	public void setNumberOfRotors(int numberOfRotors) {
		this.numberOfRotors = numberOfRotors;
		
		
	}
	
	
	/** (non-Javadoc)
	 * @see twoPack.Helicopter#equals(java.lang.Object)
	 * Here we have a equals method comparing if objects are equal or not
	 */
	public boolean equals(Object o)
	{
		if(this.getNumberOfRotors()==((Multirotor)o).getNumberOfRotors())
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
		return "The brand for the Helicopter is: "+getBrand()+"\nThe price for the Helicopter is: "+getPrice()+"\nThe horsepower of the Helicopter is: "+getHorsepower()+"\nThe number of cynlinders in the Helicopter is: "+getnOfCylinders()+"\nThe year it was created was: " +getYearCreated()+"\nThe passenger capcity is: "+getPassengerCapapcity()+"\nThe number of motors on the Multirotor is: "+ numberOfRotors;
		
	}
}
