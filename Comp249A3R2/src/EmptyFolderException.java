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
public class EmptyFolderException {
	String message ="Error yikes empty folder";
	/**
	 * @param m m is a string parameter
	 */
	public EmptyFolderException(String m){
		
		this.message=m;
	}
	/**
	 * @return here we return whether or not theres a file that exists
	 */
	public String CheckMethod(){
		File ff= new File("log.txt");
		if(ff==null){
			return "The an Emtpy file Exception error.";
		}
		else{
			return "there is sometihng in the folder";
		}
	}
}
