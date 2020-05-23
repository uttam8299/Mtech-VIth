public class ArraySizeDouble {
  public static void main(String args[]) {
    int a1[] = { 1, 2, 3, 4, 5 };
    int a2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("Original size: " + a1.length);
    System.out.println("New size: " + doubleArray(a1).length);
    System.out.println("Original size: " + a2.length);
    System.out.println("New size: " + doubleArray(a2).length);
  }

  static int[] doubleArray(int original[]) {
    int length = original.length;
    int newArray[] = new int[length * 2];
    System.arraycopy(original, 0, newArray, 0, length);
    return newArray;
  }
}