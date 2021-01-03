package com.main;

public class mainProject implements Runnable{

	public static void main(String[] args) {
		mainProject main = new mainProject();
		Thread thread = new Thread(main);
		
		
		System.out.println("This code is outside of the thread");
		thread.start();		
	}

	public void run() {
		// TODO Auto-generated method stub'
		System.out.println("This code is runnning in the thread");
		
	}
}
