<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fichero creado</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
<style>
body {
	background-image: url(img/pagina1.jpg);
	background-attachment: fixed; /*para que sea estático*/
	background-position: top right; /*arriba a la derecha*/
	background-repeat: no-repeat; /*que no se repita el fondo*/
}

h1 {
background-color: #00cbff;
text-align: center;
}
</style>
</head>
<body>
<%
if (request.getParameter("error").equals("no")) {
out.print("<h1>Fichero generado correctamente</h1>");
} else {
	out.print("<h1>La ruta que has introducido no existe</h1>");

}
%>
		<a href="Pagina0.jsp"><button type="submit" class="btn btn-primary center-block">Volver atrás</button></a>
</body>
</html>