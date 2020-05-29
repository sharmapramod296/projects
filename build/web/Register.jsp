
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
          <link href="RegisterCss.css" rel="stylesheet" type="text/css"/>
        <script>
            $(document).ready(function ()
                {
                   $("#closeregister").click(function ()
                   {
                       $("#registermain").hide(1000);
                   })     
                });
        </script>
        
        <!--ajax code-->
               
        <script>
            function myfunction(element)
            {
                url="RegisterController?id="+element.id+"&val="+element.value;
                xhttp=new  XMLHttpRequest(); 
                xhttp.onreadystatechange=function()
                {
                    if(xhttp.readyState==4 && xhttp.status == 200)
                    {
                        document.getElementById("message"+element.id).innerHTML=xhttp.responseText;
                    }
                }
                xhttp.open("GET",url)
                xhttp.send();
            }
        </script>
        
    </head>
    <body>
        
        <c:if test="${registerData1==null}">
            <%
                String username="",email="",password="",confirmpassword="",contact="",address="";
                Cookie cookie[]=request.getCookies();
                for(Cookie c:cookie)
                {
                    if(c.getName().equals("username"))
                    {
                        username=c.getValue();
                    }
                    else if(c.getName().equals("email"))
                    {
                        email=c.getValue();
                    }
                    else if(c.getName().equals("password"))
                    {
                        password=c.getValue();
                    }
                    else if(c.getName().equals("confirmpassword"))
                    {
                        confirmpassword=c.getValue();
                    }
                    else if(c.getName().equals("contact"))
                    {
                        contact=c.getValue();
                    }
                    else if(c.getName().equals("address"))
                    {
                        address=c.getValue();
                    }
                }
            %>
        
            <jsp:include page="Home.jsp"></jsp:include>
          <div class="container-fluid">
            <div class="container-fluid" id="registermain">
                <div id="registerimagediv">
                    <img src="images/coffee-cup-drink-875511.jpg" alt="image not found" id="registerimage"/>
                </div>
          <center>
                <div id="Registercontent">
                    <div id="registertitlediv">
                          <p style="background-color: #2831BE;height:40px;"id="registertitle">Register</p>
                          <div id="closeregister">+</div>
                      </div>
                    
                    <form action="RegisterController" method="post">
                        <table>
                            <tr>
                                <td><input type="text" name="username" placeholder="Username" id="username" onkeyup="myfunction(this)" /><span id="messageusername" style="color:red"></span><br></td>
                            </tr>
                            
                            <tr>
                                <td>
                                    <input onkeyup="myfunction(this)" type="text" name="email" placeholder="Email" value="<%=email%>" id="emailaddress"/><span id="messageemailaddress" style="color:red"></span><br>
                                    <short style="color: black; font-size: 0.8em;">Your email will be safe with us</short>
                                </td>
                            </tr>
                            
                            <tr>
                                <td><input type="password" name="password" placeholder="Password" id="password" value="<%=password%>" /></td>
                            </tr>

                            <tr>
                                <td><input type="password" name="confirmpassword" placeholder="Confirm Password" id="confirmpassword" value="<%=confirmpassword%>" /></td>
                            </tr>

                            <tr>
                                <td><input onkeyup="myfunction(this)" type="text" name="contact" placeholder="Contact number" value="<%=contact%>"  id="contact" /><span id="messagecontact" style="color:red"></span><br></td>
                            </tr>

                            <tr>
                                <td><textarea rows="3" cols="22" placeholder="Address" name="address" value="<%=address%>"></textarea></td>
                            </tr>

                            <tr>
                                <td style="color: black;">
                                    Male:<input type="radio" name="gender" value="Male" />
                                    Female:<input type="radio" name="gender" value="Female" />
                                </td>
                            </tr>

                            <tr>
                                <td>
                                <button type="submit" class="btn btn-success" onclick="validate()">Register</button>
                                <button type="submit" class="btn btn-success">Reset</button>
                                </td>
                            </tr>
                            <tr>
                                <td style="color: black;">Already have an account: <a href="Login.jsp"/>Login</td>
                            </tr>
                            <tr>
                            <p id="message" style="color: red"></p>
                            </tr>
                        </table>
                            
                    </form>
                </div>
             </center>
            </div>
        </div>
          </c:if>
         
        
          <script>
            function validate()
           {
              var password=document.getElementById("password").value;
              var confirmpassword=document.getElementById("confirmpassword").value;
              if(password!=confirmpassword)
              {
                  alert("Password and Confirm password should be same")
                  document.getElementById("message").innerHTML="Password and Confirm password should be same"
              }
              else
              {
                  username=document.getElementById("username").value
                  alert("welcome : "+username)
              }
          }
          </script>
            
        <c:if test="${registerData1!=null}">          
          
            <jsp:include page="Home.jsp"></jsp:include>
          <div class="container-fluid">
            <div class="container-fluid" id="registermain">
                <div id="registerimagediv">
                    <img src="images/coffee-cup-drink-875511.jpg" alt="image not found" id="registerimage"/>
                </div>
          <center>
                <div id="Registercontent">
                    <div id="registertitlediv">
                          <p style="background-color: #2831BE;height:40px;"id="registertitle">Update Profile</p>
                          <div id="closeregister">+</div>
                      </div>
                    
                    <form action="EditController" method="post">
                        <table>
                            <tr>
                                <td><input type="text" name="username" placeholder="Username" id="username" value="${registerData1.username}" readonly /></td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="email" name="email" placeholder="Email" value="${registerData1.email}"  />
                                    <short style="color: black; font-size: 0.8em;">Your email will be safe with us</short>
                                </td>
                            </tr>
                            <tr>
                                <td><input type="password" name="password" placeholder="Password" id="password" value="${registerData1.password}"/></td>
                            </tr>
                            <tr>
                                <td><input type="password" name="confirmpassword" placeholder="Confirm Password" id="confirmpassword" value="${registerData1.confirmpassword}"/></td>
                            </tr>
                            <tr>
                                <td><input type="text" name="contact" placeholder="Contact number" value="${registerData1.contact}"/></td>
                            </tr>
                            <tr>
                                <td><textarea rows="3" cols="22" placeholder="Address" name="address" value="${registerData1.address}"></textarea></td>
                            </tr>
                            <tr>
                                <td style="color: black;">
                                    Male:<input type="radio" name="gender" value="Male" />
                                    Female:<input type="radio" name="gender" value="Female" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <button type="submit" class="btn btn-success" onclick="validate()">Register</button>
                                <button type="submit" class="btn btn-success">Reset</button>
                                </td>
                            </tr>
                            <tr>
                                <td style="color: black;">Already have an account: <a href="Login.jsp"/>Login</td>
                            </tr>
                            <tr>
                            <p id="message" style="color: red"></p>
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
