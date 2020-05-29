
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link href="headercss.css" rel="stylesheet" type="text/css"/>
        <style>
           #makeanappointmentheaderlink
            {
                font-size: 15px ;
                font-weight: bold; 
                color: white;
                position: absolute;
                top: 8px;
                left: 0px;
                
            }
            #makeanappointmentheaderlink:hover
            {
                color: greenyellow;
                text-decoration: none;
            }
            #bigimagename
            {
                position: absolute;
                top: 50px; 
                left: 400px;
                font-weight: bold;
                font-size: 30px;
                color: #2831BE;
                 
            }
            #doctors
            {
                position: absolute;
                top: 90px;
                left: 400px;
                font-weight: bold;
                font-size: 16px;
                color: #09407B;
               
            }
            #doctorsname
            {
                font-weight: normal;
               
            }
        </style>
    </head>
  
    
    <body>
        

        <div class="container-fluid" style="height: 40px; width: 120%; background-color: #2831BE">
            <div class="container-fluid" style="height: 40px; width: 200px; position: absolute; left: 250px;">
                <a href="MakeAnAppointment.jsp"  id="makeanappointmentheaderlink">Make An Appointment</a>
            </div>
            <div class="container-fluid" style="height: 40px; width: 170px; background-color: red; position: absolute; right: 80px;">
                <p style="color: white; font-size: 0.75em;"><strong>Emergency Number:</strong>022-2812 9018</p>
            </div>
        </div>
        
        <div class="container-fluid" id="icon">
            <a href="Home.jsp"><img src="images/doctors logo.gif" id="doctorslogo"/></a>
            <p id="name">Janta Clinic</p>
        </div> 
        
        <div class="container-fluid" style="height: 80px; width: 100%; background-color: white; position: absolute; top: 40px">
            
            <div class="container" id="addressone">
            <p id="addressonedetails"><strong>Clinic one: </strong>Ekta Chawl, Near Neelkamal Naka,Kashmira Dongri,Mira Road(East)</p>    
            </div>
            
            <div class="container" id="addresstwo">
            <p id="addresstwodetails"><strong>Clinic two: </strong>Goyal Plaza, Shop no:08, Opp.Shiwar Garden, Mira Road(East)</p>    
            </div>
            
            <div class="container" id="email">
                <p style="color: black; opacity: 0.8" ><strong>Email: </strong>jantaclinic1010@gmail.com</p>
            </div>
            
            <c:if test="${role==null}">          
            <div class="container-fluid" id="navbar">
                <nav>
                    <a href="Home.jsp" id="navbarelements">Home</a>
                    <a href="AboutUs.jsp" id="navbarelements">About us</a>
                    <a href="Register.jsp" id="navbarelements">Register</a>
                    <a href="Login.jsp" id="navbarelements">Login</a>
                </nav>
            </div>
            </c:if>
            <c:if test="${role!=null}">          
            <div class="container-fluid" id="navbar">
                <nav>
                    <a href="Home.jsp" id="navbarelements">Home</a>
                    <a href="AboutUs.jsp" id="navbarelements">About us</a>.
                     <a href="EditController?name=${username}" id="navbarelements">Edit profile</a>
                    <c:if test="${role=='admin'}">
                    <a href="DisplayUsers.jsp" id="navbarelements">Display</a>
                    <a href="DisplayAppointments.jsp" id="navbarelements">Patients</a>
                    </c:if>
                    <a href="Login.jsp" id="navbarelements">Logout</a>
                </nav>
            </div>
            </c:if>
        </div>
        
        <div class="container">
            <img src="images/medical-doctor-stethoscope-and-office-sign-web-header.jpg" alt="image not found" id="bigimage"/>
            <div style="height: 400px; position: absolute; top :160px; width: 100%;">
                <p id="bigimagename">Welcome To Janta Clinic</p>
                <ul id="doctors">
                    <li >Dr. Parvez Shaikh<span id="doctorsname">(M.D, B.A.M.S, C.C.H, C.G.O)</span></li>
                    <li >Dr. Sonal Shaikh<span id="doctorsname">(B.A.M.S, C.C.H, C.G.O)</span></li>
                </ul>
            </div>
        </div>
        <div  class="container-fluid" id="one">
            <p><center><Strong>Working hours</Strong></center></p>
            <table class="table">
              <thead>
              </thead>
              <tbody>
                <tr>
                  <th scope="row"> </th>
                  <td>Monday-Friday</td>
                  <td>5.15 pm to 11.00 pm</td>
                  <td>Clinic one</td>
                </tr>
                <tr>
                  <th scope="row"> </th>
                  <td>Monday-Friday</td>
                  <td>10.30 pm to 2.30 pm</td>
                  <td>Clinic two</td>
                </tr>
                <tr>
                  <th scope="row"> </th>
                  <td>Monday-Friday</td>
                  <td>6.45 pm to 10.30pm</td>
                  <td>Clinic two</td>
                </tr>
              </tbody>
            </table>
        </div>
        
        <div class="container-fluid" id="two">
             <p><strong><center>Appointments</center></strong></p>
             <p><center>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</center></p>
        <center><button type="button" class="btn btn-success"><a href="MakeAnAppointment.jsp" style="color: black; text-decoration: none;">Make An Appointment</a></button></center>
        </div>
        
          <div class="container-fluid" id="three">
             <p><strong><center>Emergency cases</center></strong></p>
             <p><strong><center>022-2812 9018</center></strong></p>
             <p><center>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</center></p>
            
        </div>
    </body>
</html>
