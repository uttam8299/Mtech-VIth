class Wait {
  public static void oneSec() {
    try {
      Thread.currentThread().sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void manySec(long s) {
    try {
      Thread.currentThread().sleep(s * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

public class ThreadPause {
  public static void main(String args[]) {
    System.out.println("Wait one second");
    Wait.oneSec();
    System.out.println("Done\nWait five seconds");
    Wait.manySec(5);
    System.out.println("Done");
  }
}
