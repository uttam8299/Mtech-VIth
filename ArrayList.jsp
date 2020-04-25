<%-- 
    Document   : Linear_search
    Created on : 24 Apr, 2020, 9:43:24 PM
    Author     : Uttam Yadav
--%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ArrayList Example</title>
    </head>
    <body>
        <% 
          ArrayList<Integer> arr = new ArrayList<Integer>();
        %>
        <% arr.add(23);
           arr.add(12);
           arr.add(5);
           arr.add(42);
           arr.add(16);
           out.print("Elements entered are : ");
           for(int x:arr)
           {
             out.print(x);
             out.print(" ");
           }
        %>
    </body>
</html>    
        
    

