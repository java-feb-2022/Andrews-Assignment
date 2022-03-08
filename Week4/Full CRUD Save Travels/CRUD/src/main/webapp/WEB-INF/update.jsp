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
	<form:form action="/edit/${items.id}" method="post" modelAttribute="items">
		<input type="hidden" name="_method" value="put">
		<div class="form-group">
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

		<button>Edit</button>

	</form:form>
</body>
</html>