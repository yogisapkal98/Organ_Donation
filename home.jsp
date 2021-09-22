<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>Organ Donation System</title>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" type="text/css" href="home.css">
<style>

</style>

</head>
<body>
<div class="bg-image"></div>
<div class="bg-text">
<div class="w3-container"  id='cssmenu' style="width:100%; " >
   <h2 style="color:RED; font-size:30px; font-family: cursive; margin-bottom:0; ">Organ Donation System</h2>
   
<ul>
   <li class="active"><a href='#'>HOME</a></li>
   <li><a href='donor.html'>DONOR</a></li>
   <li><a href='accepterLogin.html'>ACCEPTOR</a></li>
   <li><a href='contact.html'>CONTACT US</a></li>
</ul>
</div> <br><br>
<div id="leftbox" class="w3-content w3-section" class="div2" style="max-width:480px; align:left;">
  <img class="mySlides w3-animate-left" src="pictures\homebg.jpg" style="width:100%; height:450px">
  <img class="mySlides w3-animate-right" src="pictures\slider7.png" style="width:100%; height:450px" >
  <img class="mySlides w3-animate-top" src="pictures\homeBg1.jpg" style="width:100%; height:450px">
   <img class="mySlides w3-animate-top" src="pictures\slider4.jpg" style="width:100%; height:450px">
   <img class="mySlides w3-animate-top" src="pictures\slider1.jpg" style="width:100%; height:450px">
</div>

<div id="rightbox" class="container">
<h2 style="color:blue; font-size:30px;">About Us</h2><br>
<p>
Organ donation is the process when a person allows an organ of their own to be removed and transplanted to another person, legally, either by consent while the donor is alive or dead.

</p>
<br>
<h3 style="color: yellow;">What is organ donation?</h3>
<br>
<p>
Donation is the giving of an organ to help someone that needs a transplant.

Transplants can save or transform the life of a person.  One organ and tissue donor can help transform the lives of more than 10 people. This relies on donors and their families agreeing to donate their organ and tissue after death.
</p>
<br>
<h3 style="color: yellow;">Why is donation important?</h3>
<br>
<p>Unfortunately, there are fewer donor organs available than there are people waiting. Some people die waiting for a transplant. Some spend weeks or months in hospital, while others make several trips to hospital every week for treatment.
People who need an organ transplant are usually very sick or dying, because one or more of their organs is failing.
Many on the organ transplant waiting list have a congenital or genetic condition, illness or sudden organ failure that will make them very sick and in need of a transplant. 

We never know when illness could affect a family member, friend or colleague who may need a transplant. 


</p>
</div>
<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 2500); 
  
 
}
</script>
</div>
</body>
</html>