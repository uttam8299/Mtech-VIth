import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, int[]> map = new TreeMap<String, int[]>();

    int[] array = new int[3];
    array[0] = 0;
    array[1] = 1;
    array[2] = 2;
    map.put("array", array);

    Iterator<String> iter = map.keySet().iterator();

    while (iter.hasNext()) {
      String arrayName = iter.next();
      array = map.get(arrayName);
      System.out.print(arrayName + ":");
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
      }
      System.out.println();
    }
  }
}