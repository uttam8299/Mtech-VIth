import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet_context extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext sc = getServletContext();
        out.println(sc.getInitParameter("driverName"));   
    }
}