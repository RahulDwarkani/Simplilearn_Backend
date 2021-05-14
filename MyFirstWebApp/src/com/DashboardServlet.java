package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DashboardServlet
 */
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashboardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String userId = null;
		HttpSession session = request.getSession();
		
		if (session!=null && session.getAttribute("userid").equals("rahul") && session.getAttribute("password").equals("rahul")) {
			userId = (String) session.getAttribute("userid");
			out.println("UserId obtained from session :" + userId + "<br>");
            out.println("<a href='LogoutSession'>Logout of session</a><br>");
			
		} else {			
            out.println("Credential found incorrect in session.<br>");
            userId = (String) session.getAttribute("userid");
            String pwd = (String) session.getAttribute("userid");
            System.out.println(userId + " " + pwd);
		}
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
