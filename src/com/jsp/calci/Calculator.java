package com.jsp.calci;

import java.util.Scanner;

public class Calculator {

	public static void add(int a,int b) {
		int c=a+b;
		System.out.println("addition : "+c);
	}
	public static void subtract(int a,int b) {
		int c=a-b;
		System.out.println("Subtract : "+c);
	}
	public static void multiply(int a,int b) {
		int c=a*b;
		System.out.println("Multiplication : "+c);
	}
	public static void divide(int a,int b) {
		int c=a/b;
		System.out.println("Devision : "+c);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two values ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		add(a, b);
		subtract(a, b);
		multiply(a, b);
		divide(a, b);

	}

}
