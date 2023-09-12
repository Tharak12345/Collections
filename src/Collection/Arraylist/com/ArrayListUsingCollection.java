package Collection.Arraylist.com;

import java.util.ArrayList;

public class ArrayListUsingCollection {
	
	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("Tharak");
		arr.add("sai");
		arr.add("venu");
		arr.add("venu");
		arr.add("mahesh");
		arr.add(null);
		arr.remove(2);
		for(String  s:arr) {
			System.out.println(s);
		}
	}

}
