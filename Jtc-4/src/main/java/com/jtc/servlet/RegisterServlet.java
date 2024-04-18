package com.jtc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "register", urlPatterns = "/myregister.jtc")
public class RegisterServlet extends HttpServlet {
	public void init(ServletConfig sc) {

	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// collect the Data
		String fname = req.getParameter("fname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String timings = req.getParameter("timings");
		String remarks = req.getParameter("remarks");
		String myCourses[] = req.getParameterValues("mycourses");
		System.out.println("*******\n");
		System.out.println("Name = " + fname);
		System.out.println("Email = " + email);
		System.out.println("Phone Number = " + phone);
		System.out.println("Gender = " + gender);
		System.out.println("Timings = " + timings);
		System.out.println("Remarks = " + remarks);
		for (String c : myCourses) {
			System.out.println("Course = " + c);
		}
//This response is for the client

		// 3 Response
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h3> Your Registration Done</h3>");
		out.print("Name = " + fname);
		out.print("<br/> email = " + email);
		out.print("<br/>Phone no = " + phone);
		out.print("<br/>Gender = " + gender);
		out.print("<br/>Timings = " + timings);
		out.print("<br/>Remarks = " + remarks);
		for (String c : myCourses) {
			out.print("<br/>Course = " + c);
		}
	}

}
