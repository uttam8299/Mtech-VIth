<%-- 
    Document   : Subtract_user_values
    Created on : 24 Apr, 2020, 12:32:35 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Subtraction of two numbers using user's input</title>
    </head>
    <body>
        <%
        out.print("Difference of numbers :"+
                (Integer.parseInt(request.getParameter("t1"))
             - Integer.parseInt(request.getParameter("t2"))));
        %>
        
    </body>
    
    
    
    
    
</html>