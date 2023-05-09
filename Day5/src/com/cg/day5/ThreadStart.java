package com.cg.day5;

public class ThreadStart {
	public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello!");
    }

}
