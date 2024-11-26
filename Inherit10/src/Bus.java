
public class Bus extends Vehicle {
	// Attributes
		private int passengerCapacity;
		
		// Constructors
		public Bus()	// default constructor 
		{
			System.out.println("Creating a bus object using default constructor ....\n");
			// Cannot access a private variable(attributes)
			numOfDoors = 2;
			super.price = 32000;
			
			
			passengerCapacity = 10;
		}
		
		public Bus(int pc, int nd, double pr)	
		{
			System.out.println("Creating a bus object using parameterized constructor ....\n");
			// Cannot access a private variable(attributes)
			numOfDoors = nd;
			super.price = pr;
			passengerCapacity = pc;
		}
		
		public Bus(Bus b)	
		{
			System.out.println("Creating a bus object using copy constructor ....\n");
			// Cannot access a private variable(attributes)
			numOfDoors = b.numOfDoors;
			super.price = b.price;
			passengerCapacity = b.passengerCapacity;
		}
		
		public int getPassangerCapacity()
		{
			return passengerCapacity;
		}
		
		public void setPassengerCapacity(int pc)
		{
			passengerCapacity = pc;
		}
		
		public String toString()
		{
			// Cannot access a private variable(attributes)
			return "This Bus has " + numOfDoors + " doors and its price is: " + price +
			"$. The passenger capacity of this bus is " + passengerCapacity + "."; 
		}

}
