<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
<link HREF="style.css" REL="stylesheet" TYPE="text/css">
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
	padding: 30;
	overflow: hidden;
	color: white;
	background-color: #333;
	position: bottom;
}

li {
	float: right;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 14px;
	text-decoration: none;
}

/* Change the link color to black on hover */
li a:hover {
	background-color: #000000;
}

ul {
	position: sticky;
	top: 0;
}

div {
	color: #333
}
</style>
</head>
<body>


	<ul>
		<span style="color: white; float: left">
			<li><h3>&nbsp; WAAD Car Rental Solutions</h3></li>
		</span>
		<li><a href="/WAAD/About.jsp">About</a></li>
		<li><a href="/WAAD/Registration.jsp">Register</a></li>
		<li><a href="/WAAD/Login.jsp">Login</a></li>
		<li><a href="/WAAD/HomePage.jsp">Home</a></li>
		
	</ul>

	<!--img src="carphoto.jpg" width="100%"/-->
	<div class="imagecontainer">
		<div class="floatingtag">
			<h2>Find a Car Now</h2>

			<form action="carsByTypeServlet">
				<table style="with: 50%">
					<tr>
						<td>From Date</td>
						<td><input id="date" name="dateFrom" type="date" placeholder="yyyy-mm-dd" /></td>
					</tr>
					<tr>
						<td>To Date</td>
						<td><input id="date" name="dateTo" type="date" placeholder="yyyy-mm-dd" /></td>
					</tr>
					<tr>
					<tr>
						<td>City</td>
						<td><select name="City">
								
								<option value="Gothenburg">Gothenburg</option>
								<option value="Stockholm">Stockholm</option>
								<option value="Malmo">Malmo</option>
								<option value="Karlskrona">Karlskrona</option>
								<option value="Kiruna">Kiruna</option>
						</select></td>
				</table>
				<br></br> <br></br> <input type="submit" name="submit"
					id="btnSubmit" value="Find Now" class="btn" /> <input
					name="operation" value="findCar" type="hidden">
				<input type="text" name="source" hidden=true value="NotLogged">
				
			</form>
			<br></br> <br></br>

		</div>

		<img src="carphoto.jpg" width="100%" />
	</div>
	<br></br>
	<br></br>


	<div>
		<table style="width: 100%" ; table cellpadding="20">
			<tr>
				<th><h3>
						<center>Family</center>
					</h3></th>
				<th><h3>
						<center>Luxury</center>
					</h3></th>
				<th><h3>
						<center>Budget</center>
					</h3></th>
			</tr>
			<tr>
				<td><img src="family.jpg" width="310" height="180" /></td>
				<td><img src="business.png" width="320" height="180" /></td>
				<td><img src="budget.jpg" width="320" height="180" /></td>
			</tr>
			<tr>
				<td>Fun for the whole family . With our collection of mivinavs
					and family cars there's space for everyone</td>
				<td>Do business in style with our Luxury cars . With special
					discounts for Corporate Partners</td>
				<td>Make the most of your trip without breaking your budget
					with our collection of affordable cars</td>
			</tr>

		</table>
	</div>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<footer>
		Disclaimer : We own none of the photos , Copyrights to respective
		owners <span style="float: right"> Contact us on +444-555-666
			&nbsp; &nbsp; Email : email@corp.com</span>
	</footer>


</body>
</html>
