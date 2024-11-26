
public class Dice {

	// Declaring two integers for the dice value
	private int roll1;
	private int roll2;
	int d1;
	int d2;
	//Creating a constructor to set dice values at 0
	public Dice(){
	
		
		d1=0;	
		d2=0;
		
		this.roll1=d1;
		this.roll2=d2;
	}
	
	
	//Creating accessor methods for the getting values of d1 and d2
	//Setting the values and getting them 
	
	public void setd1(int d1){
		this.roll1=d1;
	}

	public void setd2(int d2){
		this.roll2=d2;
	}
	
	public double getd1(){
		return roll1;
	}

	public double getd2(){
		return roll2;
	}
	
	
	//A method used to assign random integers from 1-6 to each die
	public int rollDice(){
		
		roll1=(int) (Math.random()*6)+1;		
		roll2=(int) (Math.random()*6)+1;
		int sum=roll1+roll2;
		
		return sum;
	}
	
	//toString method to return the values of each die
	public String toString(){
		
		return " roll1= "+roll1+" roll2= "+roll2;
		
	}
	
}
