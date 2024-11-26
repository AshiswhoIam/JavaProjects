/**
 * @author Ashiqur Rahman
 * COMP 249
 * Final Exam
 * Due April 23rd 2020 9am
 */
package FX_W20PKG;

public class StructureList {

	/**
	 * Inner node class for linked list
	 *
	 */
	public class StructureNode{
		
		/**
		 * Structure object and a pointer for node class as attributes
		 */
		Structure sObj;
		private StructureNode next;
		/**
		 * Default constructor
		 */
		public StructureNode(){
			
			this.sObj=null;
			this.next=null;
		}
		/**
		 * Parameterized constructor
		 * @param s is the variable used for the object Structure
		 * @param sn sn is the variable used for the StructureNode
		 */
		public StructureNode(Structure s, StructureNode sn){
			
			this.sObj=s;
			this.next=sn;
		}
		/**
		 * Copy constructor
		 * @param sn sn is the variable used for the object
		 */
		public StructureNode(StructureNode sn){
			this.sObj=sn.sObj;
			this.next=sn.next;
		}
		/**
		 * getter for object
		 * @return returns the object
		 */
		public Structure getsObj() {
			return sObj;
		}

		/**
		 * Getter for pointer
		 * @return returns next which is a pointer
		 */
		public StructureNode getNext() {
			return next;
		}
		
		
		
	}
	/**
	 * head of node
	 */
	private StructureNode head;
	
	/**
	 * Default Constructor
	 */
	public StructureList(){
		head=null;
	}
	/**
	 * This is a copy constructor
	 * @param sl sl is a variable for parameter
	 */
	public StructureList(StructureList sl){
		this.head=sl.head;
	}
	/**
	 * Method to add elements at start
	 * @param s s is the variable for the parameter
	 */
	public void addToStart(Structure s){
		
		head=new StructureNode(s,head);
	}
	/**
	 * Method to add elements at end
	 * @param s s is the variable for the parameter
	 */
	public void addAtEnd(Structure s){
		StructureNode nnode = new StructureNode();
		StructureNode atm=head;
		if(head==null){
			System.out.println(nnode);
		}
		
		while(atm.next!=null){
			atm=atm.next;
		}
		atm.next=nnode;
		System.out.println(head);
		
	}
	/**
	 * this was suppose to be a clone method
	 */
	public StructureList clone(){
		return new StructureList(this);
	}
	/**
	 * this is a method to append
	 * @param sl sl is the variable for the parameter 
	 */
	public void append(StructureList sl){
		if(head==null){
			
		}
	}
	/**
	 * method to display content
	 */
	public void showListsContents(){
		StructureNode sn=head;
		while(sn!=null){
			System.out.println("===> \n");
			System.out.println(sn.sObj);
			sn=sn.next;
		}
		System.out.println("X");
	}
}
