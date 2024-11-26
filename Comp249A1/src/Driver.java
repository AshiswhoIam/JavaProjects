import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myKey= new Scanner(System.in);

		System.out.println("Welcome dear user to the car database!");

		System.out.println("Please enter the max number of Cars the company can handle");
		int max=myKey.nextInt();

		Car carDatabase[]= new Car[max];

		String make = null;
		String model = null;
		int year = 0;
		int price = 0;
		Car carobj=new Car(make,model,year,price);

		final String password="comp249S19";

		System.out.println("What do you want to do? ");
		System.out.println(" 1. Enter a new Car to the inventory (password required) ");
		System.out.println(" 2. Change information of an existing Car (password required)");
		System.out.println(" 3. Display all the Cars with the specified make and model");
		System.out.println(" 4. Display all the Cars within the given price range");
		System.out.println(" 5. Quit");
		System.out.println("Please enter your choice >");

		int choice=myKey.nextInt();
		boolean bigstop=false;
		boolean stopchoice2=false;
		String userpass;
		int choice2;
		int count=0;
		int count2=0;

		while(bigstop==false){


			boolean someloop=false;
			while(choice!=1||choice!=2||choice!=3||choice!=4||choice!=5){


				if(choice==1||choice==2||choice==3||choice==4||choice==5)
				{
					someloop= true;

				}
				if(someloop==true)
					break;
				System.out.println("Enter a valid choice");

				choice=myKey.nextInt();

			}

			if(choice==1)
			{	
				System.out.println("You have chosen option 1 please enter your password");
				userpass=myKey.next();
				if(userpass.equals(password))
				{
					System.out.println("How many cars would u like to enter");
					int usercarnb=myKey.nextInt();
					if(usercarnb>=max)
					{
						System.out.println("The number of car you want exceeds the database holder");
						System.out.println("You can only add"+max+" amount");
						System.out.println("Try another lower nb");
						usercarnb=myKey.nextInt();
						continue;
						//still gotta fix here
					}
					else{
						System.out.println("Perfect we will add them in");
						for(int j=0;j<usercarnb;j++){

							System.out.println("Enter the make mode price and year:");
							make=myKey.next();
							model=myKey.next();

							year=myKey.nextInt();
							price=myKey.nextInt();

							Car car=new Car(make, model, price, year);
							carDatabase[usercarnb]=car;

							carDatabase[usercarnb].toString();


							//hmmm stuck I guess				
						}
						System.out.println("Thank you come again.");
						bigstop=true;
					}	
				}

				else{

					while(count<13)
					{
						count++;
						if(userpass.equals(password)==false)
						{
							System.out.println("Wrong enter again");

							userpass=myKey.next();				
						}

						else

						{
							break;
						}
						if((count==2||count==4||count==6||count==8||count==10)&&userpass.equals(password)==false)
						{

							System.out.println("What do you want to do? ");
							System.out.println(" 1. Enter a new Car to the inventory (password required) ");
							System.out.println(" 2. Change information of an existing Car (password required)");
							System.out.println(" 3. Display all the Cars with the specified make and model");
							System.out.println(" 4. Display all the Cars within the given price range");
							System.out.println(" 5. Quit");
							System.out.println("Please enter your choice >");

							choice=myKey.nextInt();
							break;


						}

						if(count==12){
							System.out.println("Program detected suspicious activity and is terminating!");
							myKey.close();
							System.exit(0);	
						}
					}

				}

			}

			if(choice==2)
			{
				if(count2!=2){
					System.out.println("You have chosen option 2 please enter your password");

					userpass=myKey.next();



					if(userpass.equals(password))
					{
						System.out.println("Which car would you like to update");
						int index=myKey.nextInt();

						if(carDatabase[index]==null)

						{
							System.out.println("There's no car avaible would u like to enter another index or quit to main");
							System.out.println("enter quit or index.");
							String userentering=myKey.next();
							if(userentering.equals("quit"))
							{
								//create b
							}
							if(userentering.equals("index"))

							{
								index=myKey.nextInt();

							}
						}
						if(carDatabase[index]!=null){

							System.out.println("This is car number:"+index);
							System.out.println();
							carDatabase[index].getMake();
							System.out.println();
							carDatabase[index].getModel();
							System.out.println();
							carDatabase[index].getYear();
							System.out.println();
							carDatabase[index].getPrice();



						}

						System.out.println("Pls enter what u would like to change");
						System.out.println("1. Car make ");
						System.out.println("2. Car model ");
						System.out.println("3. Car year ");
						System.out.println("4. Car price ");
						System.out.println("5. Quit ");
						System.out.println("Please enter your choice >");



						choice2=myKey.nextInt();
						if(choice2==1)
						{
							System.out.println("type the change");
							make=myKey.next();
							carDatabase[index].setMake(make);
						}
						if(choice2==2)
						{
							System.out.println("type the change");
							model=myKey.next();
							carDatabase[index].setModel(model);
						}
						if(choice2==3)
						{
							System.out.println("type the change");
							year=myKey.nextInt();
							carDatabase[index].setYear(year);
						}
						if(choice2==4)
						{
							System.out.println("type the change");
							price=myKey.nextInt();
							carDatabase[index].setPrice(price);
						}
						if(choice2==5)
						{
							System.out.println("You've decided to go to main menu");
							choice=0;
						}

					}

					while(count2<3)
					{
						count2++;
						if(userpass.equals(password)==false)
						{
							System.out.println("Wrong enter again");
							userpass=myKey.next();
						}
						else
						{
							break;
						}
						if(count2==2&&userpass.equals(password)==false)
						{

							System.out.println("What do you want to do? ");
							System.out.println(" 1. Enter a new Car to the inventory (password required) ");
							System.out.println(" 2. Change information of an existing Car (password required)");
							System.out.println(" 3. Display all the Cars with the specified make and model");
							System.out.println(" 4. Display all the Cars within the given price range");
							System.out.println(" 5. Quit");
							System.out.println("Please enter your choice >");
							choice=myKey.nextInt();
							count2=0;
							break;
						}
					}
				}
			}
			/*
		if(choice==3)
		{
			System.out.println("User pls enter a make and a model");
			make=myKey.next();
			model=myKey.next();
			Car.findCarBy(make, model);

		}
		if(choice==4)
		{
			System.out.println("Please enter the min and max prices for the cars");

			int mini=myKey.nextInt();

			int maxi=myKey.nextInt();
		}
			 */
			if(choice==5)
			{
				System.out.println("You have chosen option 5 thank you and goodbye!");
				System.exit(0);
			}
		}
	}
}