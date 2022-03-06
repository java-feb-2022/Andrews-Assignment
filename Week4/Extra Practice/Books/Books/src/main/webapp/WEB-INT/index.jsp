<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Language</th>
				<th>Number of Pages</th>
				<th>Actions</th>
			</tr>
		</thead>
			<tbody>
				<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.title}</td>
					<td>${book.description}</td>
					<td>${book.language}</td>
					<td>${book.numberOfPages}</td>
					<td><a href="/api/books/${book.id}">Delete</a></td>
				</tr>
				</c:forEach>
		</tbody>
	</table>
	<a href="/api/books/create">New Book</a>
</body>
</html>