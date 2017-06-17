package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LeerFichero extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		ArrayList<String> diccionario = new ArrayList<String>();

		try {
			BufferedReader bf = new BufferedReader(new FileReader("/home/jose/espa~nol.words"));
			String palabras = "";

			while (palabras != null) {
				palabras = bf.readLine();
				if (palabras != null) {
					diccionario.add(palabras);
				}
			}
		} catch (IOException e) {
			PrintWriter out = response.getWriter();

		}
		try {
			BufferedReader bf = new BufferedReader(new FileReader(request.getParameter("fichero")));
			String linea = "";
			String color = "black";
			String s2;
			PrintWriter out = response.getWriter();

			int i = 0;
			while (linea != null) {

				linea = bf.readLine();
				int numTokens = 0;
				if (linea != null) {
					StringTokenizer st = new StringTokenizer(linea);

					// bucle por todas las palabras
					while (st.hasMoreTokens()) {
						s2 = st.nextToken();

						for (int num = 0; num < diccionario.size(); num++) {
							if (s2.equals(diccionario.get(num))) {
								color = "orange";
							}
						}
						out.print("<font color=" + color + ">" + s2 + " <font>");
						color = "black";
						numTokens++;

					}
					i++;
				}

			}
			out.print("<br/><a href=\"Redirigir\">Volver atrás<a><br/>");

			bf.close();
		} catch (IOException e) {
			PrintWriter out = response.getWriter();
			out.print("<h1>Este fichero no existe</h1><br/>");
			out.print("<a href=\"Redirigir\">Volver atrás<a><br/>");

		}
	}
}
