public class ThreadSleepDemo extends Thread {
  public void run() {
    Thread t = Thread.currentThread();
    String name = t.getName();

    System.out.println("entered loop() - " + name);

    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(200);
      } catch (InterruptedException x) {
        }

      System.out.println("name=" + name);
    }
    System.out.println("leave loop() - " + name);

  }

  public static void main(String[] args) {
    ThreadSleepDemo tt = new ThreadSleepDemo();
    tt.setName("thread");
    tt.start();

    // pause for a bit
    try {
      Thread.sleep(700);
    } catch (InterruptedException x) {
      // ignore
    }
  }
}
