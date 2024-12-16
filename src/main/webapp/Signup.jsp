<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up Page</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<h1 id="heading">Sign Up page</h1>

	<div id="main">
		<div id="sec">
			<form action="signup" method="post">
				Name <input type="text" id="name" name="name" required="required">
				<br> Phone number <input type="number" id="number"
					name="number"> <br> Date of Birth <input type="date"
					id="date" name="date"> <br> Email <input type="email"
					id="email" name="email" required="required"> <br>
				Password <input type="password" name="password" id="password"
					required="required"> <br> Confirm Password <input
					type="password" name="password" id="confirm-password" required="required">
				<br> <label for="gender">Gender:</label> <select name="gender"
					id="gender">
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="others">Others</option>
				</select> <br>
				<button type="submit" id="login">Sign Up</button>
				<br>
			</form>
		</div>
	</div>
</body>
</html>