package com.cg.day5;

public class RunnablevsThreadDemo {
	public class RunnableVsThreadDemo {
	    public static void main(String[] args) {
	        MyRunnable runnable = new MyRunnable();
	        Thread thread = new MyThreads();

	        thread.start();
	        new Thread(runnable).start();
	    }
	}
}

	class MyThreads extends Thread {
	    @Override
	    public void run() {
	        System.out.println("Hello from MyThread!");
	    }
	}

	class MyRunnable implements Runnable {
	    @Override
	    public void run() {
	        System.out.println("Hello from MyRunnable!");
	    }
	}



