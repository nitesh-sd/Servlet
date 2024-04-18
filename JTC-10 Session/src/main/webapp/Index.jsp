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
	<h2>Search Books</h2>
	<form action="searchBooks.jtc"></form>
	<table>
		<tr>
			<td>Select category</td>
		</tr>
		<tr>
			<td><select name = "category"></select></td>
			<option value ="">Select category</option>
			<option value ="JAVA">Java Prog</option>
			<option value ="Python">Python prog</option>			
		</tr>
		<tr>
		<td><input type = "submit" value = "Show Books"/></td>
		</tr>
	</table>

</body>
</html>