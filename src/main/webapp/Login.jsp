<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/style.css">
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1 id="heading">Login page</h1>

	<div id="main">
		<div id="sec">
			<form action="login" method="post">
				Email <input type="email" id="email" name="email" required="required"> <br>
				Password <input type="password" name="password" id="password" required="required"> <br>
				<br>
				<button type="submit" id="login">Login</button>
				<br>
			</form>
		</div>
	</div>
</body>
</html>