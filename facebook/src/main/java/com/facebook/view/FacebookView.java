package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.FacebookController;

public class FacebookView {
	
	

	public static void main(String[] args) {
		
		String ss="yes";
		
		while(ss.equals("yes")) {
		
		System.out.println("********************MAIN MENU*******************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to edit profile");
		System.out.println("press 4 to delete profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view all profile");
		System.out.println("press 7 to send friend request");
		System.out.println("press 8 to upload photo");
		System.out.println("press 9 to upload video");
		System.out.println("press 10 to view timeline");
		System.out.println("press 11 to like post");
		System.out.println("press 12 to dislike post");
		System.out.println("press 13 to reply");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your choice--->");
		
		int choice=sc.nextInt();
		//in java if one class want to call other class then it will create object of that class as below
		FacebookController fc=new FacebookController();
		
		switch(choice) {
		case 1 :  fc.createProfile();
			break;
		case 2 :  fc.viewProfile();
			break;
		case 3 : fc.editProfile();
			break;
		case 4 : fc.deleteProfile();
			break;
		case 5 : fc.searchProfile();
			break;
		case 6 : fc.viewAllProfile();
			break;
		case 7 : fc.sendFriendRequest();
			break;
		case 8 : fc.uploadPhoto();
			break;
		case 9 : fc.uploadVideo();
			break;
		case 10 : fc.viewTimeLine();
			break;
		case 11 : fc.likePost();
			break;
		case 12 : fc.disLikePost();
			break;
		case 13 : fc.reply();
			break;
		default : System.out.println("wrong choice");
			
		}
		
		System.out.println("do you want more write yes or no");
		ss=sc.next();
		}

	}

}





