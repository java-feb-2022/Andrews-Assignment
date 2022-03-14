<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
    <%@ page isErrorPage="true"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${dojo.name} Roster</h1>
	<div>
	<hr>
	 <ul>
	 	<c:forEach var="ninja" items="${dojo.ninjas}">
		<li><c:out value="${ninja.firstName}"/> <c:out value="${ninja.lastName}"/></li>
		</c:forEach>
	</ul> 
	</div>
</body>
</html>