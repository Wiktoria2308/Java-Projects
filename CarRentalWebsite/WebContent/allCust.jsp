<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="javax.servlet.jsp.jstl.core.*" %>
<%@ page import="servlets.CustomerReg" %>
<%@ page import="servlets.CarRegister" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="servlets.Customer" %>
<% CustomerReg custReg = (CustomerReg)session.getAttribute("CustomerRegister"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		
		${CustomerRegister.getCustReg()}
		<c:forEach var="item" items="${CustomerRegister.getCustReg()}" >
			${item.firstName}<br>
			${item.lastName}<br>
			${item.email}<br>
		</c:forEach>
		
	</p>
</body>
</html>