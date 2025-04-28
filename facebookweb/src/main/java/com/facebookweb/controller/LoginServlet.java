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

public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("em");
		String password=request.getParameter("pwd");
		
		FacebookUser f=new FacebookUser();
		f.setEmail(email);
		f.setPassword(password);
		
		FacebookServiceInterface fs=new FacebookService();
		boolean b= fs.loginUserService(f);
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html><body>");
		
		if(b) {
			
			HttpSession ss=request.getSession(true);
			ss.setAttribute("myid", email);
			
			out.println("Welcome "+email);
			out.println("<br><a href=ViewProfileServlet>View Profile</a><br>");
			out.println("<a href=DeleteProfileServlet>Delete Profile</a><br>");
			out.println("<a href=EditProfileServlet>Edit Profile</a><br>");
			out.println("<a href=SearchProfileServlet>Search Profile</a><br>");
			out.println("<a href=ViewAllProfileServlet>View All Profile</a><br>");
			out.println("<a href=LogOutServlet>Log Out</a><br>");
		}
		else {
			out.println("Invalid Id and Password");
		}
		
		out.println("</body></html>");
	}

}













