<%-- 
    Document   : Even
    Created on : 24 Apr, 2020, 3:16:03 PM
    Author     : Uttam Yadav
--%>

<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Even and Odd</title>
    </head>
    <body>
       <%
         int number = Integer.parseInt(request.getParameter("n"));
         if(number%2 == 0)
         {
             out.print(number + " is even.");
         }
       %>  
 
    </body>
</html>
