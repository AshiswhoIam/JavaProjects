
import java.io.File;
import java.io.IOException;

//the exception class that can handle all the different errors for an invalid file
class FileInvalidException extends Exception{
	
	// Default Constructor 
	public FileInvalidException()
	{
		super("Error: Input file cannot be parsed due to missing information.");
		System.out.println(this.getMessage());
		System.out.println("Program will terminate.");
		System.exit(0);
	}
	//Parameterized constructor that takes a string message
	public FileInvalidException(String s){
		super(s);
	}
//Accessor for the message
	public String getMessage(){
		return super.getMessage();
	}
//Parameterized constructor that takes a file array and an index i	
	public FileInvalidException(File[] aFileArray ,int i)
	{
		super("Error: Input file is missing information. File: "+ aFileArray[i]);
		System.out.println(this.getMessage());
		System.out.println("Program will terminate.");
		System.exit(0);
	}
	
}
	