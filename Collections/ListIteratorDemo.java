import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo{

  public static void main(String[] args) {

    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("1");
    arrayList.add("2");
    arrayList.add("3");
    arrayList.add("4");
    arrayList.add("5");

    ListIterator itr = arrayList.listIterator();
    System.out.println("in forward direction");
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    System.out.println("in backward direction");
    while (itr.hasPrevious()) {
      System.out.println(itr.previous());
    }
  }
}