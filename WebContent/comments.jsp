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
	<title>Comments</title>
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
	
	<div class="jspMain">
		<div class="container text-center">
		<h3 class="commentsTitle">Leave comments or suggestions below:</h3>
		
				<form action="CommentServlet" method="post">
					<div class="jspInputTextArea">
						Name<br>
						<input type="text" name="name" class="blacktext">
						<br>
					</div>
					<div class="jspInputTextArea">
						Email<br>
						<input type="email" name="email" class="blacktext">
						<br>
					</div>
					<div class="jspInputTextArea">
						<h4>${message}</h4>
						Comments<br>
						<textarea name="comments" id="comments" style="font-family:sans-serif;font-size:1.0em;width:50%;color:black;">
						</textarea>
						<br>
						<div class="jspInputTextArea">
						<input type="submit" class="btn btn-primary" value="Submit" >
						</div>
					</div>
				</form>
		</div>
	</div>
</body>
</html>