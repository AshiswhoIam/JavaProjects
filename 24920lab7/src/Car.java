
public class Car {

	String Make= "make";
	String Model="Model";
	double price =0.1;
	
	public Car(String m, String mo,double price){
		

		this.Make=m;
		
		this.Model=mo;
		
		this.price=price;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString()

	{
		return"The Make is: "+Make+"\nThe Model is: "+Model+"\nThe price is: "+ price;
	}
}