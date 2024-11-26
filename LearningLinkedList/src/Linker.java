
public class Linker {


	Node head;

	//everytime we insert we create a new node
	public void insert(int data){
		Node node = new Node();
		node.data= data;
		node.next=null;

		if(head==null){
			head=node;
		}
		else{
			Node n = head;
			//we have to first check the elementsto travel we do the below
			while(n.next!=null){
				n=n.next;
			}
			n.next=node;
		}

	}
	/*while(node!=null){
		   System.out.println(node.data);
		   node = node.next; 
		  }
	*/
	public void show(){
		Node node=head;
		while(node.next!=null){
			System.out.println(node.data);

			node= node.next;

		}
		System.out.println(node.data);
	}
	public void insertStart(int a){
		Node node = new Node();
		node.data= a;
		node.next=null;
		node.next=head;
		
		head=node;

		
	}
	public void insertLoc(int index,int datas){
		Node node = new Node();
		node.data= datas;
		node.next=null;
		//to travel
		Node n =head;
		if(index==0){
			insertStart(datas);
		}
		else{
		for(int i=0;i<index-1;i++){
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}

	}
	public void deleter(int index){
		if(index==0)
		{
			head=head.next;
		}
		else{
			
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++){
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("n1 "+n1.data);
		
		}
	}
}


