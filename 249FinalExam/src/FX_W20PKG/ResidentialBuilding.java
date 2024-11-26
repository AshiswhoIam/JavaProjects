/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package FX_W20PKG;

public class ResidentialBuilding extends Building{

	//attribute
	int maxNumberOfHabitants;
	/**
	 * This is a parameterized constructor for Res building
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 * @param ls parameter ls is the landspace
	 * @param mat parameter mat is the material of the Res building
	 * @param maxnb this is parameter for max habitants
	 */
	public ResidentialBuilding(int year, double cost, double ls, String mat,int maxnb) {
		super(year, cost, ls, mat);
		this.maxNumberOfHabitants=maxnb;

	}
	/**
	 * This is a copy constructor
	 * @param r r is the variable parameter 
	 */
	public ResidentialBuilding(ResidentialBuilding r){
		super(r);
		this.maxNumberOfHabitants=r.maxNumberOfHabitants;
	}
	/**
	 * This is a getter
	 * @return it returns the max habitants
	 */
	public int getMaxNumberOfHabitants() {
		return maxNumberOfHabitants;
	}
	/**
	 * this is a clone method
	 */
	public ResidentialBuilding clone(){
		return new ResidentialBuilding(this);
	}
	/**
	 * This is an equals methods
	 * @param o the parameter is for Object
	 */
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((ResidentialBuilding) o).getYearOfCreation()&&this.getCost()==((ResidentialBuilding)o).getCost()&&this.getLandSpace()==((ResidentialBuilding)o).getLandSpace()&&this.getMaterial()==((ResidentialBuilding)o).getMaterial()&&this.getMaxNumberOfHabitants()==((ResidentialBuilding)o).getMaxNumberOfHabitants())
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
		return"\nThe year of creation is for the residential building is: "+ yearOfCreation+"\nThe cost of residential building is: "+cost+"\nThe landpsace of residential building is: "+landSpace+"\nThe material of residential building is: "+material+"\nThe max habitants of the r building is: "+maxNumberOfHabitants;
	}


}
