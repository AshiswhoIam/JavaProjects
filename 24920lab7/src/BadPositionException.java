
public class BadPositionException extends Exception{

	public BadPositionException(String e){
		System.out.println("A bad pos exception was found");
	}
	public String toString(){
		return("A bad pos exception was found");
	}
}
