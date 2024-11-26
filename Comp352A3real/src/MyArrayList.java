
public class MyArrayList<E> {

	//Final int
	public final static int CAP=1;
	public int size = 0;
	private E[] data;

	//constructor
	public MyArrayList(){ 
		this(CAP); 
	}

	public MyArrayList(int cap2) {
		// TODO Auto-generated constructor stub
		data = (E[]) new Object[cap2]; 
	} 

	//size
	public int size() { 
		return size;
	}

	//empty method
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	//add method
	public void add(int i, E e) throws IndexOutOfBoundsException,IllegalStateException {
		checkIndex(i, size + 1);
		if (size == data.length)
			size=2*data.length;

		for (int k=size-1; k >= i; k--) 
			data[k+1] = data[k];
		data[i] = e;
		size++;
	}

	//index checker method for add
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index:" + i);
	}
	//get eleement method
	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i,size);
		return data[i];
	}

	//get min value method
	public int getMin(MyArrayList<Integer> data) throws IndexOutOfBoundsException {
		int minInteger = data.get(0);
		for(int i = 1; i < data.size(); i++){
			if(data.get(i) < minInteger)
				minInteger= data.get(i);
		}

		return minInteger;
	}
	//remove method
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i,size);
		E temp = data[i];
		if(size<data.length*.75){
			size=data.length/2;
		}
		for (int k=i; k < size-1; k++)
		data[k] = data[k+1];
		data[size-1] = null;
		size--;
		return temp;
	}
}
