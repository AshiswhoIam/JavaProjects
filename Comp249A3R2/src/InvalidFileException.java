import java.io.File;

// ----------------------------------------------------- 
// Assignment 3
// Question: 3
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
/**
 *  @author Ashiqur Rahman (40096265)
 *
 */
public class InvalidFileException {
	/**
	 * String attribute
	 */
	String message ="Error yikes";
	
	/**
	 * @param m m is a string parameter
	 */
	public InvalidFileException(String m){
		
		this.message=m;
	}
	
	/**
	 * @return here we return weether or not theres a file that exists
	 */
	public String CheckMethod(){
		File ff= new File("log.txt");
		if(ff.exists()){
			return "The file is alive.";
		}
		else{
			return "The an invalid file Exception error";
		}
	}
}
