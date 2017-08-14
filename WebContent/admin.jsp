<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Admin</title>
</head>

<body>
<h1> In the Admin JSP</h1>
<p>${message}</p>
<!-- WIP - Space for Admin to add, delete, and update parks, trails, comments -->


<!-- NAV Bar to Add trail or park and Modify trail or park -->

<a href="index.html">Home</a>
<a href="admin.jsp">Add Park</a>
<a href="admin.jsp">Add Trail</a>
<a href="modPark.jsp">Modify Park</a>
<a href="modTrail.jsp">Modify Trail</a>
<a href="logout.jsp">Log out</a>

<h2>Add a Park</h2>
		<form action="AdminServlet" method="post">
		  Park Name: <input type="text" name="parknameP"><br>
		  Area: <input type="text" name="areaP"><br>
		  Address: <input type="text" name="addressP"><br>
		  Other: <input type="text" name="otherP"><br>
		  Restrooms: <input type="text" name="restroomsP"><br>
		  Park District: <input type="text" name="parkDistrictP"><br>
		  Area Description: <input type="text" name="areadescriptionP"><br>
		  <input type="submit" value="Submit">
		</form>
		
<h2>Add a Trail</h2>
		<form action="AdminServlet" method="post">
		  Park Name: <input type="text" name="parknameT"><br>
		  Trail Name: <input type="text" name="trailnameT"><br>
		  Trail Length: <input type="text" name="traillengthT"><br>
		  Difficulty: <input type="text" name="difficultyT"><br>
		  Terrain: <input type="text" name="terrainT"><br>
		  Features: <input type="text" name="featuresT"><br>
		  Direction: <input type="text" name="directionT"><br>
		  Notes: <input type="text" name="notesT"><br>
		  <input type="submit" value="Submit">
		</form>
		



</body>
</html>