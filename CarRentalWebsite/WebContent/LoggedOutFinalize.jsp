<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fn" 
   uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirm order</title>
<link HREF="finalize.css" REL="stylesheet" TYPE="text/css" >


</head>
<body>
 <div>
  <ul class=header>
      <span style="color: white;float:left"> <li><h3>&nbsp; WAAD Car Rental Solutions</h3></li></span>
     <li><a href="/WAAD/About.jsp">About</a></li>
		<li><a href="/WAAD/Registration.jsp">Register</a></li>
		<li><a href="/WAAD/Login.jsp">Login</a></li>
		<li><a href="/WAAD/HomePage.jsp">Home</a></li>
   </ul>
</div>

  
<form action="summaryServlet">    
<div class="cars" id="parent">
    
			<div class="car ${orderedCar.brand} ${orderedCar.seats} ${orderedCar.luggage} ${orderedCar.doors} ${orderedCar.trFull}"> 
			<div class="carHeader">
				
				<h3 id="carName">${orderedCar.fullName}</h3>
				<input type="text" name="fullName" hidden=true value="${item.fullName}">
				<div class="icons">
					<img src="images/user.png">
					<p id="seats">${fn:substring(orderedCar.seats, 1, 2)}</p>
					<input type="text" name="seats" hidden=true value="${fn:substring(orderedCar.seats, 1,2)}">
					<img src="images/suitcase.png" id="suitcase">
					<p>${fn:substring(orderedCar.luggage, 1,2)}</p>
					<input type="text" name="luggage" hidden=true value="${fn:substring(orderedCar.luggage, 1,2)}">
					<img src="images/car-door.png">
					<p>${fn:substring(orderedCar.doors, 1,2)}</p>
					<input type="text" name="doors" hidden=true value="${fn:substring(orderedCar.doors, 1,2)}">
					<img src="images/manual.png">
					<p>${orderedCar.transmission}</p>
					<input type="text" name="transmission" hidden=true value="${orderedCar.transmission}">
					

				</div>
			</div>
			<div id="carImage">
				<img src="cars/${orderedCar.fullName}.png" id="carIMG" alt="">
			</div>
			<div class="priceButton">
				<h2>${orderedCar.price} total price</h2>
				<input type="text" name="price" hidden=true value="${orderedCar.price}">
				<input type="text" name="regNr" hidden=true value="${orderedCar.regNr}">
			</div>
			<div class="bookingContainer">
			<h3 class="booking">Booking information</h3>
			<div class="bookingInfo">
			<div class="bookingDetails">
			<h4>Pickup:</h4> <p>${orderedCar.dateFrom}</p>
			<input type="text" name="dateFrom" hidden=true value="${orderedCar.dateFrom}">
			</div>
			<div class="bookingDetails">
			<h4>Location:</h4> <p>${orderedCar.city}</p>
			<input type="text" name="city" hidden=true value="${orderedCar.city}">
			</div>
			<div class="bookingDetails">
			<h4>Return:</h4> <p>${orderedCar.dateTo}</p>
			<input type="text" name="dateTo" hidden=true value="${orderedCar.dateTo}">
			</div>
			<div class="bookingDetails">
			<h4>Location:</h4> <p>${orderedCar.city}</p>
			</div>
			</div>
			</div>
			</div>
		

</div>
<div class="CustomerInfo">

 <table style="width:100%" ; cellspacing="1" frame="box" cellpading=5px >
   <tr>
    <th bgcolor="#D2ECF5" colspan="4"><h4>Customer Details</h4></th>
   </tr>
   <tr>
    <td>First Name</td>
    <td><input type="text" name="FirstName" id="FirstName" class="resizedTextbox" value="${currentSessionUser.firstName}"/></td>
    </tr>
    <tr>
     <td>Last Name</td>
    <td><input type="text" name="LastName" id="LastName" class="resizedTextbox" value="${currentSessionUser.lastName}"/></td>
   </tr>
   <tr>
   <td>Email</td>
    <td><input type="text" name="email" id="email" class="resizedTextbox" value="${currentSessionUser.email}"/></td>
   </tr>
   <tr>
    <td>Mobile</td>
    <td><input type="text" name="mobile" id="mobile" class="resizedTextbox" value="${currentSessionUser.phone}"/></td>
  </tr>
  <tr>
 <td> <button class="newbtn">Proceed</button></td>
  </tr>

</table>
<input type="text" name="status" hidden=true value="NotLogged">
</div>
</form>
<br></br>
             
     
     

</body>
</html>