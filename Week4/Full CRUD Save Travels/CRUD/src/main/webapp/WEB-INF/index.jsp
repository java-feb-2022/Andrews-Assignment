<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
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
					<c:forEach items="${items}" var="items">
					<tr>
						<td><a href="/item/${items.id}">${items.name}</a></td>
						<td>${items.vendor}</td>
						<td>${items.cost}</td>
						<td>${items.description}</td>
						<td><a href="/update/${items.id}">Update</a> | <a href="/delete/${items.id}">Delete</a></td>
					</tr>
					</c:forEach>
			</tbody>
		</table>
	</div>
	<form:form class="mb-3" action="/submit" method="POST" modelAttribute="item">
	
		<div>
			<form:label path="name">Expense Name:</form:label>
			<br/>
			<form:input path="name" />
			<br/>
			<form:errors path="name" class="text-danger" />
		</div>
		<div>
			<form:label path="vendor">Vendor Name:</form:label>
			<br/>
			<form:input path="vendor" />
			<br/>
			<form:errors path="vendor" class="text-danger" />
		</div>
		<div>
			<form:label path="cost">Cost:</form:label>
			<br/>
			<form:input path="cost" />
			<br/>
			<form:errors path="cost" class="text-danger" />
		</div>
		<div>
			<form:label path="description">Description:</form:label>
			<br/>
			<form:textarea path="description" ></form:textarea>
			<br/>
			<form:errors path="description" class="text-danger" />
		</div>

		<button>Create</button>

	</form:form>
</body>
</html>