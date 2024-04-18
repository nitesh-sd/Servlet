package com.jtc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "mydemo", urlPatterns = "/mydemo.jtc")
public class DemoServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie ck[] = req.getCookies();
		if (ck != null) {
			System.out.println("Number of Cookies" + ck.length);

		} else {
			System.out.println("No cookies found");
		}

		System.out.println("*************");
		HttpSession session = req.getSession();
		if (session.isNew()) {// we can use the method here which give boolean value
			Cookie ck1 = new Cookie("myemail", "vivek@jtc");
			res.addCookie(ck1);
			Cookie ck2 = new Cookie("myemail", "78996548");
			res.addCookie(ck2);
			ck2.setMaxAge(60);
		} else {
			Cookie ck3 = new Cookie("testing", "ServletClass");
			res.addCookie(ck3);
			ck3.setMaxAge(0);
		}
		
		PrintWriter out = res.getWriter();
		out.print("<h1>Check your Console</h1>");
	}

}
