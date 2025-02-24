package com.facebook.controller;

import java.util.Scanner;

public class FacebookController {
	public void createProfile() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name=sc.next();
		
		System.out.println("Enter Password");
		String password=sc.next();
		
		System.out.println("Enter Email");
		String email=sc.next();
		
		System.out.println("Enter Address");
		String address=sc.next();
		
		System.out.println("your profile details is below------>");
		System.out.println("Your Name is "+name);
		System.out.println("Your password is "+password);
		System.out.println("Your Email is "+email);
		System.out.println("Your address is "+address);
		
		
		System.out.println("profile created");
	}
	
	public void viewProfile() {
		System.out.println("profile viewed");
	}
	
	public void editProfile() {
		System.out.println("profile edited");
	}
	
	public void deleteProfile() {
		System.out.println("profile deleted");
	}
	
	public void searchProfile() {
		System.out.println("profile found");
	}
	
	public void viewAllProfile() {
		System.out.println("profile viewed");
	}
	
	public void sendFriendRequest() {
		System.out.println("request sent");
	}
	
	public void uploadPhoto() {
		System.out.println("photo uploaded");
	}
	
	public void uploadVideo() {
		System.out.println("video uploaded");
	}
	
	public void viewTimeLine() {
		System.out.println("timeline viewed");
	}
	
	public void likePost() {
		System.out.println("post liked");
	}
	
	public void disLikePost() {
		System.out.println("post disliked");
	}
	
	public void reply() {
		System.out.println("replied");
	}
	
	
}
