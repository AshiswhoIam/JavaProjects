
public class MagicBoard <E> implements Stack <E>{

	
	int limit=20;
	
	E[] [] mb;
	
	int countz=0;
	int count=0;
	boolean stop=true;
	String position="";
	int circle= 0;
	int c1=0;

	public MagicBoard(int r, int c){
	
	
		mb= (E[][]) new Object[r][c];
		
	}
	
	public void initial()
	{	
		
		
		for(int r=0;r<mb.length;r++){

			count++;

	
		//for loop for the collums
			for(int c=0;c<mb[r].length;c++){

				//implementing random number to each elements 
				mb [r][c]=(E)(Math.random()*(limit+1)) ;

				//taking in count if theres more than 1 zero
				if(mb [r][c]==0){
					countz++;
				}

				//change the random number if more than 1 zero
				if((countz>=1)&&(mb [r][c]==0)){

				
					mb [r][c]=(E)(Math.random()*(limit-1)) ;
				}
				
				//to ensure a zero on the board
				if(((r==mb.length-1)&&(c==mb.length-1))&&(countz==0)){

					mb [r][c]=0;
				}

				//display of the board
				System.out.print("|"+mb [r][c]+"|");
			}
			System.out.println();
		}
		}
	
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
