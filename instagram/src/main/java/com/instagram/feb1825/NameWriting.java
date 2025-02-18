package com.instagram.feb1825;

import java.util.Scanner;

public class NameWriting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("do you agree to reveal your name");
		String ss=sc.next();
		
		if(ss.equals("yes")) {
			System.out.println("what is your name ");
			
			String name=sc.next();
			
			System.out.println("your name is "+name);
		}
		else {
			System.out.println("no problem thank you to visit!");
		}

	}

}
