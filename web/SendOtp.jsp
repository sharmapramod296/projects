
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Otp</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        
       
        
        <style>
            #sendotpcontent
            {
                background-color: white;
                height:250px;
                width: 350px;
                position: absolute;
                top: 170px;
                left: 600px;
                border-radius: 10px;
                box-shadow: 0px 0px 15px black;
                border-bottom: yellowgreen solid 4px;
            }
            #sendotptitle
            {
                font-size: 25px;
                font-weight: bold;
                text-align: center;
                border-radius: 10px;
                color: white;
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
            #message1
            {
                color: red;
                font-size: 15px;
            }
            input
            {
                height: 40px;
                width: 90%;
                border: greenyellow 1px solid;
            }
        </style>
    </head>
    <body>
        <div id="headingdiv" class="container-fluid">
            <img src="images/doctors logo.gif" alt="image not found" id="brandimage"/>
            <h1 id="brandname"><span style="font-size: 65px;">J</span>anta clinic</h1>
            <p id="brandmoto">We care about your health</p>
            <a href="Home.jsp" id="exitusers">Exit</a>
        </div>
        <br>
    <center>
        <div id="sendotpcontent">
                    <div id="sendotptitlediv">
                          <p style="background-color: #2831BE;height:40px;"id="sendotptitle">Send OTP</p>
                      </div>
        <form action="SendOtpController" method="post">
            <label id="email">Enter your e-mail address :</label><br>
            <input id="email" type="email" name="email" placeholder="Email address"/><br><br>
            <button type="submit" class="btn btn-success">Send OTP</button>
            <p id="message1">Make sure that the entered email address is already registered.</p>
        </form>
        </div>
    </center>
    </body>
</html>
