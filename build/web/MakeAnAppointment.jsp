
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Make An Appointment</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
          <link href="MakeAnAppointmentCss.css" rel="stylesheet" type="text/css"/>
          <script>
           $(document).ready(function ()
           {
               $("#close").click(function ()
               {
                   $("#makeanappointmentmain").hide(1000);
               });
           });
        </script>
    </head>
    <body>
        <c:if test="${role==null}">
            <script>
               <jsp:forward page="Login.jsp"></jsp:forward>
            </script>
        </c:if >
         
        <c:if test="${role!=null}">
        <jsp:include page="Home.jsp"></jsp:include>
        <div class="container-fluid">
            <div class="container-fluid" id="makeanappointmentmain">
          <center>
                <div id="makeanappointmentcontent">
                    <div id="titlediv">
                          <p style="background-color: #2831BE;height:40px;"id="title">Make an Appointment</p>
                          <div id="close">+</div>
                      </div>
                    
                    <form action="MakeAnAppointmentController" method="post" enctype="multipart/form-data">
                        <table>
                            <tr>
                                <td><input type="text" name="name" placeholder="Patient's name" /></td>
                            </tr>
                            <tr>
                                <td><input type="email" name="email" placeholder="Email" /></td>
                            </tr>
                            <tr>
                                <td><input type="text" name="contact" placeholder="Contact number" /></td>
                            </tr>
                            <tr>
                                <td><textarea rows="3" cols="22" placeholder="Message" name="message"></textarea></td>
                            </tr>
                            <tr>
                                <td style="color: black;"><input type="file" name="image" accept="image\*" placeholder="image of the patient">
                            <short style="color: black; font-size: 0.8em;">Photo of the patient(not mandatory)</short>
                                </td>
                            </tr>
                            <tr>
                                <td style="color: black;">
                                    Clinic one:<input type="radio" name="clinic" value="Clinic one" />
                                    Clinic two:<input type="radio" name="clinic" value="Clinic two" />
                                </td>
                            </tr>
                            <tr>
                                <td><input type="date" name="date" id="date"/></td>
                            </tr>
                            <tr>
                                <td>
                                    <button type="submit" class="btn btn-success">Submit</button>
                                <button type="submit" class="btn btn-success">Reset</button>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
             </center>
            </div>
        </div>
        </c:if>
        
    </body>
</html>
