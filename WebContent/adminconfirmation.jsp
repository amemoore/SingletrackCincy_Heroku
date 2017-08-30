<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.LinkedList, sc.business.Park, sc.business.Trail" %>
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
			        <li><a href="/SingletrackCincy/index.html">HOME</a></li>
		        <li><a href="/SingletrackCincy/print.jsp">PRINT LIST</a></li>
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
			<p>The following trail was added:</p>
				<%Trail t = (Trail) request.getAttribute("newtrail"); %>
				<span>Trail Name:<%=t.getTrailName()%></span><br>
				<span>Park Name:<%=t.getParkName()%></span><br>
				<span>Difficulty:<%=t.getDifficulty()%></span><br>
				<span> Length:<%=t.getTrailLength()%></span><br>
				<span>Terrain:<%=t.getTerrain()%></span><br>
				<span>Features:<%=t.getFeatures()%></span><br><br>
			</div>
		</div>
	</main>
</body>
</html>