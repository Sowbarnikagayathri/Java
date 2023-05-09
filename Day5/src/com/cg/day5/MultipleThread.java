package com.cg.day5;

public class MultipleThread {
	public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class thread extends Thread {
    private String name;

    public thread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello from " + name + "!");
    }
}






	
	


