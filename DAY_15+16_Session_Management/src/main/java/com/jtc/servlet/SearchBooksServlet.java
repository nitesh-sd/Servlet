package com.jtc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "SearchBook", urlPatterns = "/searchBooks.jtc")
public class SearchBooksServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("SearchBooks Servlet");
		// 1. COllect the data
		String cat = req.getParameter("category");
		System.out.println(cat);
		// 2. Processing the request
		// Now we want to get the session, whether the user is new or old.
		HttpSession sessions = req.getSession(); // here get session is method inside the HttpServletRequest
		// If session is not available then it will create it and give use
		// now we get the session object
		sessions.setAttribute("CAT", cat);
		// myCart code to add the items in the cart

		List<String> mycart1 = (List<String>) sessions.getAttribute("MyCart");
		if (mycart1 == null) {
			List<String> mycart = new ArrayList<>();
			sessions.setAttribute("MyCart", mycart);

		}

		// Now we will add some items to the category
		List<String> blist = new ArrayList<>();
		String msg = "";
		String page = "";
		if (cat == null || cat.length() == 0) {
			msg = "Please Select Category ";
			req.setAttribute("MSG", msg);
			page = "index.jsp";
		} else if (cat.equals("JAVA")) {
			blist.add("Core java 8");
			blist.add("Core java 9");
			blist.add("Core java 10");
			blist.add("Core java 11");
			sessions.setAttribute("BookList", blist);
			page = "ShowBooks.jsp";

		} else if (cat.equals("WEB")) {
			blist.add("Core WEB 1");
			blist.add("Core WEB 2");
			blist.add("Core WEB 3");
			blist.add("Core WEB 4");
			sessions.setAttribute("BookList", blist);
			page = "ShowBooks.jsp";
		} else if (cat.equals("PYTHON")) {
			// If we want to show the relevant booke then we can write following
			/*
			 * blist.add("Python 1"); blist.add("Python 2"); blist.add("Python 3");
			 * blist.add("Python 4");
			 */
			// If there is no books for python then we can write
			msg = "Sorry No Books in this Category : " + cat;

			// sessions.setAttribute("Book List", blist);
			// previously we are storing the data in session but we can store it in req also
			// like this
			req.setAttribute("MSG", msg);
			page = "index.jsp"; // it will show the page
		}
		RequestDispatcher rd = req.getRequestDispatcher(page);
		rd.forward(req, res);

	}
}
