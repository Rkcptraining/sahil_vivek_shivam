package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facebookweb.entity.FacebookUser;
import com.facebookweb.service.FacebookService;
import com.facebookweb.service.FacebookServiceInterface;

/**
 * Servlet implementation class EditProfileServlet1
 */
public class EditProfileServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("nm");
 		String password=request.getParameter("pwd");
 		String email=request.getParameter("em");
 		String address=request.getParameter("ad");
 		
 		//above information must transfer to service layer using DTO(data transfer object) design pattern
 		FacebookUser fb=new FacebookUser();
 		fb.setName(name);
 		fb.setPassword(password);
 		fb.setEmail(email);
 		fb.setAddress(address);
 		
 		FacebookServiceInterface fService=new FacebookService();
 		int i=fService.editProfileService(fb);
 		
 		
 		response.setContentType("text/html");
 		PrintWriter out= response.getWriter();
 		
 		out.println("<html><body>");
 		if(i>0) {
 			out.println("Your Profile edited Successfully");
 			
 		}
 		else {
 			out.println("could not edit profile");
 		}
 		out.println("</body></html>");
	}

}
