package com.instagram.feb1825;

import java.util.Scanner;

public class Function_Demo {

	//method/function with void means it will not return any result
	//method/function with any word except void means it will return result
	public static void main(String[] args) {
		
		System.out.println("***********************MAIN MENU*********************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to edit profile");
		System.out.println("press 5 to search profile");
		
		System.out.println("enter your choice");
		
		//to take input from user we will use Scanner class
		//System.in is use to write input on console
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();  //nextInt() method is use to read integer from console
		
		System.out.println(choice);
		
		
		
		//all static methods can be called inside another static methods directly
		createProfile();
		viewProfile();
		deleteProfile();
		
		//all the non-static methods can be called inside static methods using object
		Function_Demo f=new Function_Demo();
		f.editProfile();
		f.searchProfile();
	}
	
	public static void createProfile() {
		System.out.println("profile created");
	}
	
	public static void viewProfile() {
		System.out.println("profile viewed");
	}
	
	public static void deleteProfile() {
		System.out.println("profile deleted");
	}
	
	public void editProfile() {
		System.out.println("profile edited");
	}
	public void searchProfile() {
		System.out.println("profile found");
	}

}
