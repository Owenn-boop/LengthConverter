<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Calculate Inches to CM</title>
	</head>
	<body>
		<h1>Convert Inches to Centimeters</h1>
		<form action="getInchesToCMServlet" method="post">
		Enter the amount of inches you would like to convert:
		<input type="text" name="userInches" size="10">
		<input type="submit" value="Convert Inches" />
		</form>
	</body>
</html>