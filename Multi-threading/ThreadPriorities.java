class PriThread extends Thread {

  PriThread(String name, int pri) {
    super(name);
    setPriority(pri);
    start();
  }

  public void run() {
    System.out.println(getPriority());
  }
}

public class ThreadPriorities {
  public static void main(String args[]) throws Exception {
    PriThread mt2 = new PriThread("Low Priority", Thread.NORM_PRIORITY - 1);
    PriThread mt1 = new PriThread("High Priority", Thread.NORM_PRIORITY + 1);
    mt1.join();
    mt2.join();

  }
}