package com.thefax.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thefax.bean.ProductBean;
import com.thefax.dao.ShoppingDAO;

/**
 * Servlet implementation class ShoppingController
 */
public class ShoppingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request,
							HttpServletResponse response) 
							throws ServletException, IOException {
		
		ShoppingDAO dao = new ShoppingDAO();
		
		// if request is coming from catalog, add item to cart
		String code = request.getParameter("code");
		if(code != null) {
			ProductBean product = dao.getProduct(code);
			// creating an ArrayList object to represent cart for USER 
			ArrayList<ProductBean> cart = null;
			
			// Getting session object for USER cart
			// getSession() method checks for existing session,
			// if no session exists, a new session is created.
			HttpSession session = request.getSession();
			// Getting cart object from the session
			cart = (ArrayList<ProductBean>) session.getAttribute("CART");
			
			// if cart object remains null, it's a new session
			if(cart == null)
				cart = new ArrayList<ProductBean>();
			
			// adding product to cart
			cart.add(product);
			
			// adding or updating cart attribute to session
			session.setAttribute("CART", cart);
			
			// adding cart to request
			request.setAttribute("PRODUCT", product);
			getServletContext().getRequestDispatcher("/summary.jsp").forward(request, response);
			
		} else {
			ArrayList<ProductBean> catalog = dao.getCatalog();
			
			// adding catalog to request scope
			request.setAttribute("CATALOG", catalog);
			
			// forward request to catalog page
			ServletContext srvCtx = getServletContext();
			
			// getting dispatcher from context
			RequestDispatcher reqDsp = srvCtx.getRequestDispatcher("/catalog.jsp");
			
			// forwarding request for invoking service method by passing request and response
			reqDsp.forward(request, response);
		}
		
	}

}
