<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Pathak</title>
</head>
 <spring:url value="/WebContent/WEB-INF/resources/style.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<body>

	<div class="body"></div>
	<div class="grad"></div>
	<div class="header">
		<div>
			<b>S<span>Pathak's</span></b>
		</div>
	</div>
	<br>
	<div class="login">
		<form action="/TheCore/sumbitForm.html" method="post">
			<input type="text" placeholder="username" name="ID"><br>
			<input type="password" placeholder="password" name="Password"><br>
			<button type="submit">Login</button> 
			<a href="/TheCore/newUser.html">Sign Up</a>
		</form>

	</div>

	<script src='http://codepen.io/assets/libs/fullpage/jquery.js'></script>
</body>
</html>