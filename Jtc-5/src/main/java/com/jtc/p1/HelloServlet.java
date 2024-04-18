package com.jtc.p1;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "hello", urlPatterns = "/hello.jtc", loadOnStartup = 1,initParams = {
		@WebInitParam(name = "email", value = "som@gmail.com")})
public class HelloServlet extends HttpServlet {
	
	public void init(ServletConfig config) {
		System.out.println("Init in HelloServlet");		
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("Service in HelloServlet");
	}
	@Override
	public void destroy() {
		System.out.println("Destroy in HelloServlet");
	}
}
