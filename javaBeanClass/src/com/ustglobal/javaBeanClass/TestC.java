package com.ustglobal.javaBeanClass;
import java.util.Scanner;
public class TestC {
	public static void main(String[] args) {
		System.out.println("Scanner class");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is"+age);
		
		System.out.println("Are you male?");
		Boolean a = sc.nextBoolean();
		System.out.println(a);
		
	}

}
