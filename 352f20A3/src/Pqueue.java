
public class Pqueue <T> {

	
	int size=0;
	long waitTime;
	Job j =new Job();
	Object[] pql;

	public Pqueue (){

		pql= new Object[0];
	}

	public Pqueue (int x){

		pql= new Object[x];
	}
	
	public void enqueue(Job j){
		
		if(size==0){
			
			pql[0]=j;
			size++;
		}
		if(size==pql.length){
			
		}
	}
	
	public void dequeue(){
		
	}

	public String toString(){
		return " ";
		
		
	}
}
