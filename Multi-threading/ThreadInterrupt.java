class interruptThread implements Runnable {
  public void run() {
    System.out.println(Thread.currentThread().getName() + " starting.");
    try {
      Thread.sleep(30000);
      for (int i = 1; i < 10; i++) {
        if (Thread.interrupted()) {
          System.out.println("interrupted.");
          break;
        }
        System.out.print(".");
        for (long x = 0; x < 1000; x++)
          System.out.println("/");
      }
    } catch (Exception exc) {
      System.out.println(Thread.currentThread().getName() + " interrupted.");
    }
    System.out.println(Thread.currentThread().getName() + " exiting.");
  }
}

public class ThreadInterrupt {
  public static void main(String args[]) throws Exception {
    Thread thrd = new Thread(new MyThread(), "MyThread #1");
    Thread thrd2 = new Thread(new MyThread(), "MyThread #2");
    thrd.start();
    Thread.sleep(1000);
    thrd.interrupt();
    thrd2.start();
    Thread.sleep(4000);
    thrd2.interrupt();
  }
}