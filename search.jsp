<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" type="text/css" href="search.css">
<title>Search Organ</title>

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
<br><br><br><br>
<div class="container" align="center">
<form action="SearchServlet" method="post">
<label style="color:Blue;font-size:30px;">SEARCH</label><br><br>
<h4>Enter your search(like eye,heart)</h4><br>
<input type="text" name="organ" required="required" style="width:250px;height:30px;" placeholder="   Search Organ">
<br><br>
<input type="submit" value="Search" class="btn" style="width:150px;height:50px; background-color: green;">
</form>
</div>
</div>

</body>
</html>