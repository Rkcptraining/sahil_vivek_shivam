package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.facebookweb.entity.FacebookUser;
import com.facebookweb.service.FacebookService;
import com.facebookweb.service.FacebookServiceInterface;

/**
 * Servlet implementation class SearchProfileServlet
 */
public class SearchProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ss=request.getSession(true);
		String email=ss.getAttribute("myid").toString();
		
		FacebookUser fb=new FacebookUser();
		fb.setEmail(email);
		
		FacebookServiceInterface fs=new FacebookService();
		FacebookUser fuser= fs.viewProfileService(fb);
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html><body>");
		
		if(fuser != null) {
			out.println("<br>Name is "+fuser.getName());
			out.println("<br>Password is "+fuser.getPassword());
			out.println("<br>Email is "+fuser.getEmail());
			out.println("<br>Address is "+fuser.getAddress());
		}
		
		out.println("</body></html>");
	}

}
