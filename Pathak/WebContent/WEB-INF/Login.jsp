<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${common}</h1>
<h1>Test Form</h1>
<form action="/TheCore/sumbitForm.html" method="post">
<p>
Action Name : <input type="text" name="ID" />
</p>
<p>
Action ID 	:<input type="text" name="Password" />
</p>
<button type="submit">Click</button>
</form>
</body>
</html>