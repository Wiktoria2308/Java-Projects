<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Credit Card Validation</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/jquery.payform.min.js" charset="utf-8"></script>
    <script src="js/scriptCard.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="styles.css">
    <link rel="stylesheet" type="text/css" href="demo.css">
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
          background-color: #000000;;
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
                <ul class="menubar">
                    <span style="color: white;float:left"> <li><h3>&nbsp; WAAD Car Rental Solutions</h3></li></span>
                    <li><a href="/WAAD/LoggedInAbout.jsp">About</a></li>
                    <li><a href="/WAAD/HomePage.jsp">Logout</a></li>
                    <li><a href="/WAAD/LoggedInHomePage.jsp">Home</a></li>
                 </ul>
              </div>
              
                   



    <div class="container-fluid">
     
        <div class="creditCardForm">
            <div class="heading">
                <h1>Set payment method</h1>
            </div>
            <div class="payment">
                <form action="lastServlet" role="form">
                    <div class="form-group owner">
                        <label for="owner">Owner</label>
                        <input type="text" class="form-control" id="owner">
                    </div>
                    <div class="form-group CVV">
                        <label for="cvv">CVV</label>
                        <input type="text" class="form-control" id="cvv">
                    </div>
                    <div class="form-group" id="card-number-field">
                        <label for="cardNumber">Card Number</label>
                        <input type="text" class="form-control" id="cardNumber">
                    </div>
                    <div class="form-group" id="expiration-date">
                        <label>Expiration Date</label>
                        <select>
                            <option value="01">January</option>
                            <option value="02">February </option>
                            <option value="03">March</option>
                            <option value="04">April</option>
                            <option value="05">May</option>
                            <option value="06">June</option>
                            <option value="07">July</option>
                            <option value="08">August</option>
                            <option value="09">September</option>
                            <option value="10">October</option>
                            <option value="11">November</option>
                            <option value="12">December</option>
                        </select>
                        <select>
                           
                            <option value="19"> 2019</option>
                            <option value="20"> 2020</option>
                            <option value="21"> 2021</option>
                            <option value="21"> 2022</option>
                            <option value="21"> 2023</option>
                        </select>
                    </div>
                    <div class="form-group" id="credit_cards">
                        <img src="images/visa.jpg" id="visa">
                        <img src="images/mastercard.jpg" id="mastercard">
                        
                    </div>
                 <div class="form-group" id="pay-now">
                        <button type="submit" class="btn btn-default" id="confirm-purchase">Confirm</button>
                    </div>
                </form>
            </div>
        </div>

        
             
            </div>
        
            <footer >
                    Disclaimer : We own none of the photos ,
                    Copyrights to respective owners
                
                    <span style="float:right"> Contact us on +444-555-666  &nbsp; &nbsp;  Email : email@corp.com</span>
                  </footer>
  
</body>

</html>
