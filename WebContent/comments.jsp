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
		<h3 class="commentsTitle">Leave comments or suggestions below:</h3>
		<div class="centerText">
		
		<form action="CommentServlet" method="post">
			<div class="jspInputTextArea">
				Name<br>
				<input type="text" name="name">
				<br>
			</div>
			<div class="jspInputTextArea">
				Email<br>
				<input type="email" name="email">
				<br>
			</div>
			<div class="jspInputTextArea">
				<h4>${message}</h4>
				Comments<br>
				<textarea name="comments" id="comments" style="font-family:sans-serif;font-size:1.0em;width:50%;">
				</textarea>
				<br>
				<div class="jspInputTextArea">
				<input type="submit" value="Submit" >
				</div>
			</div>
		</form>
		</div>
	</div>
	
	
</body>
</html>