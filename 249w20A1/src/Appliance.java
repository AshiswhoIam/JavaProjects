// ----------------------------------------------------- 
// Assignment 1 
// Question: 1
// Written by:  Ashiqur Rahman (40096265)
// -----------------------------------------------------
/**
 *
 * @author Ashiqur Rahman 40096265
 * COMP 249
 * Assignment 1
 * Due January 31st 2020
 *
 */
public class Appliance {

/**
 *The following are variables used for this program
 *
 *
 */
	String type="default";
	String brand="default";
	
	long serialnum=1000000;
	double price=0;
	static int count=0;
/**
 * Here we have a Appliance constructor without any parameters
 */
	public Appliance(){
		this.type="defaulted";
		this.brand="defualted";
		this.serialnum=666;
		this.price=666;

		count++;
	}
/**
 * Here we have a parameterized
 * @param type is for the type of appliance being a string
 * @param brand is for the brand of the appliance being a string 
 * @param serialnum is long, and used for the serial number of the appliances
 * @param price is double and used for the price of the appliance
 * @count is a static variable used for to determine the number of appliances created
 * 
 */
	public Appliance(String brand,String type,long serialnum,double price){

		this.type=type;
		this.brand=brand;
		this.serialnum=serialnum;
		this.price=price;

		count ++;
	}

	/**
	 * Here we have a copy constructor
	 * @param a is an Appliance object
	 */
	public Appliance(Appliance a){
		this.type=a.type;
		this.brand=a.brand;
		this.serialnum=a.serialnum;
		this.price=a.price;

	}

	/**
	 * @return type is returning the type of appliance
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type is a parameter for setting the type 
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return brand is returning the brand of appliance
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand is a parameter to set the brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return price is returning the price of the appliance
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price is setting the price for the appliance
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param serialnum
	 * @return is returning the price of the serial number of the appliance
	 */
	public long getSerial(long serialnum){
		return this.serialnum=serialnum;
	}

	/**
	 * @return count is returning the number of appliances
	 */
	public static int FindNumberOfCreatedAppliances(){
		return count;
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * This is an equals method with an object o comparing
	 * two different objects if they have same type,price and brand
	 */
	public boolean equals (Object o){
		
		if(this.getBrand()==((Appliance) o).getBrand()&&this.getPrice()==((Appliance) o).getPrice()&&this.getType()==((Appliance) o).getType()){
		return true;
		}
		else
			return false;
	}
	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * This is a toString method to display the information
	 */
	public String toString(){

		return"The type is: "+type+"\n The brand is: "+brand+"\n The serial number is: "+ serialnum+"\n The price is: "+price;
	}
	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * This is a toString method to show all the info of the appliance
	 */
	public String toString2(){

		return"The type is: "+type+"\n The brand is: "+brand+"\n The serial number is: "+ serialnum+"\n The price is: "+price;
	}

}
