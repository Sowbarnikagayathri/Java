package com.cg.day5;

public class ThreadStateDemo {

	    public static void main(String[] args) throws InterruptedException {
	        Thread thread = new MyThread();
	        System.out.println("Thread state: " + thread.getState());
	        thread.start();
	        System.out.println("Thread state: " + thread.getState());

	        Thread.sleep(1000);
	        System.out.println("Thread state: " + thread.getState());

	        Thread.sleep(2000);
	        System.out.println("Thread state: " + thread.getState());

	        thread.interrupt();
	        System.out.println("Thread state: " + thread.getState());
	    }

	    static class MyThread extends Thread {
	        @Override
	        public void run() {
	            try {
	                Thread.sleep(3000);
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted!");
	            }
	        }
	    }
	}



