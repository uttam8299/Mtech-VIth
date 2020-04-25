<%-- 
    Document   : Welocme
    Created on : 24 Apr, 2020, 1:50:13 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Welcome </title>   
    </head>
    <body>
        
        <%
        String name = request.getParameter("username");
        out.print("Welcome " + name);
        %>
    </body>
</html>
