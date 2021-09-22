<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donate Form</title>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Accepter Registration Page</title>
<style>
body, html {
  height: 100%;
  margin: 0;
  
}

* {
  box-sizing: border-box;
}

.bg-image {
  /* The image used */
  background-image: url("pictures/Login.jpg");
  
  /* Add the blur effect */
  filter: blur(8px);
  -webkit-filter: blur(8px);
  
  /* Full height */
  height: 100%; 
  
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

/* Position text in the middle of the page/image */
.bg-text {
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
  color: white;
  font-weight: bold;
  border: 2px solid #f1f1f1;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
  width: 100%;
  height:100%;
  padding: 20px;
 
}

.container { 
         margin-left: 375px;
         margin-top:50px;
        padding: 50px; 
        hight:30%;
        width:30%;
    } 
</style>
</head>
<body>
<div class="bg-image"></div>
<div class="bg-text">
<div class="w3-container"  id='cssmenu' style="width:100%; " >
   <h2 style="color:RED; font-size:30px;  font-family: cursive; ">Organ Donation System</h2>
<ul>
   <li class="active"><a href='home.jsp'>HOME</a></li>
   <li><a href='donor.html'>DONOR</a></li>
   <li><a href='accepterLogin.html'>ACCEPTOR</a></li>
   <li><a href='contact.html'>CONTACT US</a></li>
</ul>
 <br>
</div>
<br><br><br>
<div align="center">
<form action="thankYouDonor.jsp">
<label style="color:blue;font-size:30px;">FILL FORM</label><br><br>
<h4 style="color:black;">Enter your details</h4><br>
<table cellpadding="10px" cellspacing="20px">
<tr><td>UserName</td> <td><input type="text" name="username" required="required"></td></tr>
<tr><td>Age</td> <td><input type="text" name="age" required="required"></td></tr>
<tr><td>Blood Group</td> <td><input type="text" name="bloodgp"  required="required"></td></tr>
<tr><td>Mobile No</td> <td><input type="text" name="mobile"  required="required" maxlength="10" ></td></tr>
<tr><td>Email Id</td> <td><input type="email" name="email"  required="required"></td></tr>
<tr><td>Location</td> <td><input type="text" name="location"  required="required"></td></tr>
<tr><td>Organ name</td> <td><input type="text" name="organ"  required="required"></td></tr>
</table>

<input type="submit" value="Submit">
</form>
</div>
</div>

<%@ page import="com.organdonation.dao.DaoClass" %>
<jsp:useBean id="u" class="com.organdonation.bean.DonateFormBean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
DaoClass dao=new DaoClass();
int i=dao.insertDonate(u);

%>
</body>
</html>