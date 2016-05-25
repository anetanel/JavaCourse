package com.netanel.threads;

public class TestThreads {
	public static void main(String[] args) {
		// Create a runnable object
		ThreadA r1 = new ThreadA("Hello, Beautiful World!");
		ThreadA r2 = new ThreadA("Goodbye, Cruel World!");
		ThreadA r3 = new ThreadA("I can't make up my mind...");
		
		// Create a thread object 
		Thread t1 = new Thread(r1, "ThreadA-1");
		Thread t2 = new Thread(r2, "ThreadA-2");
		Thread t3 = new Thread(r3, "ThreadA-3");
		

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t3.start();
	}
}

class ThreadA implements Runnable {
	private String message;
	
	public ThreadA( String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(message);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadB extends Thread {
	@Override
	public void run() {
		System.out.println("Hello World!");
	}
}
