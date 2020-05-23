import java.util.LinkedList;
import java.util.List;

public class LinkedListToArray {

  public static void main(String[] args) {

    List<String> theList = new LinkedList<String>();
    theList.add("A");
    theList.add("B");
    theList.add("C");
    theList.add("D");

    String[] my = theList.toArray(new String[theList.size()]);

    for (int i = 0; i < my.length; i++) {
      System.out.println(my[i]);
    }
  }
}
