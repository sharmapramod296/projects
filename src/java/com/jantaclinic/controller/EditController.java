
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

@WebServlet("/EditController")
public class EditController extends HttpServlet 
{
    RegisterData registerData=new RegisterData();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        registerData.setUsername(req.getParameter("name"));
        try 
        {
          Context context= new InitialContext();
          DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
          Connection connection=dataSource.getConnection();
          PreparedStatement preparedStatement=connection.prepareStatement("select username,email,password,confirmpassword,contact,address,gender,role from register where username=(?)");
          preparedStatement.setString(1,registerData.getUsername());
          ResultSet resultSet=preparedStatement.executeQuery();
             if (resultSet.next()) 
             {
                RegisterData registerData1=new RegisterData(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5), resultSet.getString(6), resultSet.getString(7),resultSet.getString(8));
                HttpSession httpSession=req.getSession();
                httpSession.setAttribute("registerData1", registerData1);
                resp.sendRedirect("Register.jsp");
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);        
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        registerData.setUsername(req.getParameter("username"));
        registerData.setEmail(req.getParameter("email"));
        registerData.setPassword(req.getParameter("password"));
        registerData.setConfirmpassword(req.getParameter("confirmpassword"));
        registerData.setContact(req.getParameter("contact"));
        registerData.setAddress(req.getParameter("address"));
        registerData.setGender(req.getParameter("gender"));
        updateData();
        HttpSession httpSession=req.getSession();
        httpSession.removeAttribute("registerData1");
        resp.sendRedirect("Home.jsp");
        
    }
    public void updateData()
  {
    try 
      {
        Context context= new InitialContext();
        DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
        Connection connection=dataSource.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("update register set email=?,password=?,confirmpassword=?,contact=?,address=?,gender=?,role=?  where username=?");
        preparedStatement.setString(1,registerData.getEmail());
        preparedStatement.setString(2,registerData.getPassword());
        preparedStatement.setString(3,registerData.getConfirmpassword());
        preparedStatement.setString(4,registerData.getContact());
        preparedStatement.setString(5,registerData.getAddress());
        preparedStatement.setString(6,registerData.getGender());
        preparedStatement.setString(7,"user");
        preparedStatement.setString(8,registerData.getUsername());
        preparedStatement.executeUpdate();
    } 
    catch (Exception e) 
     {
         System.out.println(e);
     }
    }
}
