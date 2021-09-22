<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Request Confirmation</title>
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
  background-image: url("pictures/slider1.jpg");
  
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
.btn {
 
  color: blue;
  border: none;
  cursor: pointer;
  width: 60%;
  height:100px;
  opacity: 0.9;
}
</style>

</head>
<body>
<div class="bg-image"></div>
<div class="bg-text" align="center">
<h1 style="font: italic; margin-top: 15%; font-size: 100px; color: white; ">Mail sent successfully..</h1>
<h3 style="margin-top: 16%; font-size: 30px"><a class="btn" href="home.jsp" role="button">Continue to homepage</a></h3>
</div>
</body>
</html>