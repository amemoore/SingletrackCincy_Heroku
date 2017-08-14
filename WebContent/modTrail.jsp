<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h2>Modify a Trail</h2>
		<form action="AdminServlet" method="post">
		 Park Name: <input type="text" name="parkname"><br>
		  <input type="submit" value="Submit">
		</form>
		 <form action="AdminServlet" method="post">
		 Trail Name: <input type="text" name="trailname"><br>
		  <input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
		 Trail Length: <input type="text" name="traillength"><br>
		  <input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
		 Difficulty: <input type="text" name="difficulty"><br>
		  <input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
		  Terrain: <input type="text" name="terrain"><br>
		  <input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
		  Features: <input type="text" name="features"><br>
		  <input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
		  Direction: <input type="text" name="direction"><br>
		  <input type="submit" value="Submit">
		</form>
		<form action="AdminServlet" method="post">
		 Notes: <input type="text" name="notes"><br>
		  <input type="submit" value="Submit">
		</form>

</body>
</html>