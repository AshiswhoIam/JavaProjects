/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package FX_W20PKG;

public class Airport extends Structure{

	/**
	 * attributes
	 */
	int numOfRunways;
	String code;

	/**
	 * This is a parameterized construtor for Airport
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 * @param nr parameter for number of runways
	 * @param code parameter for the code
	 */
	public Airport(int year, double cost,int nr, String code) {
		super(year, cost);
		this.numOfRunways=nr;
		this.code=code;
	}
	/**
	 * copy constructor
	 * @param a a is a parameter
	 */
	public Airport(Airport a){
		super(a);
		this.numOfRunways=a.numOfRunways;
		this.code=a.code;
	}

	/**
	 * getter
	 * @return it returns the number of runways
	 */
	public int getNumOfRunways() {
		return numOfRunways;
	}
	/**
	 * getter for code
	 * @return returns the code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * this is a clone method
	 */
	public Airport clone(){
		return new Airport(this);
	}
	/**
	 * This is an equals methods
	 * @param o the parameter is for Object
	 */
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((Airport) o).getYearOfCreation()&&this.getCost()==((Airport)o).getCost()&&this.getNumOfRunways()==((Airport)o).getNumOfRunways()&&this.getCode()==((Airport)o).getCode())
		{
			return true;
		}
		else 
			return false;
	}
	/**
	 * ToString method for info
	 */
	public String toString()
	{
		return"\nThe year of creation is: "+ yearOfCreation+"\nThe cost is: "+cost+"\nThe number of runways at airport is: "+numOfRunways+"\nThe code for the airport is: "+code;
	}
}
