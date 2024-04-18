package com.jtcindia.Servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = "/myLogin.jtc")
public class DemoServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		RequestDispatcher rd1 =  req.getRequestDispatcher("Header.jsp");
		rd1.include(req,  res);
		RequestDispatcher rd2 =  req.getRequestDispatcher("Home.jsp");
		rd2.include(req,  res);
		RequestDispatcher rd3 =  req.getRequestDispatcher("Footer.jsp");
		rd3.include(req,  res);
	}
}
