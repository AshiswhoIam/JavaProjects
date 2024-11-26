// ----------------------------------------------------- 
// Assignment 2 
// Question: 1
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
//The documentation explains the code instead of the comments.
/**
 * * @author Ashiqur Rahman (40096265)
 */
package Packagefive;

import Packageone.Game;

/**
 * @author Ashiqur Rahman
 *
 */
public class CardGame extends Game{

	/**
	 * Attributes for the class
	 */
	int numberOfCards;
	int numCardTypes;


	/**
	 * the constructor with no parameter
	 */
	public CardGame(){
		super();
		this.numberOfCards=0;
		this.numCardTypes=0;
	}

	/**
	 * this is a constructor with param
	 * @param n is the name
	 * @param np is the number of players
	 * @param gt is the game time
	 * @param nc number of cards
	 * @param nt number of type of cards
	 */
	public CardGame(String n,int np,int gt,int nc,int nt){

		super(n,np,gt);
		this.numberOfCards=nc;
		this.numCardTypes=nt;
	}

	/**
	 * copy constructor
	 * @param cg variable
	 */
	public CardGame(CardGame cg){

		this.numberOfCards=cg.numberOfCards;
		this.numCardTypes=cg.numCardTypes;

	}
	/**
	 * setter
	 * @param noc variable for numb of cards
	 */
	protected void setNumberOfCards(int noc){
		this.numberOfCards=noc;
	}
	/**
	 * setter
	 * @param nct variable for num of type of cards
	 */
	protected void setNumCardTypes(int nct)
	{
		this.numCardTypes=nct;
	}
	/**
	 * @return number of cards
	 */
	protected  int getNumberOfCards(){

		return this.numberOfCards;
	}
	/**
	 * @return number of card types
	 */
	protected  int getNumCardsTypes(){

		return this.numCardTypes;
	}
	/** 
	 * toString method
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return  "The game name is:"+getName()+"\nThe number of players: "+numPlayers+"\nThe game time is: "+gameTime+"minutes"+"\nit is a Card game"+"\nThe number of Cards is : "+numberOfCards+"\nThe number of card types is : "+numCardTypes;
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
