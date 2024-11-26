
public class doglist {

	
	private dog[] thelist= new dog[5];
	private int i=0;
	
	public void add(dog d){
		if(i<thelist.length){
			thelist[i]=d;
			System.out.print("a dog was added at"+i);
			i++;
		}
	}
}
