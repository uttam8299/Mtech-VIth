<%-- 
    Document   : Max_main
    Created on : 25 Apr, 2020, 12:41:44 AM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Max_min</title>
    </head>
    <body>
        <%
           int num1 = Integer.parseInt(request.getParameter("number1"));
           int num2 = Integer.parseInt(request.getParameter("number2"));
           if(num1>num2)
           {
              out.print("Maximum Number : "+num1 + "<br>");
              out.print("Minimum Number : "+num2);
           }
           else{
              out.print("Maximum Number : " +num2 + "<br>");
              out.print("Minimum Number : "+num1);
           }
        %>
    </body>
</html>
