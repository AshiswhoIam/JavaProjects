
public class Tribonacci {

	
	
	 public int tribonacciAtPosition(int p){
		 
		if(p==0||p==1||p==2){
			return 0;
		}
		
		if(p==3){
			return 1;
		}
		else{
			
		return	(tribonacciAtPosition(p-1)+tribonacciAtPosition(p-2)+tribonacciAtPosition(p-3));
			
			
		}
		
			 
	 }
	 

	int displays(int p){
			
			for(int x=1;x<p;x++){
				
				System.out.println(tribonacciAtPosition(x)+"    ");
			}
			return p;
		}
}
