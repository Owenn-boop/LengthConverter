<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Converted Miles</title>
</head>
	<body>
		<p>
			${userMileConv.getMiles()} miles is equivalent to: <br />
			${userMileConv.getKilometers()} kilometers <br />
		</p>
		<a href="index.jsp">Back to Home</a>
		
	</body>
</html>