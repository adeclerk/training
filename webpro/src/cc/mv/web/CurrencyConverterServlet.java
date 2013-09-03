package cc.mv.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CurrencyConverterServlet
 */
public class CurrencyConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
	throws ServletException, IOException {
		
		response.setContentType("text/html");
		String amount = request.getParameter("amount");
		double amt = Double.parseDouble(amount);
		
		ServletConfig config = getServletConfig();
		String dollar = config.getInitParameter("DOLLAR");
		
		double dlr = Double.parseDouble(dollar);
		double result = amt * dlr;
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Currency Converter</h1>");
		out.println("<h2>Result: " + result + "</h2>");
	}

}
