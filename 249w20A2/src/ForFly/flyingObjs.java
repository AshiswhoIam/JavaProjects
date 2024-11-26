package ForFly;
/**
 * @author Ashiqur Rahman 40096265
 * COMP 249
 * Assignment 2
 * Due February 25th 2020
 *
 */
public class flyingObjs {

	double price=666;

	/**
	 * this is a default constructor
	 */
	public flyingObjs(){

	}

	/**
	 * its the get price method
	 * @return price to get price
	 */
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	/**
	 * Here is a way to set the price
	 * @param p is used to set price
	 */
	public void setPrice(double p) {
		// TODO Auto-generated method stub
		this.price=p;
	}
	/**
	 * This is a toString method to display information
	 * @return displays the info
	 */
	public String toString(){
		return"tis flying defult";
	}
}
