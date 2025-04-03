package com.whatsapp.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.dao.WhatsappDAOInterface;
import com.whatsapp.entity.WhatsappUser;

public class WhatsappController implements WhatsappControllerInterface{

	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=sc.next();   //next() method is use to read string from user
		
		System.out.println("Enter Password");
		String password=sc.next(); 
		
		System.out.println("Enter Email");
		String email=sc.next(); 
		
		System.out.println("Enter Address");
		String address=sc.next(); 
		
		WhatsappDAOInterface wd=new WhatsappDAO();
		
		//int result=wd.createProfileDAO(name,password,email,address);
		//the way which we are using to pass data to dao is not acceptable in industry
		//then how to pass data from controller to dao?
		//we should pass data using DTO (DATA TRANSFER OBJECT ) design pattern i.e. we should pass as object
		//object of which class?
		//object of entity class like WhatsappUser
		
		WhatsappUser wu=new WhatsappUser();
		
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		int result=wd.createProfileDAO(wu);
		
		
		if(result>0) {
			System.out.println("Profile Created successfully");
		}
		else {
			System.out.println("oops can not register you!");
		}
		
		System.out.println(name+" "+password+" "+email+" "+address);
		
	}

	public void viewProfileController(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Email to view profile");
		String email=sc.next(); 
		
		WhatsappUser wu=new WhatsappUser();
		wu.setEmail(email);
		
		WhatsappDAOInterface wd=new WhatsappDAO();
		WhatsappUser userProfile=wd.viewProfileDAO(wu);
		
		if(userProfile!=null) {
			System.out.println("your profile is ");
			System.out.println("Name is ---> "+userProfile.getName());
			System.out.println("Password is --->"+userProfile.getPassword());
			System.out.println("Email is --->"+userProfile.getEmail());
			System.out.println("Address is "+userProfile.getAddress());
		}
		
		
	}

	public void editProfileController(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Email to edit profile");
		String email=sc.next(); 
		
		System.out.println("enter new password");
		String password=sc.next();
		
		WhatsappDAOInterface wd=new WhatsappDAO();
		
		int result=wd.editProfile(email,password);
		if(result>0) {
			System.out.println("Profile edited successfully");
		}
		else {
			System.out.println("oops can not edit you!");
		}
		
	}

	public void deleteProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Email to delete profile");
		String email=sc.next(); 
		
		WhatsappDAOInterface wd=new WhatsappDAO();
		
		int result=wd.deleteProfile(email);
		if(result>0) {
			System.out.println("Profile deleted successfully");
		}
		else {
			System.out.println("oops can not delete you!");
		}
	}

	@Override
	public void viewAllProfileController() {
		WhatsappDAOInterface wd=new WhatsappDAO();
		ArrayList<WhatsappUser>  allUsers =  wd.viewAllProfileDAO();
		
		System.out.println("number of records "+allUsers.size());
		
		for(WhatsappUser w1 : allUsers) {
			System.out.println("****************************************************");
			System.out.println("Name is ---> "+w1.getName());
			System.out.println("Password is --->"+w1.getPassword());
			System.out.println("Email is --->"+w1.getEmail());
			System.out.println("Address is "+w1.getAddress());
		}
		
	}

}








