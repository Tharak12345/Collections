package Collection.Arraylist.com;

import java.util.Iterator;
import java.util.Vector;

public class Avector {
	
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		vec.add("hello");
		vec.add("nishitha");
		vec.add("Rami");
		Iterator<String> it = vec.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
	}

}
