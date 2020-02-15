import java.util.*;

class ArrayListDemo{
	public static void main(String args[]){
	 ArrayList<String> a1 = new ArrayList<String>();  //Creating an ArrayList
	 System.out.println("Initial Size of ArrayList a1 is: " + a1.size());
	 a1.add("Adam");
	 a1.add("Watson");
	 a1.add("Smith");
	 System.out.println("Size of ArrayList a1 after addition of elements is :" + a1.size());
	 System.out.println("Content of a1 is : " + a1);
                   a1.remove("Adam");
	 a1.remove(1);
 	 System.out.println("Size of a1 after deletion is : " + a1.size());
 	 System.out.println("Content of a1 after deletion is : " + a1); 
 }
}