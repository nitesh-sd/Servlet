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
	<font color = "red" size = "5">
	<%
	Object obj = request.getAttribute("MSG");
	if (obj != null) {
		out.print(obj);
	}
	%>
	</font>
	<form action="myLogin.jtc">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="myusername"></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="mypassword" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					name="login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>