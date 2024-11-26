package fivePack;
import fourPack.UAV;
/**
 * @author Ashiqur Rahman 40096265
 * COMP 249
 * Assignment 2
 * Due February 25th 2020
 *
 */

public class AgriculturalDrone extends UAV{

	String brand="Agdf";
	
	int carryCapacity=1;
	
	/**
	 * this is a default constructor
	 */
	public AgriculturalDrone(){
		super();
		this.carryCapacity=33;
	}
	/**
	 * This is a parameterized constructor
	 * @param w is the parameter as int for weight
	 * @param p is the parameter as double for price
	 * @param d is used as a parameter string for the brand
	 * @param c is used as a int paramter for the carry capacity
	 */
	public AgriculturalDrone(int w,int p,String d,int c){
		super(w,p);
		this.brand=d;
		this.carryCapacity=c;
		
	}
	/**
	 * this is a copy constructor
	 * @param a is an Agricultural Drone object
	 */
	public AgriculturalDrone(AgriculturalDrone a)
	{
	
		this.carryCapacity=a.carryCapacity;
	}
	
	
	
	/**
	 * This is a getter for brand
	 * @return brand is returned
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * This is a setter 
	 * @param brand the parameter brand lets us set the brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * this is a getter for carry cap
	 * @return it returns carrCapacity
	 */
	public int getCarryCapacity() {
		return carryCapacity;
	}
	/**
	 * this is a setter
	 * @param carryCapacity this allows to set a capacity
	 */
	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	
	/** (non-Javadoc)
	 * @see fourPack.UAV#equals(java.lang.Object)
	 * Here we have a equals method comparing if objects are equal or not
	 */
	public boolean equals(Object o)
	{
		if(this.getBrand()==((AgriculturalDrone)o).getBrand()&&this.getCarryCapacity()==((AgriculturalDrone)o).getCarryCapacity())
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
		return"The weight of the AgriculturalDrone is: "+getWeight()+"\nThe price is: "+getPrice()+"\nThe brand for the AgriculturalDrone is: "+brand+"\nThe carry capacity is: "+carryCapacity;
	}
}
