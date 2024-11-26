import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class main {

	public static void main(String[] args) throws IOException  {

		Scanner key= new Scanner(System.in);

		System.out.println("-----------------------------------------");
		System.out.println("Welcome To Ashiqur's BibliographyFactory!");
		System.out.println("-----------------------------------------");

		Article[] a= new Article[10];



		int count =-5;
		try {


			File folder = new File("C:/Users/Ashiqur Rahman/workspace/249w20A3");
			File[] lf = folder.listFiles();

			if (lf.length > 0) {
				for (int i = 0; i < lf.length; i++ ) {
					count++;
					if (lf[i].isFile()) {

						BufferedReader bread = new BufferedReader(new FileReader(lf[i].getName()));
						String lines = "";
						while((lines = bread.readLine())!= null) {
							System.out.println(lines);
						}
					}
					if(count>0&&lf[i].exists()==false){
						System.out.println("Exception while reading file:" + count);
						System.exit(0);
					}
				}
			}


		} catch(Exception e) {
			System.out.println("Exception while reading file:" + count);
		}





		PrintWriter pw= null;
		boolean need= true;
		if(need==true){
			System.out.println("All files have successfully been opened proceeding to create 30 new files(nj,ieee,acm)");


			//file array to store each file created of IEEE
			//As a new file is created that file ge
			File []IEEE= new File[11];
			File low;
			for(int i=1;i<11;i++){

				low=new File("IEEE"+i+".json");		

				try {
					low.createNewFile();
					IEEE[i]=low;
					if(low.exists()==false){
						System.out.println("The file number "+i+"of IEEE was not opened/created");
						System.out.println("proceeding to delete all files");
						low.delete();					
						System.out.println("terminating program...");
						System.exit(0);
					}


				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


			File []ACM= new File[11];
			File low2;
			for(int i=1;i<11;i++){
				low2=new File("ACM"+i+".json");
				try {
					low2.createNewFile();
					ACM[i]=low2;
					if(low2.exists()==false){
						System.out.println("The file number "+i+"of ACM was not opened/created");
						System.out.println("proceeding to delete all files");
						low2.delete();					
						System.out.println("terminating program...");
						System.exit(0);
					}






				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			File []NJ= new File[11];
			File low3;
			for(int i=1;i<11;i++){
				low3=new File("NJ"+i+".json");
				try {
					low3.createNewFile();
					NJ[i]=low3;
					//processFilesForValidation(lf[0], count);
					if(low3.exists()==false){
						System.out.println("The file number "+i+"of NJ was opened/created");
						System.out.println("proceeding to delete all files");
						low3.delete();					
						System.out.println("terminating program...");
						System.exit(0);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("PLEASE ENTER THE NAME OF THE AUTHOR YOU DESIRE TO SEARCH");
		String name= key.nextLine();
		System.out.println("Searching through the files will now commence...");




	}
	public static void processFilesForValidation(File[] lf, int position) throws IOException{

		PrintWriter pw=null;
		int anumb=0;
		BufferedReader bread= null;
		String line="";
		for(int i=position;i<lf.length;i++) {
			bread = new BufferedReader(new FileReader(lf[i]));	
			line=bread.readLine();
		}
		while(line!=null) {
			if(line=="@ARTICLE{")
				anumb++;
			line=bread.readLine();
		}
		Article[] anew=new Article[anumb];
		Article articleObject= new Article();
		bread.close();

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
			/*	
			anew[e-1]=articleObject.clone();


			if (e==anumb) {
				if(articleObject.getAuthor()==null||articleObject.getJournal()==null||articleObject.getTitle()==null||articleObject.getYear()==null||articleObject.getVolume()==null||articleObject.getPage()==null||articleObject.getDoi()==null||articleObject.getMonth()==null) 
						throw new FileInvalidException();
			}
		}*/
			bread.close();
		}
		pw = new PrintWriter(new FileOutputStream("IEEE"+position+".json"));
		for(int u=0; u<lf.length;u++) {
			if(lf[u]==null) {
				break;
			}
			else {
				pw.println((anew[u])+". \""+anew[u].getTitle()+"\", "+anew[u].getJournal()+", vol. "+anew[u].getVolume()+", no. "+anew[u].getNumber()+", p. "+anew[u].getPage()+", "+anew[u].getMonth()+" "+anew[u].getYear()+"\n");
			}
		}
		pw.close();	






		/*
		// TODO Auto-generated method stub
Scanner key = new Scanner(System.in);


		/*Scanner myReader=null;
		try {
			File myObj = new File("Latex1duplicate.bib");
			myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}*/		
		/*		
		int i=0;
		BufferedReader[] readers = new BufferedReader[2]; 
		readers[0] = new BufferedReader(new FileReader("trial1error.txt"));
		readers[1] = new BufferedReader(new FileReader("trialanderror.txt"));
		boolean noMoreLine = false;
		while (!noMoreLine)       
		{
		   for (BufferedReader reader : readers){
		        String line = reader.readLine();
		        if (line == null){
		           noMoreLine = true;
		           System.out.println("no more line");
		           i++;
		           break;
		        }
		        System.out.println("Line " + i + " = line");
		       }
		    }





	File[] arrayf=new File("C:/Users/Ashiqur Rahman/workspace/249w20A3").listFiles();        
		System.out.println();

		int count=0;;

		for(File a: arrayf){
			if(a.getName().endsWith(".bib")){

				String text="";
				String lines;
				Scanner key2= new Scanner(a);
				count++;
				if(a.exists()==false){
					System.out.println("Could not open input file for file#: "+count);
				}

				while(key2.hasNextLine()){
					lines=key2.nextLine();
					if (lines.isEmpty()) {
				        break;
				    }
					text += lines+"\n";

				}
				System.out.println(text);
			}
		}
		 */
		/*	int count =-5;
		try {
			String srcDir = "C:/Users/Ashiqur Rahman/workspace/249trialanderror";

			File folder = new File(srcDir);
			File[] listOfFiles = folder.listFiles();

			if (listOfFiles.length > 0) {
				for (int i = 0; i < listOfFiles.length; i++ ) {
					count++;
					if (listOfFiles[i].isFile()) {
						//create BufferedReader to read csv file
						BufferedReader br = new BufferedReader( new FileReader(listOfFiles[i].getName()));
						String strLine = "";
						while( (strLine = br.readLine()) != null) {
							System.out.println(strLine);
						}
					}
				}
			}
			System.out.println(count);
		} catch(Exception e) {
			System.out.println("Exception while reading file: ");
		}

		File low;
		for(int i=1;i<11;i++){
			low=new File("IEEE"+i+".json");
			try {


				low.createNewFile();
				if(low.exists()==false){
					System.out.println("The file number "+i+"of IEEE was not good");
					System.out.println("proceeding to delete all files");				
					low.delete();					
					System.out.println("terminating program...");
					System.exit(0);


				}
				else {
					System.out.println("it's working");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		File low2;
		for(int i=1;i<11;i++){
			low2=new File("ACM"+i+".json");
			try {
				low2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		File low3;
		for(int i=1;i<11;i++){
			low3=new File("NJ"+i+".json");
			try {
				low3.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("PLEASE ENTER THE NAME OF THE AUTHOR YOU DESIRE TO SEARCH");
		String name= key.nextLine();
		int yo=0;
try {


			File folder = new File("C:/Users/Ashiqur Rahman/workspace/249w20A3");
			File[] lf = folder.listFiles();

			if (lf.length > 0) {
				for (int i = 0; i < lf.length; i++ ) {
					count++;
					yo++;
					if (lf[i].isFile()) {

						BufferedReader bread = new BufferedReader(new FileReader(lf[i].getName()));
						String lines = "";
						while((lines = bread.readLine())!= null) {

							if(lines.contains(name)){
							System.out.println("say yes");
							System.out.println(lines);
						}

						}
					}
					if(count>0&&lf[i].exists()==false){
						System.out.println("Exception while reading file:" + count);
						System.exit(0);
					}
				}
			}



		} catch(Exception e) {
			System.out.println("Exception while reading file:" + count);
		}
PrintWriter pw=null;
int position=0;
pw = new PrintWriter(new FileOutputStream("IEEE"+position+".json"));
for(int u=0; u<lf.lenght;u++) {
	if(lf[u]==null) {
		break;
	}
	else {
		pw.println(ieeeFormat(anew[u])+". \""+anew[u].getTitle()+"\", "+anew[u].getJournal()+", vol. "+anew[u].getVolume()+
			", no. "+anew[u].getNumber()+", p. "+anew[u].getPages()+", "+anew[u].getMonth()+" "+anew[u].getYear()+"\n");
		}
	}
	pw.close();		

		 */
		/*
		File[] fileArray=new File("C:/Users/Ashiqur Rahman/workspace/249trialanderror").listFiles();        
		System.out.println("does it work ");
		for(File f: fileArray) // loop thru all files
		{


			if(f.getName().endsWith(".bib")) // to deal with the .txt files.
			{                 

				String input = "";
				Scanner keyboard = new Scanner(f);
				String line;
				while (keyboard.hasNextLine()) {
				    line = keyboard.nextLine();
				    if (line.isEmpty()) {
				        break;
				    }
				    input += line + "\n";
				}


				System.out.println(input);

			}              

		}*/
		/*		
		File[] arrayf=new File("C:/Users/Ashiqur Rahman/workspace/249trialanderror").listFiles();        
		System.out.println();

		int count=0;;

		for(File a: arrayf){
			if(a.getName().endsWith(".bib")){

				String text="";
				String lines;
				Scanner key2= new Scanner(a);
				count++;
				if(a.exists()==false){
					System.out.println("Could not open input file for file#: "+count);
				}

				while(key2.hasNextLine()){
					lines=key2.nextLine();
					if (lines.isEmpty()) {
				        break;
				    }
					text += lines+"\n";

				}
				System.out.println(text);
			}
		}*/


	}
}
