// ----------------------------------------------------- 
// Assignment 3 
// Question: 1
// Written by:  Ashiqur Rahman (40096265)
// -----------------------------------------------------
/**
 * @author Ashiqur Rahman
 * COMP 249
 * Assignment 3
 * Due March 2020
 */
public class Article {

	/**
	 * 	Variables required for presenting information on the article
	 */
	String author;
	String journal;
	String title;
	String year;
	String volume;
	String number;
	String page;
	String keywords;
	String doi;
	String ISSN;
	String month;
	
	/**
	 * This is the default constructor
	 */
	public Article(){

		this.author = "";
		this.journal = "";
		this.title = "";
		this.year = "";
		this.volume = "";
		this.number = "";
		this.page = "";
		this.keywords = "";
		this.doi = "";
		this.ISSN = "";
		this.month = "";
	}
	/**
	 * This is a parameterized constructor of article with several variables for information
	 * @param author this parameter is for the authors names
	 * @param journal this parameter is for the journals name
	 * @param title this parameter is a String for the title
	 * @param year here we have a parameter for the year
	 * @param volume the parameter here is for the volume
	 * @param number the parameter here is for the number
	 * @param page the page parameter is for the number of pages 
	 * @param keywords the parameter is for keywords
	 * @param doi this parameter is for the doi
	 * @param iSSN this paramater identifies the ISSN 
	 * @param month the month parameter determines the month.
	 */
	public Article(String author, String journal, String title, String year,
			String volume, String number, String page, String keywords,
			String doi, String iSSN, String month) {

		this.author = author;
		this.journal = journal;
		this.title = title;
		this.year = year;
		this.volume = volume;
		this.number = number;
		this.page = page;
		this.keywords = keywords;
		this.doi = doi;
		this.ISSN = iSSN;
		this.month = month;
	}
	
	/**
	 * this is a getter
	 * @return it returns the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * this is a setter for the author
	 * @param author it uses the String parameter author 
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * this is a getter
	 * @return it returns the journal
	 */
	public String getJournal() {
		return journal;
	}

	/**
	 * this is a setter for the journal
	 * @param journal this allows to set the journal
	 */
	public void setJournal(String journal) {
		this.journal = journal;
	}

	/**
	 * this is a getter
	 * @return it returns the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This is a setter for the title
	 * @param title the string parameter allows to set the title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * this is a getter
	 * @return it returns the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * setter for year
	 * @param year the parameter allows us to set the year
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * this is a getter
	 * @return it returns the volume
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * setter for volume
	 * @param volume this allows us to set the volume number
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}

	/**
	 * this is a getter
	 * @return it returns the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * setter for number
	 * @param number parameter allows to set the number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * this is a getter
	 * @return it returns the page
	 */
	public String getPage() {
		return page;
	}

	/**
	 * This is a setter for the pages
	 * @param page the string parameter allows to set the page
	 */
	public void setPage(String page) {
		this.page = page;
	}

	/**
	 * this is a getter
	 * @return it returns the keywords
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * This is a setter for keywords
	 * @param keywords it allows to keywords
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * this is a getter
	 * @return it returns the DOI
	 */
	public String getDoi() {
		return doi;
	}

	/**
	 * this is doi setter
	 * @param doi the parameter doi allows to set the doi
	 */
	public void setDoi(String doi) {
		this.doi = doi;
	}

	/**
	 * this is a getter
	 * @return it returns the ISSN
	 */
	public String getISSN() {
		return ISSN;
	}

	/**
	 * this is a setter
	 * @param iSSN it sets the ISSN using the string parameter iSSN
	 */
	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}

	/**
	 * this is a getter
	 * @return it returns the month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * this is a setter for month
	 * @param month the string parameter month allows to set the month
	 */
	public void setMonth(String month) {
		this.month = month;
	}


	/**
	 * this is a string method for the authors names
	 * @return it returns back the authors names
	 */
	public String IEEE(){
		int save=author.indexOf("  and  ");
		String aIEEE=author;
		while(save!=-1){
			aIEEE=aIEEE.substring(0,save)+"  "+aIEEE.substring(save+7);
			save=aIEEE.indexOf("  and  ");
			
		}
		
		return aIEEE;
	}

	/**
	 * this is a string method for the authors names
	 * @return it returns back the authors names
	 */
	public String ACM(){
		int save=author.indexOf("  and  ");
		String aACM=author;
		while(save!=-1){
			aACM=aACM.substring(0,save)+"  "+aACM.substring(save+7);
			save=aACM.indexOf("  and  ");
			
		}
		
		return aACM;
	}
	/**
	 * this is a string method for the authors names
	 * @return it returns back the authors names
	 */
	public String NJ(){
		int save=author.indexOf("  and  ");
		String aNJ=author;
		while(save!=-1){
			aNJ=aNJ.substring(0,save)+"  "+aNJ.substring(save+7);
			save=aNJ.indexOf("  and  ");
			
		}
		
		return aNJ;
	}

}
