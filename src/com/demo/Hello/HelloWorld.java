package com.demo.Hello;

import java.util.Scanner;

public class HelloWorld {

	interface IDemo {
		public void add(int i, int j);
		public void sub(int i, int j);
		public void mul(int i, int j);
	}

	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("Welcome to GIT Hub commit.");
		System.out.println("Hello " + str + ". Enjoy GIT Hub.");
		Sukumar obj = new Sukumar();
		obj.add(45, 54);
		obj.sub(54, 45);
		obj.mul(45, 2);
		
		 
		
	}
}
