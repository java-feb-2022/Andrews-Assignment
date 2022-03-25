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
	<title>Show</title>
</head>
<body>
	<div class="dash">
		<h1><c:out value="${currentUser.name}"/></h1>
		<div>
			<a href="/logout">Log Out</a><br>
			<a href="/dash">Home</a>
		</div>
	</div>
	<h2>${book.title}</h2>
		<div>
			<div>
				<label>Author: <c:out value="${book.author}" /></label><br>
			</div><br>
			<label>Thoughts:</label><br>
			<p><c:out value="${book.thoughts}" /></p>
			<label>Submitted by: <c:out value="${book.users.name}" /></label>
		</div>
		<a href="/book/new">Add Book</a>
		<c:if test="${currentUser.id == book.users.id}">
			<a href="/book/edit/${book.id}">Edit</a>
		</c:if>
</body>
</html>