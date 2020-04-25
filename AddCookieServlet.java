import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddCookieServlet extends HttpServlet
{
 public void doPost(HttpServletRequest request,
         HttpServletResponse response)
          throws ServletException,IOException
  {
      String data = request.getParameter("data");
      Cookie cookie = new Cookie("MyCookie",data);
      response.addCookie(cookie);
      response.setContentType("text/html");
      PrintWriter pw = response.getWriter();
      pw.println("<b>My cookie has been set to :" + data);
      pw.close();  
  }
}
