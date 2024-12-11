<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style type="text/css">
#main {
	padding: none;
	margin: none;
}

 #email,#password{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

#login {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

#login:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>
	<h1>Login page</h1>

	<div id="main">
		<div id="sec">
			<form action="login" method="post">
				Email <input type="email" id="email" name="email" text="email or username" required="required"> <br>
				Password <input type="password" name="password" text="email" id="password" required="required"> <br>
				<br>
				<button type="submit" id="login">Login</button>
				<br>
			</form>
		</div>
	</div>
</body>
</html>