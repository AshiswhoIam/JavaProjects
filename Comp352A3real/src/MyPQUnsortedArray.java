import java.util.Comparator;


public class MyPQUnsortedArray <K,V> extends AbsPQ<K,V>{

	private MyArrayList<Entry<K,V>> list = new MyArrayList<>();

	//size of array
	public int size() {
		return list.size(); 
	}
	public MyPQUnsortedArray () {
		super();
	}
	public MyPQUnsortedArray (Comparator<K> comp) { 
		super(comp); 
	}

	//insert method
	public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
		checkKey(key);
		Entry<K,V> n = new PQEntry<>(key, value);
		list.add((int)key,n);
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

		return null;
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
	public Entry<K, V> removeMin() {
		return null;
	}


}
