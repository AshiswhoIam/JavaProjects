import java.util.Scanner;
public class Player {

	Scanner key = new Scanner(System.in);
	//creating the two attributes
	
	public String name;
	//Garden garden= new Garden();
	//IF it does not work use above
	public Garden garden;
	
	//Creating a constructor for the user name and board size
	
	
	
	public Player(String Name,int Gsize){
		
		
		
		name = Name;
		
		 garden = new Garden(Gsize);
		
		
	}
	
	// Creating accessor method
	
	public String getName(){
		
		
		return name;
	}
	
	
	public int howManyFlowersPossible(){
	
		return garden.countPossibleFlowers();
	}
	
	public int howManyTreesPossible(){
		
		return garden.countPossibleTrees();
	}
	
	public char whatisPlanted(int r,int c){
		return garden.getInLocation(r, c);
	}
	
	public void plantTreeInGarden(int r,int c){
		
		 garden.PlantTree(r, c);
	}
	public void plantFlowerInGarden(int r,int c)
	{
		garden.PlantFlower(r, c);
	}
	public void eatHere(int r,int c){
		
		garden.removeFlower(r, c);
	}
	
	public boolean isEmptySlot(int r,int c){
		return garden.EmptySlot(r, c);
	}
	public boolean isGardenEmpty(){
		return garden.getGardensize()==0;
	}

	public boolean isGardenFull(){
		
		return garden.gardenFull();
	}
	
	public void showGarden(){
		System.out.println( garden.toString());
	}
}
