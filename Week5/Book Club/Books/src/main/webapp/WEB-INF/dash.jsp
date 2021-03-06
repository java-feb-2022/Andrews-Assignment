<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ page isErrorPage="true"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Login and Register</title>
</head>
<body>
	<div class="dash">
		<h1><c:out value="${currentUser.name}"/></h1>
		<div>
			<a href="/logout">Log Out</a><br>
			<a href="/dash">Home</a><br>
			<a href="/book/new">Add Book</a>
		</div>
	</div>
	 	<div>
		
			<h3>Books in the Library</h3>
		
			<table>
				<tr>
					<th>Title</th>
					<th>Author</th>
					<th>Added By</th>
				</tr>
				<c:forEach items="${book}" var="book">
				<tr>
					<td><a href="/book/${book.id}"><c:out value="${book.title}"/></a></td>
					<td><c:out value="${book.author}"/></td>
					<td><c:out value="${book.users.name}"/></td>
				</tr>
				</c:forEach>		
			</table>
			<br>
		</div>
</body>
</html>