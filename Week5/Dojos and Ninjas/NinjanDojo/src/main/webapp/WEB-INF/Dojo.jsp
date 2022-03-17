<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
    <%@ page isErrorPage="true"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Show Dojo</title>
</head>
<body>
	<h1>${dojo.name} Student List</h1>
	<div>
	<hr>
	 <ul>
	 	<c:forEach var="ninja" items="${dojo.ninjas}">
		<li><c:out value="${ninja.firstName}"/> <c:out value="${ninja.lastName}"/></li>
		</c:forEach>
	</ul> 
	</div>
	<p><a href="/">Dojos</a> <a href="/dojo">Dojos</a></p>
</body>
</html>