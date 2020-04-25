<%-- 
    Document   : Expression_tag_use
    Created on : 24 Apr, 2020, 1:59:12 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expression Tag Use</title>
    </head>
    <body>
        
        <!--
         Use of Expression tag.
        It does not require semicolon after the java statement.
        -->
        <%= "Hii " + request.getParameter("username")%> 
        
    </body>
</html>
