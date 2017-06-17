<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Página principal</title>

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
	background-image: url(img/pagina0.jpg);
	background-attachment: fixed; /*para que sea estático*/
	background-position: top right; /*arriba a la derecha*/
	background-repeat: no-repeat; /*que no se repita el fondo*/
}

h1 {
background-color: #0090ff;
text-align: center;
color: white;
}

h2 {
text-align: center;
color: #232323;
}

label {
color: #232323;

}

</style>
</head>
<body>
	<h1>Transcomunicación instrumental mediante ficheros de texto
		digitales</h1>
	<h2>Generar Fichero</h2>
	<form action="GenerarFichero" class="form-inline">
		<div class="form-group">
			<label for="fichero">Directorio y nombre del fichero:</label> <input
				type="text" name="fichero" placeholder="/directorio/fichero" required>
		</div>
		<div class="form-group">
			<label for="lineas">Número de lineas:</label> <input type="number"
				min="0" name="lineas" required>
		</div>
		<div class="form-group">
			 <input type="checkbox"
				name="numeros" value="yes">
				<label for="numeros">Incluir números</label>
		</div>
		<button type="submit" class="btn btn-primary">Generar fichero</button>
	</form>

	<h2>Leer Fichero</h2>
	<form action="LeerFichero" class="form-inline">
		<div class="form-group">
			<label for="ficheros">Ruta y nombre del fichero:</label> <input
				type="text" name="fichero" placeholder="/ruta/fichero" required><br />
		</div>
		<button type="submit" class="btn btn-primary">Leer fichero</button>
	</form>
	<p><b>Nota:</b> si no se introduce directorio, se escogerá el escritorio como directorio</p>
</body>
</html>