import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList_to_HashSet {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<String>();
    myList.add("A");
    myList.add("B");
    myList.add("C");
    myList.add("D");

    Set<String> mySet = new HashSet<String>(myList);

    for (Object theFruit : mySet)
      System.out.println(theFruit);
  }
}