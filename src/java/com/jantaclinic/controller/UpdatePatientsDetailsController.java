
package com.jantaclinic.controller;

import com.jantaclinic.bean.UpdatePatient;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
@WebServlet("/UpdatePatientsDetailsController")
public class UpdatePatientsDetailsController extends HttpServlet
{
     UpdatePatient updatePatient=new UpdatePatient();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        updatePatient.setPatients_id(req.getParameter("id"));
        updatePatient.setName(req.getParameter("name"));
        updatePatient.setMessage(req.getParameter("message"));
        updatePatient.setPrescription(req.getParameter("prescription"));
        
        writeData();
        resp.sendRedirect("DisplayAppointments.jsp");
    }
    public void writeData()
    {
         try 
         {
             Context context= new InitialContext();
             DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
             Connection connection=dataSource.getConnection();
             PreparedStatement preparedStatement=connection.prepareStatement("insert into updatepatient values(?,?,?,?)");
             preparedStatement.setString(1, updatePatient.getPatients_id());
             preparedStatement.setString(2, updatePatient.getName());
             preparedStatement.setString(3, updatePatient.getMessage());
             preparedStatement.setString(4, updatePatient.getPrescription());
             preparedStatement.executeUpdate();
         }
         catch (Exception ex) 
         {
             System.out.println(ex);
         }
          
    }
    
}
