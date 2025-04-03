package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappController;
import com.whatsapp.controller.WhatsappControllerInterface;

public class WhatsappView {

	public static void main(String[] args) {
		System.out.println("*******************MAIN MENU*********************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to edit profile");
		System.out.println("press 4 to delete profile");
		System.out.println("press 5 to view all profile");
		
		System.out.println("please enter your choice");
		
		Scanner sc=new Scanner(System.in);
		
		int choice=sc.nextInt(); //nextInt() method will read user input as integer
		
		//WhatsappController wc=new WhatsappController(); //here we are creating object directly so it is tight coupling which is not acceptable in industry
		//so what is acceptable?
		//low coupling i.e. we must create object via interface
		
		WhatsappControllerInterface wc=new WhatsappController(); //now it is low coupled because reference is of interface
		
		switch(choice) {
		case 1 :  wc.createProfileController();
			break;
		case 2 :  wc.viewProfileController();
			break;
		case 3 :  wc.editProfileController();
			break;
		case 4 : wc.deleteProfileController();
			break;
		case 5 : wc.viewAllProfileController();
			break;
		default : System.out.println("wrong choice ");
		}

	}

}
