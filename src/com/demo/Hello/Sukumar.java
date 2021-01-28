package com.demo.Hello;

import com.demo.Hello.HelloWorld.IDemo;

public class Sukumar implements IDemo {

	@Override
	public void add(int i, int j) {
		System.out.printf("Sum of %d,%d is:%d ", i, j, i + j);
	}

	@Override
	public void sub(int i, int j) {
		System.out.printf("\nDifference of %d,%d is:%d ", i, j, i - j);
	}

	@Override
	public void mul(int i, int j) {
		System.out.printf("\nProduct of %d,%d is:%d", i, j, i * j);
	}

}

