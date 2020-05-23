import java.util.Stack;

public class StackExample {
  public static void main(String args[]) {
    Stack s = new Stack();
    s.push("Java");
    s.push("Source");
    s.push("and");

    System.out.println("Next: " + s.peek());
    s.push("Support");
    System.out.println(s.pop());
    s.push(".");
    int count = s.search("Java");
    while (count != -1 && count > 1) {
      s.pop();
      count--;
    }
    System.out.println(s.pop());
    System.out.println(s.empty());
  }
}

           
      