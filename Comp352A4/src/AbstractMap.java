
public  abstract class AbstractMap<K,V> implements Map<K,V>{

	// the map entry class was created to store the keys and values
	public class MapEntry<K,V> extends Entry<K,V>{
		public MapEntry(int value) {
			super(value);
			// TODO Auto-generated constructor stub
		}
		public int k;
		public int v;
		
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size()==0;
	}

	@Override
	public int get(K key) {
		// TODO Auto-generated method stub
		return (int) key;
	}

	@Override
	public int remove(K key) {
		// TODO Auto-generated method stub
		return (int) key;
	}

	@Override
	public int put(K key, V value) {
		// TODO Auto-generated method stub
		return (int) key;
	}

}
