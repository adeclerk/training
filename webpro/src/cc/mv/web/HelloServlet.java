package cc.mv.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, 
						HttpServletResponse response) 
						throws ServletException, IOException {
		// Setting Response MIME type
		response.setContentType("text/html");
		
		// Getting Response Stream for writing HTML 
		PrintWriter out = response.getWriter();
		
		// Writing html response to stream
		out.println("<h1>Hello Beautiful World</h1>");
		out.println("<h2>Welcome to servlets</h2><hr>");
		Date curDt = new Date();
		out.println("<h3>Now: " + curDt + "</h3>");
	}

}
