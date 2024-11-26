// ----------------------------------------------------- 
// Assignment 3 
// Question: 1
// Written by:  Ashiqur Rahman (40096265)
// -----------------------------------------------------
/*
 * The program below essentially required us to go through various latex files and read
 * the information in them. This was possible using several different methods. The file class 
 * was used in this case to read the .bib files.Aftwerwards it was required to create an exception
 * for invalid files. It was then required to create new .json for acm,ieee,and nj. This part, I did 
 * not create a static array for storing the files and only used a normal file array.
 * The processvalidation method goes through any given file, however it did not function for me.
 * Lastly, the requirement for the identifying files was not fufilled properly as the way i did it did not seem to function.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class BibFact {


	public static void main(String[] args) throws FileNotFoundException, FileInvalidException {
		// TODO Auto-generated method stub

		//Scanner method to be used later
		Scanner key= new Scanner(System.in);

		//display welcome message
		System.out.println("-----------------------------------------");
		System.out.println("Welcome To Ashiqur's BibliographyFactory!");
		System.out.println("-----------------------------------------");

		//article array object to be used later
		Article[] a= new Article[10];

		//count for the list of files set to -5 because of the default files being read
		int count =-5;
		try {


			//using the file class and giving the directory to read the file later
			//creating a file array and using listfiles 
			File folder = new File("C:/Users/Ashiqur Rahman/workspace/249w20A3");
			File[] lf = folder.listFiles();


			if (lf.length > 0) {

				for (int i = 0; i < lf.length; i++ ) {
					//incrementing everytime a file is read
					count++;
					//checking if theres a file and if there is proceeding to read it
					if (lf[i].isFile()) {

						//using the buffereader with read line in the while loop to continuously loop and read it all
						BufferedReader bread = new BufferedReader(new FileReader(lf[i].getName()));
						String lines = "";
						while((lines = bread.readLine())!= null) {
							System.out.println(lines);
						}
						bread.close();
					}
					//if the file doesnt exist identifying the file and terminating the program
					if(count>0&&lf[i].exists()==false){
						System.out.println("Exception while reading file at position:" + count);
						System.exit(0);
					}

				}

			}


		} catch(Exception e) {
			System.out.println("Exception while reading file at number:" + count);
		}

		//initializing the printwriter
		PrintWriter pw= null;
		//setting a boolean to start if statement was not really necessary.
		boolean need= true;
		File []IEEE= new File[11];
		File []ACM= new File[11];
		File []NJ= new File[11];

		if(need==true){
			System.out.println("All files have successfully been opened proceeding to create 30 new files(nj,ieee,acm)");

			//creating a File class called low using createFile
			//looping it 10 times to create 10 IEEE files
			//The IEEE files are stored in the file array of IEEE

			File low;
			for(int i=1;i<11;i++){
				low=new File("IEEE"+i+".json");
				try {
					low.createNewFile();
					IEEE[i]=low;
					//if the file doesnt exist then deleting all files and terminating program
					if(low.exists()==false){
						System.out.println("The file number "+i+"of IEEE was not opened/created");
						System.out.println("proceeding to delete all files");
						//if the files is bad we can use the delete() to clear the files
						IEEE[i].delete();					
						System.out.println("terminating program...");
						System.exit(0);
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//creating a File class called low2 using createFile
			//looping it 10 times to create 10 ACM files
			//The ACM files are stored in the file array of ACM
			//Similar to the top

			File low2;
			for(int i=1;i<11;i++){
				low2=new File("ACM"+i+".json");
				try {
					low2.createNewFile();
					ACM[i]=low2;
					if(low2.exists()==false){
						System.out.println("The file number "+i+"of ACM was not opened/created");
						System.out.println("proceeding to delete all files");
						//if the files is bad we can use the delete() to clear the files
						ACM[i].delete();					
						System.out.println("terminating program...");
						System.exit(0);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			//creating a File class called low3 using createFile
			//looping it 10 times to create 10 NJ files
			//The ACM files are stored in the file array of ACM
			//Similar to the top

			File low3;
			for(int i=1;i<11;i++){
				low3=new File("NJ"+i+".json");
				try {

					low3.createNewFile();
					NJ[i]=low3;
					if(low3.exists()==false){
						System.out.println("The file number "+i+"of NJ was opened/created");
						System.out.println("proceeding to delete all files");
						//if the files is bad we can use the delete() to clear the files
						NJ[i].delete();					
						System.out.println("terminating program...");
						System.exit(0);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

		//Start of question n7
		//Here i ask the user for the file name then compare the string they entered
		//if the strings match the respective files should open and be read
		System.out.println("PLEASE ENTER THE NAME OF THE FILE YOU DESIRE TO SEARCH");
		String name= key.nextLine();
		System.out.println("Searching through the files will now commence...");

		int counter=0;
		for (int i=0;i<11;i++){
			counter++;
			if(name.equalsIgnoreCase("latex"+i+".bib")){

				File folder = new File("C:/Users/Ashiqur Rahman/workspace/249w20A3");
				File[] lf = folder.listFiles();
				if (lf[i].isFile()) {

					//using the buffereader with read line in the while loop to continuously loop and read it all
					BufferedReader bread = new BufferedReader(new FileReader(lf[i].getName()));
					String lines = "";
					try{
						processFilesForValidation(lf, i);
					}catch (IOException e){
						System.out.println("The processFilesForValidation did not work");
					}
					try {
						while((lines = bread.readLine())!= null) {
							System.out.println(lines);
						}
						bread.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else{
				System.out.println("Error mismatch, second chance will be given");
				name= key.nextLine();
				for ( i=0;i<11;i++){
					counter++;
					if(name.equalsIgnoreCase("latex"+i+".bib")){

						File folder = new File("C:/Users/Ashiqur Rahman/workspace/249w20A3");
						File[] lf = folder.listFiles();
						if (lf[i].isFile()) {

							//using the buffereader with read line in the while loop to continuously loop and read it all
							BufferedReader bread = new BufferedReader(new FileReader(lf[i].getName()));
							String lines = "";
							try{
								processFilesForValidation(lf, i);
							}catch (IOException e){
								System.out.println("The processFilesForValidation did not work");
							}
							try {
								while((lines = bread.readLine())!= null) {
									System.out.println(lines);
								}
								bread.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					else{
						System.out.println("another mistmatch termination proceessing");
						if(counter<20){
							System.out.println("The task of searcing was not sucessful...");
							System.out.println("program will now be done...");
						}
						System.exit(0);
					}
			}
			if(name.equalsIgnoreCase("IEEE"+i+".json")){


				if (IEEE[i].isFile()) {

					//using the buffereader with read line in the while loop to continuously loop and read it all
					BufferedReader bread = new BufferedReader(new FileReader(IEEE[i].getName()));
					String lines = "";
					
					try {
						while((lines = bread.readLine())!= null) {
							System.out.println(lines);
						}
						bread.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try{
						processFilesForValidation(IEEE, i);
					}catch (IOException e){
						System.out.println("The processFilesForValidation did not work");
					}
				}

			}

			if(name.equalsIgnoreCase("ACM"+i+".json")){

				if (ACM[i].isFile()) {

					//using the buffereader with read line in the while loop to continuously loop and read it all
					BufferedReader bread = new BufferedReader(new FileReader(IEEE[i].getName()));
					String lines = "";
					
					try {
						while((lines = bread.readLine())!= null) {
							System.out.println(lines);
						}
						bread.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try{
						processFilesForValidation(ACM, i);
					}catch (IOException e){
						System.out.println("The processFilesForValidation did not work");
					}
				}
			}
			if(name.equalsIgnoreCase("NJ"+i+".json")){

				if (NJ[i].isFile()) {

					//using the buffereader with read line in the while loop to continuously loop and read it all
					BufferedReader bread = new BufferedReader(new FileReader(IEEE[i].getName()));
					String lines = "";
					
					try {
						while((lines = bread.readLine())!= null) {
							System.out.println(lines);
						}
						bread.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try{
						processFilesForValidation(NJ, i);
					}catch (IOException e){
						System.out.println("The processFilesForValidation did not work");
					}
				}
			}


		}

		}
		if(counter<20){
			System.out.println("The task of searcing was not sucessful...");
			System.out.println("program will now be done...");
		}

	}

	//Part 5
	//The processFilesForValidation method take in a File array and an integer for the position of the specific array
	public static void processFilesForValidation(File[] lf, int position) throws IOException{

		//initializing the printwriter
		PrintWriter pw=null;
		//initializing the article position number
		int anumb=0;
		//initializing the bufferedreader
		BufferedReader bread= null;
		//initializing the string to read lines
		String line="";
		//looping a buffered reader that has an array of files 
		for(int i=position;i<lf.length;i++) {
			bread = new BufferedReader(new FileReader(lf[i]));	
			line=bread.readLine();
		}
		//Takes in count the number of Articles in the files anumb is incremneted each time theres an article
		while(line!=null) {
			if(line=="@ARTICLE{")
				anumb++;
			line=bread.readLine();
		}
		//creating an array object of articles
		Article[] anew=new Article[anumb];
		Article articleObject= new Article();
		bread.close();

		//here we are looping through how many articles there are using the buffered reader read line we can go through	
		//each lines and also we are checking if any of the important information variables are present and setting them.
		bread = new BufferedReader(new FileReader(lf[position]));	
		for(int e=0; e<anumb;) {
			if(line=="@ARTICLE{") {
				e++;
				line=bread.readLine();

				while(line!="@ARTICLE{"){
					line=bread.readLine();
					if(line=="author"){
						articleObject.setAuthor(line);
					}
					if(line=="journal"){
						articleObject.setJournal(line);
					}
					if(line=="title"){
						articleObject.setTitle(line);
					}
					if(line=="year"){
						articleObject.setYear(line);
					}
					if(line=="volume"){
						articleObject.setVolume(line);
					}
					if(line=="number"){
						articleObject.setNumber(line);
					}
					if(line=="page"){
						articleObject.setPage(line);
					}
					if(line=="doi"){
						articleObject.setDoi(line);
					}
					if(line=="month"){
						articleObject.setMonth(line);
					}

				}
				line=bread.readLine();
			}
			bread.close();
		}
		//as we iterate through the loop,the code below selects a ieee file at a certain position
		//to then display information using the print writer to their respective format
		pw = new PrintWriter(new FileOutputStream("IEEE"+position+".json"));
		for(int u=0; u<lf.length;u++) {
			if(lf[u]==null) {
				break;
			}
			else {
				pw.println((anew[u].IEEE())+". \""+anew[u].getTitle()+"\", "+anew[u].getJournal()+", vol. "+anew[u].getVolume()+", no. "+anew[u].getNumber()+", p. "+anew[u].getPage()+", "+anew[u].getMonth()+" "+anew[u].getYear()+"\n");
			}
		}
		pw.close();
		//as we iterate through the loop,the code below selects a acm file at a certain position
		//to then display information using the print writer to their respective format
		pw = new PrintWriter(new FileOutputStream("ACM"+position+".json"));
		for(int u=0; u<lf.length;u++) {
			if(lf[u]==null) {
				break;
			}
			else {
				pw.println(anew[u].ACM()+"   "+anew[u].getYear()+". "+anew[u].getTitle()+". "+anew[u].getJournal()+". "+anew[u].getVolume()+", "+anew[u].getNumber()+"("+anew[u].getYear()+"), "+anew[u].getPage()+". DOI:https://doi.org/"+"\n");
			}
		}
		pw.close();		

		//as we iterate through the loop,the code below selects a nj file at a certain position
		//to then display information using the print writer to their respective format
		pw = new PrintWriter(new FileOutputStream("NJ"+position+".json"));
		for(int u=0; u<lf.length;u++) {
			if(lf[u]==null) {
				break;
			}
			else {
				pw.println(anew[u].NJ()+"   "+anew[u].getTitle()+". "+anew[u].getJournal()+". "+anew[u].getVolume()+", "+anew[u].getPage()+"("+anew[u].getYear()+").\n");
			}
		}
		pw.close();	
	}
	//question 6 delete method although most of the times i used .delete() directly
	//was not yet implemeted in the code
	public static void extraDelete(File[] i,int position){
		if(i[position].exists()){
			i[position].delete();
		}
	}
}
