/**
 * @author Ashiqur Rahman
 * COMP 249
 * Assignment 4
 * Due April 19th 2020
 */
import java.util.NoSuchElementException;
public class CellList {


	/**
	 *Here we have a inner class CellNode
	 */
	public class CellNode{

		/**
		 * The following are attributes
		 */
		private CellPhone cellobj;
		private CellNode points;
		private int somenumb=0;


		/**
		 * This is a constructor for CellNode
		 */
		public CellNode(){
			this.cellobj=null;
			this.points=null;
		}


		/**
		 * This is a parameterized constructor for CellNode
		 * @param cellobj it takes a CellPhone object as param
		 * @param points it takes a CellNode object as param
		 */
		public CellNode(CellPhone cellobj, CellNode points) {

			this.cellobj = cellobj;
			this.points = points;
		}

		/**
		 * This is a copy constructor
		 * @param c c is the object for CellNode
		 */
		public CellNode(CellNode c){
			this.cellobj = c.cellobj;
			this.points = c.points;

		}

		/**
		 * This is a clone method
		 */
		public CellNode clone() {
			return new CellNode(this);
		}


		/**
		 * This is a getter for the CellPhone Object
		 * @return it return the cellphone object
		 */
		public CellPhone getCellobj() {
			return cellobj;
		}


		/**
		 * This is a setter for the CellPhone object
		 * @param cellobj The cellobj is a parameter for setting CellPhone
		 */
		public void setCellobj(CellPhone cellobj) {
			this.cellobj = cellobj;
		}


		/**
		 * This is a getter for CellNode point
		 * @return it returns the pointer
		 */
		public CellNode getPoints() {
			return points;
		}


		/**
		 * Setter for the pointer
		 * @param points the parameter is a pointer that can be set
		 */
		public void setPoints(CellNode points) {
			this.points = points;
		}


	}
	/**
	 * These are attributes for the CellList class
	 */
	private CellNode head;
	private int size;

	/**
	 * Constructor for CellList class
	 */
	public CellList(){

		head=null;
		size=0;
		size++;
	}
	/**
	 * Parameterized Constructor for CellList class
	 * @param cl is a parameter for the object
	 */
	public CellList(CellList cl){
		this.head=cl.head;
		this.size=cl.size;
		size++;
	}

	/**
	 * This is the addToStart method 
	 * @param cp is the variable for Cellphone
	 */
	public void addToStart(CellPhone cp){
		CellNode cn= new CellNode(cp,head);
		head=cn;
		cn=null;
	}

	/**
	 * This is a method that allow to insert at a specific index
	 * @param c is the object for CellPhone
	 * @param index the index is the position
	 * @throws NoSuchElementException this is an exception
	 */
	public void insertAtIndex(CellPhone c, int index)throws NoSuchElementException{

		if(index<0||index>size-1){
			System.out.println("NSEE was found during insertIndexMethod terminating program");
			System.exit(0);

		}
		else{
			CellNode cn1= new CellNode(c,head);
			cn1.points=head;
			CellNode position=cn1;
			for(int i=0;i<index;i++){
				position=position.points;
			}
			cn1.points=position.points;			
			System.out.println("The item was inserted at the index chosen: "+cn1.points);

		}

	}

	/**
	 * This is a method to delete at a specific index
	 * @param index this is the position of the index
	 * @throws NoSuchElementException just an exception
	 */
	public void deleteFromIndex(int index)throws NoSuchElementException{
		if(index<0||index>size-1){
			System.out.println("NSEE was found using deleteFromIndex method terminating program");
			System.exit(0);

		}
		else{
			CellNode cn2= new CellNode();
			cn2.points=head;
			CellNode position=cn2;
			for(int i=0;i<index;i++){
				position=position.points;
			}
			cn2.points=position.points;	
			cn2.points=null;
			System.out.println("The item was deleted at the index chosen: "+cn2.points);
		}

	}
	/**
	 * This method is to delete the start
	 */
	public void deleteFromStart(){
		if(head!=null){

			head=head.points;
			System.out.println("The start has been now deleted.");
		}
		else{
			System.out.println("Nothing was there to delete at start.");
		}
	}
	/**
	 * This is a method to replace at a specific index
	 * @param cp cp is the object for CellPhone
	 * @param index index is the position
	 */
	public void replaceAtIndex(CellPhone cp, int index){
		if(index<0||index>size-1){
			System.out.println("index was not valid for the replaceatindex method");
		}
		else
		{
			CellNode c=head;
			c=c.points;
			for(int i=0;i<index;i++){
				c=c.points;
			}
			CellNode celln=new CellNode(cp,c);
			c=celln;
			System.out.println("The item was replaced at the indicated index.");
			
		}
		
	}
	
	/**
	 * This is a method to find by serial number
	 * @param sn sn is the parameter for serial number
	 */
	public void find(long sn){
		CellNode c=head;
		int count=0;
		boolean stopper=true;
		
		while(stopper==true){
			
			if(c.cellobj.getSerialNum()==(sn)){
				
				System.out.println("A similar number was found for: "+c.cellobj.getSerialNum());
				stopper=false;	
				break;
			}
			if(count>10){
				System.out.println("it was searched "+count+"times and will stop");
				stopper=false;
				break;
			}		
			count++;
		}
		
		
	}
	/**
	 * This is a method to see if theres a specific serial number in it
	 * @param sn sn is the parameter for serial number
	 * @return it return either true or false
	 */
	public boolean contains(long sn){
		CellNode c=head;
		
		int count=0;
		boolean stopper=true;
		
		while(stopper==true){
		if(c.cellobj.getSerialNum()==(sn)){
			System.out.println("The contains method found: "+c.cellobj.getSerialNum());
			stopper =false;	
			return true;
		}
		if(count>10){
			System.out.println("it was searched "+count+"times and will stop");
			stopper=false;
			return false;
		}	
		
	}
		if(count>10){
			return false;
		}else
			return true;
		}
	/**
	 * This method is to display information
	 */
	public void showContents(){
		System.out.println();
		CellNode temp= head;
		if(temp ==null)
		{
			System.out.println("There is no content to be printed out");
		}
		while(temp!=null){
			
			System.out.println(temp.cellobj);
			System.out.println();
			temp=temp.points;
		}
	}
	/**
	 * This is equals method to check if two objects are the same
	 * @param obj obj is the object passed as a parameter
	 * @return it returns either true or false
	 */
	public boolean equals(CellList obj){
		if(this==null||this!=obj)
		{
			return false;
		}
		else
			return true;
	}

}
