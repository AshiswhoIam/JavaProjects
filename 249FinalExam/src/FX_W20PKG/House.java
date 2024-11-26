/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package FX_W20PKG;

public class House extends ResidentialBuilding{

	/**
	 * Attributes
	 */
	double numberOfRooms;
	int numOfFloors;

	/**
	 * This is a parameterized constructor for House
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 * @param ls parameter ls is the landspace
	 * @param mat parameter mat is the material of the House
	 * @param maxnb this is parameter for max habitants
	 * @param nor parameter for number of rooms
	 * @param nof parameter for number of floors
	 */
	public House(int year, double cost, double ls, String mat, int maxnb,double nor, int nof) {
		super(year, cost, ls, mat, maxnb);
		this.numberOfRooms=nor;
		this.numOfFloors=nof;
	}

	/**
	 * copy constructor
	 * @param h is variable parameter
	 */
	public House(House h){
		super(h);
		this.numberOfRooms=h.numberOfRooms;
		this.numOfFloors=h.numOfFloors;
	}

	/**
	 * Getter
	 * @return it returns the number of rooms
	 */
	public double getNumberOfRooms() {
		return numberOfRooms;
	}
	/**
	 * getter for floor nb
	 * @return returns the number of floors
	 */
	public int getNumOfFloors() {
		return numOfFloors;
	}

	/**
	 * Clone method
	 */
	public House clone(){
		return new House(this);
	}
	/**
	 * This is an equals methods
	 * @param o the parameter is for Object
	 */
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((House) o).getYearOfCreation()&&this.getCost()==((House)o).getCost()&&this.getLandSpace()==((House)o).getLandSpace()&&this.getMaterial()==((House)o).getMaterial()&&this.getMaxNumberOfHabitants()==((House)o).getMaxNumberOfHabitants()&&this.getNumberOfRooms()==((House)o).getNumberOfRooms()&&this.getNumOfFloors()==((House)o).getNumOfFloors())
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
		return"\nThe year of creation is for the House is: "+ yearOfCreation+"\nThe cost of House is: "+cost+"\nThe landpsace of House is: "+landSpace+"\nThe material of the House is: "+material+"\nThe max habitants of the House is: "+maxNumberOfHabitants+"\nThe number of Rooms for the house is : "+numberOfRooms+"\nThe number of Floors in the house is: "+numOfFloors;
	}


}
