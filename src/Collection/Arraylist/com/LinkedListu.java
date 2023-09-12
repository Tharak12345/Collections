package Collection.Arraylist.com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListu {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(5);
		list.add(2,2);
		list.add(10);
		/*
		 * for(int rei:list) { System.out.println(rei); }
	
		 */
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
		    Integer msg = it.next();
		    System.out.println(msg);
		}
	}

}
