//package com.jtc.p1;
//
//import java.io.IOException;
//
//import jakarta.servlet.ServletConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//
//@WebServlet(name = "abc", urlPatterns = "/abc.jtc", loadOnStartup = 4)
//public class AbcServlet extends HttpServlet{
//	public void init(ServletConfig config) {
//		System.out.println("Init in AbcServlet");		
//	}
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		
//		System.out.println("Service in AbcServlet");
//	}
//	@Override
//	public void destroy() {
//		System.out.println("Destroy in AbcServlet");
//	}
//}
//	
