<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login & Signup Module</title>
<style>
#main {
	padding: none;
	margin: none;
}

#heading {
	color: black;
	padding: none;
	margin: none;
	text-align: center;
}

#login, #sign-up {
	color: white;
	background-color: black;
	align-content: center;
	text-align: center;
	border: none;
	border-radius: 5px;
	font-size: 24px;
	font-family: Arial;
	padding: 8px;
	margin: 10px;
	cursor: pointer;
}

#sec {
	display: flex;
	justify-content: center;
	align-items: center;
	margin: 20px;
}

#heading-div{
margin: 0;
padding: 0;
justify-content: center;
align-items: center;
}

#options{
font-size: 30px;
text-align: center;
font-family: "Arial";
}


</style>
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
			<form action="Login.jsp" method="get">
				<button type="submit" id="login">Login</button>
			</form>
			<form action="Signup.jsp" method="get">
				<button type="submit" id="sign-up">Sign Up</button>
			</form>
		</div>
	</div>
</body>
</html>
