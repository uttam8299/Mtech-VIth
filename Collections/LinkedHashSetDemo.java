import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
  public static void main(String[] args) {
    LinkedHashSet<Integer> lhashSet = new LinkedHashSet<Integer>();
    
    lhashSet.add(new Integer("1"));
    lhashSet.add(new Integer("2"));
    lhashSet.add(new Integer("3"));

    System.out.println(lhashSet);

    boolean blnRemoved = lhashSet.remove(new Integer("2"));

    System.out.println(blnRemoved);
    System.out.println(lhashSet);
  }
}

   