package com.jtc.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name="showMyCart",urlPatterns = "/showMyCart.jtc" )
public class ShowCartServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String page = "showCart.jsp";
		
		
		
		RequestDispatcher rd = req.getRequestDispatcher(page);
		rd.forward(req, res);
		
	}
	
	

}
