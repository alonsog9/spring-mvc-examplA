<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--@ taglib uri="https://java.sun.com/jsp/jstl/core" prefix="c"--%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body style = "background-color:#03BB85">
	<h1>Hello world!</h1>
	<P style = "font-weight: bold">The time on the server on five days will be ${serverTime}.</p>
	<form action="user" method="post">
		<input type="text" name="userName"><br>
		<P>Introduce un numero entero</p>
		<input type="text" name="userTag"><br> <input
			type="submit" value="Enviar">
	</form>

</body>
</html>