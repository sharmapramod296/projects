
package com.jantaclinic.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
@WebServlet("/UpdatePasswordController")
public class UpdatePasswordController extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String newpassword=req.getParameter("newpassword");
        String confirmpassword=req.getParameter("confirmpassword");
        String email=(String)req.getSession().getAttribute("email");
        if (newpassword.equals(confirmpassword)) 
        {
        try 
        {
            Context context=new InitialContext();
            DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("update register set password=?,confirmpassword=? where email=?");
            preparedStatement.setString(1, newpassword);
            preparedStatement.setString(2, confirmpassword);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();
            connection.close();
            resp.sendRedirect("Login.jsp");
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
        }
        else
        {
            resp.setContentType("text/html");
            PrintWriter out=resp.getWriter();
            out.println("Wrong Password please try again<br>");
            out.println("<a href='UpdatePassword.jsp'>Try Again</a>");
        }
    }
}
