<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="servlets.Customer" %>
<% Customer currentCustomer = (Customer)session.getAttribute("currentSessionUser"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome, <%=currentCustomer.getFirstName() %></title>
<link HREF="customer.css" REL="stylesheet" TYPE="text/css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
	background-color: ##000000;;
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
    <div class="header">
        <ul class="menubar">
            <span style="color: white; float: left">
                <li><h3>&nbsp; WAAD Car Rental Solutions</h3></li>
            </span>
            <li><a href="/WAAD/About.jsp">About</a></li>
            <li><a href="/WAAD/HomePage.jsp">LogOut</a></li>
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
    
    <section id="cover" class="min-vh-100">
            <div id="cover-caption">
                <div class="container">
                    
                        <div class="col-xl-5 col-lg-6 col-md-8 col-sm-10 mx-auto  form p-4" id="con">
                            <h1 class="display-4 py-2 text-truncate" id="prof">Your Profile</h1>
                            <div class="px-2">
                                <form action="updateCustomerServlet" role="form" novalidate="" autocomplete="off" method="post" class="justify-content-center" id="regi">
                              
                                   <div class="form-group">
            <label class="col-lg-4 control-label">First name:</label>
            <div class="col-lg-12">
              <input class="form-control" type="text" value="<%=currentCustomer.getFirstName() %>">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-4 control-label">Last name:</label>
            <div class="col-lg-12">
              <input class="form-control" type="text" value="<%=currentCustomer.getLastName() %>">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-4 control-label">Email:</label>
            <div class="col-lg-12">
              <input class="form-control" type="email" value="<%=currentCustomer.getEmail() %>">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-4 control-label">Password:</label>
            <div class="col-lg-12">
              <input class="form-control" type="password" value="<%=currentCustomer.getPassword() %>">
            </div>
          </div>
          <div class="form-group">
                <label class="col-lg-4 control-label">Address 1:</label>
                <div class="col-lg-12">
                  <input class="form-control" type="text" value="<%=currentCustomer.getAddress1() %>">
                </div>
              </div>
              <div class="form-group">
                    <label class="col-lg-4 control-label">Address 2:</label>
                    <div class="col-lg-12">
                      <input class="form-control" type="text" value="<%=currentCustomer.getAddress2() %>">
                    </div>
                  </div>
              <div class="form-group">
                    <label class="col-lg-4 control-label">City:</label>
                    <div class="col-lg-12">
                      <input class="form-control" type="text" value="<%=currentCustomer.getCity() %>">
                    </div>
                  </div>
                  <div class="form-group">
                        <label class="col-lg-4 control-label">Country:</label>
                        <div class="col-lg-12">
                          <input class="form-control" type="text" value="<%=currentCustomer.getCountry() %>">
                        </div>
                      </div>
                      <div class="form-group">
                            <label class="col-lg-4 control-label">Phone:</label>
                            <div class="col-lg-12">
                              <input class="form-control" type="text" value="<%=currentCustomer.getPhone() %>">
                            </div>
                          </div>
                                    <button type="submit" class="btn btn-primary btn-lg"  >Save changes</button>
                                </form>
                            </div>
                        </div>
              
                </div>
            </div>
        </section>
    
             
   <footer>
    Disclaimer : We own none of the photos ,
    Copyrights to respective owners
    <span style="float:right"> Contact us on +444-555-666  &nbsp; &nbsp;  Email : email@corp.com</span>
  </footer>
  </body>
  </html>