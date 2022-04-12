<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<body>
	<div class="container">
		<h1>Error en el formulario</h1>
		<hr />
		<h2>Error en los siguientes campos</h2>
		
		<table border="1" class="table table-striped table-bordered">
			<thead class="thead-dark">
				<tr>
					<th>Full Name</th>
					<th>Email</th>
					<th>Country</th>
					<th>Actions</th>
				</tr>
			</thead>
				<tbody>
					<tr>
						<td>${employee.fullname}</td>
						<td>${employee.email}</td>
						<td>${employee.country}</td>
						<td><a href="/spring-mvc-examplA/employee/showFormForAdd.html">Volver al formulario</a> 
					</tr>
				</tbody>
		</table>
	</div>
</body>
</html>