package se.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String kaka = request.getParameter("kaka");
		//Authorization check
		Auth beanzAuth = new Auth();	
		beanzAuth.setName(name);
		beanzAuth.setValue(kaka);
		beanzAuth.setPassword(password);
		request.setAttribute("Auth", beanzAuth);
		boolean status = beanzAuth.validate();
		//Cookie
		response.addCookie(createCookie(name, kaka));
		
		if (status) {
			RequestDispatcher rd = request.getRequestDispatcher(name + ".jsp");
			rd.forward(request,  response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
		
		
		
	}
	
	private Cookie createCookie(String name, String value) {
			Cookie cookie = new Cookie(name, value);
			cookie.setMaxAge(600);
			cookie.setHttpOnly(true);
			return cookie;
	}

}
