import java.util.Vector;

public class VectorDemo {

  public static void main(String args[]) {
    String data[] = { "Java", "Source", "and", "Support", "."};
    
    Vector v = new Vector();
    for (int i = 0, n = data.length; i < n; i++) {
      v.add(data[i]);
    }
    System.out.println(v);
    System.out.println("Contains Java?: " + v.contains("Java"));
    System.out.println("Contains Java2s?: " + v.contains("Java2s"));
    System.out.println("Where's and?: " + v.indexOf("and"));
    System.out.println("Where's Source?: " + v.indexOf("Source"));
    System.out.println("Where's Java from end?: "
        + v.lastIndexOf("Java"));
  }
}