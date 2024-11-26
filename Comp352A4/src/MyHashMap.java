import java.util.ArrayList;


public class MyHashMap<K,V> extends AbsHashMap<K,V> {

	static int max;
	int size;
	
	public MyHashMap(){
		super(max);
		max=20;
		size=0;		
	}
	//this returns the size
	public int size(){
		return size;
	}
	//checks if empty
	public boolean isEmpty() {
		return size()==0;
	}
	
	public MyHashMap<K,V> [] table;
	//creating table method
	public void createTable(){
		table = (MyHashMap<K,V>[]) new MyHashMap[max];
	}
	
	// the following gives us the value at the key k of the specified hash value
	public int getValK(int hash,K k){
		
		MyHashMap<K,V> bucket = table[hash];	
		if(bucket==null)
			return (Integer) null;
		return bucket.get(k);	
	}
	// the following removes the value at the key k of the specified hash value
	public int removeKey(int hash,K k){
		MyHashMap<K,V> bucket = table[hash];	
		if(bucket==null)
			return (Integer) null;
		
		int rem= bucket.remove(k);
		return rem;
	}
	// here we have our key with a value (val) that we put at the specified hash value
	public int put(int hash,K key, V val){
		MyHashMap<K,V> bucket = table[hash];	
		if(bucket==null)
		bucket = table[hash]= new MyHashMap<>();
		int output=bucket.put(key,val);
		return output;
	}

}
