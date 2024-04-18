<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JTC</h1>

	<h2>Login Form</h2>

	<%
	Object obj = request.getAttribute("");
	if (obj != null) {
		out.print(obj);
	}
	%>
	
	<form action="myLogin.jtc">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="myusername"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="mypassword"></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td colspan ="2" align ="center" ><input type="submit" value = "login"></td>
			</tr>
		</table>
		</form>
</body>
</html>