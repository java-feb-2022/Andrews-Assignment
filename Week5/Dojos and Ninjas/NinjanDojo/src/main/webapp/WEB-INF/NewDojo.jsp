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
	<h2>New Dojo</h2>
	<div class="view">
		
		<div>
			<form:form action="/dojo/submit" method="POST" modelAttribute="dojo">
				<div>
					<form:label path="name">First Name:</form:label><br>
					<form:input path="name" />
					<form:errors path="name" class="text-danger"/>
				</div>
				<button>Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>