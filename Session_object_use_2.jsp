<%-- 
    Document   : Session_object_use_2
    Created on : 24 Apr, 2020, 2:52:43 PM
    Author     : Uttam Yadav
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>Session Object Use</title>
    </head>
    <body>
     <%
     String name =(String)session.getAttribute("user");
     out.print("Welcome back..." + name);
     %>
    </body>
</html>
