
package com.jantaclinic.controller;

import com.jantaclinic.bean.AppointmentData;
import java.io.IOException;
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
@WebServlet("/DeletePatientController")
public class DeletePatientController extends HttpServlet
{
     AppointmentData appointmentData=new AppointmentData();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        appointmentData.setPatients_id(req.getParameter("id"));
        deleteData();
        resp.sendRedirect("DisplayAppointments.jsp");
    }
        
        public void deleteData()
        {
         try 
        {
            Context context=new InitialContext();
            DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("delete from appointments where Patients_id=?");
            preparedStatement.setString(1, appointmentData.getPatients_id());
            preparedStatement.executeUpdate();
            connection.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
