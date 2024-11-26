import java.util.Comparator;


public class MyPQSortedList<K,V> extends AbsPQ<K,V> {
	private MyLinkedList<Entry<K,V>> list = new MyLinkedList<>();
	public MyPQSortedList(){
		super();
	}
	public MyPQSortedList(Comparator<K> comp) {
		super(comp);
	}

	//insert method
	public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
		checkKey(key);
		Entry<K,V> n = new PQEntry<>(key, value);
		Entry<K,V> w = list.last();

		while (w != null && compare(n, w)<0);
		//did not implement before yet
		w = list.before(w);
		if (w == null)
			list.addFirst(n);
		else
			//did not implement addAfter yet
			list.addAfter(w, n);
		return n;

	}
	//min method
	public Entry<K,V> min() {
		if (list.isEmpty())
			return null;
		return list.first();
	}
	//remove min method
	public Entry<K,V> removeMin(){
		if (list.isEmpty()) 
			return null;
		return list.remove(list.first());

	}
	//return size
	public int size( ) {
		return list.size(); 
	}



}
