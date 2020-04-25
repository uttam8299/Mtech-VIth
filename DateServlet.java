/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Uttam Yadav
 */
import java.io.*;
import javax.servlet.*;

public class DateServlet extends GenericServlet{

public void service(ServletRequest request,ServletResponse response) throws IOException,ServletException{
response.setContentType("text/html");
PrintWriter pw = response.getWriter();
java.util.Date date = new java.util.Date();
pw.println("<h2>" + "Current Date and Time: " + date.toString()+"</h2>");
pw.close();
}
}