// ----------------------------------------------------- 
// Assignment 3
// Question: 3
// Written by:Ashiqur Rahman (40096265)
// -----------------------------------------------------
/*
 * This program was designed to gain a better comprehension of exception handling , file i/o as well as multiple other concepts.
 * We start with the creation of a file reader reading through the all of the current files in the log.txt folder
 * The user is given 3 option, one is to create a new file and overwrite the log folder,
 * the second to proccess the log folder and lasty the third to exit the program
 * 2 class of exception are used to prevent program crashes. One of the processing phase
 * requires to read the files in a data folder, get specific information and have a random access method which is incomplete in this case.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class Maindriv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exception objects
		InvalidFileException i= new InvalidFileException("");
		EmptyFolderException j=new EmptyFolderException("");
		Scanner key= new Scanner (System.in);
		//welcome banner
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Ash's program that helps practice Exception Handling, and File I/O and other concepts");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");





		System.out.println("Dear user select 1 of 3 options: ");
		System.out.println("1:List files");
		System.out.println("2:Process files");
		System.out.println("3:Exit");


		//boolean to stop the while loop
		boolean stop=true;

		//initialize file reader
		FileReader file = null;
		try {
			file = new FileReader("C:/Users/Ashiqur Rahman/workspace/Comp249A3R2/log.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}





		//user input for choices
		int userin = key.nextInt();

		//while loop to continue until 3 or some invalid number is chsen
		while(stop==true){
			if(userin==1)
				System.out.println("Option 1 was chosen");
			System.out.println("New file being created");
			{

				//try and catch to prevent file not found expception
				try {
					//Creation of the file where to read from
					file = new FileReader("C:/Users/Ashiqur Rahman/workspace/Comp249A3R2/log.txt");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					i.CheckMethod();
				}
			}

			//buffer reader with file 
			BufferedReader reader = new BufferedReader(file);
			//some string to output the txt file in
			String text="";

			String line = null;
			try {
				//reads ine
				line = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException was caught here in the open");
			}

			String text2="";
			String line2 =null;
			if(userin==2){

				System.out.println("Option 2 was chosen");
				System.out.println("log.txt info is being released");
				//while loop to continue reading full until no more lines
				while(line!=null){

					text+=line+"\n";

					try {
						line=reader.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("IOException was caught here for reading the lines in option 2");
					}

				}


				try{
					File all= new File("C:/Users/Ashiqur Rahman/workspace/Comp249A3R2/Data/2017");
					File [] listall=all.listFiles();



					for(int a=0;a<listall.length;a++){
						File newfile=listall[a];
						if(newfile.isFile()&&newfile.getName().endsWith(".txt")){

							System.out.println(newfile);
							/*	while(line2!=null){

								text+=line2+"\n";

								try {
									line2=reader2.readLine();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									System.out.println("IOException was caught here for reading the lines in option 2");
								}

							}*/

						}
					}
				}
				catch(Exception e){
					System.out.print("yeah naw i cant do that");
				}
			}

			System.out.println("\n"+text);

			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException was caught here for the close of reader");
			}


			// this print the file names not content.
			File folder = new File("C:/Users/Ashiqur Rahman/workspace/Comp249A3R2/Data/2017");
			File[] listOfFiles = folder.listFiles();

			for (File filess : listOfFiles) {
				if (filess.isFile()) {
					System.out.println(filess.getName());
				}
			}
			//also again prints file names
			String rando;
			String readm;
			int ij; 


			//method used for reading textfiles
			for(int ok =0;ok<listOfFiles.length;ok++){
				if(listOfFiles[ok].isFile()){

					rando=listOfFiles[ok].getName();

					if(rando.endsWith(".txt")){
						System.out.println(rando);

						File toReadThetxt= new File(folder.getAbsolutePath()+File.separator+rando);
						try {

							BufferedReader help= new BufferedReader(new FileReader(toReadThetxt));

							while((ij=help.read())!=-1){  
								readm=help.readLine();
								System.out.println(readm);  
							}

						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							System.out.println("caught an FilenotfoundException right before the while loop");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("caught an Io exception");
						}

						try {
							RandomAccessFile raf= new RandomAccessFile(folder,"r");
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							System.out.println("FilenotfoundException was caught here trying to use random access file");  
						}

					}
				}
			}



			//Option 3 closes file reader and terminates program
			if(userin==3){
				System.out.println("You chose option 3 terminating program.");

				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("IOException was caught here in 3rd option part 1");
				}
				try {
					file.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("IOException was caught here in 3rd option part 2");
				}
				System.exit(0);

			}

			System.out.println("what option would you like to do now");
			userin=key.nextInt();


			i.CheckMethod();
			j.CheckMethod();

			//File folder= new File("");



			//trying to print out data txt files but still not working....
			/*
			String direct="C:/Users/Ashiqur Rahman/workspace/Comp249A3R2/Data";
			File d = new File(direct);
			File[] files = d.listFiles();

			for(File f:files){

				if(f.isFile()){
					BufferedReader inputStream=null;
					try{
						inputStream = new BufferedReader(new FileReader(f));

						String liner;
						while((liner=inputStream.readLine())!=null){
							System.out.println(liner);
						}

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					finally{
						if(inputStream !=null){
							try {
								inputStream.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}*/

		}




	}





	//method to try and read files in data (incomplete)
	/*
	public static void laf(File folder) throws FileNotFoundException, IOException{
		File[] printall=folder.listFiles();
		for(File file:printall){
			if(file.isDirectory()){
				laf(file);
			}
			else{
				 try(BufferedReader b  = new BufferedReader(new FileReader(file))){
		               String s;

		               while((s = b.readLine()) != null){
		                System.out.println("Line is - " + s);
		               }

			}
	 */


}
