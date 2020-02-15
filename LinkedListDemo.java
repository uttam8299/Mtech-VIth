// Program to implement LinkedList

import java.util.*;

class LinkedListDemo{
	public static void main(String args[]){
	 LinkedList<String> ll = new LinkedList<String>();
	 
	ll.add("F");
	ll.add("B");
	ll.add("D");
	ll.add("E");
	ll.add("C");
	ll.addLast("Z");
	ll.addFirst("A");
	ll.add(1,"A2");

 	System.out.println("Original Contents of ll are : " + ll);
	
	ll.remove("F");
	ll.remove(2);

 	System.out.println("Contents of ll are  : " + ll);
	ll.removeFirst();
	ll.removeLast();
	System.out.println("ll after removing the first and last element :" + ll);
	
 	String val = ll.get(2);
	ll.set(2,val + "Changed");
	
	System.out.println("ll after change " + ll);
 }
}