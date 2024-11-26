
public class mdk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal[] alist= new animal[2];
		dog d = new dog();
		fihs f= new fihs();
		
		alist[0]=d;
		alist[1]=f;
		
		for (int i=0;i<alist.length;i++){
			
			alist[i].noise();
		}
	}

}
