package Multithreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // pause for half a second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        try {
            // Main thread waits until t1 finishes
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        try {
            // Main thread waits until t2 finishes
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t3.start();
        try {
            // Main thread waits until t3 finishes
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All threads finished. Main thread ends.");
    }
}