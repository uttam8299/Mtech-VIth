<%-- 
    Document   : DateJsp
    Created on : 23 Apr, 2020, 6:20:54 PM
    Author     : Uttam Yadav
--%>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>

<html>
   <head>
      <title>Display Current Date & Time</title>
   </head>
   
   <body>
      <center>
         <h1>Display Current Date & Time</h1>
      </center>
      <%
         Date date = new Date();
         out.print( "<center>" +date.toString()+"</center>");
      %>
   </body>
</html>