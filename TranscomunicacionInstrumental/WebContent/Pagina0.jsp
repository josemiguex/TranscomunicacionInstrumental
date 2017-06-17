<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Página principal</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<h1>Transcomunicación instrumental mediante ficheros de texto digitales</h1>
<h2>Generar Fichero</h2>
<form action="GenerarFichero" class="form-inline">
  <div class="form-group">
    <label for="email">Ruta y nombre del fichero:</label>
<input type="text" name="fichero" placeholder="/ruta/fichero" required>
</div>
<div class="form-group">
<label for="email">Número de lineas:</label>
<input type="number" min="0" name="lineas" required>
</div>
  <button type="submit" class="btn btn-default">Enviar</button>
</form>

<h2>Leer Fichero</h2>
<form action="LeerFichero" class="form-inline">
  <div class="form-group">
  <label for="email">Ruta y nombre del fichero:</label>
<input type="text" name="fichero" placeholder="/ruta/fichero" required><br/>
</div>
  <button type="submit" class="btn btn-default">Enviar</button>
</form>
</body>
</html>