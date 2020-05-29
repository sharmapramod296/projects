
package com.jantaclinic.controller;

import com.jantaclinic.bean.RegisterData;
import com.jantaclinic.others.Test;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet
{
    RegisterData registerData=new RegisterData();
@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        registerData.setUsername(req.getParameter("username"));
        registerData.setEmail(req.getParameter("email"));
        registerData.setPassword(req.getParameter("password"));
        registerData.setConfirmpassword(req.getParameter("confirmpassword"));
        registerData.setContact(req.getParameter("contact"));
        registerData.setAddress(req.getParameter("address"));
        registerData.setGender((req.getParameter("gender")));
        
        HttpSession httpSession=req.getSession();
        httpSession.setAttribute("registerData", registerData);
        
        Cookie ck1=new Cookie("username", registerData.getUsername());
        Cookie ck2=new Cookie("email", registerData.getEmail());
        Cookie ck3=new Cookie("password",registerData.getPassword());
        Cookie ck4= new Cookie("confirmpassword",registerData.getConfirmpassword());
        Cookie ck5=new Cookie("Contact",registerData.getContact());
        Cookie ck6=new Cookie("address", registerData.getContact());
        
        ck1.setMaxAge(60);
        ck2.setMaxAge(60);
        ck3.setMaxAge(60);
        ck4.setMaxAge(60);
        ck5.setMaxAge(60);
        ck6.setMaxAge(60);
        
        resp.addCookie(ck1);
        resp.addCookie(ck2);
        resp.addCookie(ck3);
        resp.addCookie(ck4);
        resp.addCookie(ck5);
        resp.addCookie(ck6);
        
        if (registerData.getPassword().equals(registerData.getConfirmpassword())) 
        {
           writeData();  
           resp.sendRedirect("Login.jsp");
           Test test=new Test(registerData.getEmail(), "welcome to Janta Clinic", "Janta Clinic welcomes you, we care about your health");
            try 
            {
                test.sendEmail();
            }
            catch (Exception ex) 
            {
                Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            resp.sendRedirect("Register.jsp");
        }
        
    }
    public void writeData()
    {
        try 
        {
            Context context= new InitialContext();
            DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into register values(?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, registerData.getUsername());
            preparedStatement.setString(2, registerData.getEmail());
            preparedStatement.setString(3, registerData.getPassword());
            preparedStatement.setString(4, registerData.getConfirmpassword());
            preparedStatement.setString(5, registerData.getContact());
            preparedStatement.setString(6, registerData.getAddress());
            preparedStatement.setString(7, registerData.getGender());
            preparedStatement.setString(8, "user");
            preparedStatement.executeUpdate();
            connection.close();
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
         try 
        {
            String id=req.getParameter("id");
            String val=req.getParameter("val");
            Context context=new InitialContext();
            DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("select * from register where "+id+"='"+val+"'");
            ResultSet resultSet=preparedStatement.executeQuery();
            
            PrintWriter out=resp.getWriter();
            if (resultSet.next()) 
            {
                out.print(id+" is already exist!!!");
            }
            else
            {
                System.out.println("");
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

