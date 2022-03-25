<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Edit Book</title>
</head>
<body>
	<div class="dash">
		<h1><c:out value="${currentUser.name}"/></h1>
		<div>
			<a href="/logout">Log Out</a><br>
			<a href="/dash">Home</a>
		</div>
	</div>
	<h2>Edit Book</h2>
	<div class="view">
		
		<div>
			<form:form action="/book/submit/${book.id}" method="POST" modelAttribute="book">
				<div>
					<form:label path="title">Title:</form:label><br>
					<form:input path="title" value="${book.title}"/>
					<form:errors path="title"/>
				</div>
				<div>
					<form:label path="author">Author:</form:label><br>
					<form:input path="author" value="${book.author}"/>
					<form:errors path="author"/>
				</div>
				<div>
					<form:label path="thoughts">Thoughts:</form:label><br>
					<form:textarea path="thoughts" value="${book.thoughts}" rows="3"/>
					<form:errors path="thoughts"/>
				</div>
				<div>
					<form:input type="hidden" path="users" value="${book.users.id}" />
					<form:errors path="users" class="error"/>
				</div>
				<button>Submit</button>
			</form:form>
		</div>
		
	</div>
</body>
</html>