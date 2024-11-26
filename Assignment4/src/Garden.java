
public class Garden {

	private char [][] garden;

	private int gardensize;
	
	public Garden(){

		garden= new char [3][3];
		gardensize = 0;
		initializeGarden();
	}

	public Garden(int size){
		
		gardensize = 0;
		garden= new char [size][size];
		initializeGarden();
	}
	

	private void initializeGarden(){

		for(int x=0;x<garden.length;x++)
			for(int a=0;a<garden.length;a++)
			{
				garden[x][a]='-';
			}

	}

	public char getInLocation(int r,int c){
		return garden[r][c];
	}

	public void PlantFlower(int r,int c){

		garden[r][c]='f';
		gardensize++;
	}


	public void PlantTree(int r,int c){
		garden[r][c]='t';
		garden[r+1][c]='t';
		garden[r][c+1]='t';
		garden[r+1][c+1]='t';
		gardensize+=4;
	}

	public void removeFlower(int r,int c){

		garden[r][c]='-';
		gardensize--;
	}

	public boolean EmptySlot(int r, int c)
	{		
		return garden[r][c]=='-';
	}
	
	public int countPossibleTrees(){
		int r=0;
		int c=0;
		int count = 0;

		for (r = 0; r < garden.length-1; r++)
			for (c = 0; c < garden.length-1; c++) {
				if ((garden[r][c]=='t')&&(garden[r+1][c]=='t')&& (garden[r][c+1]=='t')&& (garden[r+1][c+1]=='t') ) {

					count++;
				}
			}
		return count;
	}


	public int countPossibleFlowers(){

		int places=0;

		int r=0;
		int c=0;


		for (r = 0; r < garden.length; r++)
			for (c = 0; c < garden.length; c++)
			{
				if(garden[r][c]=='-')

					places++;
			}	

		return places; 
	}

	public boolean gardenFull(){

		int r=0;

		int c=0;

		int full=0;

		for (r = 0; r < garden.length; r++)
			for (c = 0; c < garden.length; c++){
				if(garden[r][c]=='f'||(garden[r][c]=='t'))

				{
					full++;
				}
			}

		if(full==(garden.length)*(garden.length))
		{
			return true;
		}
		else 

		{
			return false;
		}


	}
	
	
	public int getGardensize() {
		return gardensize;
	}

	public void setGardensize(int gardensize) {
		this.gardensize = gardensize;
	}

	public String toString(){
		
		String reString="  ";		
		reString+=" |";
				
		for(int c=0;c<garden.length;c++)
		{
			reString+=" "+c+" ";
		}		
		for (int r = 0; r < garden.length; r++)
		{ 			
			reString+=("\n\n "+r+" | ");
			for (int c = 0; c < garden.length; c++)
			{
				reString+=garden[r][c]+"  ";
			}
		System.out.println();
		}
		//reString +="\n"		
		return reString;
	}

	//MAKE A print pf it&?????


}
