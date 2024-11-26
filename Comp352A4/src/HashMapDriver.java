import java.util.*;
/**
 * Ashiqur Rahman
 * 40096265
 * Comp 352 A4
 */
/*
 * The following assignment requires to first create an entry class with the given specifications, 
 * followed by that an AbsHashMap and a personal hashmap has to be created as well. AFter implementing the 
 * methods 2 functions in the driver will be used to check through it all. This assignment remains incomplete...
 */
public class HashMapDriver {

	static void validate(){
		ArrayList<Integer> data = new ArrayList<Integer>();
		MyHashMap<Integer, Integer> test = new MyHashMap<>();
		
	}
	static void experiment_interpret(){
		ArrayList<Integer> data = new ArrayList<Integer>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//display message
		System.out.println("Welcome to the last assignment");
		
		//creating the m object
		MyHashMap<Integer, Integer> m = new MyHashMap<>();
	
		//data to test
		m.put(5,10);
		m.put(2,3);
		m.getValK(1,1);
		m.removeKey(5,10);
		System.out.println(m);
		validate();
		experiment_interpret();
		
		
	}

}
