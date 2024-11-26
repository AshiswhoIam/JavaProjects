// ----------------------------------------------------- 
// Assignment 2 
// Question: 1
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
//The documentation explains the code instead of the comments.
/**
 * * @author Ashiqur Rahman (40096265)
 */
package Packageone;
import Packagetwo.VideoGame;
/**
 * @author Ashiqur Rahman
 *
 */
public class Game {


	/**
	 * protected attributes
	 */
	protected String name;
	protected int numPlayers;
	//gameTime in minutes
	protected int gameTime;

	/**
	 * Construtor for Game
	 */
	public Game(){

		this.name="Default";
		this.numPlayers=0;
		this.gameTime=0;
	}

	/**
	 * 
	 * Game constructor with parameters
	 * @param n name
	 * @param np number of players
	 * @param gt gametime
	 */
	public Game(String n,int np,int gt){

		this.name=n;
		this.numPlayers=np;
		this.gameTime=gt;
	}

	/**
	 * Copy Constructor of Game
	 * @param g variable
	 */
	public Game(Game g){
		this.name=g.name;
		this.numPlayers=g.numPlayers;
		this.gameTime=g.gameTime;
	}
	/**
	 * setter for name
	 * @param n name
	 */
	private void setName(String n){
		this.name=n;
	}
	/**
	 * setter for number of players
	 * @param np number of players
	 */
	private void setNumPlayers(int np){
		this.numPlayers=np;
	}

	/**
	 * setter for game time
	 * @param gt gametime
	 */
	private void setGameTime(int gt){
		this.gameTime=gt;
	}
	/**
	 * getter for name
	 * @return name
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * getter for number of players
	 * @return number of players
	 */
	public int getNumPlayers(){
		return this.numPlayers;
	}
	/**
	 * getter game time
	 * @return game time
	 */
	public int getGameTime(){
		return this.gameTime;
	}
	/** 
	 * toString method
	 * @see java.lang.Object#toString()
	 */
	public String toString(){

		return "The name of the game is:"+name+"\nThe number of players: "+numPlayers+"\nThe game time is: "+gameTime+"minutes";
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
