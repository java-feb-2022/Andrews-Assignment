<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<h1>Expense Details</h1>
	<div>
		<label>Name:</label>
		<c:out value="${items.name}" />
	</div>
	<div>
		<label>Vendor:</label>
		<c:out value="${items.vendor}" />
	</div>
	<div>
		<label>Cost:</label>
		<c:out value="$${items.cost}" />
	</div>
	<div>
		<label>Description:</label>
		<c:out value="${items.description}" />
	</div>
	<a href="/">Home</a>
</body>
</html>