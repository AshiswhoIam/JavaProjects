class MachineA{

	@Override
	public String toString() {
		return "i am a machine ok";
	}
	
	public void start(){
		System.out.println("machine is starting..");
	}
}
interface Plant{
	public void grow();
}


public class Anonmian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//anon class
		MachineA m= new MachineA(){
			@Override public void start(){
				System.out.println("snap of the cam");
			}
		};
		m.start();
		
		
		Plant plant1= new Plant(){

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("plant is growing yeee");
				
			}
			
		};
		plant1.grow();
	}

}
