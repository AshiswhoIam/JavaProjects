import java.io.Serializable;


public class Record implements Serializable{

	String name="";
	String song="";
	int year=0;
	int price=0;
	int ID=0;
	
	public Record(){
		super();
		this.name = "john";
		this.song = "help";
		this.year = 2020;
		this.price = 20;
		ID = 123;
		
	}
	public Record(String name, String song, int year, int price, int iD) {
		super();
		this.name = name;
		this.song = song;
		this.year = year;
		this.price = price;
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String toString(){
		return "The name is: "+name+"\nThe song is "+song+"\nThe year : "+year+"\nThe price: "+price+"\nID: "+ID;
	}
	
}
