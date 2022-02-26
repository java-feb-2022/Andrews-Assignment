<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/styles.css"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Fruit Store</h1>
	<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
	<c:forEach var="fruit" items="${fruits}">
  <tbody>
    <tr>
      <td><c:out value="${fruit.name}"/></td>
      <td><c:out value="$${fruit.price}"/></td>
    </tr>
  </tbody>
  </c:forEach>
</table>
	
</body>
</html>