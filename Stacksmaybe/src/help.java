import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


public class help {
	
	public static int ok(int n){
		
		int z;
		if (n==1)
				return n;
		else
			return ok(n-1)*(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<String> list = new ArrayList<String>();
		list.add(0, "0");
		list.add(4, "1");
		list.remove(1);
		*/
		
		Stack<String> stack = new Stack<String>();
		//PriorityQueue<String> q= new PriorityQueue<String>();

		stack.push("5");
		stack.push("3");
		stack.push("23");
		stack.size();
		stack.get(1);

		
	
		System.out.println(stack.pop());
		System.out.println(ok(6));



	}

}
