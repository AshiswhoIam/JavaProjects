
public abstract class AbsHashMap<K, V> extends AbstractMap<K,V>{

	//general methods and variables
	int entries=0;
	int max;
	public AbsHashMap(int max){
		this.max=max;
	}
	public int size(){
		return entries;
	}
	public boolean isEmpty(){
		return false;
		
	}
	public int get(K key){
		return (Integer) null;
		
		
	}
	public int put(K key,V value){
		return (Integer) null;
		
	}
	public int remove(K key){
	
	
	}
}
