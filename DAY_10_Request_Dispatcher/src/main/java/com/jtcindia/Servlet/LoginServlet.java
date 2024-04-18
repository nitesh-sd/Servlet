package com.jtcindia.Servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = { "/myLogin.jtc" })
public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		String un = request.getParameter("myusername");
		String pw = request.getParameter("mypassword");
		String page = "";
		if(un.equals(pw)) {
			request.setAttribute("UN", un);
			page = "home.jsp";
			//If login is successfull then it will goes to the home page
		}else {
			String msg = "Invalid Username or Password";
			request.setAttribute("MSG", msg);
			page = "login.jsp";
			//If login is not successfull then it will again redirected to the login page.
		}
		try {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		//If the un.equals(pw) is true then page value will be home.jsp
		//If the un.equals(pw) is false then page value will be login.jsp
		rd.forward(request, response);
		}catch(ServletException | IOException e){
			e.printStackTrace();
			
		}
	}

}
