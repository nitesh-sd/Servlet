<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JTC Book Store</h1>
	<h2>Books Available in this ${CAT} category</h2>
	<div>
		<form action="showMyCart.jtc">
			<input type="submit" value="Show MyCart " />
		</form>
	</div>
	<table>
		<%
		Object obj = session.getAttribute("BookList");
		if (obj != null) {
			List<String> bookList = (List<String>) obj;
			int count = 1;
			for (String bname : bookList) {
		%>
		<tr>
			<td><%=count++%></td>
			<td><%=bname%></td>
			<td>Rs 500</td>
			<td>10% off</td>
			<td>
				<form action="addToCart.jtc">
					<input type="hidden" name="bname" value="<%=bname%>" />
					<input type="submit" type="submit" value="Add To Cart" />
					
				</form>
			</td>
		</tr>
		<%
		}
		}
		%>


	</table>
</body>
</html>