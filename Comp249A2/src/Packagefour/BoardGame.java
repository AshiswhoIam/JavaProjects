// ----------------------------------------------------- 
// Assignment 2 
// Question: 1
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
//The documentation explains the code instead of the comments.
/**
 * * @author Ashiqur Rahman (40096265)
 */
package Packagefour;

import Packageone.Game;

public class BoardGame extends Game{

	boolean timedTurns;

	/**
	 * constructor
	 */
	public BoardGame(){
		super();
		this.timedTurns=true;
	}
	/**
	 * constructor with param
	 * @param n is the name
	 * @param np is the number of players
	 * @param gt is the game time
	 * @param t is the boolean attribute
	 */
	public BoardGame(String n,int np,int gt,boolean t){
		super(n,np,gt);
		this.timedTurns=t;
	}
	/**
	 * copy constructor with parameter
	 * @param bg variable
	 */
	public BoardGame(BoardGame bg){
		this.timedTurns = bg.timedTurns;
	}

	/**
	 * setter
	 * @param t variable
	 */
	private void setTimedTurned(boolean t){
		this.timedTurns=t;
	}
	/**
	 * @return the timedTurn boolean value
	 */
	private boolean getTimedTurned()
	{	
		return this.timedTurns;
	}
	/** 
	 * toString method
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return  "The game name is:"+getName()+"\nit is an Board game"+"\nThe number of players: "+numPlayers+"\nThe game time is: "+gameTime+"minutes"+"\nThe timed turns is: "+timedTurns;
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
