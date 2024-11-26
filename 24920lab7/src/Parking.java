
public class Parking{

	Car cars[];
	int MAXNBOFCARS=3;
	int nbCars=0;


	public Parking(){

		Car cars[]= new Car[2];
		nbCars++;
	}


	public int getMAXNBOFCARS() {
		return MAXNBOFCARS;
	}


	public void setMAXNBOFCARS(int mAXNBOFCARS) {
		MAXNBOFCARS = mAXNBOFCARS;
	}


	public int getNbCars() {
		return nbCars;
	}


	public void setNbCars(int nbCars) {
		this.nbCars = nbCars;
	}

	public void addCar(Car c) throws FullParkingException{

		//if(nbCars<MAXNBOFCARS){
			cars[nbCars]=c;
			nbCars++;
		//}

	}
	public void removeCar(int position)throws BadPositionException ,EmptyParkingException{
		if(cars[position]!=null){
			cars[position]=null;
			System.out.println("car was removed.");
		}
		
		
			System.out.println("An Empty Parking exception was found");
		
		
		

	}

	

}
