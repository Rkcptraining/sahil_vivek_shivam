package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.facebookweb.entity.FacebookUser;
import com.facebookweb.service.FacebookService;
import com.facebookweb.service.FacebookServiceInterface;

/**
 * Servlet implementation class ViewAllProfileServlet
 */
public class ViewAllProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ss=request.getSession(true);
		String email=ss.getAttribute("myid").toString();
		
		
		
		FacebookServiceInterface fs=new FacebookService();
		ArrayList<FacebookUser> fuser1= fs.viewAllProfileService();
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html><body>");
		
		if(fuser1.size()>0) {
			for(FacebookUser fuser : fuser1) {
			out.println("<br>Name is "+fuser.getName());
			out.println("<br>Password is "+fuser.getPassword());
			out.println("<br>Email is "+fuser.getEmail());
			out.println("<br>Address is "+fuser.getAddress());
			}
		}
		
		out.println("</body></html>");
	}

}
