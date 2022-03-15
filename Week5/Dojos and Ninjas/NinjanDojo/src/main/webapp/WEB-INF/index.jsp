<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
    <%@ page isErrorPage="true"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Dojo List</title>
</head>
<body>
	<h1>Dojos</h1>
	<div>
	<hr>
	 <ul>
	 	<c:forEach var="dojo" items="${dojo}">
  		<li><a href="/dojo/${dojo.id}">${dojo.name}</a></li>
  		</c:forEach>
	</ul> 
	<hr>
	<div>
	<a href="/dojo">Add Dojo</a><br>
	<a href="/ninja">Add Ninja</a>
	</div>
	</div>
</body>
</html>