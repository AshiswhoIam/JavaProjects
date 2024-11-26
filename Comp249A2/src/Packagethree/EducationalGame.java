// ----------------------------------------------------- 
// Assignment 2 
// Question: 1
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
//The documentation explains the code instead of the comments.
/**
 * * @author Ashiqur Rahman (40096265)
 */
package Packagethree;

import Packagetwo.VideoGame;
import Packagetwo.VideoGame.gamingPlatform;


public class EducationalGame extends VideoGame{

	/**
	 * attributes for class
	 */
	private String subjectLearnt;

	/**
	 * private constructor
	 */
	private  EducationalGame()
	{
		super();
		this.subjectLearnt="none";
	}

	/**
	 * Constructor with many parameters
	 * @param n is for name
	 * @param np is for number of players
	 * @param gt is for gametime
	 * @param gp is gameprice
	 * @param gs is gameStudio
	 * @param gamePlat gaming platform
	 * @param l is the subject learnt
	 */
	public  EducationalGame(String n,int np,int gt,int gp,String gs,gamingPlatform gamePlat,String l)
	{
		super(n,np,gt,gp,gs,gamePlat);
		this.subjectLearnt=l;
	}

	/**
	 * this is a copy constructor
	 * @param eg variable
	 */
	protected  EducationalGame(EducationalGame eg)
	{
		this.subjectLearnt=eg.subjectLearnt;
	}
	/**
	 * setter for subject
	 * @param sl subject learnt
	 */
	private  void setSubjectLearnt(String sl){
		this.subjectLearnt=sl;
	}
	/**
	 * @return subject learnt
	 */
	private  String getSubjectLearnt(){
		return this.subjectLearnt;
	}
	/** 
	 * toString method
	 * @see java.lang.Object#toString()
	 */
	public String toString(){

		return  "The game name is:"+getName()+"\nit is an Educational game"+"\nThe game is developped by:"+getGameStudio()+"\nThe game price is:" + getGamePrice()+"$"+"\nThe gaming platform is: "+gamePlat+"\nThe subject learnt is:"+subjectLearnt;
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
