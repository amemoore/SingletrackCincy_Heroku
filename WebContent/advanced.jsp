<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.LinkedList, sc.business.Park, sc.business.Trail" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<title>Trails By Level</title>
	<link rel="stylesheet" href="main.css">
	<script src="/scripts/jquery.js" type="text/javascript"></script>
</head>

<body>
	<header>
		<div class="jspTop">
		</div>
	</header>
	
	<main>
		<div class="jspMain">>
			<h3>${message}</h3>
				<div >	
				
					<table align="center" class="jspTables">
					<% 
						LinkedList<Trail> currentTrails = (LinkedList<Trail>) request.getAttribute("trails");
							for (Trail t: currentTrails){
					%>
						<tr><td class="parkTitle"><%=t.getParkName()%></td><td>Trail Name:</td><td><%=t.getTrailName()%></td></tr>
						<tr><td></td><td>Trail Length: </td><td><%=t.getTrailLength()%></td></tr>
						<tr><td></td><td>Terrain: </td><td><%=t.getTerrain()%></td></tr>
						<tr><td></td><td>Technical Features: </td><td><%=t.getFeatures()%></td></tr>
					
					<%
					} 
					%>
					</table>
				</div>
		</div>
	</main>
</body>
</html>
