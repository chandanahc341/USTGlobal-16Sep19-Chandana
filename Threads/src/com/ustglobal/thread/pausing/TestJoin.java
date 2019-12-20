package com.ustglobal.thread.pausing;

public class TestJoin {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		MyJoinThread mj = new MyJoinThread();
		mj.start();
		try {
			mj.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}
	
	System.out.println("Main ended");
	
	
	}
	

}
