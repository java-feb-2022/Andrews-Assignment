<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<title>Insert title here</title>
</head>
<body>
	<div class="center">
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th scope="col">Title</th>
					<th scope="col">Description</th>
					<th scope="col">Language</th>
					<th scope="col">Number of Pages</th>
					<th scope="col">Actions</th>
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
	</div>
	<a href="/api/books/create">New Book</a>
</body>
</html>