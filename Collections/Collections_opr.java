import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collections_opr {

  public static void main(String args[]) {

    List<Character> ll = new LinkedList<Character>();

    for (char n = 'A'; n <= 'F'; n++)
      ll.add(n);

    System.out.println("Here is the original list: ");
    for (Character x : ll)
      System.out.print(x + " ");
    Collections.reverse(ll);
    System.out.println();

    System.out.println("Here is the reversed list: ");
    for (Character x : ll)
      System.out.print(x + " ");
    Collections.rotate(ll, 2);
    System.out.println();
    for (Character x : ll)
      System.out.print(x + " ");

    Collections.shuffle(ll);
    System.out.println();

    System.out.println("Here is the randomized list:");
    for (Character x : ll)
      System.out.print(x + " ");
  }
}
