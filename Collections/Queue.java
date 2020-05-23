     
public class Queue {
  private int maxSize;

  private long[] queArray;

  private int front;

  private int rear;

  private int nItems;

  public Queue(int s) {
    maxSize = s;
    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  //   put item at end of a queue
  public void insert(long j) {
    if (rear == maxSize - 1) // deal with wraparound
      rear = -1;
    queArray[++rear] = j; // increment rear and insert
    nItems++; 
  }

  //   take item from front of queue
  public long remove() {
    long temp = queArray[front++]; // get value and incr front
    if (front == maxSize) // deal with wraparound
      front = 0;
    nItems--; // one less item
    return temp;
  }

  public long peekFront() {
    return queArray[front];
  }

  public boolean isEmpty() {
    return (nItems == 0);
  }

  public boolean isFull() {
    return (nItems == maxSize);
  }

  public int size() {
    return nItems;
  }

  public static void main(String[] args) {
    Queue theQueue = new Queue(5); // queue holds 5 items

    theQueue.insert(10);
    theQueue.insert(20);
    theQueue.insert(30);
    theQueue.insert(40);

    theQueue.remove(); 
    theQueue.remove(); 
    theQueue.remove();

    theQueue.insert(50); 
    theQueue.insert(60); //    (wraps around)
    theQueue.insert(70);
    theQueue.insert(80);

    while (!theQueue.isEmpty()) {
      long n = theQueue.remove(); // (40, 50, 60, 70, 80)
      System.out.print(n);
      System.out.print(" ");
    }
    System.out.println("");
  }
}