package Automobile;

public class Car {

	private final Double MAX_TIRE_PRESSURE=5.43;

	private boolean car_on;
	private double tirePressure;
	
	public Car(double tirePressure){
		
		if(!validTirePressure(tirePressure)){
			this.tirePressure=MAX_TIRE_PRESSURE;
		}
		else
		{
		this.tirePressure=tirePressure;
		}
		this.car_on=false;
		
		
	}
	public void startCar(){
		this.car_on=true;
	}
	public void shutCar(){
		this.car_on=false;
	}
	public void setTirePressure(double newtirePressure){
		if(!validTirePressure( newtirePressure)){
			return;
		}

		this.tirePressure=newtirePressure;
		
	}

	private boolean validTirePressure(double tirePressure){
		
		return tirePressure>=0 && tirePressure<=MAX_TIRE_PRESSURE;
		
	}
	
	public boolean equals(Object o){
		if(o==null){
			return false;
		}
		//current and passing.
		if(this.getClass()==o.getClass()){
			
		
			Car c= (Car) o;
			if(this.tirePressure==c.tirePressure){
				return true;
			}
		}
		//o not car or is but diff tire pressure
		return false;
	}
}
