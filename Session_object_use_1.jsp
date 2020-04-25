<%-- 
    Document   : Session_object_use
    Created on : 24 Apr, 2020, 2:46:56 PM
    Author     : Uttam Yadav
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>Session Object use</title>
    </head>
    <body>
     <%
     String name = request.getParameter("username");
     out.print("Hello " + name);
     session.setAttribute("user",name);
     %>
     <a href = "Session_object_use_2.jsp">
     Second page </a> 
    </body>
</html>
 