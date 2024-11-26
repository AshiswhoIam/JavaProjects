package twoPack;
import onePack.Airplane;
/**
 * @author Ashiqur Rahman 40096265
 * COMP 249
 * Assignment 2
 * Due February 25th 2020
 *
 */

public class Helicopter extends Airplane{

	/**
	 * Here we have some attributes
	 */
	int nOfCylinders=6;
	int yearCreated=1999;
	int passengerCapacity=7;

	/**
	 * this is a default constructor
	 */
	public Helicopter(){


		super();
		nOfCylinders=1;
		yearCreated=2121;
		passengerCapacity=23;
	}
	
	/**
	 * Here we have a parameterized constructor
	 * @param brand is a string type for brand
	 * @param price is double to get price
	 * @param hp is an int for horsepower
	 * @param noc is an int for the number of cylinders
	 * @param yc is an int the year created 
	 * @param pc is an int for the passenger capacity
	 */
	public Helicopter(String brand, double price, int hp,int noc,int yc,int pc){
		
		super(brand,price,hp);
		this.nOfCylinders=noc;
		this.yearCreated=yc;
		this.passengerCapacity=pc;
	}
	/**
	 * THis is a copy constructor
	 * @param h is used as an object for the parameter
	 */
	public Helicopter(Helicopter h){
		
		this.nOfCylinders=h.nOfCylinders;
		this.yearCreated=h.yearCreated;
		this.passengerCapacity=h.passengerCapacity;
	}
	
	/**
	 * a Getter 
	 * @return it returns the number of cylinders
	 */
	public int getnOfCylinders() {
		return nOfCylinders;
	}
	/**
	 * its a setter
	 * @param nOfCylinders the parameted is to set the number of cylinders
	 */
	public void setnOfCylinders(int nOfCylinders) {
		this.nOfCylinders = nOfCylinders;
	}
	/**
	 * getter for year
	 * @return yearCreated is the year the model was created
	 */
	public int getYearCreated() {
		return yearCreated;
	}
	/**
	 * this is a setter
	 * @param yearCreated is to set the year
	 */
	public void setYearCreated(int yearCreated) {
		this.yearCreated = yearCreated;
	}
	/**
	 * getter
	 * @return it gives the passenger capacity
	 */
	public int getPassengerCapapcity() {
		return passengerCapacity;
	}
	/**
	 * its a setter
	 * @param passengerCapacity parameter to set passenger limit
	 */
	public void setPassengerCapapcity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	/** (non-Javadoc)
	 * @see onePack.Airplane#equals(java.lang.Object)
	 * Here we have a equals method comparing if objects are equal or not
	 */
	public boolean equals(Object o){
		if(this.getBrand()==((Helicopter)o).getBrand()&&this.getHorsepower()==((Helicopter)o).getHorsepower()&&this.getPrice()==((Helicopter)o).getPrice()&&this.getnOfCylinders()==((Helicopter)o).getnOfCylinders()&&this.getYearCreated()==((Helicopter)o).getYearCreated()&&this.getPassengerCapapcity()==((Helicopter)o).getPassengerCapapcity())
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
		return "The brand for the Helicopter is: "+getBrand()+"\nThe price for the Helicopter is: "+getPrice()+"\nThe horsepower of the Helicopter is: "+getHorsepower()+"\nThe number of cynlinders in the Helicopter is: "+nOfCylinders+"\nThe year it was created was: " +yearCreated+"\nThe passenger capcity is: "+passengerCapacity;
	}

}
