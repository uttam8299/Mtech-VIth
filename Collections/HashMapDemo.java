import java.util.HashMap;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap<String,String> hMap = new HashMap<String,String>();

    hMap.put("1", "One");
    hMap.put("2", "Two");
    hMap.put("3", "Three");

    Object obj = hMap.remove("2");
    System.out.println(obj + " Removed from HashMap");
  }
}
