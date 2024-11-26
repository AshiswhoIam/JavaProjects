package fivePack;

import fourPack.UAV;
/**
 * @author Ashiqur Rahman 40096265
 * COMP 249
 * Assignment 2
 * Due February 25th 2020
 *
 */
public class MAV extends UAV{

	String model="x30";
	double size=12.432;
	
	/**
	 * this is a default constructor
	 */
	public MAV(){	
		super();
		this.model="teslxa";
		this.size=320.32;
	}
	/**
	 * This is a parameterized constructor
	 * @param w is the parameter as int for weight
	 * @param p is the parameted as double for price
	 * @param m is a String for the model
	 * @param s is a double for the size
	 */
	public MAV(int w,int p,String m,double s){
		super(w,p);
		this.model=m;
		this.size=s;
		
	}
	/**
	 * This is a copy constructor
	 * @param m is a MAV object
	 */
	public MAV(MAV m){
		this.model=m.model;
		this.size=m.size;
	}
	
	
	/**
	 * This is a getter for model
	 * @return model returns model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * This is a setter
	 * @param model the model parameter allows to set the model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * This is a getter
	 * @return size gives the size
	 */
	public double getSize() {
		return size;
	}
	/**
	 * This is a setter
	 * @param size allows us to set the size
	 */
	public void setSize(double size) {
		this.size = size;
	}
	/** (non-Javadoc)
	 * @see fourPack.UAV#equals(java.lang.Object)
	 * Here we have a equals method comparing if objects are equal or not
	 */
	public boolean equals(Object o){
		if(this.getModel()==((MAV)o).getModel()&&this.getSize()==((MAV)o).getSize())
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
		return "The weight of the MAV is: "+getWeight()+"\nThe price is: "+getPrice()+"\nThe model of the MAV is: "+model+"\nThe size is: "+size;
	}
}
