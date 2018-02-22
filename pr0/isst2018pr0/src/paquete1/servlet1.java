package paquete1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1");
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//cambio en doGet() desde repositorio remoto
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//comentario para crear version diferente
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

/*
@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
HttpSession sesion = request.getSession(true);
response.setContentType("text/html");
PrintWriter html = response.getWriter();
html.print("<strong>");
Date date = (Date)sesion.getAttribute("date");
if(date != null) {
html.print("Último acceso de la sesión: " + date + "<br>");
}
else {
html.print("Este es el primer acceso de la sesión <br>");
}
date = new Date();
sesion.setAttribute("date", date);
html.print("Fecha actual: " + date);
html.print("</strong>");
}
}
*/
