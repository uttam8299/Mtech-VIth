public class ThreadPriority extends Thread {
  private int countDown = 5;
  private volatile double d = 0; // No optimization
  public ThreadPriority(int priority) {
    setPriority(priority);
    start();
  }
  public String toString() {
    return super.toString() + ": " + countDown;
  }
  public void run() {
    while(true) {
      // An expensive, interruptable operation:
      for(int i = 1; i < 100000; i++)
        d = d + (Math.PI + Math.E) / (double)i;
      System.out.println(this);
      if(--countDown == 0) return;
    }
  }
  public static void main(String[] args) {
    new ThreadPriority(Thread.MAX_PRIORITY);
    for(int i = 0; i < 5; i++)
      new ThreadPriority(Thread.MIN_PRIORITY);
  }
}