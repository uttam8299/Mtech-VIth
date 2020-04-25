<%-- 
    Document   : HashSet
    Created on : 24 Apr, 2020, 10:39:47 PM
    Author     : Uttam Yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HashSet Program</title>
    </head>
    <body>
        <%
           HashSet<String> hs = new HashSet<String>();
           hs.add("Welocme");
           hs.add("to");
           hs.add("HashSet");
           hs.add("with");
           hs.add("JSP");
           out.print("Entered elements in HashSet are : ");
           out.print(hs);
        %>
    </body> 
</html>