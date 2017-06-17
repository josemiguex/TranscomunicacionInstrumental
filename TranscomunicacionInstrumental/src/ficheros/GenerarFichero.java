package ficheros;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GenerarFichero extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean error = false;
		//Creo un array que contiene los porcentajes para los carácteres y el array con los carácteres
		double[] porcentajes = { 0, 17.599, 28.706, 38.866, 46.245, 52.086, 57.231, 62.28, 67.254, 72.069, 75, 944,
				79.268, 82.377, 85.395, 87.499, 89.457, 90.944, 92.497, 93.906, 94.931, 95.824, 96.7, 97.495, 98.28,
				98.767, 99.138, 99.458, 99.669, 99.871, 99.942, 99.996, 99.996, 100 };
		String[] letras = { " ", "a", "e", "o", "s", "r", "n", "i", "l", "d", "u", "t", "c", "m", "p", "b", ".", ",",
				"q", "v", "g", "h", "y", "f", "j", "z", ";", "ñ", "x", ":", "k", "w" };

		//Array que contiene los números que se emplea en el caso de que se seleccione el checkbox de incluir números
		String[] numeros = { " cero ", " uno ", " dos", " tres ", " cuatro ", " cinco ", " seis ", " siete ", " ocho ",
				" nueve ", " diez " };

		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter(request.getParameter("fichero")));
			int lineas = Integer.parseInt(request.getParameter("lineas"));

			//Si no se ha seleccionado el checkbox de incluir números, el fichero sólo tendrá carácteres
			if (request.getParameter("numeros") == null) {
				int i;
				for (int filas = 0; filas < lineas; filas++) {
					for (int columnas = 0; columnas < 100; columnas++) {

						i = 0;
						while (i < porcentajes.length) {
							double numero = (double) (Math.random() * 100);
							if (numero >= porcentajes[i] && numero < porcentajes[i + 1]) {
								if (i < 32) {
									bf.write(letras[i]);
								} else if (i == 32) {
									bf.write(letras[i - 1]);
								}
								break;
							}
							i++;
						}

					}
					bf.write("\n");
				}
			} else { //Si no se ha seleccionado el checkbox de incluir números, el fichero tendrá carácteres y números
				int i;
				for (int filas = 0; filas < lineas; filas++) {
					for (int columnas = 0; columnas < 100; columnas++) {

						i = 0;
						
						//Se crea una variable llamada probabilidad que es un número al azar entre 0 y 100
						int probabilidad = (int) (Math.random() * 101);

						//Si la variable es mayor a 5, se introducirá en el fichero un caracter
						if (probabilidad > 3) {
							while (i < porcentajes.length) {
								double porcentaje = (double) (Math.random() * 100);
								if (porcentaje >= porcentajes[i] && porcentaje < porcentajes[i + 1]) {
									if (i < 32) {
										bf.write(letras[i]);
									} else if (i == 32) {
										bf.write(letras[i - 1]);
									}
									break;
								}
								i++;
							}
						} else { //Si la variable es menor que 5, se introducirá un número, por lo que hay un 5% de probabilidades de que se introduzca un número en el fichero
							int numero = (int)(Math.random() * 11);
							bf.write(numeros[numero]);
							i++;
						}

					}
					bf.write("\n");
				}
			}

			bf.close();
		} catch (IOException ioe) {
			System.out.println("No se ha podido escribir en el fichero");
			error = true;
		}
		request.setAttribute("error1", error);
		String nextJSP = "/Pagina0.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request, response);
	}
}
