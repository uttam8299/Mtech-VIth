import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetCookieServlet extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response)
          throws ServletException,IOException
  {
      String data = request.getParameter("data");
      Cookie[] cookies = request.getCookies();
      response.setContentType("text/html");
      PrintWriter pw = response.getWriter();
      pw.println("<b>");
      for(int i=0;i<cookies.length;i++)
      {
          String name = cookies[i].getName();
          String value = cookies[i].getValue();
          pw.println("name = " + name);
          pw.println("value = " + value);
      }
      pw.close();  
  }
}
