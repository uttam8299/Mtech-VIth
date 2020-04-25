<%-- 
    Document   : Factorial
    Created on : 24 Apr, 2020, 8:44:15 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Factorial Program of given number using recursion</title>
    </head>
    
    <body>
        <%! 
        int fact(int n)
        {
          if(n==1)
              return 1;
          else
              return n*fact(n-1);
        }
        %>
        <% out.print("Factorial of number is : " + fact(5));%>
    </body>
</html>