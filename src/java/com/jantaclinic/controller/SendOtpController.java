
package com.jantaclinic.controller;

import com.jantaclinic.others.Test;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
@WebServlet("/SendOtpController")
public class SendOtpController extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String email=req.getParameter("email");
        try 
        {
          Context context= new InitialContext();
          DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
          Connection connection=dataSource.getConnection();
          PreparedStatement preparedStatement=connection.prepareStatement("select * from register where email=?");
          preparedStatement.setString(1, email);
            ResultSet resultSet=preparedStatement.executeQuery();
            
            if (resultSet.next()) 
            {
                Random random=new Random();
                int n=random.nextInt(8999)+1000;
                
                Test test=new Test(email, "otp number", "otp number:-"+n);
                test.sendEmail();
                
                HttpSession httpSession=req.getSession();
                httpSession.setAttribute("otp", n+"");
                httpSession.setAttribute("email", email);
                
                resp.sendRedirect("CheckOtp.jsp");
            }
            else
            {
                PrintWriter out=resp.getWriter();
                out.println("please enter correct email address");
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
     
}
