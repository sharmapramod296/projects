
package com.jantaclinic.controller;

import com.jantaclinic.bean.AppointmentData;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.sql.DataSource;
@WebServlet("/MakeAnAppointmentController")
@MultipartConfig(maxFileSize = 9999999l)
public class MakeAnAppointmentController extends HttpServlet
{
    AppointmentData appointmentData=new AppointmentData();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    { 
        appointmentData.setName(req.getParameter("name"));
        appointmentData.setEmail(req.getParameter("email"));
        appointmentData.setContact(req.getParameter("contact"));
        appointmentData.setMessage(req.getParameter("message"));
        appointmentData.setClinic(req.getParameter("clinic"));
        appointmentData.setDate(req.getParameter("date"));
        
        Part part= req.getPart("image");
        InputStream inputStream=part.getInputStream();
       
        
        try 
        {
            Context context=new InitialContext();
            DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into appointments (name,email,contact,message,photo,clinic,date) values(?,?,?,?,?,?,?)");
            preparedStatement.setString(1, appointmentData.getName());
            preparedStatement.setString(2, appointmentData.getEmail());
            preparedStatement.setString(3, appointmentData.getContact());
            preparedStatement.setString(4, appointmentData.getMessage());
            preparedStatement.setBlob(5, inputStream);
            preparedStatement.setString(6, appointmentData.getClinic());
            preparedStatement.setString(7, appointmentData.getDate());
            preparedStatement.executeUpdate();
            connection.close();
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        resp.sendRedirect("Home.jsp");
        }
    }
     

