import java.io.PrintStream;


public class herewego {
	static void revealStr(char binaryString[], int currentIndex)
	{
		if(currentIndex == binaryString.length)
		{

			System.out.println(binaryString);


		return;
		}      
		if(binaryString[currentIndex] == '*')
		{
			binaryString[currentIndex] = '0';
			

			revealStr(binaryString, currentIndex + 1);
			

			binaryString[currentIndex] = '1';
			
			revealStr(binaryString, currentIndex + 1);
	
			binaryString[currentIndex] = '*';
			
		
		}

		else

			revealStr(binaryString, currentIndex + 1);  
		System.out.println(binaryString);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="1*01*10*1";
		 char[] ch = new char[a.length()]; 
		 for (int i = 0; i < a.length(); i++) { 
	            ch[i] = a.charAt(i); 
	        } 
		revealStr(ch,0);
		
		System.out.println("here"+ch);
	}

}
