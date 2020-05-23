import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
  public static void main(String[] args) {
    LinkedHashMap<String,Integer> lHashMap = new LinkedHashMap<String,Integer>();

    lHashMap.put("One", new Integer(1));
    lHashMap.put("Two", new Integer(2));

    // retrieve value using Object get(Object key) method of Java LinkedHashMap class

    Object obj = lHashMap.get("One");
    System.out.println(obj);
  }
}

 