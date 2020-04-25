import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PrimeSearcher extends HttpServlet implements Runnable {

  long lastprime = 0;                    // last prime found
  Date lastprimeModified = new Date();   // when it was found
  Thread searcher;                       // background search thread

  public void init(ServletConfig config) throws ServletException {
    super.init(config);                  // always!
    searcher = new Thread(this);
    searcher.setPriority(Thread.MIN_PRIORITY);  // be a good citizen
    searcher.start();
  }

  public void run() {
    long candidate = 1000000000000001L;  // one quadrillion and one
    while (true) {                       // search forever
      if (isPrime(candidate)) {
        lastprime = candidate;           // new prime
        lastprimeModified = new Date();  // new "prime time"
      }
      candidate += 2;                    // evens aren't prime
      try {
        searcher.sleep(200);
      } 
      catch (InterruptedException ignored) { }
    }
  }

  private static boolean isPrime(long candidate) {
    double sqrt = Math.sqrt(candidate);
    for (long i = 3; i <= sqrt; i += 2) {
      if (candidate % i == 0) return false;  
    }
    return true;
  }
  @Override 
  public void doGet(HttpServletRequest req, HttpServletResponse res) 
                               throws ServletException, IOException {
    res.setContentType("text/plain");
    PrintWriter out = res.getWriter();
    if (lastprime == 0) {
      out.println("Still searching for first prime...");
    }
    else {
      out.println("The last prime discovered was " + lastprime);
      out.println(" at " + lastprimeModified);
    }
  }

  public void destroy() {
    searcher.stop();
  }

  public long getLastModified(HttpServletRequest req) {
    return lastprimeModified.getTime() / 1000 * 1000;
  }
}
