<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="javax.servlet.jsp.jstl.core.*"%>
<%@ page import="servlets.CustomerReg"%>
<%@ page import="servlets.CarRegister"%>

<%@ page import="servlets.Customer"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car selection</title>
<link rel="stylesheet" type="text/css" href="styleFilter.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script src="script.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<body>

	

	<div class="filterBar">
		<div class="doors">
			<h3>Doors:</h3>
			<label class="container">2 <input type="checkbox" value="2"
				class="chk"> <span class="checkmark"></span>
			</label> <label class="container">3 <input type="checkbox" value="3"
				class="chk"> <span class="checkmark"></span>
			</label> <label class="container">4 <input type="checkbox" value="4"
				class="chk"> <span class="checkmark"></span>
			</label> <label class="container">5 <input type="checkbox" value="5"
				class="chk"> <span class="checkmark"></span>
			</label>
		</div>

		<div class="radioButtons">
			<h3>Transition:</h3>
			<label class="container">Manual <input type="checkbox"
				name="radio" value="manual" class="chk2"> <span
				class="checkmark"></span>
			</label> <label class="container">Automat <input type="checkbox"
				name="radio" class="chk2" value="automat"> <span
				class="checkmark"></span>
			</label>
		</div>

		<div class="luggage">
			<h3>Luggage:</h3>
			<label class="container">One <input type="checkbox"
				value="one" class="lu"> <span class="checkmark"></span>
			</label> <label class="container">Two <input type="checkbox"
				value="two" class="lu"> <span class="checkmark"></span>
			</label> <label class="container">Three <input type="checkbox"
				value="three" class="lu"> <span class="checkmark"></span>
			</label> <label class="container">Four <input type="checkbox"
				value="four" class="lu"> <span class="checkmark"></span>
			</label>
		</div>

		<div class="seats">
			<h3>Seats:</h3>
			<label class="con ">4 <input type="checkbox" value="fyra"
				class="chk4"> <span class="checkmark"></span>
			</label> <label class="con ">5 <input type="checkbox" value="fem"
				class="chk4"> <span class="checkmark"></span>
			</label>
		</div>




		<div class="selectCar">
			<h3>Brand:</h3>
			<!--surround the select box with a "custom-select" DIV element. Remember to set the width:-->
			<div class="custom-select" style="width: 200px;">
				<select id="brandVal">
					<option value="">Select car:</option>
					<option value="audi">Audi</option>
					<option value="bmw">BMW</option>
					<option value="skoda">Skoda</option>
					<option value="ford">Ford</option>
					<option value="volkswagen">Volkswagen</option>
					<option value="mercedes">Mercedes</option>
					<option value="fiat">Fiat</option>
					<option value="nissan">Nissan</option>
					<option value="toyota">Toyota</option>
					<option value="volvo">Volvo</option>
				</select>
			</div>
		</div>

		<button class="active btn" id="all">Show All</button>
		<button class="btn" id="a">Search</button>
	</div>



	<div class="cars" id="parent">

		<c:forEach var="item" items="${AllCars.getCarReg()}">
			
			
			<div class="car ${item.brand} ${item.seats} ${item.luggage} ${item.doors} ${item.trFull}"> 
			<div class="carHeader">

				<h3 id="carName">${item.fullName}</h3>
				<div class="icons">
					<img src="images/user.png">
					<p>${item.seats}</p>
					<img src="images/suitcase.png" id="suitcase">
					<p>${item.luggage}</p>
					<img src="images/car-door.png">
					<p>${item.doors}</p>
					<img src="images/manual.png">
					<p>${item.transmission}</p>

				</div>
			</div>
			<div id="carImage">
				<img src="cars/${item.fullName}.png" id="carIMG" alt="">
			</div>
			<div class="priceButton">
				<h2>${item.price}</h2>
				<p>
					<button class="w3-button w3-blue">Rent</button>
				</p>
			</div>
			</div>
		</c:forEach>

	</div>






</body>
</html>