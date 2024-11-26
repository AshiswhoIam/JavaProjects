// ----------------------------------------------------- 
// Assignment 3 
// Question: 1
// Written by:  Ashiqur Rahman (40096265)
// -----------------------------------------------------
/**
 * @author Ashiqur Rahman
 * COMP 249
 * Assignment 3
 * Due March 2020
 */
import java.io.File;


public class FileInvalidException extends Exception{


	/**
	 * THis is the default constructor
	 */
	public FileInvalidException(){
		super("Error: Input file cannot be parsed due to missing information (i.e. month={}, title={}, etc.) ");
	}

	/**
	 * THis is the parameterized constructor
	 * @param message the string message allows to output the message
	 */
	public FileInvalidException(String message)
	{
		System.out.println(message);
	}


	/**
	 * THis is a parameterized constructor with file array and int position of array
	 * @param file the file parameter takes in a file array
	 * @param position the position is the index of the array
	 */
	public FileInvalidException(File[] file ,int position)
	{
		super("There was an error with a file at the position: "+ file[position]);
		System.out.println(this.getMessage());
		System.exit(0);
	}


}
