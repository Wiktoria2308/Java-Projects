<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="styleFilter.css">
<script src="script.js"></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Confirm order</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>

footer {

  margin: 0;
  padding: 30;
  overflow: hidden;
  color : white ;
  background-color: #333;
  position :  bottom ;
}
</style>
</head>
<body>
<div class="topNav">
<ul class="mainHeader">
  <span style="color: white;float:left"> <li><h3>&nbsp; WAAD Car Rental Solutions</h3></li></span>
    <li><a href="/WAAD/LoggedInAbout.jsp">About</a></li>
    <li><a href="WAAD/HomePage.jsp">Logout</a></li>  
    <li><a href="/WAAD/LoggedInHomePage.jsp">Home</a></li>
 </ul>
 </div>
 <div class="sideBar2">
               <ul>
                   <li><a href="/WAAD/CustomerProfile.jsp">Manage Your Profile</a></li>
                   <li><a href="/WAAD/History.jsp">History</a></li>  
                   <li><a href="/WAAD/CreditCardInfo.jsp">Change Payment Information</a></li>
               </ul>

  </div>
             
<div class="cars" id="parent">
    
    
			
			
			<div class="car ${orderedCar.brand} ${orderedCar.seats} ${orderedCar.luggage} ${orderedCar.doors} ${orderedCar.trFull}"> 
			<div class="carHeader">
				
				<h3 id="carName">${orderedCar.fullName}</h3>
				<div class="icons">
					<img src="images/user.png">
					<p id="seats">${orderedCar.seats}</p>
					<img src="images/suitcase.png" id="suitcase">
					<p>${orderedCar.luggage}</p>
					<img src="images/car-door.png">
					<p>${orderedCar.doors}</p>
					<img src="images/manual.png">
					<p>${orderedCar.transmission}</p>
					

				</div>
			</div>
			<div id="carImage">
				<img src="cars/${orderedCar.fullName}.png" id="carIMG" alt="">
			</div>
			<div class="priceButton">
				<h2>${orderedCar.price} per day</h2>
				
					<form action="orderServlet">
					<input type="text" name="regNr" hidden=true value="${orderedCar.regNr}">
					<button class="w3-button w3-blue">Rent</button></form>
				
			</div>
			</div>
		

</div>
<div class="CustomerInfo">

 

</div>
<br></br>
<div class="bottomLine">
<footer >
  Disclaimer : We own none of the photos ,
  Copyrights to respective owners

  <span style="float:right"> Contact us on +444-555-666  &nbsp; &nbsp;  Email : email@corp.com</span>
</footer>
</div>
</body>
</html>