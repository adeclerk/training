package com.thefax.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class ShoppingFilter
 */
public class ShoppingFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ShoppingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here - execute during request
		System.out.println("Client IP: " + request.getRemoteAddr());
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		// execute during response 
		PrintWriter out = response.getWriter();
		out.println("<hr><center>&copy; Copyright TheFax.com </center>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
