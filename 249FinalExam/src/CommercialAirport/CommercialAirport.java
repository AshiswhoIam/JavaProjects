/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package CommercialAirport;

import FX_W20PKG.Airport;
import FX_W20PKG.Structure;

public class CommercialAirport extends Airport{

	/**
	 * attribute
	 */
	int numOfGates;
	/**
	 * This is a parameterized construtor for CommercialAirport
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 * @param nr parameter for number of runways
	 * @param code parameter for the code
	 * @param gates parameter for the number of gates
	 */
	public CommercialAirport(int year, double cost, int nr, String code,int gates) {
		super(year, cost, nr, code);
		this.numOfGates=gates;
	}
	/**
	 * Copy constructor
	 * @param ca parameter
	 */
	public CommercialAirport(CommercialAirport ca){
		super(ca);
		this.numOfGates=ca.numOfGates;
	}
	/**
	 * getter for gates
	 * @return return the nb of gates
	 */
	public int getNumOfGates() {
		return numOfGates;
	}

	/**
	 * clone method
	 */
	public CommercialAirport clone(){
		return new CommercialAirport(this);
	}
	/**
	 * This is an equals methods
	 * @param o the parameter is for Object
	 */
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((CommercialAirport) o).getYearOfCreation()&&this.getCost()==((CommercialAirport)o).getCost()&&this.getNumOfRunways()==((CommercialAirport)o).getNumOfRunways()&&this.getCode()==((CommercialAirport)o).getCode()&&this.getNumOfGates()==((CommercialAirport)o).getNumOfGates())
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
		return"\nThe year of creation is: "+ getYearOfCreation()+"\nThe cost is: "+getCost()+"\nThe number of runways at CommercialAirport is: "+getNumOfRunways()+"\nThe code for the CommercialAirport is: "+getCode()+"\nThe number of gates is: "+numOfGates;
	}
}
