/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package FX_W20PKG;

public class Building extends Structure{

	/**
	 * These are some needed attributes
	 */
	double landSpace;
	String material;

	/**
	 * This is a parameterized constructor for Building
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 * @param ls parameter ls is the landspace
	 * @param mat parameter mat is the material of the building
	 */
	public Building(int year,double cost,double ls,String mat){
		super(year,cost);
		this.landSpace=ls;
		this.material=mat;
	}
	/**
	 * This is a copy constructor
	 * @param b b is the paramater used for Building
	 */
	public Building(Building b){
		super(b);
		this.landSpace=b.landSpace;
		this.material=b.material;
	}

	/**
	 * This is a getter for landspace
	 * @return it returns the landspace
	 */
	public double getLandSpace() {
		return landSpace;
	}

	/**
	 * This is a getter for material
	 * @return it returns the type of material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * This is a clone method
	 */
	public Building clone(){
		return new Building(this);
	}
	/**
	 * This is an equals methods
	 * @param o the parameter is for Object
	 */
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((Building) o).getYearOfCreation()&&this.getCost()==((Building)o).getCost()&&this.getLandSpace()==((Building)o).getLandSpace()&&this.getMaterial()==((Building)o).getMaterial())
		{
			return true;
		}
		else 
			return false;
	}
	/**
	 * This is a toString method, it returns info
	 */
	public String toString(){
		return"\nThe year of creation is for the building is: "+ yearOfCreation+"\nThe cost of building is: "+cost+"\nThe landpsace of building is: "+landSpace+"\nThe material of building is: "+material;
	}




}
