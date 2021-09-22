<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send Email</title>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Accepter Registration Page</title>
<style>
#leftbox { 		float:left;
                width:40%; 
                height:280px; 
            } 
 #rightbox{ 
                float:right;
                width:60%; 
                height:280px; 
            }

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
        
        margin-top:30px;
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
   <h2 style="color:RED; font-size:30px; font-family: cursive; ">Organ Donation System</h2>
<ul>
   <li class="active"><a href='home.jsp'>HOME</a></li>
   <li><a href='donor.html'>DONOR</a></li>
   <li><a href='accepterLogin.html'>ACCEPTOR</a></li>
   <li><a href='contact.html'>CONTACT US</a></li>
</ul>
 <br>
</div>

<h1 style="color: green; background-color: blue;" align="center"></h1>
<div id="leftbox" >
<form action="SendRequestServlet" method="post">
<h2 style="color: blue; font-family: cursive;">Send Mail</h2>
<table cellpadding="30px" cellspacing="20px">
<tr><td> To </td><td> <input type="text" name="to" style="width:100%; height:30px;" placeholder=" Enter recipient address"/></td></tr>
 <tr><td> Subject </td><td> <input type="text" name="subject" style="width:100%; height:30px;" placeholder=" Enter subject"/></td></tr>
 <tr><td> Message </td><td> <textarea  rows="10" cols="50" name="msg" placeholder=" Enter the message"></textarea></td></tr>
  <tr><td> Your Email id </td><td> <input type="text" name="user" style="width:100%; height:30px;" placeholder=" Enter your email id"></td></tr>
 <tr><td> Password </td><td> <input type="password" name="pass" style="width:100%; height:30px;" placeholder=" Enter the password"/></td></tr>
 <tr><td> <input type="submit" value="send" class="btn" style="width:110px;height:50px; background-color: green; text-align: center;" /></td></tr>
</table>
</form>
</div>
<div  id="rightbox" class="container">
<%@ page import="java.util.List" %>
<%@ page import="com.organdonation.bean.DonateFormBean" %>
<%@ page import="com.organdonation.dao.DaoClass" %>
<jsp:useBean id="u" class="com.organdonation.bean.DonateFormBean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
HttpSession ses=request.getSession();
String organ =(String) ses.getAttribute("oname");
DaoClass dao=new DaoClass();
List<DonateFormBean> list=dao.getAllDonor(organ);
out.print("<h2>List Of Donors</h2><br>");
out.print("<table border='1' cellpadding='20px' cellspacing='10px'>");
out.print("<tr><th>Username</th><th>Age</th><th>Blood Group</th><th>Mobile Number</th><th>Email</th><th>Location</th><th>Organ</th></tr>");
for(DonateFormBean m:list) {
	out.print("<tr><td>"+m.getUsername()+"</td><td>"+m.getAge()+"</td><td>"+m.getBloodgp()+"</td><td>"+m.getMobile()+"</td><td>"+m.getEmail()+"</td><td>"+m.getLocation()+"</td><td>"+m.getOrgan()+"</td></tr>");
	
}
out.print("</table>");
%>
</div>
</div>


</body>
</html>