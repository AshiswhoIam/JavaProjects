// ----------------------------------------------------- 
// Assignment 2 
// Question: 1
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
//The documentation explains the code instead of the comments.
/**
 * * @author Ashiqur Rahman (40096265)
 */
package Packagetwo;
import Packageone.Game;

/**
 * @author Ashiqur Rahman
 *
 */
public class VideoGame extends Game{

	/**
	 * attributes for the class
	 */
	protected int gamePrice;
	String gameStudio;

	/**
	 * enum gaming platforms
	 *
	 */
	public enum gamingPlatform{XBOXONE,PS4,IOS,ANDROID}
	protected gamingPlatform gamePlat;

	/**
	 * VideoGame constructor
	 */
	public VideoGame(){
		super();
		this.gamePrice=0;
		this.gameStudio="Unknown";
		this.gamePlat=gamingPlatform.PS4;
	}

	/**
	 * Constructor with many parameters
	 * @param n is for name
	 * @param np is for number of players
	 * @param gt is for gametime
	 * @param gp is gameprice
	 * @param gs is gameStudio
	 * @param gamePlat is gaming platform
	 */
	public VideoGame(String n,int np,int gt,int gp,String gs,gamingPlatform gamePlat){
		super(n,np,gt);
		this.gamePrice=gp;
		this.gameStudio=gs;
		this.setGamePlat(gamePlat);
	}

	/**
	 * copy Constructor
	 * @param vg variable for constructor
	 */
	public VideoGame(VideoGame vg){

		this.gamePrice=vg.gamePrice;
		this.gameStudio=vg.gameStudio;
	}

	/**
	 * @return game platform
	 */
	public gamingPlatform getGamePlat() {
		return gamePlat;
	}

	/**
	 * @param gamePlat gaming platform setter
	 */
	protected void setGamePlat(gamingPlatform gamePlat) {
		this.gamePlat = gamePlat;
	}

	/**
	 * @param gp game price
	 */
	protected void setGamePrice(int gp){
		this.gamePrice=gp;
	}
	/**
	 * @param gs gamestudio
	 */
	protected void setGameStudio(String gs){
		this.gameStudio=gs;
	}
	/**
	 * @return game price
	 */
	protected int getGamePrice()
	{
		return this.gamePrice;
	}
	/**
	 * @return name of game studio
	 */
	public String getGameStudio(){

		return this.gameStudio;
	}
	/** 
	 * toString method
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "The name of the game is:"+name+"\nThe number of players: "+numPlayers+"\nThe game time is: "+gameTime+"minutes"+"\nThe game price is:" + gamePrice+"$"+"\nThe game studio is:"+gameStudio+"\nThe gaming platform is: "+gamePlat;
	}
	/**
	 * equals method
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object now){
		if(this==null||this!=now)
		{
			return false;
		}
		else
			return true;
	}
}
