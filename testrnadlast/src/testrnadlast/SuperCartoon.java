package testrnadlast;

class SuperArt {
	SuperArt(int x) {
		System.out.println("Art constructor");
	  }
}

class SuperDrawing extends SuperArt {
	SuperDrawing(int x) {
		// the parent constructor has an argument so
		// you must invoke the parent properly
		super(x);
		System.out.println("Drawing constructor");
	  }
}


public class SuperCartoon extends SuperDrawing {
	int m=0;
	SuperCartoon() {
		// the parent constructor has an argument so
		// you must invoke the parent properly
		super(55); 
		System.out.println("Cartoon constructor");
	}
	 

	public static void main(String[] args) {
		
		SuperCartoon sc = new SuperCartoon(); 
		
		// no constructor arguments required
	}
}
