/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package CargoAirport;

import FX_W20PKG.Airport;
import FX_W20PKG.Structure;

public class CargoAirport extends Airport{

	/**
	 * attribute
	 */
	double landedWeight;
	/**
	 * This is a parameterized construtor for CargoAirport
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 * @param nr parameter for number of runways
	 * @param code parameter for the code
	 * @param lw lw is the landed weight
	 */
	public CargoAirport(int year, double cost, int nr, String code,double lw) {
		super(year, cost, nr, code);
		this.landedWeight=lw;
		
	}
	/**
	 * copy constructor
	 * @param c is parameter
	 */
	public CargoAirport(CargoAirport c){
		super(c);
		this.landedWeight=c.landedWeight;
	}
	/**
	 * getter
	 * @return returns landed weight
	 */
	public double getLandedWeight() {
		return landedWeight;
	}
	/**
	 * Clone method
	 */
	public CargoAirport clone(){
		return new CargoAirport(this);
	}
	/**
	 * This is an equals methods
	 * @param o the parameter is for Object
	 */
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((CargoAirport) o).getYearOfCreation()&&this.getCost()==((CargoAirport)o).getCost()&&this.getNumOfRunways()==((CargoAirport)o).getNumOfRunways()&&this.getCode()==((CargoAirport)o).getCode()&&this.getLandedWeight()==((CargoAirport)o).getLandedWeight())
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
		return"\nThe year of creation is: "+ getYearOfCreation()+"\nThe cost is: "+getCost()+"\nThe number of runways at CargoAirport is: "+getNumOfRunways()+"\nThe code for the CargoAirport is: "+getCode()+"\nThe landed weight is: "+landedWeight;
	}
}
