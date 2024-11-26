import java.io.Serializable;


public class Employee implements Serializable{
	
	String name;
	int id;
	
	Employee(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	public String toString(){
		
		
		return String.format("Name: %s ID: %d ", this.name,this.id);
	}

}
