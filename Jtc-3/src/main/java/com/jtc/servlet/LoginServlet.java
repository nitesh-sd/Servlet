package com.jtc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = { "/login.jtc", "/myhello.jtc" })

public class LoginServlet extends HttpServlet {
	public LoginServlet() {
		System.out.println("Constr in LoginServlet");
	}
	public void init(ServletConfig sc) {
		System.out.println("Init Method");

	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// 1. Collect the input Data
		System.out.println("Service method");
		String un = req.getParameter("sname");
		String pw = req.getParameter("mypassword");

		// 2. Process the request
		String msg = "";
		if (un.equals(pw)) {
			msg = "<h2> Hello " + un + "</h2>";
			msg = msg + "<h3> Login Success Welcome to JTC </h3>";
		} else {
			msg = msg + "<h3>Login Failed </h3>";
		}
		// 3. Send Response to client
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print(msg);
	}
}
