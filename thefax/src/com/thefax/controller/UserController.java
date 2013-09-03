package com.thefax.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thefax.bean.LoginBean;
import com.thefax.bean.UserBean;
import com.thefax.dao.ShoppingDAO;

/**
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
							HttpServletResponse response) 
							throws ServletException, IOException {
		// Getting request header referer
		String referer = request.getHeader("referer");
		ShoppingDAO dao = new ShoppingDAO();
		if(referer.contains("home.jsp")) {
			// request is coming for login authentication
			LoginBean login = new LoginBean();
			login.setUserid(request.getParameter("user"));
			login.setPassword(request.getParameter("password"));
			
			if(dao.validate(login)){
				HttpSession session = request.getSession();
				session.setAttribute("USER", login.getUserid());
				// forward to shopping controller
				getServletContext().getRequestDispatcher("/shopping.fax").forward(request, response);
			} else {
				// send user back to login
				response.sendRedirect("home.jsp?invalid=true");
			}
		} else {
			// Request is for user registration
			UserBean user = new UserBean();
			user.setName(request.getParameter("name"));
			user.setUserid(request.getParameter("username"));
			user.setPassword(request.getParameter("pw1"));
			user.setEmail(request.getParameter("email"));
			user.setCity(request.getParameter("city"));
			user.setPhone(request.getParameter("phone"));
			user.setAge(Integer.parseInt(request.getParameter("age")));
			
			if(dao.persist(user)) {
				response.sendRedirect("home.jsp");	
			} else {
				response.sendRedirect("registration.jsp");
			}
		}
	}

}
