//Program which randomly selects a site among given sites

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SiteSelector extends HttpServlet {
  Vector sites = new Vector();
  Random random = new Random();

  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    sites.addElement("http://www.google.com");
    sites.addElement("http://www.yahoo.com");
    sites.addElement("http://www.youtube.com");
    sites.addElement("http://www.facebook.com");
  }
  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    int siteIndex = Math.abs(random.nextInt()) % sites.size();
    String site = (String)sites.elementAt(siteIndex);

    res.setStatus(res.SC_MOVED_TEMPORARILY);
    res.setHeader("Location", site);
  }
}
