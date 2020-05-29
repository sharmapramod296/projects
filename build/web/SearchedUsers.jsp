<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Users</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
         <style>
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
            #displayallusers
            {
                position: absolute;
                top: 73%;
                right: 10%;
                color: white;
                font-size: 18px;
                border: 1px solid greenyellow;
                padding: 3px;
                border-radius: 5px;
            }
            #displayallusers:hover
            {
                text-decoration: none;
            }
            #Searchedcontent
            {
                background-color: white;
                height:500px;
                width: 350px;
                position: absolute;
                top: 170px;
                left: 600px;
                border-radius: 10px;
                box-shadow: 0px 0px 15px black;
                border-bottom: yellowgreen solid 4px;
            }
            #Searchedtitle
            {
                font-size: 25px;
                font-weight: bold;
                text-align: center;
                border-radius: 10px;
                color: white;
            }
            input
            {
                border: none;
                outline: none;
                border-bottom: greenyellow 1px solid;
                width: 90%;
                font-weight: bold;
            }
            label
            {
                position: absolute;
                left: 5px;
                
            }
         </style>
 
    </head>
    <body>
        <div id="headingdiv" class="container-fluid">
            <img src="images/doctors logo.gif" alt="image not found" id="brandimage"/>
            <h1 id="brandname"><span style="font-size: 65px;">J</span>anta clinic</h1>
            <p id="brandmoto">We care about your health</p>
            <div class="container">
              <nav>
                  <a href="DisplayUsers.jsp" id="displayallusers">Display all Users</a>
                  <a href="Home.jsp" id="exitusers">Exit</a>
              </nav>
        </div>
        </div>
     
        <br>
        <sql:setDataSource driver="org.apache.derby.jdbc.ClientDriver"
                           url="jdbc:derby://localhost:1527/JantaClinic"
                           user="JantaClinic"
                           password="JantaClinic"
                           var="mydatasource"/>
        <sql:query dataSource="${mydatasource}" var="data">
            select * from register where username=?
            <sql:param>${param.username}</sql:param>
        </sql:query>
    
        <center>
                <div id="Searchedcontent">
                    <div id="Searchedtitlediv">
                          <p style="background-color: #2831BE;height:40px;"id="Searchedtitle">${param.username}</p>
                      </div>
                    <c:forEach var="row" items="${data.rows}">        
                    <form>
                        <label id="username">Username : </label><br>
                        <input readonly type="text" name="username" placeholder="Username" id="username" value="${row.username}"/><br>
                        <label id="emailaddress">Email : </label><br>
                        <input readonly type="text" name="email" placeholder="Email" id="emailaddress" value="${row.email}"/><br>
                        <label id="password">Password : </label><br>        
                        <input readonly type="text" name="password" placeholder="Password" id="password"  value="${row.password}"/><br>
                        <label id="confirmpassword">Confirm Password : </label><br>
                        <input readonly type="text" name="confirmpassword" placeholder="Confirm Password" id="confirmpassword" value="${row.confirmpassword}" /><br>
                        <label id="contact">Contact : </label><br>
                        <input readonly type="text" name="contact" placeholder="Contact number"   id="contact" value="${row.contact}"/><br>
                        <label id="address">Address : </label><br>
                        <input readonly type="text"  value="${row.address}" id="address"/><br>
                        <label id="gender">Gender : </label><br>
                        <input readonly type="text" value="${row.gender}" /></td>
                    </form>
                </c:forEach>
                </div>
             </center>
    </body>
</html>
