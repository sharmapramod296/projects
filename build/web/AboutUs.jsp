
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link href="AboutUs.css" rel="stylesheet" type="text/css"/>
        <link href="AboutUsmapcss.css" rel="stylesheet" type="text/css"/>
        <style>
            #imageslider1
            {
                position: relative;
                top: 2000px;
                right:  400px;
                height: 400px;
                width: 450px;
                
            }
            .images1
            {
                height: 300px;
                width: 400px;
                box-shadow: 0 0 10px black;
            }
            #imageslider2
            {
                position: relative;
                top: 1600px;
                left:  200px;
                height: 400px;
                width: 450px;
               
            }
             .images2
            {
                height: 300px;
                width: 400px;
                box-shadow: 0 0 10px black;
            }
            #imageSlidertext
            {
                font-weight: bold;
                font-size: 20px;
                border-bottom: #2831BE 2px solid;
                
            }
        </style>

    </head>
    <body>

        <jsp:include page="Header.jsp"></jsp:include>
        <div class="container" id="ourdoctorsmaindiv">
            <div class="container" id="ourdoctorstitlediv">
                <p id="ourdoctorstitle">Our Doctor's</p>
            </div>
            <div class="jumbotron" style="height: 400px; width: 350px;position: absolute; top: 50px;border-bottom: greenyellow 4px solid;">
                <img src="images/doctor1.jpg" alt="Image not found" class="img-thumbnail img-responsive" id="doctor1"/>
                <p style="color: black; position: absolute; top: 330px; left: 5px;">Lorem ipsuma Lorem ipsuma Lorem ipsuma Lorem ipsuma Lorem ipsumaLorem ipsuma</p>
            </div>
            <div class="jumbotron" style="height: 400px; width: 350px;position: absolute; top: 50px; left: 600px ;border-bottom: greenyellow 4px solid;">
                <img src="images/doctor2.jpg" alt="Image not found" class="img-thumbnail img-responsive" id="doctor2"/>
                <p style="color: black; position: absolute; top: 330px; left: 5px;">Lorem ipsuma Lorem ipsuma Lorem ipsuma Lorem ipsuma Lorem ipsumaLorem ipsuma</p>
            </div>
            </div>
            <div class="container" id="ourclinicsmaindiv">
                <div class="container " id="ourclinicstitlediv">
                    <p id="ourclinictitle">Our Clinic's</p>
                </div>
                <div class="jumbotron" style="height: 180px; width: 350px;position: absolute; top: 500px; left: 0px;border-bottom: greenyellow 4px solid;">
                    <p id="clinicone" ><strong>Clinic One:</strong><br>Ekta Chawl, Near Neelkamal Naka,Kashmira Dongri,Mira Road(East),Mumbai.</p>
                </div>
                <div class="jumbotron" style="height: 180px; width: 350px;position: absolute; top: 500px; left: 600px;border-bottom: greenyellow 4px solid;" >
                    <p id="clinictwo"><strong>Clinic Two:</strong>Goyal Plaza, Shop no:08, Opp.Shiwar Garden, Mira Road(East),Mumbai.</p>
                </div>
            </div>
         
        <div class="container" id="mapsmaindiv">
            <p id="mapstitle">Find us on Google Maps</p>
            <div class="container" id="map1div">
                <p id="map1"><iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d15064.266593970726!2d72.87756426465775!3d19.279467644940258!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7b06470a44893%3A0xf288aade686c83e0!2sKashimira%2C+Mira+Road%2C+Mira+Bhayandar%2C+Maharashtra+401107!5e0!3m2!1sen!2sin!4v1556704702416!5m2!1sen!2sin" width="500" height="450" frameborder="0" style="border:0" allowfullscreen></iframe></p>
            </div>
            <div class="container" id="map2div">
                <p id="map2"><iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3765.8841410682044!2d72.86225405006168!3d19.287403950242346!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7b046312f7617%3A0x747d67c428b6dc42!2sGoyal+Plaza%2C+Bharti+Nagar%2C+Mira+Road%2C+Mira+Bhayandar%2C+Maharashtra+401107!5e0!3m2!1sen!2sin!4v1556705273165!5m2!1sen!2sin" width="500" height="450" frameborder="0" style="border:0" allowfullscreen></iframe></p>
            </div>
        </div>
        
        <div id="imageslider1" class="container">
            <p id="imageSlidertext">Clinic One:</p>
            <img src="images/janta clinic image1.JPG" class="images1"/>             
            <img src="images/doctor2.jpg" class="images1"/>             
            <img src="images/doctors logo.gif" class="images1"/>         
        </div>
        <script src="AboutUsSlider.js" type="text/javascript"></script>
        
          <div id="imageslider2" class="container">
            <p id="imageSlidertext">Clinic Two:</p>
            <img src="images/doctor1.jpg" class="images2"/>             
            <img src="images/doctor2.jpg" class="images2"/>             
            <img src="images/doctors logo.gif" class="images2"/>     
        </div>
        <script>
            index=1;
            x=document.getElementsByClassName("images2");
            x[0].style.display="block";
            var interval=setInterval(slider,1000);
            
            function slider()
            {
                x=document.getElementsByClassName("images2");
                
                for(i=0 ; i < 3 ; i++)
                {
                    x[i].style.display="none";
                }
                
                if(index >= 3 )
                {
                    index=0;
                }
                x[index].style.display="block";
                index++;
            }
         </script>
    </body>
</html>
