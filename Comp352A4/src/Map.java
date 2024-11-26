
public interface Map<K,V> {
	
	//general methods to be required
	int size();
	boolean isEmpty();
	int get(K key);
	int remove(K key);
	int put(K key, V value);
}
