
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("this is lab 7 but actually 8");
	
		String make1="1999";
		String model1="tesla";
		double price1=21323.90;
		
		
		Car c1= new Car(make1,model1,price1);
		Car c2= new Car("2323","freta",900782.9);
		
		Car c3= new Car("1000","old",5000.1);
		Car c4= new Car("2020","honda",90000);
		
		Parking p= new Parking();
		
		try{
		
			p.addCar(c1);
			p.addCar(c2);
			p.addCar(c3);
			p.addCar(c4);
		}
		catch(Exception e){
			System.out.println("this wont work maybe cuz 4 cars");
		}
		
		try{
			p.removeCar(0);
			p.removeCar(1);
			p.removeCar(2);
			p.removeCar(3);
		}catch(Exception e){
			System.out.println("Should possibly catch another expcetion");
		}
	}

}
