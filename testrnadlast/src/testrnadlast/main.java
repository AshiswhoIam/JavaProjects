package testrnadlast;

public class main extends a{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	try {
			String a = "0";
			int r2 = Integer.parseInt(a) / Integer.parseInt(a);
			} 
			catch (ArithmeticException e) {
			System.out.println("Calculation Error");
			} 
			catch (Exception e) {
			System.out.println("General Exception");
			} 
			finally {
			System.out.println("Finally");
			//System.exit(0);
			}
			System.out.println("Finished");
		 */
		try { 
			String a = "0"; int r2 = Integer.parseInt(a) / Integer.parseInt(a);
		} 
		catch (Exception e) 
		{ // general exception first 
			System.out.println("General Exception"); 

		}
		/*catch (ArithmeticException e){ 
			//specific exception after
			System.out.println("Calculation Error");
		} 
		
		finally { System.out.println("Finally");
		} System.out.println("Finished");
		try {
			String text = "abcde";
			System.out.print(text.charAt(10));
			int r1 = Integer.parseInt(text);
			} 
			catch (ArithmeticException e) {
			System.out.println("Calculation Error!");
			} 
			System.out.println("Finished!");
*/
		
		square s= new rect();
		shape e=s;
		shape e2= new square();
		shape e3= new shape();
		System.out.println(s.x);
		System.out.println(e.x);
		System.out.println(s.x);
		
		System.out.println(e2.x);
		
		System.out.println(e3.x);
		int one=1;
		double two=2.0;
		two=one;
		//one=two;
	}
}


