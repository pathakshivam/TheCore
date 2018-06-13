<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>${common}</h1>
<h1>Sign Up</h1>
<form:errors path="userInfo.*"/>
<form action="/TheCore/signup.html" method="post">
<p>
User ID : <input type="text" name="ID" />
</p>
<p>
Password :<input type="text" name="Password" />
</p>
<button type="submit">Click</button>
</form>
</body>
</html>
