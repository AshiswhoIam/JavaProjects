// ----------------------------------------------------- 
// Assignment 2 
// Question: 1&2
// Written by:  Ashiqur Rahman (40096265)
// -----------------------------------------------------
/*
 * The program below was essentially meant to display various objects of different class and teach us
 * to handle packages. In addition, proper hieararchy needed to be implemented to make the program function well
 * and to use the method getPrice() (when looking for the smallest and second smallest price).Also, a crucial part
 * of this program was to implement a copy object methods called flyingCopyObjects.
 * The method was suppose to make a new array and copy all of the objects in the old array
 * to the newer one. However, the program seems to misbehave as when calling the method it seems as if 
 * there are some objects that were not properly printed. This is due to the use of an unsual method
 * and not using the clone method which is the proper way to do it.
 */
import java.util.*;

import ForFly.flyingObjs;
import onePack.Airplane;
import twoPack.Helicopter;
import twoPack.Quadcopter;
import threePack.Multirotor;
import fourPack.UAV;
import fivePack.AgriculturalDrone;
import fivePack.MAV;
public class Driver {
	
	//This is the copyFlyingObject static method where we need to take an array
	//and duplicate it. I created a Fly array object to take in the values
	//of the old array and iterating it through the loop to copy it all.
	public static flyingObjs copyFlyingObject(flyingObjs [] fo){
		
		int defaultIndex=15;
		
		flyingObjs [] flyArray= new flyingObjs[defaultIndex];
		for(int o=0;o<15;o++){
			
			flyArray[o]=fo[o];
			System.out.println("This is a duplicate array of FlyArray: \n"+flyArray[o]);
			System.out.println();
		}
		
		return fo[0];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key= new Scanner(System.in);

		//Welcome meassage
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("Welcome to Ash's flying vehicle program");
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println();


		//Below various objects are created for the different classes
		//their information is being outputted as well as the result of the equals methods
		String ap1="Bombardier";
		double p1=200000.7;
		int hp1=1200;
		Airplane a1= new Airplane(ap1,p1,hp1);


		String ap2="United Airlines";
		double p2=120000.4;
		int hp2=900;
		Airplane a2= new Airplane(ap2,p2,hp2);		


		String ap3="Drakar";
		double p3=300000.0;
		int hp3=1500;
		Airplane a3= new Airplane(ap3,p3,hp3);

		System.out.println(a1.toString());
		System.out.println();
		System.out.println(a2.toString());
		System.out.println();
		System.out.println(a3.toString());
		System.out.println();
		System.out.println("Here we are comparing a1 to a2 to see if they are equal and the result is: "+a1.equals(a2));
		System.out.println();
		System.out.println("Here we are comparing a1 to a1 to see if the method works and the result is: "+a1.equals(a1));
		System.out.println();

		String helb1="Air force";
		double help1=450000.0;
		int helhp1=1600;
		int cyl1=3;
		int year1=1990;
		int pc1=12;
		Helicopter h1= new Helicopter(helb1,help1,helhp1,cyl1,year1,pc1);

		String helb2="Japan Airlines";
		double help2=110000.0;
		int helhp2=970;
		int cyl2=3;
		int year2=2012;
		int pc2=70;
		Helicopter h2= new Helicopter(helb2,help2,helhp2,cyl2,year2,pc2);

		String helb3="Dubai Airlines";
		double help3=910000.0;
		int helhp3=2000;
		int cyl3=12;
		int year3=2019;
		int pc3=500;
		Helicopter h3= new Helicopter(helb3,help3,helhp3,cyl3,year3,pc3);

		System.out.println(h1.toString());
		System.out.println();
		System.out.println(h2.toString());
		System.out.println();
		System.out.println(h3.toString());
		System.out.println();


		//Here we are testing a few equals method, it is also done more times below
		System.out.println();
		System.out.println("Here we are comparing h1 to h2 to see if they are equal and the result is: "+h1.equals(h2));
		System.out.println();
		System.out.println("Here we are comparing h1 to h1 to see if the method works and the result is: "+h1.equals(h1));
		System.out.println();


		String qbrand1="Very Expensive one";
		double qprice1=900400.99;
		int qhorse1=3000;
		int qcylinder1= 20;
		int qyear1=2090;
		int qcapacity1= 100;
		int speed1=100;
		Quadcopter q1= new Quadcopter(qbrand1,qprice1,qhorse1,qcylinder1,qyear1,qcapacity1,speed1);


		String qbrand2="Very Cheap one";
		double qprice2=8900.99;
		int qhorse2=300;
		int qcylinder2= 2;
		int qyear2=209;
		int qcapacity2= 10;
		int speed2=10;
		Quadcopter q2= new Quadcopter(qbrand2,qprice2,qhorse2,qcylinder2,qyear2,qcapacity2,speed2);

		String qbrand3="Very Cheap two";
		double qprice3=7000.99;
		int qhorse3=200;
		int qcylinder3= 2;
		int qyear3=525;
		int qcapacity3= 7;
		int speed3=19;
		Quadcopter q3= new Quadcopter(qbrand3,qprice3,qhorse3,qcylinder3,qyear3,qcapacity3,speed3);

		System.out.println(q1.toString());
		System.out.println();
		System.out.println(q2.toString());
		System.out.println();
		System.out.println(q3.toString());
		System.out.println();


		System.out.println();
		System.out.println("Here we are comparing q1 to q3 to see if they are equal and the result is: "+q1.equals(q3));
		System.out.println();
		System.out.println("Here we are comparing q1 to q1 to see if the method works and the result is: "+q1.equals(q1));
		System.out.println();



		String mbrand1="SpinnerRx3000";
		double mprice1=99999;
		int mhorse1=787;
		int mcylinder1= 6;
		int myear1=2030;
		int mcapacity1= 20;
		int rotators1=6;


		Multirotor m1= new Multirotor(mbrand1,mprice1,mhorse1,mcylinder1,myear1,mcapacity1,rotators1);

		String mbrand2="Flyhighxxx9000";
		double mprice2=1000000;
		int mhorse2=2500;
		int mcylinder2= 15;
		int myear2=2090;
		int mcapacity2= 505;
		int rotators2=50;

		Multirotor m2= new Multirotor(mbrand2,mprice2,mhorse2,mcylinder2,myear2,mcapacity2,rotators2);


		System.out.println(m1.toString());
		System.out.println();
		System.out.println(m2.toString());
		System.out.println();


		System.out.println();
		System.out.println("Here we are comparing m1 to m2 to see if they are equal and the result is: "+m1.equals(m2));
		System.out.println();
		System.out.println("Here we are comparing m2 to m2 to see if the method works and the result is: "+m2.equals(m2));
		System.out.println();


		int w1=20;
		int uavp1=5500;
		UAV u1= new UAV(w1,uavp1);

		int w2=30;
		int uavp2=7900;
		UAV u2 = new UAV(w2,uavp2);

		System.out.println(u1.toString());
		System.out.println();
		System.out.println(u2.toString());
		System.out.println();


		System.out.println();
		System.out.println("Here we are comparing u1 to u2 to see if they are equal and the result is: "+u1.equals(u2));
		System.out.println();
		System.out.println("Here we are comparing u2 to u2 to see if the method works and the result is: "+u2.equals(u2));
		System.out.println();

		int agweight1=50;
		int agprice1=10100;
		String agbrand1="Flex x 4000";
		int agcarry1=15;

		AgriculturalDrone ag1= new AgriculturalDrone(agweight1,agprice1,agbrand1,agcarry1);

		int agweight2=10;
		int agprice2=999;
		String agbrand2="super cheap mod232";
		int agcarry2=5;

		AgriculturalDrone ag2= new AgriculturalDrone(agweight2,agprice2,agbrand2,agcarry2);


		System.out.println(ag1.toString());
		System.out.println();
		System.out.println(ag2.toString());
		System.out.println();


		System.out.println();
		System.out.println("Here we are comparing ag1 to ag2 to see if they are equal and the result is: "+ag1.equals(ag2));
		System.out.println();
		System.out.println("Here we are comparing ag2 to ag2 to see if the method works and the result is: "+ag2.equals(ag2));
		System.out.println();


		MAV mav1= new MAV();

		int mavw1=13;
		int mavp1=3425;
		String model1= "LighterE90c";
		double size1= 22.4;

		MAV mav2= new MAV(mavw1,mavp1,model1,size1);

		System.out.println(mav1.toString());
		System.out.println();
		System.out.println(mav2.toString());
		System.out.println();


		System.out.println();
		System.out.println("Here we are comparing mav1 to mav2 to see if they are equal and the result is: "+mav1.equals(mav2));
		System.out.println();
		System.out.println("Here we are comparing mav2 to mav2 to see if the method works and the result is: "+mav2.equals(mav2));
		System.out.println();

		System.out.println("Here we are comparing various object of different classes and they should all result in false");
		System.out.println(a1.equals(h2));
		System.out.println(a2.equals(q2));
		System.out.println(u1.equals(ag2));
		System.out.println(u1.equals(mav2));
		System.out.println(h1.equals(q2));
		System.out.println(m1.equals(m2));




		//Creating 15 different flyingobjs
		flyingObjs fo[]= new flyingObjs[15];
		fo[0]=a1;
		fo[1]=a2;
		fo[2]=a3;
		fo[3]=h1;
		fo[4]=h2;
		fo[5]=q1;
		fo[6]=q2;
		fo[7]=m1;
		fo[8]=m2;
		fo[9]=u1;
		fo[10]=u2;
		fo[11]=ag1;
		fo[12]=ag2;
		fo[13]=mav1;
		fo[14]=mav2;



	

		//variable to save the index
		int index = 0;

		//for loop to go through all the objects
		//the if method compares all prices of objects and will save the smallest one by going through each of them
		//index=i to save the smallest prices index
		for(int i=0;i<15;i++){
			if(fo[i].getPrice()<fo[0].getPrice()){

				index=i;
				fo[0]=fo[i];

			}
			//display message once all the objects have been gone through
			if(i==14){

				System.out.println("The smallest price flyingobj: \n"+fo[0].toString()+"\nit is at index: "+index);

			}

		}

		System.out.println();
		
		//index saving for the second smallest object
		int index2=0;
		//saving the smallest objects price
		double saveog=fo[index].getPrice();
		//making the smallest object have a bigger price to find 2nd smallest price
		double saveme=10000000;
		//similar loop to above
		for(int j=0;j<15;j++){
			fo[index].setPrice(saveme);
			if(fo[j].getPrice()<fo[0].getPrice()){

				index2=j;
				fo[0]=fo[j];

			}
			
			if(j==14){

				System.out.println("The second smallest price flyingobj: \n"+fo[0].toString()+"\nit is at index: "+index2);
			//Reseting the smallest index to its orignal price
				fo[index].setPrice(saveog);
			

			}

		}
		System.out.println();
		System.out.println();
		System.out.println("This is where the copy begins");
		System.out.println();
		System.out.println();
		//calling of the method for phase 2
		copyFlyingObject(fo);
		
		System.out.println();
		System.out.println();
		System.out.println("Program has been terminated, thank you!");

	}

}
