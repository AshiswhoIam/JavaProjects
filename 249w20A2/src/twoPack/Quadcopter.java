package twoPack;
/**
 * @author Ashiqur Rahman 40096265
 * COMP 249
 * Assignment 2
 * Due February 25th 2020
 *
 */

public class Quadcopter extends Helicopter{

	/**
	 * an attrbute
	 */
	int maxFlyingSpeed=9999;

	/**
	 * this is a default constructor
	 */
	public Quadcopter(){
		super();
		this.maxFlyingSpeed=7777;
	}

	/**
	 * this is a parameterized constructor
	 * @param brand is a string type for brand
	 * @param price is double to get price
	 * @param hp is an int for horsepower
	 * @param noc is an int for the number of cylinders
	 * @param yc is an int the year created 
	 * @param pc is an int for the passenger capacity
	 * @param mfs is a parameted as int for the max fly speed
	 */
	public Quadcopter(String brand, double price, int hp,int noc,int yc,int pc,int mfs){

		super(brand,price,hp,noc,yc,pc);
		this.maxFlyingSpeed=mfs;
	}
	/**
	 * Here we have a copy constructor
	 * @param q q is an object used as a parameter
	 */
	public Quadcopter(Quadcopter q){
		
		this.maxFlyingSpeed=q.maxFlyingSpeed;
	}



	/**
	 * To get the max fly speed
	 * @return maxFlyingSpeed is the max speed
	 */
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}

	/**
	 * Setter
	 * @param maxFlyingSpeed is to set the speed
	 */
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	/** (non-Javadoc)
	 * @see twoPack.Helicopter#equals(java.lang.Object)
	 * Here we have a equals method comparing if objects are equal or not
	 */
	public boolean equals(Object o)
	{
		if(this.getBrand()==((Quadcopter)o).getBrand()&&this.getHorsepower()==((Quadcopter)o).getHorsepower()&&this.getPrice()==((Quadcopter)o).getPrice()&&this.getnOfCylinders()==((Quadcopter)o).getnOfCylinders()&&this.getYearCreated()==((Quadcopter)o).getYearCreated()&&this.getPassengerCapapcity()==((Quadcopter)o).getPassengerCapapcity()&&this.getMaxFlyingSpeed()==((Quadcopter)o).getMaxFlyingSpeed())
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

		return "The brand for the Quadcopter is: "+getBrand()+"\nThe price for the Quadcopter is: "+getPrice()+"\nThe horsepower of the Quadcopter is: "+getHorsepower()+"\nThe number of cynlinders in the Quadcopter is: "+nOfCylinders+"\nThe year it was created was: " +yearCreated+"\nThe passenger capcity is: "+passengerCapacity+"\nThe max flying speed of the Quadcopter is: "+maxFlyingSpeed;
	}
}

