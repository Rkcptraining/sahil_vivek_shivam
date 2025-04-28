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

public class EditProfileServlet extends HttpServlet {
	
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
			out.println("<p size=6 color=red>Edit Profile</p>");
			out.println("<form method=post action=EditProfileServlet1>");
			out.println("<table border=5>");
			out.println("<tr><td>Name</td><td> <input type=text name=nm value= "+fuser.getName()+"></td><tr>");
			out.println("<tr><td>Password</td><td> <input type=text name=pwd value= "+fuser.getPassword()+"></td><tr>");
			out.println("<tr><td>Email</td><td> <input type=email name=em value= "+fuser.getEmail()+"></td><tr>");
			out.println("<tr><td>Address</td><td> <input type=text name=ad value= "+fuser.getAddress()+"></td><tr>");
			out.println("<tr><td><input type=reset></td><td> <input type=submit value=edit></td><tr>");
			out.println("</table>");
			out.println("</form>");
		}
		
		out.println("</body></html>");
		
		
	}

}
