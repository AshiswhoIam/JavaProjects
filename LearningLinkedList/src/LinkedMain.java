import java.util.LinkedList;


public class LinkedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Linker list= new Linker();
		list.insert(13);
		list.insert(6);
		list.insert(101);
		list.insert(97);
		list.insertStart(23);
		
		list.insertLoc(1, 1369);
		list.deleter(3);
		list.show();
	}

}
