
public class InvalidNumException extends Exception{

	
	public InvalidNumException (){
		super("nah it aint working like that");
	}
	public InvalidNumException (String message){
		System.out.println(message);
	}
}
