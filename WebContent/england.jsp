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
	<title>England-Idlewild</title>
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
  			<div class="container text-center">
    			<h3>England-Idlewild</h3>  
    			<p class="text-left" id="paragraph">England-Idlewild is located in Burlington, Kentucky close to the Boone County Fairgrounds.  This is by 
    			far a favorite park of the area.  Trails for all abilities.  A pump track that is used that is great to get warmed up on or spend a few hours
    			on.  The central part of the trail system is a meeting area down by the creek with a couple of picnic tables, teeter-totter, and wooden ramp
    			 for practicing.  Check out the map before you go - there are a number of trails and it can be easy to get mixed up.</p>
				
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
							<div class="col-sm-3 text-center">
								<a href="https://www.facebook.com/England-Idlewild-Trails-109081279121449/" class="btn btn-primary" role="button">FB Trails</a>
							</div>
							<div class="col-sm-3 text-center">
								<a href="https://www.facebook.com/EIbikepark/?rf=138193262890460" class="btn btn-primary" role="button">FB Bike Park</a>
							</div>
							<div class="col-sm-3 text-center">
								<a href="http://www.boonecountyky.org/departments/parks/england_idlewild_park_and_dog_park.aspx" class="btn btn-primary" role="button">Park Website</a>
							</div>
							<div class="col-sm-3 text-center">
								<a href="http://www.boonecountyky.org/document_center/Parks/EnglandIdlewild.pdf" class="btn btn-primary" role="button">Map</a>
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
										</form><form  method="POST" action="PrintServlet">
											<input type="hidden" name="addtrail" value="<%=t.getTrailName()%>">
											<button type="submit" class="btn btn-primary btn-sm">Add to Print List</button>
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