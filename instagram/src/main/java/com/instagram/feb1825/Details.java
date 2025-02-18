package com.instagram.feb1825;

import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("what is your name ");
		String myname=sc.next();
		
		System.out.println("what is your Father Name");
		String fathername=sc.next();
		
		System.out.println("what is your place of birth");
		String placeofbirth=sc.next();
		
		System.out.println("your details is below ");
		System.out.println("***************************");
		System.out.println("Your Name is "+myname);
		System.out.println("your Father name is "+fathername);
		System.out.println("your place of birth is "+placeofbirth);

	}

}
