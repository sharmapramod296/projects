
package com.jantaclinic.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
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
import javax.sql.DataSource;
@WebServlet("/ImageServlet")
public class ImageServlet extends HttpServlet
{
 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String name=req.getParameter("name");
        try 
        {
            Context context=new InitialContext();
            DataSource dataSource=(DataSource)context.lookup("jdbc/myDatasource");
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("select photo from appointments where name=?");
            preparedStatement.setString(1, name);
            ResultSet resultSet=preparedStatement.executeQuery();
            byte arr[]=null;
            if (resultSet.next()) 
            {
                Blob blob=resultSet.getBlob("photo");
                arr=blob.getBytes(1, (int)blob.length());
            }
            connection.close();
            OutputStream outputStream=resp.getOutputStream();
            outputStream.write(arr);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
