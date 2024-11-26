
public class LinkedList {

	class Node{

		private Player player;
		private Node next;
		public Node()
		{
			this.player=null;
			this.next=null;
		}
		public Node(Player player, Node next) {
			super();
			this.player = player;
			this.next = next;



		}

		public Player getPlayer() {
			return player;
		}

		public void setPlayer(Player player) {
			this.player = player;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String toString(){
			return"The player is: "+player;
		}
	}
	Node head;
	int size;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}



	void insert (Player p) {
		Node n=new Node(p, head);	     
		head = n; 						
		n = null;	
		
		System.out.println("The player:"+p.getName()+" is added");

	}
	void remove(Player p){
		Node x = head;
		while(x != null){

			if (x.player==p){
				x=null;
				System.out.println("The player "+p.getName()+" is now gone");
			}
			else
				x=null;
				System.out.println("The player "+p.getName()+" is now removed");
		}

	}

	public String toString1(){

		return"The head is :"+head+"The size is:"+size;
	}

}
