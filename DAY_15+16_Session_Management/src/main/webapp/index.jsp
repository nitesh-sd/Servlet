<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JTC</h1>
	<h2>Search Books</h2>
	<form action="searchBooks.jtc" method = "get">
	<font color = "red" size = "5">${MSG}</font>
		
		<table>
			<tr>
				<td>Select Category</td>
			</tr>
			<tr>
				<td><select name="category">
						<option value="">Select Category</option>
						<option value="JAVA">JAVA Prog</option>
						<option value="PYTHON">Python Prog</option>
						<option value="WEB">WEB Prog</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Show Books" /></td>
			</tr>
		</table>
	</form>
</body>
</html>