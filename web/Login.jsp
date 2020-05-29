
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link href="LoginCss.css" rel="stylesheet" type="text/css"/>
         <script>
           $(document).ready(function ()
           {
               $("#closelogin").click(function ()
               {
                   $("#loginmain").hide(1000);
               });
           });
        </script>
    </head>
    <body>
        <%
            session.removeAttribute("role");
        %>
        <jsp:include page="Home.jsp"></jsp:include>
        <div class="container-fluid">
            <div class="container-fluid" id="loginmain">
               
          <center>
                <div id="logincontent">
                    <div id="logintitlediv">
                          <p style="background-color: #2831BE;height:40px;"id="logintitle">Login</p>
                          <div id="closelogin">+</div>
                      </div>
                    
                    <form action="LoginController" method="post">
                        <table>
                            <tr>
                                <td><input type="text" name="username" placeholder="Username" /></td>
                            </tr>
                            
                            <tr>
                                <td><input type="password" name="password" placeholder="Password" /></td>
                            </tr>
                            <tr>                            
                                <td>
                                    <p></p>
                                </td>
                            </tr>
                            <tr>                            
                                <td>
                                    <button type="submit" class="btn btn-success">Login</button>
                                </td>
                            </tr>
                            <tr>
                                <td style="color: black;"><a href="SendOtp.jsp">Forgot Password</a></td>
                            </tr>
                            <tr>
                                <td style="color: black;">New User? Create An Account  <a href="Register.jsp">Register</a></td>
                            </tr>
                        </table>
                    </form>
                    <p style="color: red;font-size: 0.8em">Please Login to Make An Appointment!!!</p>
                </div>
             </center>
            </div>
        </div>
    </body>
</html>
