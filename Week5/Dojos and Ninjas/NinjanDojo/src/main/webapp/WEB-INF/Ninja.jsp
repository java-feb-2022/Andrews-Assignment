<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="view">
		<h2>New Ninja</h2>
		
		<div>
			<form:form action="/ninja/submit" method="post" modelAttribute="ninja">
				<div>
					<form:label path="firstName">First Name:</form:label><br>
					<form:input path="firstName" />
					<form:errors path="firstName" class="text-danger"/>
				</div>
				<div>
					<form:label path="lastName">Last Name:</form:label><br>
					<form:input path="lastName" />
					<form:errors path="lastName" class="text-danger"/>
				</div>
				<div>
					<form:label path="age">Age:</form:label><br>
					<form:input path="age" />
					<form:errors path="age" class="text-danger"/>
				</div>
				<div>
					<form:label path="dojo">Dojo</form:label>
					<form:select path="dojo">
						<c:forEach var="dojo" items="${dojo}">
							<option value="${dojo.id}"><c:out value="${dojo.name}" /></option>
						</c:forEach>
					</form:select>
				</div>
				<button>submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>