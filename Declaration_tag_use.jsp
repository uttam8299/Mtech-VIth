<%-- 
    Document   : Declaration_tag_use
    Created on : 24 Apr, 2020, 2:13:45 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            int square(int n)
            {
               return n*n;
            } 
        %>
        <% 
        out.print("Square of number is :" + square(3));
        %>
        
    </body>
</html>
