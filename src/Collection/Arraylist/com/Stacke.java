package Collection.Arraylist.com;

import java.util.Iterator;
import java.util.Stack;

public class Stacke {
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		
		/* Integer ir= s.pop(); */
	   
			
			Integer im= s.peek(); 
			 
			
			  Iterator<Integer> it = s.iterator(); while(it.hasNext()) { Integer
			  i=it.next(); System.out.println(i); }
			 
		
	}

}
