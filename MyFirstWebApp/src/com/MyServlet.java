package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
//		out.print("Hello World, Service method");
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		String name = request.getParameter("name");
		String address = request.getParameter("address");
		out.println("Name=" + name + "<br>Address=" + address);
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out1 = response.getWriter();
		out1.println("<html><body>");

		String name1 = request.getParameter("name");
		String address = request.getParameter("address");
		out1.println("Name=" + name1 + "<br>Address=" + address);
		out1.println("</body></html>");
		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("fname");
		out.print("Hello World, do post method");
		out.print("<br/> Hello bu" + name);
	}

}
