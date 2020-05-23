import java.util.Stack;

public class StackDemo {

  public static void main(String[] args) {
    Stack stack = new Stack();
    for (int i = 0; i < 5; i++)
      stack.push(new Integer(i));
    System.out.println("stack = " + stack);
    // Treating a stack as a Vector:
    stack.addElement("The last line");
    System.out.println("element 5 = " + stack.elementAt(5));
    System.out.println("popping elements:");
    while (!stack.empty())
      System.out.println(stack.pop());
  }
}