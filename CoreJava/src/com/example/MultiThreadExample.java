package com.example;

class MyThread extends Thread {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class MultiThreadExample {
    
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        thread1.start();  // Start thread 1
        thread2.start();  // Start thread 2
    }
}
