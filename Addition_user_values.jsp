<%-- 
    Document   : Addtion_user_values
    Created on : 24 Apr, 2020, 12:05:49 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Addition with user values</title>
    </head>
    
     <% out.print("Sum : "+(Integer.parseInt(request.getParameter("t1"))
              +Integer.parseInt(request.getParameter("t2"))));
       %>
</html>
