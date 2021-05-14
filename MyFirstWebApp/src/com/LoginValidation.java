package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginValidation
 */
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("fname");
		String password = request.getParameter("pwd");
		HttpSession session = request.getSession();
		
		session.setAttribute("userid", userId);
		session.setAttribute("password", password);
		if(!userId.equals("") && !password.equals("")) {
			response.sendRedirect("DashboardServlet");
		} else {
			
		PrintWriter out =response.getWriter();
		out.println("<html><body>");
		System.out.println("User id or Password is null <br>");
		out.println("<a href='login.html'>Login Page</a><br>");
		out.println("</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
