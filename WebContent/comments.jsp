<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="main.css">
	<title>Comments</title>
</head>

<body>
	<div class="jspTop">
	</div>
	
	<div class="jspBottom">
		<h3>Leave comments or suggestions below:</h3>
		
		<form action="Admin/Servlet" method="post">
		
			<div class="commentArea">
				<textarea name="comments" id="comments" rows="7" cols="60" style="font-family:sans-serif;font-size:1.0em;">
				</textarea>
			</div>
			<div class="commentSubmit">
				<input type="submit" value="Submit" >
			</div>
		</form>
	</div>
	
	
</body>
</html>