import java.util.*;
public class maind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		food t[]=new food[2];
		t[0]=new pie();
		t[1]= new tuna();
		
		for(int i=0;i<2;i++){
			t[i].eat();
		}
		
		
		
		fat f = new fat();
		food foo=new food();
		f.finish(foo);
		food po= new pie();
		f.finish(po);
	}

}
