package testrnadlast;

public class qqddq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	
		
		
		char garden[][]= new char[3][3];
		
		
		int r=0;
		int c=0;
		String reString="";
		
		reString+=" |";
		
		
		for(c=0;c<garden.length;c++)
		{
			reString+=" "+c+" ";
		}
		
		
		for (r = 0; r < garden.length; r++)
		{ 
			
			reString+=("\n\n "+r+" | ");
			for (c = 0; c < garden.length; c++)
			{
				reString+=garden[r][c]+" ";
			}
		System.out.println();
		}

		System.out.println(reString);
		
	}
	
	
	

}
