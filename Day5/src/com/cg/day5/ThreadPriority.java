package com.cg.day5;

public class ThreadPriority {
	
	public class ThreadPriorityDemo {
	    public static void main(String[] args) {
	        Thread thread1 = new Thread("Thread 1");
	        Thread thread2 = new Thread("Thread 2");

	        thread1.setPriority(Thread.MAX_PRIORITY);
	        thread2.setPriority(Thread.MIN_PRIORITY);

	        thread1.start();
	        thread2.start();
	    }
	}

	class MyThread extends Thread {
	    private String name;

	    public MyThread(String name) {
	        this.name = name;
	    }

	    @Override
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(name + ": " + i);
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}


}
