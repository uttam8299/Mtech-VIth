import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet_config extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
       
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletConfig sc = getServletConfig();
        out.println(sc.getInitParameter("email")); 
    }
}