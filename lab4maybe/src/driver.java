
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("tis lab 5 actually");
		
		Accomadation arrayyy[];
		
	
		arrayyy= new Accomadation[4];
		
		Apartement a= new Apartement(1200,333,9, false);
		
		Apartement a2= new Apartement(1000, 500, 5,true);
		
		VIlla v= new VIlla(4000, 10000, 300, 4001);
		VIlla v2= new VIlla(3300, 23000, 200, 3000);

		
		arrayyy[0]=a;
		arrayyy[1]=a2;

		arrayyy[2]=v;

		arrayyy[3]=v2;


		a.ad();
		a2.ad();
		v.ad();
		v2.ad();
		a.TotalPrice();
		a2.TotalPrice();
		v.TotalPrice();
		v2.TotalPrice();
		
		for(int i=0;i<=4;i++){
			
			System.out.println(arrayyy[i]);
			
			
		}
		
		
	}

}
