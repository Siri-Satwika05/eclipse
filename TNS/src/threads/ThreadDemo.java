package threads;



class ThreadDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println(getName() + " is running... Count: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();

        t1.setName("Thread-One");
        t2.setName("Thread-Two");

        t1.start();
        t2.start();
    }
}
