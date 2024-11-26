// ----------------------------------------------------- 
// Assignment 2 
// Question: 1
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
//The documentation cxplains the Code instead of the comments.
/**
 * * @author Ashiqur Rahman (40096265)
 */
package Packagethree;

import Packagetwo.VideoGame;
import Packagetwo.VideoGame.gamingPlatform;

public class RPGGame extends VideoGame{

	/**
	 * Attribute for class
	 */
	String gameWorld;

	/**
	 * constructor
	 */
	public RPGGame(){
		super();
		this.gameWorld="NoWorld";

	}
	/**
	 * Constructor with many parameters
	 * @param n is for name
	 * @param np is for number of players
	 * @param gt is for gametime
	 * @param gp is gameprice
	 * @param gs is gameStudio
	 * @param gamePlat gaming platform
	 * @param gw is game world
	 */
	public RPGGame(String n,int np,int gt,int gp,String gs,gamingPlatform gamePlat,String gw){
		super(n,np,gt,gp,gs,gamePlat);
		this.gameWorld=gw;
	}
	/**
	 * copy constructor
	 * @param rpg variable
	 */
	public RPGGame(RPGGame rpg){

		this.gameWorld=rpg.gameWorld;

	}
	/**
	 * @param gw game world
	 */
	private void setgameWorld(String gw){
		this.gameWorld=gw;
	}
	/**
	 * @return game world
	 */
	private String getgameWorld(){
		return this.gameWorld;
	}
	/** 
	 * toString method
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "The game name is:"+getName()+"\nit is an RPG game"+"\nThe game is developped by:"+getGameStudio()+"\nThe game price is:" + getGamePrice()+"$"+"\nThe gaming platform is: "+gamePlat+"\nThe game world is: "+ gameWorld;
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
