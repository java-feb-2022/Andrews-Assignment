<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<c:forEach var="fruit" items="${fruits}">
	<c:out value="${fruit.name} ${fruit.price}"/>
	</c:forEach>
</body>
</html>