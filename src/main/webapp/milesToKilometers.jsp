<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Calculate Miles to Kilometers</title>
	</head>
	<body>
		<h1>Convert Miles to Kilometers</h1>
		<form action="getMilesToKMServlet" method="post">
		Enter the amount of miles you would like to convert:
		<input type="text" name="userMiles" size="10">
		<input type="submit" value="Convert Miles" />
		</form>
	</body>
</html>