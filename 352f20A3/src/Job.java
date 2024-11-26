
public class Job {


	String jobName;
	int jobLength;
	int currentJobLength;
	int jobPriority;
	int finalPriority;
	long entryTime;
	long endTime;
	long waitTime;

	public Job(){

		jobName="default";
		jobLength=0;
		currentJobLength=0;
		jobPriority=0;
		finalPriority=0;
		entryTime=0;
		endTime=0;
		waitTime=0;
	}

	public Job(String jobName, int jobLength, int currentJobLength,
			int jobPriority, int finalPriority, long entryTime, long endTime,
			long waitTime) {
		
		this.jobName = jobName;
		this.jobLength = jobLength;
		this.currentJobLength = currentJobLength;
		this.jobPriority = jobPriority;
		this.finalPriority = finalPriority;
		this.entryTime = entryTime;
		this.endTime = endTime;
		this.waitTime = waitTime;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public int getJobLength() {
		return jobLength;
	}

	public void setJobLength(int jobLength) {
		this.jobLength = jobLength;
	}

	public int getCurrentJobLength() {
		return currentJobLength;
	}

	public void setCurrentJobLength(int currentJobLength) {
		this.currentJobLength = currentJobLength;
	}

	public int getJobPriority() {
		return jobPriority;
	}

	public void setJobPriority(int jobPriority) {
		this.jobPriority = jobPriority;
	}

	public int getFinalPriority() {
		return finalPriority;
	}

	public void setFinalPriority(int finalPriority) {
		this.finalPriority = finalPriority;
	}

	public long getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public long getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(long waitTime) {
		this.waitTime = waitTime;
	}
	
	
	
}
