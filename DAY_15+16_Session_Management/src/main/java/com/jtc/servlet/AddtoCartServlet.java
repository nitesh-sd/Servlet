package com.jtc.servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(name = "addToCart", urlPatterns  = "/addToCart.jtc" )
public class AddtoCartServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//1. Collect the Data
		String bname = req.getParameter("bname");
		System.out.println(bname);
		String page = "ShowBooks.jsp";
		HttpSession session = req.getSession();
		List<String> myCart = (List<String>)session.getAttribute("MyCart");
		myCart.add(bname);
		session.setAttribute("MyCart", myCart);
		System.out.println(myCart);
		
		RequestDispatcher rd = req.getRequestDispatcher(page);
		rd.forward(req, res);
	}
}
