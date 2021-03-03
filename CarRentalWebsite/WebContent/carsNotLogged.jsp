<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fn" 
   uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="styleFilter.css">
<script src="scriptFilter.js"></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Our fleet</title>
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
     <li><a href="/WAAD/About.jsp">About</a></li>
    <li><a href="/WAAD/Registration.jsp">Register</a></li>
    <li><a href="/WAAD/Login.jsp">Login</a></li>
    <li><a href="/WAAD/HomePage.jsp">Home</a></li>
 </ul>
 </div>
     
        <div class="filterBar">
            <div class="doors">
        <h3>Doors:</h3>
        <label class="container">3
          <input type="checkbox" value="23" class="chk">
          <span class="checkmark"></span>
        </label>
        <label class="container">5
          <input type="checkbox" value="25" class="chk">
          <span class="checkmark"></span>
        </label>
    </div>
<div class="radioButtons">
        <h3>Transition:</h3>
        <label class="container">Manual
          <input type="checkbox" name="radio" value="manual" class="chk2"  >
          <span class="checkmark"></span>
        </label>
        <label class="container">Automat
          <input type="checkbox" name="radio" class="chk2" value="automat">
          <span class="checkmark"></span>
        </label>
    </div>
    <div class="luggage">
            <h3>Luggage:</h3>
            <label class="container">1
              <input type="checkbox"  value="31" class="chk3">
              <span class="checkmark"></span>
            </label>
            <label class="container">2
              <input type="checkbox"  value="32" class="chk3">
              <span class="checkmark"></span>
            </label>
            <label class="container">3
              <input type="checkbox" value="33" class="chk3">
              <span class="checkmark"></span>
            </label>
            <label class="container">4
              <input type="checkbox" value="34" class="chk3">
              <span class="checkmark"></span>
            </label>
        </div>
        <div class="seats">
                <h3>Seats:</h3>
                <label class="con ">4
                  <input type="checkbox" value="14" class="chk4">
                  <span class="checkmark"></span>
                </label>
                <label class="con ">5
                  <input type="checkbox" value="15" class="chk4">
                  <span class="checkmark"></span>
                </label>
            </div>
            
            <div class="selectCar">
                <h3>Type:</h3>
                <!--surround the select box with a "custom-select" DIV element. Remember to set the width:-->
                <div class="custom-select" style="width:200px;" >
                  <select id="brandVal">
                    <option value="">Select type:</option>
                    <option value="Small">Small</option>
                    <option value="Sedan">Sedan</option>
                    <option value="StationWagon">Station wagon</option>
                    <option value="SUV">SUV</option>
                    <option value="Luxury">Luxury car</option>
                    <option value="Sport">Sport</option>
                  </select>
                </div>
                </div>
                <button class="active btn" id="all">Show All</button>
                <button class="btn" id="a">Search</button>
    </div>
   
  
<div class="cars" id="parent">
    
    <c:forEach var="item" items="${AllCars.getCarReg()}">
			
			
			<div class="car ${item.type} ${item.seats} ${item.luggage} ${item.doors} ${item.trFull}"> 
			<div class="carHeader">
				
				<h3 id="carName">${item.fullName}</h3>
				<div class="icons">
					<img src="images/user.png">
					<p id="seats">${fn:substring(item.seats, 1, 2)}</p>
					<img src="images/suitcase.png" id="suitcase">
					<p>${fn:substring(item.luggage, 1,2)}</p>
					<img src="images/car-door.png">
					<p>${fn:substring(item.doors, 1,2)}</p>
					<img src="images/manual.png">
					<p>${item.transmission}</p>
					
					

				</div>
			</div>
			<div id="carImage">
				<img src="cars/${item.fullName}.png" id="carIMG" alt="">
			</div>
			<div class="priceButton">
				<h2>${item.price} SEK</h2>
				<p>
					<form action="orderServlet">
					<input type="text" name="regNr" hidden=true value="${item.regNr}">
					<input type="date" name="dateFrom" hidden=false value="${item.dateFrom}">
					<input type="date" name="dateTo" hidden=false value="${item.dateTo}">
					<input type="date" name="City" hidden=false value="${item.city}">
					<input type="text" name="status" hidden=false value="NotLogged">
					<button class="w3-button w3-blue">Rent</button></form>
				</p>
			</div>
			</div>
		</c:forEach>
		</div>
<div class="bottomLine">
<footer >
  Disclaimer : We own none of the photos ,
  Copyrights to respective owners
  <span style="float:right"> Contact us on +444-555-666  &nbsp; &nbsp;  Email : email@corp.com</span>
</footer>
</div>
</body>
</html>