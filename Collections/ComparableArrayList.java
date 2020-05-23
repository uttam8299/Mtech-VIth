import java.util.Set;
import java.util.TreeSet;

class Product implements Comparable<Product> {
  String prodName;

  int prodID;

  Product(String str, int id) {
    prodName = str;
    prodID = id;
  }

  public int compareTo(Product p2) {
    return prodName.compareToIgnoreCase(p2.prodName);
  }

  public boolean equals(Object p2) {
    return prodName.compareToIgnoreCase(((Product) p2).prodName) == 0;
  }
}

public class ComparableArrayList {
  public static void main(String args[]) {
    Set<Product> prodList = new TreeSet<Product>();

    prodList.add(new Product("A", 13546));
    prodList.add(new Product("B", 04762));
    prodList.add(new Product("C", 12221));
    prodList.add(new Product("D", 44387));

    for (Product p : prodList)
      System.out.printf("%-14s ID: %d\n", p.prodName, p.prodID);
  }
}
