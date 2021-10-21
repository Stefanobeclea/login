<%@page import="it.prova.web.model.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Benvenuto</title>
	</head>
	<body>
		<h1>Non so chi tu sia! 
		<% Persona personaPassataDallaServlet = (Persona)request.getAttribute("personaAttribute");%>
		<%= personaPassataDallaServlet.getNome() %>
		<%= personaPassataDallaServlet.getCognome()%></h1>
		<br>
		<br>
		<a href="index.jsp">HOME</a>
	</body>
</html>