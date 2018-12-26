<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login to Medical Online</title>
<link rel="stylesheet" type="text/css" href="css/login.css" />
</head>

<body>
	<header>
	<div class="login-box">
		<img src="images/login-logo.png" class="avatar">
			<h1>Medical Online</h1>
			<p style="color: red;">${msg}</p>
			<form action="login.do" method="post">
				<p>Username</p>
				<input type="text" name="username" placeholder="Enter Username"
					required="Bạn cần điền đầy đủ thông tin!">
					<p>Password</p> <input type="password" name="password"
					placeholder="Enter Password"
					required="Bạn cần điền đầy đủ thông tin!"> <!--<span><input type="radio" name="gender" value="male" checked> Male </span>
  <span><input type="radio" name="gender" value="female"> Female </span>
  <span><input type="radio" name="gender" value="other"> Other </span>  -->

						<input type="submit" name="submit" value="Login"> <a
							href="#">Forget Password?</a>
							<p class="message">
								<a href="#">Create an account?</a>
							</p>
			</form>
			<form class="register-form" action="register.do" method="post">
				<input type="text" name="username"
					placeholder="Enter Username" required> <input
					type="password" name="password" placeholder="Enter Password"
					required> <input type="password" name="repeatpassword"
						placeholder="Repeat Password" required> <input type="text"
							name="youremail" placeholder="Enter your mail" required>
								<input type="submit" name="create" value="Create">
									<p class="message">
										<a class="" href="#">Back</a>
									</p>
			</form>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script> <script>
		$('.message a').click(function(){
		$('form').animate({height: "toggle", opacity: "toggle"}, "slow");});
	</script> </header>
</body>
</html>
