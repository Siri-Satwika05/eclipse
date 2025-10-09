package threads;

class RunDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        RunDemo obj = new RunDemo();
        Thread t1 = new Thread(obj, "Worker-1");
        Thread t2 = new Thread(obj, "Worker-2");

        t1.start();
        t2.start();
    }
}
