package com.javarevolutions.jsps.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javarevolutions.jsps.servlets.vo.VOLogin;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/WebLogin.jr")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("user");
		String password = request.getParameter("password");
		System.out.println("user : "+  user);
		System.out.println("password : "+ password);
		if(usuario.equals("Rodrigo") &&  password.equals("Santisteban")) {
			VOLogin vo = new VOLogin();
			vo.setUser(user);
			vo.setPassword(password);
			vo.setAge(18);
			vo.setName("Rodrigo Santisteban");
			request.setAttribute("UserLogged", vo);
			request.getRequestDispatcher("welcomeuser.jsp").forward(request,response);
		}else {
			System.out.println("Los datos ingresados no son correctos");
			response.sendRedirect("login.html");
		}
		
	}

}
