<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="main.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Admin</title>
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
			  <div class="container-fluid">
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span> 
			      </button>
			      <span class="navbar-text">Singletrack Cincy</span>
			    </div>
			    <div class="collapse navbar-collapse" id="myNavbar">
			      <ul class="nav navbar-nav navbar-right">
			        <li><a href="#about">HOME</a></li>
			        <li><a href="#services">PRINT LIST</a></li>
			      </ul>
			    </div>
			  </div>
	</nav>
	
	<header>
		<div class="jspTop">
		</div>
	</header>

	<main>
		<div class="jspMain">
  			<div class="container text-left">
			<h3>${message}</h3>
			
			<h2>Add a Park</h2>
					<form action="AdminServlet" method="post">
					  Park Name: <input type="text" name="parknameP"><br><br>
					  Area: <input type="text" name="areaP"><br><br>
					  Address: <input type="text" name="addressP"><br><br>
					  Other: <input type="text" name="otherP"><br><br>
					  Restrooms: <input type="text" name="restroomsP"><br><br>
					  Park District: <input type="text" name="parkDistrictP"><br><br>
					  Area Description: <input type="text" name="areadescriptionP"><br><br>
					  <input type="submit" class="btn btn-primary" value="Submit"><br>
					</form>
					
			<h2>Add a Trail</h2>
					<form action="AdminServlet" method="post">
					  Park Name: <input type="text" name="parknameT"><br><br>
					  Trail Name: <input type="text" name="trailnameT"><br><br>
					  Trail Length: <input type="text" name="traillengthT"><br><br>
					  Difficulty: <input type="text" name="difficultyT"><br><br>
					  Terrain: <input type="text" name="terrainT"><br><br>
					  Features: <input type="text" name="featuresT"><br><br>
					  Direction: <input type="text" name="directionT"><br><br>
					  Notes: <input type="text" name="notesT"><br><br>
					  <input type="submit" class="btn btn-primary" value="Submit"><br>
					</form>
			</div>
		</div>
	</main>
</body>
</html>