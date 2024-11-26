/**
 * @author Ashiqur Rahman
 * COMP 249
 * Assignment 4
 * Due April 19th 2020
 */
public class CellPhone {

	
	/**
	 * These are the main attibutes in the class
	 */
	long serialNum;
	String brand;
	int year;
	double price;
	
	/**
	 * This is a constructor
	 */
	public CellPhone(){
		
		this.serialNum=0;
		this.brand="none";
		this.year=0;
		this.price=0;
	}
	
	/**
	 * This is a parameterized constructor 
	 * @param serialNum the serial num with long parameter is for the the serial number
	 * @param brand the brand with String parameter is for the brand
	 * @param year this is for the year manufactured with int 
	 * @param price this is price with double
	 */
	public CellPhone(long serialNum, String brand, int year, double price) {
		super();
		this.serialNum = serialNum;
		this.brand = brand;
		this.year = year;
		this.price = price;
	}
	
	/**
	 * this is a copy constructor
	 * @param c the variable is used to represent the Cellphone object
	 * @param number the number is used for the serial number
	 */
	public CellPhone(CellPhone c,long number){
		this.brand = c.brand;
		this.year = c.year;
		this.price = c.price;
		this.serialNum = number;
	
	}
	
	/**
	 * This is a clone method
	 */
	public CellPhone clone(){
		return new CellPhone();
		
	}
	
	/**
	 * This is a get method for the serial number
	 * @return it returns the serial number
	 */
	public long getSerialNum() {
		return serialNum;
	}
	/**
	 * This is a setter it allows to set the serial number
	 * @param serialNum the serialNum is passed as a long 
	 */
	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}
	/**
	 * This is a method for getting brand
	 * @return it returns the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * This is a setter for brand
	 * @param brand it takes a string as parameter
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * Getter for year
	 * @return it returns the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * It sets the year
	 * @param year the int parameter year allows to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * This is a get price
	 * @return it returns the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * This method sets the price
	 * @param price it take double price as a parameter
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * This is a boolean method to compare if two objects are the same
	 * @param cp cp is used as the object
	 * @return it returns either true or false
	 */
	public boolean equals(CellPhone cp){
		if(this.getBrand()==cp.getBrand()&&this.getPrice()==cp.getPrice()&&this.getYear()==cp.getYear())
		{
			return true;
		}
		else
			return false;
	}

	/**
	 * This is a String method to display info
	 */
	public String toString() {
		return "The [serialNum=" + serialNum + ", The brand=" + brand
				+ ", The year=" + year + ", The price=" + price + "]";
	}
	
	
	
}
