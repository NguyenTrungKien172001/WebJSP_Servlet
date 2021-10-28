//package com.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import com.model.Member;
//
//@WebFilter("/admin/*")
//public class AuthFilter implements Filter {
//
//	public AuthFilter() {
//
//	}
//
//	public void destroy() {
//		System.out.println("AuthFilter is destroyed!");
//	}
//
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		HttpServletRequest httpRequest = (HttpServletRequest) request;
//		HttpSession session = httpRequest.getSession();
//
//		Member authMember = (Member) session.getAttribute("Member");
//
//		if (authMember == null) {
//			HttpServletResponse httpResponse = (HttpServletResponse) response;
//			HttpServletRequest httRequest = (HttpServletRequest) request;
//			httpResponse.sendRedirect(httRequest.getContextPath()+ "/Login");
//		}else {
//			chain.doFilter(request, response);
//		}
//		
//		
//
//	}
//
//	public void init(FilterConfig fConfig) throws ServletException {
//		System.out.println("AuthFilter is initialzing...");
//	}
//
//}
