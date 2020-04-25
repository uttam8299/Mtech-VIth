<%-- 
    Document   : Pattern_generator
    Created on : 25 Apr, 2020, 12:14:35 AM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pattern Generator</title>
    </head>
    <body>
        <%
           int number = Integer.parseInt(request.getParameter("num"));
           for(int i=1;i<=number;i++)
           {
               for(int j=1;j<=i;j++)
               {
                   out.print(i);
                   out.print(" ");
               }
               out.print("<br>");
           }
        %>
    </body>
</html>
