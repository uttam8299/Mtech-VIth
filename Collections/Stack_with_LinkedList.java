import java.util.LinkedList;

public class Stack_with_LinkedList {

  private LinkedList list = new LinkedList();

  public void push(Object v) {
    list.addFirst(v);
  }

  public Object top() {
    return list.getFirst();
  }

  public Object pop() {
    return list.removeFirst();
  }

  public static void main(String[] args) {
    Stack_with_LinkedList stack = new Stack_with_LinkedList();
    for (int i = 0; i < 10; i++)
      stack.push(new Integer(i));
    System.out.println(stack.top());
    System.out.println(stack.top());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}