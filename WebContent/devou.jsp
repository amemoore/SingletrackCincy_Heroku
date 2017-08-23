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
	<title>Devou Park</title>
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
  			<div class="container text-center">
    			<h3>Devou Park</h3>  
    			<p class="text-left" id="paragraph">Devou Park is located between Ludlow and Covington Kentucky. You basically ride up the hill to 
    			get to the rest of the trails, but the best part is the last, the ride down.</p>
				
				<div class="row">
					<div class="col-sm-6 text-left">  
						<h3 class="h3extrasjsp">General Information</h3>  
								<%
									Park currentPark = (Park)request.getAttribute("parks");
								%>
									<span><strong>Address</strong></span><br>
									<span><%=currentPark.getAddress()%></span><br><br>
									<span><strong>Location</strong></span><br>
									<span><%=currentPark.getArea()%></span><br><br>
									<span><strong>Other Activities</strong></span><br>
									<span><%=currentPark.getOther()%></span><br><br>
									<span><strong>Restrooms</strong></span><br>
									<span> <%=currentPark.getRestrooms()%></span><br>
						<div class="row" id="buttons">
							<div class="col-sm-4 text-center">
								<a href="https://www.facebook.com/Devou-Park-Trails-216386225070434/"class="btn btn-primary" role="button">Facebook</a>
							</div>
							<div class="col-sm-4 text-center">
								<a href="http://www.covingtonky.gov/visitors/parks/devou-park" class="btn btn-primary" role="button">Park Website</a>
							</div>
							<div class="col-sm-4 text-center">
								<a href="http://www.covingtonky.gov/Portals/covingtonky/Documents/Maps/DevouParkKiosk_May2016.pdf" class="btn btn-primary" role="button">Map</a>
							</div>
						</div>
					</div>
					<div class="col-sm-6 text-left" id="traillist">  
							<h3 class="h3extrasjsp" >Trails</h3>
									<% 
										LinkedList<Trail> currentTrails = (LinkedList<Trail>)request.getAttribute("trails");
											for (Trail t: currentTrails){
									%>
										<span><strong><%=t.getTrailName()%></strong></span><br>
										<span>Difficulty:<%=t.getDifficulty()%></span><br>
										<span>Length:<%=t.getTrailLength()%></span><br>
										<span>Terrain:<%=t.getTerrain()%></span><br>
										<span>Features:<%=t.getFeatures()%></span><br><br>
										<form action="PrintServlet" >
    										<input type="submit" class="btn btn-primary" name="addtoprintlist" value="Add to print list" />
										</form>
										<br>
									<%
										} 
									%>
					 </div>
				</div>
			</div>
		</div>
	</main>
</body>
</html>