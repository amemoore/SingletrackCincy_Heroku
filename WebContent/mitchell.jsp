<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.LinkedList, sc.business.Park, sc.business.Trail" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="main.css">
	<title>Mitchell Memorial Forest</title>
</head>

<body>
	<header>
		<div class="jspTop">
			
		</div>
	</header>

	<main>
		<div class="jspMain">
			<h1>Mitchell Memorial Forest</h1>
			
			<a href="https://www.facebook.com/Mitchell-Memorial-Forest-Mountain-Bike-Trail-209920917752/"><img src="images/FacebookIconSquare.png" alt="Facebook" ></a>
			<a href="http://www.greatparks.org/parks/mitchell-memorial-forest" id="webBackground">Great Parks Website</a>
			<div>
			<p>Mitchell Memorial Forest is located on the west side of Cincinnati adjacent to the Great Miami River.  
			It is in close proximity to Miamitown and easy to reach from I-275 and I-74.  There are two mountain biking trails here.  
			Trail A feeds into Trail B for a total of 8.1 miles.  Great place for an after-work evening ride.  Mitchell Memorial 
			Forest is a part of Great Parks of Hamilton County, but the trails are maintained by CORA.  Check out their facebook
			page to see if the trails are clear to ride.</p>
			</div>
			
			
			<div >
					<table align="center" class="jspTables">
						<%
							Park currentPark = (Park)request.getAttribute("parks");
						%>
						<tr><td>Address: </td><td><%=currentPark.getAddress()%></td></tr>
						<tr><td>Location: </td><td><%=currentPark.getArea()%></td></tr>
						<tr><td>Restrooms: </td><td><%=currentPark.getRestrooms()%></td></tr>
					</table>
			</div>
			
			<div >	
					<table align="center" class="jspTables">
					<% 
						LinkedList<Trail> currentTrails = (LinkedList<Trail>) request.getAttribute("trails");
							for (Trail t: currentTrails){
					%>
						<tr><th class="trailTitle"><%=t.getTrailName()%></th></tr>
						<tr><td>Difficulty: </td><td><%=t.getDifficulty()%></td></tr>
						<tr><td>Trail Length: </td><td><%=t.getTrailLength()%></td></tr>
						<tr><td>Terrain: </td><td><%=t.getTerrain()%></td></tr>
						<tr><td>Obstacles: </td><td><%=t.getObstacles()%></td></tr>
					
					<%
					} 
					%>
					</table>
			</div>
			
		</div>
		<section class="jspBottom">
		
		
		
		</section>
	</main>

</body>
</html>