import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_ArrayList {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();

    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("C");
    arrayList.add("D");
    arrayList.add("E");
    
    Comparator comparator = Collections.reverseOrder();
    System.out.println(arrayList);

    Collections.sort(arrayList, comparator);
    System.out.println(arrayList);
  }
}