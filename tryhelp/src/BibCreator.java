
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BibCreator {
	
	public static int fileNum=10; 
	public static long fileLength=0;
	private static String [] fileName = new String[fileNum];	//the array of names of original files 
	private static String [] fileNameIEE = new String[fileNum];	//the array of names of IEEE output files
	private static String [] fileNameACM = new String[fileNum];	//the array of names of ACM output files
	private static String [] fileNameNJ = new String[fileNum];	//the array of names of NJ output files
	private static File [] fileArray = new File [fileNum];		//the array of original files 
	private static File [] fileArrayIEE = new File [fileNum];	//the array of IEEE output files
	private static File [] fileArrayACM = new File [fileNum];	//the array of ACM output files
	private static File [] fileArrayNJ = new File [fileNum];	//the array of NJ output files
	private static BufferedReader br = null;					// initializing the bufferReader br	
	private static PrintWriter pw =null;						// initializing the printwriter pw
	private static Scanner sc=null;								// initializing the scanner sc
	
//Method to delete the output Files created for each type of bibliography based on the given index in the array
	public static void deleteOutputFiles(int i) {
		if(fileArrayIEE[i].exists()) {
			fileArrayIEE[i].delete();
		}
		if(fileArrayACM[i].exists()) {
			fileArrayACM[i].delete();
		}
		if(fileArrayNJ[i].exists()) {
			fileArrayNJ[i].delete();
		}
	}
//Method from File class to retrieve a String array of the file list in the directory 
	public static String[] list() {
		return fileName;
	}

//Method from File CLass to check the length of the file 
	public static long length() {
		return fileLength;
	}
	
//Method from the File Class to create the 10 IEEE output files and return an array of it
	public static File[] createIEE() throws IOException{
		for(int i=0;i<fileNum;i++) {
			fileArrayIEE[i]=new File("IEE"+fileNum, ".json");
		}
		return fileArrayIEE;
	}

//Method from the File Class to create the 10 NJ output files and return an array of it
	public static File[] createNJ() throws IOException{
		for(int i=0;i<fileNum;i++) {
			fileArrayNJ[i]=new File("NJ"+fileNum, ".json");
		}
		return fileArrayNJ;
	}
//Method from the File Class to create the 10 ACM output files and return an array of it
	public static File[] createACM() throws IOException{
		for(int i=0;i<fileNum;i++) {
			fileArrayACM[i]=new File("ACM"+fileNum, ".json");
		}
		return fileArrayACM;
	}
	
	public static void main(String[] args) {
	//Welcome message to the user
		System.out.println("Welcome to BibCreator!");
	//FInding the directory we are in
		String currentDirectory = System.getProperty("user.dir");
        String folderDirectory = currentDirectory + "\\BibCreator\\files";
        System.out.println("\nFiles in are located in: " +folderDirectory);
//Loop that adds 10 files to a file array	
		for(int i=0;i<fileNum;i++) {
			fileName[i] = "Latex"+(i+1)+".bib";
			fileArray[i] = new File(fileName[i]);
//Trying to read the files using scanner
			try
			{
				sc = new Scanner(new FileInputStream(fileName[i]));				     
			}
			catch(FileNotFoundException e) 
			{							   
				System.out.println("Could not open file " +fileName[i]+ ". Please check if the file exists.\nAll files will no close");	
				System.out.print("Program will now terminate.");
				sc.close();
				System.exit(0);			   
			}
		}
//Array of String for each format has the file names added to it
//Array of files is filled with the files with the names from the String array for each format
		for(int i=0; i<fileNum; i++) {
			fileNameIEE[i]= "IEEE"+(i+1)+".json";
			fileNameACM[i]= "ACM"+(i+1)+".json";
			fileNameNJ[i]= "NJ"+(i+1)+".json";
			fileArrayIEE[i] = new File(fileNameIEE[i]);
			fileArrayACM[i] = new File(fileNameACM[i]);
			fileArrayNJ[i] = new File(fileNameNJ[i]);	
		}
//Using the PrintWriter Class to open the created files of the IEE format
//Using a file Not found exception, and deleting the files using the deleteOutputFiles method if the exception is caught. 
		for(int i=0; i<fileNum; i++) {
			try {
				pw = new PrintWriter(new FileOutputStream(fileNameIEE[i]));
				processFilesForValidation(fileArrayIEE, i);
			}
			catch(FileInvalidException e) {	
			}
			catch(FileNotFoundException e) {
				System.out.println("The file "+fileArrayIEE[i]+" cannot be opened or created. All files will now be deleted./nProgram will terminate. ");
				for(int j=0; j<=i; j++) 
					deleteOutputFiles(i);
				System.exit(0);	
			}			
		catch(IOException e) {
			System.out.println("Error: An error has occurred while closing file. ");
			System.out.println("Program will terminate.");
			System.exit(0);	
		}
			pw.close();
		}

//Using the PrintWriter Class to open the created files of the ACM format
//Using a file Not found exception, and deleting the files using the deleteOutputFiles method if the exception is caught. 		
		for(int i=0; i<fileNum; i++) {
			try {
				pw = new PrintWriter(new FileOutputStream(fileNameACM[i]));
				processFilesForValidation(fileArrayACM, i);
			}
			catch(FileInvalidException e) {	
			}
			catch(FileNotFoundException e) {
				System.out.println("The file "+fileNameACM[i]+" cannot be opened or created. All files will now be deleted./nProgram will terminate. ");
				for(int j=0; j<=i; j++) 
					deleteOutputFiles(i);
				System.exit(0);	
			}			
		catch(IOException e) {
			System.out.println("Error: An error has occurred while closing file. ");
			System.out.println("Program will terminate.");
			System.exit(0);	
		}
			pw.close();
		}
//Using the PrintWriter Class to open the created files of the NJ format
//Using a file Not found exception, and deleting the files using the deleteOutputFiles method if the exception is caught. 		
		for(int i=0; i<fileNum; i++) {
			try {
				pw = new PrintWriter(new FileOutputStream(fileNameNJ[i]));
				processFilesForValidation(fileArrayNJ, i);
			}
			catch(FileInvalidException e) {	
			}
			catch(FileNotFoundException e) {
				System.out.println("The file "+fileNameNJ[i]+" cannot be opened or created. All files will now be deleted./nProgram will terminate. ");
				for(int j=0; j<=i; j++) 
					deleteOutputFiles(i);
				System.exit(0);	
			}			
		catch(IOException e) {
			System.out.println("Error: An error has occurred while closing file. ");
			System.out.println("Program will terminate.");
			System.exit(0);	
		}
			pw.close();
		}			
	}
	
//Process Validation Method
	public static void processFilesForValidation(File[] fileArray, int index) throws IOException, FileInvalidException{
	//Int to keep track of the number of articles in each file 
		int articleNum=0;
	//String to check if the next line in the article is valid or not (will it return null)
		String nextLine;
		
//Create a Buffered reader that takes a fileArray,	
		for(int i=index;i<fileNum;i++) {
			br = new BufferedReader(new FileReader(fileArray[i]));	
			nextLine=br.readLine();
//Check the number of Articles in the file using the articleNum integer 
			while(nextLine!=null) {
				if(nextLine=="@ARTICLE{")
					articleNum++;
				nextLine=br.readLine();
			}
			if (articleNum==0)
				throw new FileInvalidException();
			
	//Creating an array of type Article to store the information from each article, making the array size the number of articles found in the file
			Article[] a1=new Article[articleNum];
			Article articleObject= new Article();
			br.close();
	//Re open the file
			br = new BufferedReader(new FileReader(fileArray[i]));	
			for(int w=0; w<articleNum;) {
				if(nextLine=="@ARTICLE{") {
					w++;
					nextLine=br.readLine();
	//Checking if the next line is @Article, or null, otherwise checking if it is any of the article attributes in order to store it
					while(nextLine!="@ARTICLE{") {
						nextLine=br.readLine();
						switch(nextLine) {
						case "author": articleObject.setAuthor(nextLine);
							break;
						case "journal": articleObject.setJournal(nextLine);
							break;
						case "title": articleObject.setTitle(nextLine);
							break;
						case "year": articleObject.setYear(nextLine);
							break;
						case "volume": articleObject.setVolume(nextLine);
							break;
						case "number": articleObject.setNumber(nextLine);
							break;
						case "pages": articleObject.setPages(nextLine);
							break;
						case "doi": articleObject.setDoi(nextLine);
							break;
						case "month": articleObject.setMonth(nextLine);
							break;
						}
					}
					nextLine=br.readLine();
				}
		//Create a clone of the article object to store it in the array
				a1[w-1]=articleObject.clone();
				
	//Once you reach the max number of articles for the file. Check if any of the parameters are ever null, then throwing the appropriate exception
				if (w==articleNum) {
					if(articleObject.getAuthor()==null||articleObject.getJournal()==null||articleObject.getTitle()==null||
							articleObject.getYear()==null||articleObject.getVolume()==null||articleObject.getPages()==null||articleObject.getDoi()==null||articleObject.getMonth()==null) 
							throw new FileInvalidException(fileArray, i);
				}
			}
			br.close();
//Opening the print Writer for the IEEE files, and formating the information into it		
	pw = new PrintWriter(new FileOutputStream(fileNameIEE[i]));
		for(int j=0; j<fileNum;j++) {
			if(fileArray[j]==null) {
				break;
			}
			else {
				pw.println(ieeeFormat(a1[j])+". \""+a1[j].getTitle()+"\", "+a1[j].getJournal()+", vol. "+a1[j].getVolume()+
					", no. "+a1[j].getNumber()+", p. "+a1[j].getPages()+", "+a1[j].getMonth()+" "+a1[j].getYear()+"\n");
				}
			}
			pw.close();	
			
//Opening the print Writer for the ACM files, and formating the information into it		
		pw = new PrintWriter(new FileOutputStream(fileNameACM[i]));
			for(int j=0; j<fileNum;j++) {
				
				if(fileArray[j]==null) {
					break;
				}
				else {
					pw.println("["+(j+1)+"]\t"+acmFormat(a1[j])+". "+a1[j].getYear()+". "+a1[j].getTitle()+". "+a1[j].getJournal()+". "+a1[j].getVolume()+
							", "+a1[j].getNumber()+"("+a1[j].getYear()+"), "+a1[j].getPages()+". DOI:https://doi.org/"+"\n");
				}
			}
			pw.close();	
			
//Opening the print Writer for the NJ files, and formating the information into it		
			pw = new PrintWriter(new FileOutputStream(fileNameNJ[i]));
			for(int j=0; j<fileNum;j++) {
			
				if(fileArray[j]==null) {
					break;
				}
				else {
					pw.println(njFormat(a1[j])+". "+a1[j].getTitle()+". "+a1[j].getJournal()+". "+a1[j].getVolume()+
							", "+a1[j].getPages()+"("+a1[j].getYear()+").\n");
				}
			}
			pw.close();	
		}
	
	}
	
// This method will take the collected information from the files and format it appropriately for the IEEE format
	public static String ieeeFormat(Article a){
		if(a!=null) {
			String author = a.getAuthor();
			int tokenNum=0;
			StringTokenizer authorToken = new StringTokenizer(author);
			tokenNum=authorToken.countTokens();
			String [] tokenArray = new String [tokenNum];
			for(int i=0; i<tokenNum; i++) {
				tokenArray [i]= authorToken.nextToken();
			}	
			for(int i=0; i<tokenNum; i++) {
				if(tokenArray[i].contains(".")) 
				tokenArray[i]=tokenArray[i].concat(" ");	
			}
			String newAuthor = tokenArray[0];
			for(int i=1; i<tokenNum; i++) {
				
				if(tokenArray[i].equals("and")) {
					newAuthor = newAuthor.concat(", ");
				}else
					newAuthor = newAuthor.concat(tokenArray[i]);
			}
			return newAuthor;

		}
		else
			return null;
	}	
	
	// This method will take the collected information from the files and format it appropriately for the ACM format
	public static String acmFormat(Article a){
		if(a!=null) {
			String author = a.getAuthor();
			int indexOfAnd = author.indexOf(" and ");
			if((indexOfAnd)>0) {
				author = author.substring(0, indexOfAnd);
				author = author.concat(" et al");
			}
			return author;
		}
		return null;
	}	
	
	// This method will take the collected information from the files and format it appropriately for the NJ format
	public static String njFormat(Article a){
		if(a!=null) {
			String author = a.getAuthor();
			int tokenNum=0;
			StringTokenizer authorToken = new StringTokenizer(author);
			tokenNum=authorToken.countTokens();
			String [] tokenArray = new String [tokenNum];
			for(int i=0; i<tokenNum; i++) {
				tokenArray [i]= authorToken.nextToken();
			}	
			for(int i=0; i<tokenNum; i++) {
				if(tokenArray[i].contains(".")) 
				tokenArray[i]=tokenArray[i].concat(" ");	
			}
			String newAuthor = tokenArray[0];
			for(int i=1; i<tokenNum; i++) {
				
				if(tokenArray[i].equals("and")) {
					newAuthor = newAuthor.concat(" & ");
				}else
					newAuthor = newAuthor.concat(tokenArray[i]);
			}
			return newAuthor;

		}else
			return null;
	}	
	
	
}
