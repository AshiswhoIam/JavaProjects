import java.util.Comparator;


public abstract class AbsPQ <K,V> implements PQ<K,V>{

	protected static class PQEntry<K,V> implements Entry<K,V>{

		//Key and value
		public K k;
		public V v;

		public PQEntry(K key, V value){

			k = key;
			v = value;
		}
		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return k;
		}

		@Override
		public V getValue() {
			// TODO Auto-generated method stub
			return v;
		}

		protected void setKey(K key) {
			k = key; 
		}
		protected void setValue(V value) {
			v = value; 
		}
	}
	//order of keys
	private Comparator<K> comp;
	//empty pq created 
	protected AbsPQ(Comparator<K>c) {

		comp = c;
	}
	//empty pq created
	protected AbsPQ() { 
		this(new DefaultComparator<K>()); 
	}

	// compare two Entry
	protected int compare(Entry<K,V> a, Entry<K,V> b) {
		return comp.compare(a.getKey(), b.getKey( ));
	}
	//checking if key is good
	protected boolean checkKey(K key) throws IllegalArgumentException{
		try {
			return (comp.compare(key,key) == 0);
		}catch (ClassCastException e){
			throw new IllegalArgumentException("Bad key");
		}
	}
	

	public boolean isEmpty() {
		return size() == 0;
	}
}
