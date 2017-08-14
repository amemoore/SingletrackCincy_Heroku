<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		<h2>Modify a Park</h2>
		<form action="AdminServlet" method="post">
	  	Park Name: <input type="text" name="parkname"><br>
	  	<input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
	  	 Area: <input type="text" name="area"><br>
	  	<input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
	  	 Address: <input type="text" name="address"><br>
	  	<input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
	  	Other: <input type="text" name="other"><br>
	  	<input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
	  	Restrooms: <input type="text" name="restrooms"><br>
	  	<input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
	  	Park District: <input type="text" name="parkDistrict"><br>
	  	<input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">b nn
	  	 Area Description: <input type="text" name="areadescription"><br>
	  	<input type="submit" value="Submit">
		</form>
</body>
</html>