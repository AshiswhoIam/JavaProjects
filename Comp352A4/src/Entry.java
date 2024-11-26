import java.util.*;
public class Entry <K,V>{

	int key; 
	int value;

	//random value
	int r=(int)(Math.random()*20+1);
	public Entry(int value){
		key=r;
		this.value=value;
	}
	//compression method
	public int hashCode(int n) {
		int x=0;
		for(int i=0;i<n;i++){
			//keymod(primenubmer)
		}
		return x;
	}
	K getKey() {
		return null;
	}
	V getValue() {
		return null;
	}
}
