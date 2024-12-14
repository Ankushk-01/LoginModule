<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./css/Index.css">
<title>Login & Signup Module</title>
</head>
<body>
	<div id="main">
		<h1 id="heading">Welcome to the Login Module</h1>
		<div id="sec">
			<img alt="image not found" src="home.jpg" width="400" height="400"
				align="center">
		</div>
		<div id="heading-div">
			<p id="options">Please choose an option to proceed:</p>
		</div>
		<div id="sec">
			<form action="login.jsp" method="get">
				<button type="submit" id="login">Login</button>
			</form>
			<form action="signup.jsp" method="get">
				<button type="submit" id="sign-up">Sign Up</button>
			</form>
		</div>
	</div>
</body>
</html>
