import java.text.Format;

public class TriangularArray {
public static void main(String[] args) {
    final int MAX_HIGH = 10;

    // allocate triangular array
    int[][] odds = new int[MAX_HIGH + 1][];
    for (int i = 0; i <= MAX_HIGH; i++)
      odds[i] = new int[i + 1];

    // fill triangular array
    for (int i = 0; i < odds.length; i++)
      for (int j = 0; j < odds[i].length; j++)
        odds[i][j] = i+j;

    // print triangular array
    for (int i = 0; i < odds.length; i++) {
      for (int j = 0; j < odds[i].length; j++){
        System.out.print(odds[i][j] + " ");  
      }
      System.out.println();
      
    }
  }
}
           
   
