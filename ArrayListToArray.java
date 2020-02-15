// Converting an ArrayList to an Array 

import java.util.*;

class ArrayListToArray{
	public static void main(String args[]){
	 ArrayList<Integer> a1 = new ArrayList<Integer>();
	 a1.add(20);
	 a1.add(30);
	 a1.add(40);
	 a1.add(50);
 	 a1.add(60);
    
                  System.out.println("Contents of a1 is : " + a1);
	 Integer ai[] = new Integer[a1.size()];
	 ai = a1.toArray(ai);
 	 int sum = 0;
	 for(int i : ai)
	  sum+=i;
 	 System.out.println("Sum is :  " +sum);
 }
}
	 