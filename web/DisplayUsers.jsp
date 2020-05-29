
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Display Users</title>
    </head>
    <body>
        <jsp:include page="SmallHeader.jsp"></jsp:include>
        <sql:setDataSource driver="org.apache.derby.jdbc.ClientDriver"
                           url="jdbc:derby://localhost:1527/JantaClinic"
                           user="JantaClinic"
                           password="JantaClinic"
                           var="mydatasource"/>
        <sql:query dataSource="${mydatasource}" var="data">
            select * from register
        </sql:query>
    <center>
        <table border="1">
            <thead>
                <th>Username</th>
                <th>Email</th>
                <th>Password</th>
                <th>Confirm Password</th>
                <th>Contact Number</th>
                <th>Address</th>
                <th>Gender</th>
                <th>Role</th>
                <th>Delete</th>
            </thead>
            <tbody>
                <c:forEach var="row" items="${data.rows}">
                <tr>
                    <td>${row.username}</td>
                    <td>${row.email}</td>
                    <td>${row.password}</td>
                    <td>${row.confirmpassword}</td>
                    <td>${row.contact}</td>
                    <td>${row.address}</td>
                    <td>${row.gender}</td>
                    <td>${row.role}</td>
                    <td>
                        <a href="DeleteController?name=${row.username}">Delete</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        </center>
    </body>
</html>
