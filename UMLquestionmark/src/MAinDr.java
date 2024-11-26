import Automobile.*;
public class MAinDr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1= new Car(2);
		Car c2 = new Car(3);
		Car c3= new Car(2);
		Object arr[]={c1,c2,"test",c3};
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(c1.getClass()+" "+ arr[i].getClass());
			System.out.println("Index = " + i + " equals ? "+(c1.equals(arr[i])));
		}
	}

}
