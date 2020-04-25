import javax.servlet.http.*;

public class SessionCounter implements HttpSessionListener {

    private static int sessionCount; 
    
    public int getActiveSession()
    {
        return sessionCount;
    }
   
    public void sessionCreated(HttpSessionEvent e) 
    {   
        sessionCount++;  
    }

    public void sessionDestroyed(HttpSessionEvent e) 
    {
        sessionCount--;
    }
}