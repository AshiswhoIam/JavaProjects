import java.util.Comparator;


public class MyPQUnsortedList<K,V> extends AbsPQ<K,V> {

	private MyLinkedList<Entry<K,V>> list = new MyLinkedList<>();

	public MyPQUnsortedList() {
		super();
	}
	public MyPQUnsortedList(Comparator<K> comp) {
		super(comp);
	}
	// insert method

	public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
		checkKey(key);
		Entry<K,V> n = new PQEntry<>(key, value);
		list.addB(n, null, null);
		
		return n;
	}
	//min method
	public Entry<K,V> min(){
		if(list.isEmpty())
			return null;
		else
			return findM();

	}
	// find min method
	public Entry<K,V> findM() {
		// TODO Auto-generated method stub
		Entry<K,V> s = list.get(0);
		for(Entry<K,V>w:list){
			if(compare(w,s)<0)
				s=w;
			return s;
		}
	}
	//remove min method
	public Entry<K,V> removeMin(int p,String s) {
		if (list.isEmpty())
			return null;
		
			
		Entry<K,V> pos= findM();
		list.remove(pos);
		return pos;
		
	
		return null;
	}
	@Override
	//size
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Entry<K, V> removeMin() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
