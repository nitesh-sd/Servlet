package com.jtcindia.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "mydemo", urlPatterns = "/mydemo.jtc")
public class DemoServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		// HttpSession session = req.getSession(true);
		// HttpSession session = req.getSession(false);
		System.out.println(session);
		// checking whether the request is sending by the new user or not
		System.out.println("IsNew   : " + session.isNew());
		System.out.println("ID  : " + session.getId());
		System.out.println("Creationtime  :" + session.getCreationTime());
		System.out.println("Last Accessed Time  :" + session.getLastAccessedTime());
		System.out.println("Max Inactive Interval  :" + session.getMaxInactiveInterval());
		System.out.println("After set the MaxInactiveInterval");
		session.setMaxInactiveInterval(800); // here we set the Max time interval for which the session is inactive
		System.out.println("Max Inactive Interval  :" + session.getMaxInactiveInterval());
		// here we are trying to fetch the email. whether there is any email attribute
		// present or not
		System.out.println("Fetchin the Email");
		System.out.println("Email  :" + session.getAttribute("Email"));// since we are not set any Email attribute so
																		// here we will get null as output
		System.out.println("After setting the email attribute  ");
		session.setAttribute("Email", "abc@jtc");
		System.out.println("Email  :" + session.getAttribute("Email"));// since we set the Email attribute so here we
																		// will get abc@jtc as output
		// Removing the Attribute
		System.out.println("Removing the Attribute");
		session.removeAttribute("Email");
		System.out.println("Email  :" + session.getAttribute("Email"));// since we remove the Email attribute so here we
																		// will get null as output

		session.invalidate();
		// After invalidate this we are going to make one more session object and then
		// call the isNew() and getId() method

		System.out.println("New Session *******");
		HttpSession session1 = req.getSession();
		System.out.println("isNew  :" + session1.isNew());
		System.out.println("getId : " + session1.getId());
	}

}
