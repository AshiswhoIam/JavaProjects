/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package FX_W20PKG;

public class Overpass extends Bridge {

	/**
	 * attribute
	 */
	double maxLoad;

	/**
	 * This is a parameterized constructor for Overpass
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 * @param l parameter for lenght
	 * @param h parameter for height
	 * @param max parameter for the maxload
	 */
	public Overpass(int year, double cost, double l, double h,double max) {
		super(year, cost, l, h);
		this.maxLoad=max;

	}
	/**
	 * This is a copy constructor
	 * @param o is the parameter for Overpass
	 */
	public Overpass(Overpass o){

		super(o);
		this.maxLoad=o.maxLoad;
	}

	/**
	 * This is a getter
	 * @return it returns the maxload
	 */
	public double getMaxLoad() {
		return maxLoad;
	}
	/**
	 * This is a clone method
	 */
	public Overpass clone(){
		return new Overpass(this);
	}
	/*
	 * The equals method was commented out as it was causing a error due to innapropriate casting when using arraylist contains method
	 * 
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((Overpass) o).getYearOfCreation()&&this.getCost()==((Overpass)o).getCost()&&this.getLenght()==((Overpass)o).getLenght()&&this.getHeight()==((Overpass)o).getHeight()&&this.getMaxLoad()==((Overpass)o).getMaxLoad())
		{
			return true;
		}
		else 
			return false;
	}
	 */
	/**
	 * ToString method for info
	 */
	public String toString(){
		return"\nThe year of creation is for the Overpass is: "+ yearOfCreation+"\nThe cost of the Overpass is: "+cost+"\nThe lenght of the Overpass is: "+lenght+"\nThe height of the Overpass is: "+height+"\nThe max load of the overpass is: "+maxLoad;
	}
}
