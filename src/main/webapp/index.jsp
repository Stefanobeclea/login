<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="ISO-8859-1">
			<title>Accedi</title>
		</head>
		<body>
			<h1>Pagina di Login<br></h1>
			
			<form action="CheckPresenzaServlet" method="post">
				<h2>Inserisci i dati richiesti per accedere</h2><br>
				
				Nome: 
				<input type="text" name = "nomeInput"> <br>
				
				Cognome:
				<input type="text" name = "cognomeInput"> <br>
			
				<input type="submit" value="Invia">
			
			</form>
		</body>
	</html>