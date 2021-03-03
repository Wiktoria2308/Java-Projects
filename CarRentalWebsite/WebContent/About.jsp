<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn</title>

<style>

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}
footer {

  margin: 0;
  padding: 20;
  overflow: hidden;
  color : white ;
  background-color: #333;
  position :  bottom ;
}

li {
  float: right;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to black on hover */
li a:hover {
  background-color: #333;
}

ul {
  position :sticky ;
  top: 0;
}

div {
color : #333

}
</style>
</head>
<body>

<div>

<ul>
  <span style="color: white;float:left"> <li><h3>&nbsp; WAAD Car Rental Solutions</h3></li></span>
    <li><a href="/WAAD/About.jsp">About</a></li>
    <li><a href="/WAAD/Registration.jsp">Register</a></li>
    <li><a href="/WAAD/Login.jsp">LogIn</a></li>
    <li><a href="/WAAD/HomePage.jsp">Home</a></li>
 </ul>

This is About Page !!
<footer >
  Disclaimer : We own none of the photos ,
  Copyrights to respective owners

  <span style="float:right"> Contact us on +444-555-666  &nbsp; &nbsp;  Email : email@corp.com</span>
</footer>


</body>
</html>
