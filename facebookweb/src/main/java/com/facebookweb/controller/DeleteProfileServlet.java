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
 * Servlet implementation class DeleteProfileServlet
 */
public class DeleteProfileServlet extends HttpServlet {
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
		int fuser= fs.deleteProfileService(fb);
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html><body>");
		
		if(fuser >0) {
			out.println("<br>Profile deleted");
			
		}
		
		out.println("</body></html>");
	}

}
