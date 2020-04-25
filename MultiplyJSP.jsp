<%-- 
    Document   : MultiplyJSP
    Created on : 24 Apr, 2020, 11:00:37 AM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Multiplication of two integers</title>
    </head>
    <body>
    <%
      int a = 10;
      int b = 5;
      int multiply = a*b;
      out.print("Product of two numbers:" + multiply);
    %>
    </body>
</html>