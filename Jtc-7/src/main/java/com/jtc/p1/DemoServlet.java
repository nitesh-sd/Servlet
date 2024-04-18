package com.jtc.p1;

import java.util.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	public void init(ServletConfig config) {
		System.out.println("config parameter");
		System.out.println("Init param (...........)" );
		String email = config.getInitParameter("email");
		String city = config.getInitParameter("city");
		System.out.println(email);
		System.out.println(city);
		
		//Second method.
		System.out.println("******Second method/n");
		Enumeration <String> enms1= config.getInitParameterNames();
		List<String> configParam = Collections.list(enms1);
		for(String configName : configParam) {
			String pvalue = config.getInitParameter(configName);
			System.out.println(configName+ " "  + pvalue);
		}
		
		//Third method
//		System.out.println("*******Third method");
//		System.out.println("3rd method ********");
//		Map<String,String[]> paramMap1 = config.getInitParameterMap();
//		Set<String> paramNames3 = paramMap1.keySet();
//		for(String pname1:paramNames3) {
//			String pvalues1[] = paramMap1.get(pname1);
//			System.out.println(pname1 + " " + pvalues1[0]);
//		
//}
		
		//context parameter 1st Method
		System.out.println("/n*******Context parameter");
		System.out.println("*******1st method");
		ServletContext ctx = config.getServletContext();
		String state = ctx.getInitParameter("State");
		String country = ctx.getInitParameter("Country");
		String institute = ctx.getInitParameter("Institute");
		System.out.println(state);
		System.out.println(country);
		System.out.println(institute);
		
		//2nd Approach
		System.out.println("**********2nd method");
		Enumeration<String> enms2 = ctx.getInitParameterNames();
		List<String> ctxParam = Collections.list(enms2);
		for(String ctxName : ctxParam) {
			String pvalue1 = ctx.getInitParameter(ctxName);
			System.out.println(ctxName + "  " + pvalue1);
		}
			
	}	
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("Service()");
		//1. collect the Request Param .....
		String fname = req.getParameter("fname");
		String phone = req.getParameter("phone");
		System.out.println(fname);
		System.out.println(phone);
		
		//2nd Method
		System.out.println("2nd method******");
		Enumeration<String> enms = req.getParameterNames();
		List<String> paraNames1 = Collections.list(enms);
		for(String pname:paraNames1) {
			String pvalues = req.getParameter(pname);
			System.out.println(pname + " " + pvalues);
		}
		//3rd method
		System.out.println("3rd method ********");
		Map<String,String[]> paramMap = req.getParameterMap();
		Set<String> paramNames2 = paramMap.keySet();
		for(String pname:paramNames2) {
			String pvalues[] = paramMap.get(pname);
			System.out.println(pname + " " + pvalues[0]);
			
		}
//		System.out.println("Config Parameters");
		
		
	}
	public void destroy() {
		System.out.println("Service");
	}
}
