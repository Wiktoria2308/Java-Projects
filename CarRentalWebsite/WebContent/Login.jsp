<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn</title>
<script src="regi.js"></script>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
       
          <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link HREF="style.css" REL="stylesheet" TYPE="text/css" >
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
  padding: 14px 14px;
  text-decoration: none;
}
/* Change the link color to black on hover */
li a:hover {
  background-color: #000000;
}
ul {
  position :sticky ;
  top: 0;
}
.header {
color : #333
}

</style>
</head>
<body>

<div class="header">
<ul>
  <span style="color: white;float:left"> <li><h3>&nbsp; WAAD Car Rental Solutions</h3></li></span>
    <li><a href="/WAAD/About.jsp">About</a></li>
    <li><a href="/WAAD/Registration.jsp">Register</a></li>
    <li><a href="/WAAD/Login.jsp">Login</a></li>
    <li><a href="/WAAD/HomePage.jsp">Home</a></li>
 </ul>
</div>


<section id="cover2" class="min-vh-100">
  <div id="cover-caption2">
      <div class="container">
          <div class="row text-white">
              <div class="col-xl-5 col-lg-6 col-md-8 col-sm-10 mx-auto text-center form p-4" id="con2">
                  <h1 class="display-4 py-2 text-truncate">Log in</h1>
                  <div class="px-2">
                      <form action="LoginServlet" role="form" novalidate="" autocomplete="off" class="justify-content-center" id="login">
                         
                          <div class="form-group">
                              <label class="sr-only">Email</label>
                              <input type="email" name="UserName" class="form-control" placeholder="jane.doe@example.com" required="">
                              <div class="invalid-feedback">Enter email in the correct form.</div>
                          </div>
                          <div class="form-group">
                              <label class="sr-only">Password</label>
                              <input type="password" name="Password" class="form-control" placeholder="Password" required="" autocomplete="new-password" minlength="4">
                              <div class="invalid-feedback">Enter password too! (Min four letters)</div>
                          </div>
                        
                         
                          <button type="submit" class="btn btn-primary btn-lg" id="btnRegister" onclick="functionLogin()">Login</button>
                      </form>
                  </div>
                   <div class="mt-4">
                    <div class="d-flex justify-content-center links">
                      Don't have an account?<a href="Registration.jsp" class="ml-2">Sign Up</a>
                    </div>
                    </div>
              </div>
          </div>
      </div>
  </div>
</section>









<footer >
  Disclaimer : We own none of the photos ,
  Copyrights to respective owners

  <span style="float:right"> Contact us on +444-555-666  &nbsp; &nbsp;  Email : email@corp.com</span>
</footer>


</body>
</html>