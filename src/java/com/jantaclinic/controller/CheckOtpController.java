
package com.jantaclinic.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
@WebServlet("/CheckOtpController")
public class CheckOtpController extends HttpServlet 
{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String otp=req.getParameter("otp");
        
        if (otp.equals(req.getSession().getAttribute("otp"))) 
        {
            resp.sendRedirect("UpdatePassword.jsp");
        }
         else
        {
            resp.setContentType("text/html");
            PrintWriter out=resp.getWriter();
            out.println("Wrong Password please try again<br>");
            out.println("<a href='checkotp.jsp'>Try Again</a>");
        }

    }
    

}
 