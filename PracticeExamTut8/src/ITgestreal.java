import java.util.*;
public class ITgestreal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question 1 (BUBBLE SORTING) kinda doable but reallly needed time
		
		int[] n = {4, 2, 6, 12, 0, -4, 6, 3, 8, 1};
		System.out.println("Array before:");
		for (int i = 0; i < n.length; i++) {
		System.out.println("n["+i+"] = " + n[i]);
		}
		boolean secretProperty = false;
		while (!secretProperty) {
		secretProperty = true;
		for (int i=0; i < (n.length-1); i++) {
		if (n[i] > n[i+1]) {
		int temp = n[i];
		n[i] = n[i+1];
		n[i+1] = temp;
		secretProperty = false;
		}
		}
		}
		System.out.println();
		System.out.println("Array after:");
		for (int i = 0; i < n.length; i++) {
		System.out.println("n["+i+"] = " + n[i]);
		}
		
		
		//Question 2-3 Done
		
		//Question 4 iffy
		
		//Question 5 Yep I got it
		
		//Question 6 somebsiac stuff i sohuoldm know if i take a oeek quick
		
		//Question 7 
		/*int temp;
		 * 
		 * for (int i=0; i<theArray.length/2; i++){
		 * temp = theArray[i];
		 * theArray[i] = theArray[theArray.length-1-i];
		 * theArray[theArray.length-1-i] = temp;}
		 * Just reversing elements in array from first to last etc*/
		
		//Question 8-11 save for bed beacuse diffiult
	}

}
