
package com.jantaclinic.controller;

import com.jantaclinic.bean.RegisterData;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet
{
     RegisterData registerData=new RegisterData();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        registerData.setUsername(req.getParameter("username"));
        registerData.setPassword(req.getParameter("password"));
        
        try 
        {
            Context context=new InitialContext();
            DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("select password,role from register where username=?");
            preparedStatement.setString(1, registerData.getUsername());
            ResultSet resultSet=preparedStatement.executeQuery();
            
            if (resultSet.next()) 
            {
                String password=resultSet.getString(1);
                String role=resultSet.getString(2);
                if (password.equals(registerData.getPassword())) 
                {
                    HttpSession httpSession=req.getSession();
                    httpSession.setAttribute("role", role);
                    resp.sendRedirect("MakeAnAppointment.jsp");
                    
                    HttpSession httpSession1=req.getSession();
                    httpSession1.setAttribute("username", registerData.getUsername());
                }
            }
            else
            {
                resp.sendRedirect("WrongIdOrPassword.jsp");
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
