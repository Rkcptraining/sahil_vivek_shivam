package com.instagram;

public class Variable_demo {
	//global variable i.e. all the variables define inside class are known as global variables'
	
	int i=8;         //instance variable i.e. to access this variable we have to create object of class
	static int k=5;  //class variable i.e. we can access class variable directly
	
	static long l;

	public static void main(String[] args) {
		//local variables i.e. all the variables define inside a method/function are known as local variables
		int j=9;
		
		Variable_demo a=new Variable_demo();
		
		System.out.println("instance variable result "+a.i);
		System.out.println("class variable result "+k);
		System.out.println("local variable result "+j);
		
		int m=89;
		
		System.out.println("global variable l = "+l);
		
		System.out.println("local variable m = "+m);
	}

}
