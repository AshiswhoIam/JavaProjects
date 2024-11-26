
public class Player implements Comparable<Player>{

	@Override
	public int compareTo(Player arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	String health;
	String name;
	
	
	public Player(){
		String health="2222";
		String name="Lesl";
	}
	
	
	public Player(String health, String name) {
		super();
		this.health = health;
		this.name = name;
	}
	
	public Player(Player a){
		this.health=a.health;
		this.name=a.name;
	}
	
	
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return"The player name is : "+name+"\nTheir health is : "+health;
	}
}
