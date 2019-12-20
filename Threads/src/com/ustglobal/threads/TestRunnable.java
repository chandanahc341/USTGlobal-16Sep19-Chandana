package com.ustglobal.threads;

public class TestRunnable {
	public static void main(String[] args) {
		System.out.println("main started");
		
		MyRunnable m = new MyRunnable();
		//m.start(); start() is undefined in runnable
		Thread t = new Thread();
		t.start();
		
		for(int i =0;i<5;i++) {
			System.out.println("main thread");
		}
		System.out.println("main ended");
		
	
	
	}

}
