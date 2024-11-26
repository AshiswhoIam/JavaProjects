/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package FX_W20PKG;

public class HighRise extends Building{

	//attribute
	double height;

	/**
	 * This is a parameterized constructor for HighRise
	 * @param year parameter year is for the year
	 * @param cost parameter cost is for the cost
	 * @param ls parameter ls is the landspace
	 * @param mat parameter mat is the material of the HighRise
	 * @param height the parameter is for the height
	 */
	public HighRise(int year, double cost, double ls, String mat,double height) {
		super(year, cost, ls, mat);
		this.height=height;

	}
	/**
	 * Copy Constructor
	 * @param h h is variable for HighRise
	 */
	public HighRise(HighRise h){
		super(h);
		this.height=h.height;
	}
	/**
	 * getter
	 * @return it returns height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * This is a clone method
	 */
	public HighRise clone(){
		return new HighRise(this);
	}
	/**
	 * This is an equals methods
	 * @param o the parameter is for Object
	 */
	public boolean equals(Object o){
		if(this.getYearOfCreation()==((HighRise) o).getYearOfCreation()&&this.getCost()==((HighRise)o).getCost()&&this.getLandSpace()==((HighRise)o).getLandSpace()&&this.getMaterial()==((HighRise)o).getMaterial()&&this.getHeight()==((HighRise)o).getHeight())
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
		return"\nThe year of creation is for the HighRise is: "+ yearOfCreation+"\nThe cost of HighRise is: "+cost+"\nThe landpsace of HighRise is: "+landSpace+"\nThe material of HighRise is: "+material+"\nThe height for the high rise is : "+height;
	}
}
