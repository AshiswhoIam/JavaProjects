
public class Article {
	/**
	 * List of parameters in the articles, all in String
	 * @param id, @param journal , @param author, @param title, @param year , @param volume , @param number
	 * @param pages , @param  keywords , @param doi , @param issn , @param month
	 */
		private String author;
		private String journal;
		private String title;
		private String year;
		private String volume;
		private String number;
		private String pages;
		private String doi;
		private String month;
		
	//Default Constructor of Article Class
		public Article() {
			this.author=null;
			this.journal=null;
			this.title=null;
			this.year=null;
			this.volume=null;
			this.number=null;
			this.pages=null;
			this.doi=null;
			this.month=null;
		}
//Parameterized Constructor of the Article Class		
		public Article (String author, String journal, String title, String year, String volume, String number, 
						String pages, String doi, String month) {
			this.author=author;
			this.journal=journal;
			this.title=title;
			this.year=year;
			this.volume=volume;
			this.number=number;
			this.pages=pages;
			this.doi=doi;
			this.month=month;
		}
//Copy Constructor of the Article Class	
		public Article(Article a) {
			this.author=a.getAuthor();
			this.journal=a.getJournal();
			this.title=a.getTitle();
			this.year=a.getYear();
			this.volume=a.getVolume();
			this.number=a.getNumber();
			this.pages=a.getPages();
			this.doi=a.getDoi();
			this.month=a.getMonth();
		}
/**
 * Clone method of the Article Class
 * @return Article 
 */
		public Article clone() {
			return new Article(this);
		}

/**
 * Accessor for the author
 * @return author String 
 */
		public String getAuthor() {
			return author;
		}
/**
 * Setter for the Author		
 * @param aut
 */
		public void setAuthor(String aut) {
			author=aut;
		}
/**
 * Accessor for the journal	
 * @return journal
 */
		public String getJournal() {
			return journal;
		}
/**
 * Mutator for the journal		
 * @param jou
 */
		public void setJournal(String jou) {
			journal=jou;
		}
/**
 * Accessor for the title		
 * @return title
 */
		public String getTitle() {
			return title;
		}
/**
 * Mutator for the title		
 * @param tit
 */
		public void setTitle(String tit) {
			title=tit;
		}
/**
 * Accessor for the year		
 * @return year
 */
		public String getYear() {
			return year;
		}
/**
 * Mutator for the year		
 * @param yr
 */
		public void setYear(String yr) {
			year=yr;
		}
/**
 * Accessor for the volume		
 * @return volume
 */
		public String getVolume() {
			return volume;
		}
/**
 * Mutator for the volume		
 * @param vol
 */
		public void setVolume(String vol) {
			volume=vol;
		}
/**
 * Accessor for the number		
 * @return number
 */
		public String getNumber() {
			return number;
		}
/**
 * Mutator for the number		
 * @param num
 */
		public void setNumber(String num) {
			number=num;
		}
/**
 * Accessor for the pages		
 * @return pages
 */
		public String getPages() {
			return pages;
		}
/**
 * Mutator for the pages	
 * @param pa
 */
		public void setPages(String pa) {
			pages=pa;
		}
/**
 * Accessor for the DOI	
 * @return doi
 */
		public String getDoi() {
			return doi;
		}
/**
 * Mutaor for the DOI		
 * @param doi
 */
		public void setDoi(String doi) {
			this.doi=doi;
		}
/**
 * Accessor for the month		
 * @return month
 */
		public String getMonth() {
			return month;
		}
/**
 * Mutator for the month		
 * @param mo
 */
		public void setMonth(String mo) {
			month=mo;
		}
			

}
