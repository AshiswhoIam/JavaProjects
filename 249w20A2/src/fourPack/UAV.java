package fourPack;

import ForFly.flyingObjs;
/**
 * @author Ashiqur Rahman 40096265
 * COMP 249
 * Assignment 2
 * Due February 25th 2020
 *
 */
public class UAV extends flyingObjs{

	/**
	 * these are attributes for the class
	 */
	double weight=13.0;
	double price=21.09;
	
	/**
	 * this is a default constructor
	 */
	public UAV(){
		this.weight=6;
		this.price=1111111;
	}
	/**
	 * This is a parameterized constructor
	 * @param w is the parameter as int for weight
	 * @param p is the parameted as double for price
	 */
	public UAV(int w,int p){
		this.price=p;
		this.weight=w;
	}
	/**
	 * THis is a copy constructor
	 * @param u is a UAV obj
	 */
	public UAV(UAV u){
		this.weight=u.weight;
		this.price=u.price;
	}
	
	/**
	 * Getter
	 * @return the method returns the weight
	 */
	public double getWeight() {
		return weight;
	}


	/**
	 * This is setter
	 * @param weight is used to set weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
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
	
	
	/** (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * Here we have a equals method comparing if objects are equal or not
	 */
	public boolean equals(Object o)
	{
		if(this.getWeight()==((UAV)o).getWeight()&&this.getPrice()==((UAV)o).getPrice())
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
		
		return "The weight of the UAV is: "+weight+"\nThe price is: "+price;
	}
}
