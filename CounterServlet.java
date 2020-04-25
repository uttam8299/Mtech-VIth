
/**
 *
 * @author Uttam Yadav
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet extends HttpServlet
{
     
     private int iHitCounter;

     public void init() throws ServletException
     {
          iHitCounter = 0;
     }
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
     {
          PrintWriter out =  response.getWriter();
          out.println("<form><fieldset style='width:15%'>");
          out.println("<h3>Welcome to my website !</h3><hr>");
          out.println("You are visitor number: "+ (++iHitCounter));
          out.println("</fieldset></form>");
     }
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
     {
          doGet(request, response);
     }
}