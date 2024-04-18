package com.jtc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void init(ServletConfig sc) {
	}
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// 1. Collect input Data
		String name = req.getParameter("sname");

		// 2. Process the request and prepare Response
		String msg = "<h2> Hello" + name + "</h2>";
		msg = msg + "<h3> Welcome to JTC</h3>";

		// 3. Send Response back to Client
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print(msg);
	}
	public void destroy() {
	}
}
