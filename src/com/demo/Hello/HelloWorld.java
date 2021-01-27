package com.demo.Hello;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("Welcome to GIT Hub commit.");
		System.out.println("Hello "+str+". Enjoy GIT Hub.");
		
	}
}
