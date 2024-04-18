package com.jtc.p1;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "demo", urlPatterns = { "/mydemo.jtc" })

public class DemoServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res){
		//1. Accessing the Request Parameter
		System.out.println("Request Parameter");
		Enumeration<String> enms1 = req.getParameterNames();
		List<String> paramNames = Collections.list(enms1);
		for (String paramName : paramNames) {
			String paramValue = req.getParameter(paramName);
			System.out.println(paramName + "\t" + paramValue);
		}
		//2.Accessing Request Header
		System.out.println("Request Header");
		String hvalue = req.getHeader("referer");
		System.out.println(hvalue);
		//fixed component
		hvalue = req.getHeader("accept-encoding");
		System.out.println("accept-encoding");
		System.out.println(hvalue);
		//3. Accessing cookies in two ways
		//Accessing Cookies with cookies as parameter in header
		hvalue = req.getHeader("cookie");
		System.out.println("cookie");
		System.out.println(hvalue);
		//Accessing Cookies with getCookies() method
		System.out.println("getCookies ******");
		Cookie ck[] = req.getCookies();
		for(Cookie ck1 :ck) {
			System.out.println(ck1.getName()+ "\t" + ck1.getValue());
			
		}
		//4. Accessing Other Information
		System.out.println("Request URI   " +req.getRequestURI());
		System.out.println("Request URL   " +req.getRequestURL());
		System.out.println("Query String  " +req.getQueryString());
		System.out.println("GetServletPath  " + req.getServletPath());
		System.out.println("GetServerPort  " + req.getServerPort());
		System.out.println("GetServletConnection  " + req.getServletConnection());


	}
}
