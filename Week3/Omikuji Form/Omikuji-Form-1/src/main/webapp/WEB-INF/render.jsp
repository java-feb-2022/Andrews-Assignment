<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="main">
		<h1>Omikuji</h1>
		<div>
			<p><c:out value="${render}" /> </p>
		</div>
		
		<a href="/">Go Back</a>
	</div>
</body>
</html>