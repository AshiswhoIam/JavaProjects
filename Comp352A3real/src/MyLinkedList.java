
public class MyLinkedList <E>{

	private static class Node<E> {

		//reference variables
		private E element;
		private Node<E> prev;
		private Node<E> next;
		public Node(E e, Node<E> p, Node<E> n) {

			element = e;
			prev = p;
			next = n;
		}
		public E getElement() { 
			return element; 
		}
		public Node<E> getPrev() { 
			return prev; 
		}

		public Node<E> getNext() {
			return next; 
		}
		public void setPrev(Node<E> p) { 
			prev = p; 
		}
		public void setNext(Node<E> n) {
			next = n; 
		}

	}
	private Node<E> header;
	private Node<E> tl;
	private int size = 0;

	//new empty list
	public MyLinkedList() {
		header = new Node<>(null, null, null);
		tl = new Node<>(null, header, null);
		header.setNext(tl);
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0; 
	}
	//first elemet
	public E first() {
		if (isEmpty()) return null;
		return header.getNext().getElement(); 
	}
	//last element
	public E last() {
		if (isEmpty()) return null;
		return tl.getPrev().getElement();
	}
	//remove a node
	public E remove(Node<E> node) {
		Node<E> prevv = node.getPrev();
		Node<E> nextt = node.getNext();
		prevv.setNext(nextt);
		nextt.setPrev(prevv);
		size=size-1;
		return node.getElement();
	}

	//adding in between
	public void addB(E e, Node<E> pre, Node<E> nex) {

		Node<E> n = new Node<>(e, pre, nex);
		pre.setNext(n);
		nex.setPrev(n);
		size++;
	}
	//add first method
	public void addFirst(E e) {
		addB(e,header,header.getNext());
	}
	//add last method
	public void addLast(E e) {
		addB(e, tl.getPrev(), tl);
	}


}
