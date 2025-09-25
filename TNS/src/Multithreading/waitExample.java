package Multithreading;

class SharedResource {
    synchronized void produce() {
        System.out.println("Producer thread running...");
        try {
            System.out.println("Producer is waiting for consumer to consume...");
            wait(); // releases the lock and waits
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Producer resumed after notification");
    }

    synchronized void consume() {
        System.out.println("Consumer thread running...");
        try {
            Thread.sleep(2000); // simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consumer finished work, notifying producer...");
        notify(); // wakes up the waiting thread
    }
}

public class waitExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> resource.produce());
        Thread consumer = new Thread(() -> resource.consume());

        producer.start();
        consumer.start();
    }
}
