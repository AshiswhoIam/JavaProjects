// ----------------------------------------------------- 
// Assignment 4
// Question: 3
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
import java.util.NoSuchElementException;
/**
 *  @author Ashiqur Rahman (40096265)
 *
 */
public class ActivityList{

	/**
	 * inner class ActivityNode
	 *
	 */
	public class ActivityNode
	{
		/**
		 * private attributes as required
		 */
		private Activity aobj;
		private ActivityNode link;

		/**
		 * constructor
		 */
		public ActivityNode(){
			this.aobj=null;
			this.link=null;
		}
		/**
		 * this is ActivityNode Constructor
		 * @param a is for the Activity Object
		 * @param an is for the ActivityNode
		 */
		public ActivityNode(Activity a, ActivityNode an){

			this.aobj=a;
			this.link=an;

		}
		/**
		 * this is ActivityNode Copy Constructor
		 * @param an is variable for ActivityNode
		 */
		public ActivityNode(ActivityNode an){
			this.aobj=an.aobj;
			this.link=an.link;
		}
		/** 
		 * @see java.lang.Object#clone()
		 * clone method
		 * returns a copy
		 */
		public ActivityNode clone(){
			return new ActivityNode(this);
		}
		/**
		 * @return aobj
		 */
		public Activity getAobj() {
			return aobj;
		}
		/**
		 * @param aobj to set Activity aobj
		 */
		public void setAobj(Activity aobj) {
			this.aobj = aobj;
		}
		/**
		 * @return link
		 */
		public ActivityNode getLink() {
			return link;
		}
		/**
		 * @param link to set the link
		 */
		public void setLink(ActivityNode link) {
			this.link = link;
		}
	}

	/**
	 * ActivityNode as head
	 * and the node size initialized
	 */
	private ActivityNode head;
	private int size=0;

	/**
	 * method to get node size
	 * @return size to get size value
	 */
	public int getSize(){

		for(ActivityNode node=head;node.link!=null;node=node.link)
		{
			size++;
		}
		return size;
	}
	/**
	 * Contructor for outer class
	 */
	public ActivityList(){
		head=null;
		size=0;

	}
	/**
	 * this is a copy constructor
	 * @param a is variable for ActivityList
	 */
	public ActivityList(ActivityList a){

		ActivityList al= new ActivityList();
		al=a;
		System.out.println(al);
	}
	/**
	 * 
	 * @param obj refers as the Variable for Activity
	 */
	public void addStart(Activity obj){

		ActivityNode a= new ActivityNode(obj,head);
		System.out.println(a);

	}
	
	/**
	 * @param a is the variable for activity
	 * @param index the index position of the node
	 * @throws NoSuchElementException exception handling
	 * this method inserts a specific index of a node
	 */
	public void insertAtIndex(Activity a,int index) throws NoSuchElementException{

		if(index<0||index>size-1){
			System.out.println("NSEE was found terminating program");
			System.exit(0);

		}

		else
		{
			ActivityNode an= new ActivityNode(a,head);
			an.link=head;
			ActivityNode positions=an;
			
			for(int i=0;i<index;i++){
				positions=positions.link;
			}
			
			an.link=positions.link;
			
			System.out.println("It was inserted at its desired index"+an.link);
		}
	}
	/**
	 * @param index the index position of the node
	 * @throws NoSuchElementException exception handling
	 * this method deletes a specific index of a node
	 */
	public void deleteFromIndex(int index)throws NoSuchElementException{

		if(index<0||index>size-1){
			System.out.println("NSEE was found terminating program");
			System.exit(0);

		}
		else
		{
			ActivityNode an1= new ActivityNode();
			an1.link=head;
			ActivityNode positions=an1;
			
			for(int i=0;i<index;i++){
				positions=positions.link;
			}
			
			an1.link=positions.link;
			an1.link=null;
			
			System.out.println("It was removed at its desired index"+an1.link);
		}
	}
	/**
	 * this method deletes a node at the start
	 */
	public void deleteFromStart(){
		if(head!=null){
			
			head=head.link;
			System.out.println("it has been deleted.");
		}
		else{
			System.out.println("there was nothing to begin with .");
		}
	}
	/**
	 * @param obj variable for Activity
	 * @param index index of the node
	 * this method is to replace a certain node at a certain position by another
	 */
	public void replaceAtIndex(Activity obj,int index){
		
		if(index<0||index>size-1){
			System.out.println("index was not valid");
		

		}
		else{
			ActivityNode a= head;
			a=a.link;
			
			for(int i=0;i<index;i++){
				a=a.link;
			}
			ActivityNode anew= new ActivityNode(obj,a);
		
			a=anew;
			System.out.println("the replace mthd did its job:");
		
		}
	}
	/**
	 * this method determines wether or not theres a a specific id and show at what index
	 * @param ActivityID string for id
	 */
	public void find(String ActivityID){
		
		int count=0;
		ActivityNode a= head;
		
		boolean stop=true;
		do{
			
			if(a.aobj.getActivityID().equals(ActivityID)){
				System.out.println("There was a match!: for "+a.aobj.getActivityID());
				stop=false;
			}
			if (count>7){
				System.out.println("limted to "+count+" searches and nothing that match was found");
				stop=false;
			
			}
			
			count++;
		}while(stop==true);
	}
	
	/**
	 * this is a boolean method to check if the node list has a specific id
	 * @param ActivityID string for Id
	 * @return true or false
	 */
	public boolean contains(String ActivityID){
		int count=0;
		ActivityNode a= head;
		
		boolean stop=true;
		do{
			
			if(a.aobj.getActivityID().equals(ActivityID)){
				System.out.println("There was a match!: for "+a.aobj.getActivityID());
				stop=false;
				return true;
			}
			if (count>7){
				System.out.println("limted to "+count+" searches and nothing that match was found");
				stop=false;
				return false;
			
			}
			
			count++;
		}while(stop==true);
		if(count>7){
			return false;
		}else
			return true;
	}
	
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 * boolean equals method to check the equality of objects
	 */
	public boolean equals(ActivityList now){
		if(this==null||this!=now)
		{
			return false;
		}
		else
			return true;
	}
	

}
