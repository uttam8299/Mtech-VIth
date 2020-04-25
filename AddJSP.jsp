<%-- 
    Document   : AddJSP
    Created on : 24 Apr, 2020, 9:40:43 AM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Addition of two numbers</title>
    </head>
    
    <body>
        <%
        int a = 10;
        int b = 15;
        int sum = a+b;
        out.print("Sum of two number is : " +sum  );  
        %>
    </body>
</html>
