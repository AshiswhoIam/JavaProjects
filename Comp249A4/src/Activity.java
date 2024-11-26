// ----------------------------------------------------- 
// Assignment 4
// Question: 2
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
/**
 *  @author Ashiqur Rahman (40096265)
 *
 */
public class Activity implements Commitable {

	/**
	 * Attributes do as their names are said
	 *
	 */
	public String activityID;
	public String activityName;
	public double startTime;
	public double endTime;

	/**
	 * this is a constructor with no param
	 */
	public Activity(){
		 activityID="";
		 activityName="";
		 startTime=0;
		 endTime=0;
	}
	/**
	 * this is a constructor with 3 params
	 * @param n is a String that refers to the activity name
	 * @param st is the startime
	 * @param et is the endtime
	 */
	public Activity(String n,double st,double et){

		this.activityName=n;
		this.startTime=st;
		this.endTime=et;
	}

	/**
	 * this is a constructor with 4 params
	 * @param aid is a string for activityID
	 * @param n is a string for the activity name
	 * @param st is for the startime
	 * @param et is for the end time
	 */
	public Activity(String aid,String n,double st,double et){
		this.activityID=aid;
		this.activityName=n;
		this.startTime=st;
		this.endTime=et;
	}

	/**
	 * this is an Activity copy constructor
	 * @param obj refers to the Activity for the object
	 * @param value is the String value for activityID
	 */
	public Activity(Activity obj,String value){

		this.activityName=obj.activityName;
		this.startTime=obj.startTime;
		this.endTime=obj.endTime;
		this.activityID=value;

	}
	/**
	 * @return activityID
	 */
	public String getActivityID() {
		return activityID;
	}
	/**
	 * @param activityID to set activityID
	 */
	public void setActivityID(String activityID) {
		this.activityID = activityID;
	}
	/**
	 * @return activityName
	 */
	public String getActivityName() {
		return activityName;
	}
	/**
	 * @param activityName to set activityName
	 */
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	/**
	 * @return startime
	 */
	public double getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime to set startime
	 */
	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return end time
	 */
	public double getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime to set endtime
	 */
	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}

	//@Override
	
	/**
	 * @see Commitable#isOnSameTime(Activity)
	 * implemented method from Commitable interface
	 * returns 1 of 3 options in the code
	 */
	public String isOnSameTime(Activity S) {
		// TODO Auto-generated method stub
		if(this.startTime==S.startTime&&this.endTime==S.endTime)
			return "SameTime";
		if(this.startTime!=S.startTime&&this.endTime!=S.endTime)
			return "different time";
		else 
			return "Overlap Time";
	}
	/**
	 * this is clone method
	 * @param activityID refers to String as parameter for ActivityID
	 * @return the copy of Activity with name and times
	 */
	public Activity clone(String activityID){

		return new Activity(activityName,startTime,endTime);
	}

	/**
	 * @see java.lang.Object#toString()
	 * toString method
	 */
	public String toString(){
		return "The activity Id is :"+getActivityID()+"\nThe activity name is:"+getActivityName()+"\nThe Start time was:"+getStartTime()+"\nThe end time is:"+getEndTime();

	}
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 * boolean equals method to check the equality of objects
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
