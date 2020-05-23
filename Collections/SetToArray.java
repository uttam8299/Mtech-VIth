import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetToArray {
  public static void main(String[] argv) {
    // Create the sorted set
    Set<String> set = new TreeSet<String>();

    set.add("b");
    set.add("c");
    set.add("a");

    Iterator it = set.iterator();
    while (it.hasNext()) {

      Object element = it.next();
      System.out.println(element);
    }

    // Create an array containing the elements in a set
    String[] array = (String[]) set.toArray(new String[set.size()]);
    Arrays.toString(array);
  }
}
