// ----------------------------------------------------- 
// Assignment 1 
// Question: 1
// Written by:  Ashiqur Rahman (40096265)
// -----------------------------------------------------
/*
 * The program's function in general is to let the user store some appliances in a array object
 * which in this case is called inventory. The purpose of the program is to allow the user to 
 * change the brands,prices and types and make sure thet are saved in the inventory properly.
 * An Appliance class was created for the serving of the different utilities in this program.There are 5 options
 * to the program where 1 allows you to create an appliance,option 2 allows u to update the any existing
 * appliance in the inventory, 3 and 4 are made to display information based on a brand name and price respectively,
 * and lastly 5 is to exit the program since a while loop to set the user back to the main menu.
 */
/**
 * @author Ashiqur Rahman 40096265
 * COMP 249
 * Assignment 1
 * Due January 31st 2020
 */
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner for user to input stuff
		Scanner key= new Scanner(System.in);

		//for the array object to store the appliances
		Appliance[] inventory;

		//list of the types of appliances we can use
		String[] typess={"Fridge","AirConditioner","Washer","Dryer","Freezer","Stove","Dishwasher","WaterHeaters","MicroWave"};
		//variables for when creating the object
		String createBrand;
		String createType;
		double createPrice;
		//the position of the array inventory
		int pos;

		String pass="c249";
		//the attempts for the passwords
		int Attempts=0;

		//varible for option 3
		String oldbrand;
		//variable used in option 4
		double pricing;
		
		System.out.println("Please enter the max amount of appliances you will require");
		int maxAppliances=key.nextInt();
		inventory = new Appliance[maxAppliances];
		
		
		//Display Welcome message
		System.out.println();
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		System.out.println("Welcome to Ash's Appliance Inventory");
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");

		//boolean value to start big while loop
		//This will continue to loop to the main menu,until we choose option 5
		boolean looper= true;
		while(looper==true){
			System.out.println("\nWhat do you want to do?");
			System.out.println("\t1.  Enter new appliances (password required)");
			System.out.println("\t2.  Change information of appliances (password required)");
			System.out.println("\t3.  Display all appliances by specific brand");
			System.out.println("\t4.  Display all appliances under a certain price");
			System.out.println("\t5.  Quit");
			System.out.print("Please enter your choice> ");


			int choice= key.nextInt();

			// if user choose option 1
			if(choice == 1){

				System.out.println("Option 1 was chosen, enter password: ");

				String userpass;

				//while loop to allow the user to attempt more than once
				boolean reseter=false;
				while(reseter==false)
				{
					{
						//using equals to verify if pass is correct
						userpass=key.next();
						if(userpass.equals(pass)){

							System.out.println("Password was successful you may proceed");

							reseter=true;
							Attempts=0;

							System.out.println("how many appliances would u like to enter:");
							int usernumber=key.nextInt();

							if(usernumber<=maxAppliances-Appliance.FindNumberOfCreatedAppliances()){

								for(int i=0;i<usernumber;i++){

									System.out.println("Please enter the brand");
									createBrand=key.next();
									System.out.println("Please enter the type");
									createType=key.next();
									System.out.println("Please enter the price");
									createPrice= key.nextDouble();

									//creation of some appliances
									inventory[i]=new  Appliance(createBrand,createType,1000000+i, createPrice);
								}

								System.out.println("The appliances have been saved on to the inventory.");
							}
							else{
								System.out.println("There is not enough space for all, the spots left are : "+(maxAppliances-Appliance.FindNumberOfCreatedAppliances()));
							}
						}
						else{
							System.out.println("password was incorrect try again ");
							Attempts++;
						}

						//redirection if failed 3 times
						if(Attempts==3){
							System.out.println("3 attempts have been made you will be redirected to main menu");
							break;

						}
						if(Attempts==6){
							System.out.println("3 attempts have been made you will be redirected to main menu");
							break;

						}
						if(Attempts==9){
							System.out.println("3 attempts have been made you will be redirected to main menu");
							break;

						}

						// termination of program when 12 password fails
						if(Attempts==12){
							System.out.println("Program detected suspicious activities and will terminate immediately!");
							System.exit(0);
						}
					}
				}
			}

			//if user choose option 2
			if(choice==2){
				System.out.println("Option 2 was chosen, enter password: ");

				String userpass;

				//similar while loop to the one above but has some differences
				boolean reseter=false;
				while(reseter==false)
				{
					userpass=key.next();
					if(userpass.equals(pass)){

						System.out.println("Password was successful you may proceed");

						reseter=true;
						Attempts=0;

						System.out.println("Please enter the serial number of the item");
						long sn=key.nextLong();

						if(sn>1000000+maxAppliances||sn<1000000)
						{

							System.out.println("There is no avaible product of that serial number\n enter 1 if u want to try again or 2 to quit");
							int choices2=key.nextInt();
							if(choices2==1){
								System.out.println("You have chosen 1 redirecting to reenter another one");
							}
							else

							{
								System.out.println("You have chosen 2 quitting to main menu");
								break;
							}
						}
						else{

							//while loop to keep allowing user to makes changes until they are done
							boolean Re=true;
							while(Re==true){


								System.out.println("\nWhat information would you like to change?");
								System.out.println("1 Brand");
								System.out.println("2 Type");
								System.out.println("3 Price");
								System.out.println("4 Quit");
								System.out.println("\nEnter your choice>");

								int options=key.nextInt();

								System.out.println("Enter the position of the appliance u would like to change");						
								pos=key.nextInt();							
								//The different options to change information 
								if(options==1){
									System.out.println("\nEnter a Brand");
									createBrand=key.next();
									inventory[pos].setBrand(createBrand);
								}
								if(options==2){
									System.out.println("\nEnter a Type");
									createType=key.next();
									inventory[pos].setType(createType);
								}
								if(options==3){
									System.out.println("\nEnter a Price");
									createPrice=key.nextDouble();
									inventory[pos].setPrice(createPrice);
								}
								if(options==4)
								{							
									System.out.println("You have decided to quit");
									Re=false;
									break;
								}													
							}
						}
					}
					else{
						System.out.println("password was incorrect try again ");
						Attempts++;
					}

					if(Attempts==3){
						System.out.println("3 attempts have been made you will be redirected to main menu");
						Attempts=0;
						break;
					}
				}
			}
			//option 3 if chosen by user will display items of a specific brand
			if(choice==3){
				System.out.println("Option 3 was chosen, enter a brand name from the list: ");

				oldbrand=key.next();
				//here the for loop uses the method FindNumberOfCreatedAppliances() to find the amount of appliances created
				//the if statement compares the appliances in the inventory to the current user input
				for(int i=0;i<Appliance.FindNumberOfCreatedAppliances();i++){
					
					//System.out.println("does it work");
				
					if(inventory[i].getBrand().equalsIgnoreCase(oldbrand)){
						System.out.println("Appliance #"+i);
						//System.out.println("SerialNumber"+(1000000+i));
						System.out.println(inventory[i]);
					}
					else{
						System.out.println("searching....");
					}
				}

			}
			//option 4 if chosen by user will display items of a specific value
			if(choice==4){

				System.out.println("Option 4 was chosen, enter a value: ");
				pricing=key.nextDouble();
				//here the for loop uses the method FindNumberOfCreatedAppliances() to find the amount of appliances created
				//the if statement checks if the pricing of the current appliance is lower than the userinput
				for(int i=0;i<Appliance.FindNumberOfCreatedAppliances();i++){
					if(inventory[i].getPrice()<pricing){
						
						System.out.println("Appliance #"+i);
						//System.out.println("SerialNumber:"+(1000000+i));
						System.out.println(inventory[i]);
					}
				}
			}
			//option 5 if chosen by user will terminate the program
			if(choice==5){
				System.out.println("Option 5 was chosen, \n thank you for using the program \n exiting now! ");
				System.exit(0);

			}

		}
		key.close();
	}
}
