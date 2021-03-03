<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car adding interface</title>
</head>
<body>
	<form action="addCarServlet">
		<p>
		
			<input id="brand" name="brand" type="text" placeholder="Car brand">
			<input id="model" name="model" type="text" placeholder="Car model">
			<input id="regNr" name="regNr" type="text" placeholder="Registration number">
			<input id="type" name="type" type="text" placeholder="Type">
			<input id="seats" name="seats" type="text" placeholder="Number of seats">
			<input id="doors" name="doors" type="text" placeholder="Number of doors">
			<input id="transmission" name="transmission" type="text" placeholder="Transmission type">
			<input id="luggage" name="luggage" type="text" placeholder="luggage">
			<input id="available" name="available" type="text" placeholder="Availability">
			<input id="price" name="price" type="text" placeholder="Price per day">
			<input id="city" name="city" type="text" placeholder="City">
			
		
		</p>
		<p>
			<input type="submit" value="Save car">
		</p>
	</form>
</body>
</html>