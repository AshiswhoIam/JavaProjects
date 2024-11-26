/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package FX_W20PKG;

public class Structure {

	/**
	 * These are some general attributes required for the program
	 */
	int yearOfCreation;
	double cost;
	String code;
	double height;
	/**
	 * This is a parameterized construtor using int year and double cost for parameters
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 */
	public Structure(int year, double cost){

		this.yearOfCreation=year;
		this.cost=cost;
	}


	/**
	 * This is a copy constructor of Structure
	 * @param s s is used as the parameter for Structure
	 */
	public Structure(Structure s){
		this.yearOfCreation=s.yearOfCreation;
		this.cost=s.cost;
	}


	/**
	 * This is a getter for the year
	 * @return it returns the year
	 */
	public int getYearOfCreation() {
		return yearOfCreation;
	}
	/**
	 * this is a getter for the cost
	 * @return it returns the cost
	 */
	public double getCost() {
		return cost;
	}


	/**
	 * getter for height
	 * @return it returns the height
	 */
	public double getHeight() {
		return height;
	}



	/**
	 * getter for code
	 * @return returns code
	 */
	public String getCode() {
		return code;
	}


	/**
	 * This is a clone method to copy
	 */
	public Structure clone(){
		return new Structure(this);
	}
	/**
	 * This is an equals methods
	 * @param o the parameter is for Object
	 */
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((Structure) o).getYearOfCreation()&&this.getCost()==((Structure)o).getCost())
		{
			return true;
		}
		else 
			return false;
	}
	/**
	 * This is a toString method it, returns info
	 */
	public String toString()
	{
		return"\nThe year of creation is: "+ yearOfCreation+"\nThe cost is: "+cost;
	}
}
