<%-- 
    Document   : IF_ELSE
    Created on : 24 Apr, 2020, 8:38:21 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IF_ELSE STATEMENT</title>
    </head>
    <body>
        <%! int n = 10; %>
        <%
        if(n%2==0)
        {
           out.print(n + " is even.");
        }
        else
        {
          out.print(n + " is odd");
        }
        %>
    </body>
</html>
