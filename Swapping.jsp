<%-- 
    Document   : Swapping
    Created on : 24 Apr, 2020, 11:31:23 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Swapping of two numbers</title>
    </head>
    <body>
        <%
           int num1 = Integer.parseInt(request.getParameter("a"));
           int num2 = Integer.parseInt(request.getParameter("b"));
           int temp = num1;
           num1 = num2;
           num2 = temp;
           out.print("Value of <b>a</b> after swapping : " + num1 + "<br>");
           out.print("Value of <b>b</b> after swapping : " + num2);
        %>
    </body>
</html>
