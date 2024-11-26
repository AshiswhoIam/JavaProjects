/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package FX_W20PKG;

public class CondoBuilding extends ResidentialBuilding{

	/**
	 * attribute
	 */
	int numOfUnits;
	/**
	 * This is a parameterized constructor for CondoBuilding
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 * @param ls parameter ls is the landspace
	 * @param mat parameter mat is the material of the CondoBuilding
	 * @param maxnb this is parameter for max habitants
	 * @param units this is the units parameter
	 */
	public CondoBuilding(int year, double cost, double ls, String mat, int maxnb,int units) {
		super(year, cost, ls, mat, maxnb);
		this.numOfUnits=units;

	}
	/**
	 * Copy constructor
	 * @param c c is the parameter
	 */
	public CondoBuilding(CondoBuilding c){
		super(c);
		this.numOfUnits=c.numOfUnits;

	}
	/**
	 * This is a getter
	 * @return it returns the number of units
	 */
	public int getNumOfUnits() {
		return numOfUnits;
	}
	/**
	 * clone method
	 */
	public CondoBuilding clone(){
		return new CondoBuilding(this);
	}
	/**
	 * This is an equals methods
	 * @param o the parameter is for Object
	 */
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((CondoBuilding) o).getYearOfCreation()&&this.getCost()==((CondoBuilding)o).getCost()&&this.getLandSpace()==((CondoBuilding)o).getLandSpace()&&this.getMaterial()==((CondoBuilding)o).getMaterial()&&this.getMaxNumberOfHabitants()==((CondoBuilding)o).getMaxNumberOfHabitants()&&this.getNumOfUnits()==((CondoBuilding)o).getNumOfUnits())
		{
			return true;
		}
		else 
			return false;
	}
	/**
	 * ToString method for info
	 */
	public String toString(){
		return"\nThe year of creation is for the CondoBuilding is: "+ yearOfCreation+"\nThe cost of CondoBuilding is: "+cost+"\nThe landpsace of CondoBuilding is: "+landSpace+"\nThe material of CondoBuilding is: "+material+"\nThe max habitants of the CondoBuilding is: "+maxNumberOfHabitants+"\nThe number of units of the CondoBuilding is : "+numOfUnits;
	}

}
