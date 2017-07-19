<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.ArrayList, sc.business.Park, sc.business.Trail" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="main.css">
	<title>Mitchell Memorial Forest</title>
</head>

<body>
	<img src="images/mitchell.jpg" alt="Trail View" style="width:304px;height:228px;float:left;border:solid white 5px">
	<h1>Mitchell Memorial Forest</h1>




<table align="center">
		<%
			Park currentPark = (Park)request.getAttribute("parks");
		%>
		<tr><td>Address: </td><td><%=currentPark.getAddress()%>, <%=currentPark.getCity()%> <%=currentPark.getState()%>, <%=currentPark.getZip()%></td></tr>
		<tr><td>Location: </td><td><%=currentPark.getArea()%></td></tr>
		<tr><td>Restrooms: </td><td><%=currentPark.getRestrooms()%></td></tr>
	</table>


</body>
</html>