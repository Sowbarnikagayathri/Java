package com.cg.day5;

public class RaceCondition {
	    private static int counter = 0;

	    public static void main(String[] args) {
	        Thread thread1 = new MyThread();
	        Thread thread2 = new MyThread();

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Counter value: " + counter);
	    }

	    static class MyThread extends Thread {
	        @Override
	        public void run() {
	            for (int i = 0; i < 100000; i++) {
	                counter++;
	            }
	        }
	    }
	}



