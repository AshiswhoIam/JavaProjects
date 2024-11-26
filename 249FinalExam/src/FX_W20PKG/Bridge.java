/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package FX_W20PKG;

public class Bridge extends Structure{

	/**
	 * These are attributes
	 */
	double lenght;
	double height;

	/**
	 * This is a parameterized constructor for Bridge
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 * @param l parameter for lenght
	 * @param h parameter for height
	 */
	public Bridge(int year, double cost,double l, double h) {
		super(year, cost);

		this.lenght=l;
		this.height=h;
	}
	/**
	 * This is a copy constructor
	 * @param b b is the paramater used for Building
	 */
	public Bridge(Bridge b){
		super(b);
		this.lenght=b.lenght;
		this.height=b.height;
	}
	/**
	 * This is a getter
	 * @return it returns the lenght
	 */
	public double getLenght() {
		return lenght;
	}

	/**
	 * This is a getter
	 * @return it returns the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * This is a clone method
	 */
	public Bridge clone(){
		return new Bridge(this);
	}
	/*
	 *  The equals method was commented out as it was causing a error due to innapropriate casting when using arraylist contains method
	 * 
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((Bridge) o).getYearOfCreation()&&this.getCost()==((Bridge)o).getCost()&&this.getLenght()==((Bridge)o).getLenght()&&this.getHeight()==((Bridge)o).getHeight())
		{
			return true;
		}
		else 
			return false;
	}
	 */

	/**
	 * This is a toString method, it returns info
	 */
	public String toString(){
		return"\nThe year of creation is for the bridge is: "+ yearOfCreation+"\nThe cost of the bridge is: "+cost+"\nThe lenght of the bridge is: "+lenght+"\nThe height of the bridge is: "+height;
	}

}
