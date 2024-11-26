
public class House {

	private int houseage;
	private String type;
	private double housecost;

	public House(int age,String Type,double cost){
		houseage=age;
		type=Type;
		housecost=cost;

	}

	public void reAge(){
		System.out.print("Its age is: "+houseage);
	}

	public void reString(){	
		System.out.print("The house type is: "+type);
	}

	public void reCost(){
		System.out.print(" and costs: "+housecost);
	}


	public void newreAge(){System.out.print("Mutator Method:");
		
		System.out.println("The new age for house H3 is : "+houseage);
	}
	public void newreString(){System.out.print("Mutator Method:");
		System.out.println("The new housetype for house H3 is : "+type);
	}
	public void newreCost(){System.out.print("Mutator Method:");
		System.out.println("The new cost for house H3 is : "+housecost);
	}
	public void reAll(){System.out.print("Mutator Method:");
		System.out.println("The new age for house H3 is : "+houseage+"The new cost for house H3 is : "+housecost);
	}
	public void reAll2(){System.out.print("Mutator Method:");
		System.out.println("The new housetype for house H3 is : "+type+"Its new age for house H3 is : "+houseage+"and The new cost for house H3 is : "+housecost);
	}
	
	
	//Estimate price
	
	
	
	public String toString(){
		

		return "The house is type "+type+" house age is "+houseage+" the cost is "+housecost;
	
	}
	
	boolean var=true;
	
	 /*public boolean equals(House somehouse){
		if(type.equals(somehouse.newreString()))
		{
			if(age==somehouse.reneage)
				
		}
		else
		{
			
		}*/
	
	
	
		
	}
	
	
	

}
