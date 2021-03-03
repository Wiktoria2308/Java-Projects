<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
      <li><a href="/WAAD/LoggedInAbout.jsp">About</a></li>
      <li><a href="/WAAD/HomePage.jsp">Logout</a></li>
      <li><a href="/WAAD/LoggedInHomePage.jsp">Home</a></li>
   </ul>
</div>

   <div class="sideBar3">
               <ul>
                   <li><a href="/WAAD/CustomerProfile.jsp">Manage Your Profile</a></li>
                   <li><a href="/WAAD/History.jsp">History</a></li>  
                   <li><a href="/WAAD/CreditCardInfo.jsp">Change Payment Information</a></li>
               </ul>

             </div>



</div>
<div class="CustomerInfo">

 <table style="width:100%"   frame="box"  >
   <tr>
    <th bgcolor="#D2ECF5" colspan="2"><h4>Confirm Order Details</h4></th>
   </tr>
   <tr><td><br></td></tr>
   <tr>
    <td colspan="2"> <center>First Name : ${order.firstName}</center></td>
    </tr>
    <tr>
      <td colspan="2"><center>Last Name : ${order.lastName}</center></td>
    </tr>
   <tr>
   <td colspan="2"><center>Email : ${order.email} <center></td>
   </tr>
   <tr>
     <td colspan="2"><center>Car : ${order.brand} <center></td>
     </tr>
   <tr>
     <td colspan="2"><center>Seats : ${order.seats} <center></td>
     </tr>
      <tr>
     <td colspan="2"><center>Luggage : ${order.luggage} <center></td>
     </tr>
      <tr>
    <td colspan="2"><center>Doors : ${order.doors} <center></td>
     </tr>
      <tr>
     <td colspan="2"><center>Transmission : ${order.transmission} <center></td>
     </tr>
      <tr>
     <td colspan="2"><center>total Price : ${order.price} <center></td>
     </tr>
  <tr>
 <form action="creditCardServlet"><td> <center><button class="newbtn">Confirm</button></center></td></form>
  <td><center> <button class="newbtn">Back</button></center></td>
  </tr>

</table>

</div>
</form>
<br></br>
             
     
     

</body>
</html>