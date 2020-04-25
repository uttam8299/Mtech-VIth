<%-- 
    Document   : Table_generator
    Created on : 24 Apr, 2020, 11:49:24 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Table Generator</title>
    </head>
    <body>
        <% 
           int n = Integer.parseInt(request.getParameter("num"));
           for(int i = 1;i<=10;i++)
           {
             out.print(n + " * " + i + " = " + (n*i) + "<br>");
           }
        %>
    </body>
</html>
