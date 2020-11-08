<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Respuesta</title>
</head>
<body>
<h1>Esta es la respuesta del formulario</h1>
<h2>El nombre del alumno es: <%= request.getParameter("nombre") %> bienvenido</h2>
</body>
</html>