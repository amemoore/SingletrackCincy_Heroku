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
		<div class="jspBottom">
			<h1>Mitchell Memorial Forest</h1>
			<div class="half-width">
					<table align="center" class="jspTables">
						<%
							Park currentPark = (Park)request.getAttribute("parks");
						%>
						<tr><td>Address: </td><td><%=currentPark.getAddress()%>, <%=currentPark.getCity()%> <%=currentPark.getState()%>, <%=currentPark.getZip()%></td></tr>
						<tr><td>Location: </td><td><%=currentPark.getArea()%></td></tr>
						<tr><td>Restrooms: </td><td><%=currentPark.getRestrooms()%></td></tr>
					</table>
			</div>
			
			<div class="half-width">	
					<table align="center" class="jspTables">
					<% 
						LinkedList<Trail> currentTrails = (LinkedList<Trail>) request.getAttribute("trails");
							for (Trail t: currentTrails){
					%>
						<tr><td>Trail Name: </td><td><%=t.getTrailName()%></td></tr>
						<tr><td>Trail Length: </td><td><%=t.getTrailLength()%></td></tr>
						<tr><td>Difficulty: </td><td><%=t.getDifficulty()%></td></tr>
						<tr><td>Terrain: </td><td><%=t.getTerrain()%></td></tr>
						<tr><td>Obstacles: </td><td><%=t.getObstacles()%></td></tr>
					
					<%
					} 
					%>
					</table>
			</div>
			
		</div>
	</main>

</body>
</html>