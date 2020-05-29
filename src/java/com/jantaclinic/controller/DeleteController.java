
package com.jantaclinic.controller;

import com.jantaclinic.bean.RegisterData;
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
@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet 
{
     RegisterData registerData =new RegisterData();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
         registerData.setUsername(req.getParameter("name"));
        deleteData();
        resp.sendRedirect("DisplayUsers.jsp");
    }
        
        public void deleteData()
        {
         try 
        {
            Context context=new InitialContext();
            DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("delete from register where username=?");
            preparedStatement.setString(1, registerData.getUsername());
            preparedStatement.executeUpdate();
            connection.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
   }
}
            
        
  

