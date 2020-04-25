<%-- 
    Document   : Response_object_use
    Created on : 24 Apr, 2020, 2:26:18 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Response Object use</title>
    </head>
    <body>
        <!--
        Response object can be used to add or manipulate response
        such as redirect response to another resource, send error etc.
        -->
        <%
        response.sendRedirect("http://www.iips.edu.in");
        %>
    </body>
</html>
