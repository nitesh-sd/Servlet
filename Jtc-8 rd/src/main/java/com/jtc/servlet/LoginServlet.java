package com.jtc.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = { "/mylogin.jtc" })
public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		String un = req.getParameter("myusername");
		String pw = req.getParameter("mypassword");
		String page = "";
		if(un.equals(pw)) {
			request.
		}
	}
}
