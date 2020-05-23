import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<Integer> tSet = new TreeSet<Integer>();

    tSet.add(new Integer("1"));
    tSet.add(new Integer("2"));
    tSet.add(new Integer("3"));

    System.out.println(tSet);
    System.out.println("Was 2 removed from TreeSet ? " + tSet.remove(new Integer("2")));
    System.out.println(tSet);
  }
}