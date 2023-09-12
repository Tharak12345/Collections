package Collection.Arraylist.com;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsett {
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Tharaka");
		hs.add("Rami");
		hs.add("Reddy");
		hs.add(null);
		hs.add(null);
		hs.add("Ganta");
        Iterator<String> it = hs.iterator();
        while(it.hasNext()) {
        	String in=it.next();
        	System.out.println(in);
        }
        
	}

}
