import java.util.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class PageRefresh extends HttpServlet{


  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
    res.setContentType("text/plain");
    PrintWriter out = res.getWriter();

    res.setHeader("Refresh", "1");
    out.println(new Date().toString());
  }
}
