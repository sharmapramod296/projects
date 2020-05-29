
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Appointments</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        
           <style>

            #button
            {
                cursor: pointer;
                border: black solid 1px;
                width: 130px;
                padding: 5px;
                border-radius:5px;
            }
            #headingdiv
            {
                height: 150px;
                width: 100%;
                background-color: #2831BE;
                position: relative;
                border-bottom: greenyellow 4px solid;           
            }
            #brandname
            {
                position: absolute;
                top: 20px;
                left: 37%;
                color: white;
                font-size: 55px;
                border-bottom: greenyellow 1px solid;
            }
            #brandmoto
            {
                color: white;
                position: absolute;
                top: 95px;
                left: 650px;
            }
            #searchusersbyname
            {
                height: 40px;
                width: 200px;
                border: 2px solid greenyellow;
                outline: none;
                border-radius: 15px;
                position: absolute;
                top: 70%;
                right: 9.5%;
            }
            #exitusers
            {
                color: red;
                font-size: 20px;
                position: absolute;
                top: 7px;
                right: 30px;
                text-decoration: none;
                border: 1px solid red;
                padding: 3px;
                border-radius: 8px;
            }
            #brandimage
            {
                height: 150px;
                width: 150px;
                position: absolute;
                top: 10px;
                left: 80px;
            }
            #searchimage
            {
                height: 23px; 
                width: 23px;
            }
            #button1
            {
                position: absolute;
                top: 69%;
                right: 5.8%;
                outline: none;
                border: none;
            }
            #button2
            {
                position: absolute;
                top: 70%;
                right: 23.5%;
                outline: none;
                border: none;
            }
    
            #searchusersbydate
            {
                height: 40px;
                width: 200px;
                border: 2px solid greenyellow;
                outline: none;
                border-radius: 15px;
                position: absolute;
                top: 70%;
                right: 27%;
            }
            #updateddetails
            {
                border: 1px solid greenyellow;
                padding: 3px;
                border-radius: 5px;
                position: absolute;
                top: 10px;
                right: 100px;
                color: white;
            }
            #updateddetails:hover
            {
                text-decoration: none;
            }
        </style>
         <script>
            $(document).ready(function ()
            {
                $("#button").click(function()
                {
                    $("#allappointments").show();
                });
            });
        </script>
     
    </head>
    <body>
    
        <div id="headingdiv" class="container-fluid">
            <img src="images/doctors logo.gif" alt="image not found" id="brandimage"/>
            <h1 id="brandname"><span style="font-size: 65px;">J</span>anta clinic</h1>
            <p id="brandmoto">We care about your health</p>
            <div class="container">
              
                <form action="DisplayByNames.jsp">
                  <input type="text" name="name" placeholder="Patient's Name" id="searchusersbyname"/>
                  <button id="button1" type="submit" class="btn btn-success"><img src="images/search1.png" id="searchimage"></button>
                </form>
                  
                <form action="DisplayByDate.jsp">
                    <input type="date"  placeholder="date" name="date" id="searchusersbydate"/>
                  <button id="button2" type="submit" class="btn btn-success"><img src="images/search1.png" id="searchimage"></button>
                </form>
                 <a href="Home.jsp" id="exitusers">Exit</a>
                 <a href="DisplayUpdatedPatientsDetails.jsp" id="updateddetails">Updated details</a>      
            </div>
        </div>        
       <br>
      
    <sql:setDataSource
        driver="org.apache.derby.jdbc.ClientDriver"
        url="jdbc:derby://localhost:1527/JantaClinic"
        user="JantaClinic"
        password="JantaClinic"
        var="DataSource"/>
    <sql:query dataSource="${DataSource}" var="data">
        select * from appointments
    </sql:query> 
    <center>
        <table border="1">
            <th>Patient's_id</th>
            <th>Patient's Name</th>
            <th>Email</th>
            <th>Contact</th>
            <th>Message</th>
            <th>Patient's Image</th>
            <th>Clinic</th>
            <th>Date</th>
            <th>Delete</th>
            <th>Update details</th>
            
            <c:forEach items="${data.rows}" var="row">
                <tr>
                    <td>${row.Patients_id}</td>
                    <td>${row.name}</td>
                    <td>${row.email}</td>
                    <td>${row.contact}</td>
                    <td>${row.message}</td>
                    <td><img src="ImageServlet?name=${row.name}" height="100px" width="100px" alt="image not available"/></td>
                    <td>${row.clinic}</td>
                    <td>${row.date}</td>
                    <td><a href="DeletePatientController?id=${row.Patients_id}">Delete</a></td>
                    <td><a href="UpdatePatientsDetails.jsp?id=${row.Patients_id}">Update details</a></td>
                </tr>
            </c:forEach>
        </table>
        </center>
    </body>
</html>
