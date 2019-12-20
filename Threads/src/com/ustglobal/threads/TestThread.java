package com.ustglobal.threads;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("main started");
		
		MyThread m = new MyThread();
		m.start();
		
		//m.start();IllegalThreadException
		/*
		 * m.run(); don't call run() method,it behaves like normal program all program
		 * will be executed inside main thread only
		 */
		for(int i=0;i<5;i++) {
			System.out.println("hiiii");
		}
		
		System.out.println("main ended");
	}

}
