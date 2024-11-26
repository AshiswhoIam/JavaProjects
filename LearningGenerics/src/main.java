import java.util.ArrayList;


class Machine{

	@Override
	public String toString() {
		return "i am a machine ok";
	}
	
	public void start(){
		System.out.println("machine is starting..");
	}
}


class Camera extends Machine{

	@Override
	public String toString() {
		return "i am a cammera ok";
	}
	public void snap(){
		System.out.println("cliclcik zoom..");
	}

}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Machine> list1= new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());
		//camera is a sub class
		//array list of camera not a sub class of arraylist of macine
		//An arraylist of child class type is not a sub class of the same class of parent
		ArrayList<Camera> list2= new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());

		showList(list2);
		showList2(list1);
	}

	//arraylist of unkonwn type so i can pass arraylist of any paramaten
	public static void showList(ArrayList<? extends Machine> list){
		for(Machine x:list){
			System.out.println(x);
		x.start();
		//cannot x.snap  because ? only class machine methos
		}
		
	}
	public static void showList2(ArrayList<? super Camera> list){
		for(Object x:list){
			System.out.println(x);
		//x.snap();
		//cannot x.snap  because ? only class machine methos
		}
		
	}

}
