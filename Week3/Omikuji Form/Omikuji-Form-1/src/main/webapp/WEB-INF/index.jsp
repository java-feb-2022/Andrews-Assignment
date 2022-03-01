<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<h1>Send an Omikuji!</h1>
	<form class="form" action="/submit" method="post">
		<label>Enter a number between 5 and 25:</label>
  		<div class="in">
  			<input type="number" class="form-control" name="number" aria-describedby="basic-addon1">
		</div>
  		
  		<label>Enter the name of any real person:</label>
  		<div class="input-group mb-3">
  			<input type="text" class="form-control" name="name" aria-describedby="basic-addon1">
		</div>
		
		<label>Enter the name of any city:</label>
  		<div class="input-group mb-3">
  			<input type="text" class="form-control" name="city" aria-describedby="basic-addon1">
		</div>
		
  		<label>Enter professional endeavor or hobby:</label>
  		<div class="input-group mb-3">
  			<input type="text" class="form-control" name="hobby" aria-describedby="basic-addon1">
		</div>
		
		<label>Enter any type of living thing:</label>
		<div class="input-group mb-3">
  			<input type="text" class="form-control" name="living" aria-describedby="basic-addon1">
		</div>
		
		<label>Say something nice to someone:</label>
		<div class="input-group">
  			<textarea class="form-control" name="nice" aria-label="With textarea"></textarea>
		</div>
 		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>