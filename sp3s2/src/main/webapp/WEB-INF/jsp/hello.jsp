<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing Page</title>
</head>
<body>
	<h1>Please enter your name and the feedback you wish to give.</h1>
	<br>
	<form id = "feedback" action = "feedback" method = "post">
		<label>Name:</label>
		<input type = "text" name = "responderName">
		<br>
		<label>Feedback:</label>
		<input type = "text" name = "feedbackString">
		<br>
		<button type = "submit">Submit</button>
	</form>
</body>
</html>