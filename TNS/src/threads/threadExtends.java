package threads;



class threadExtends extends Thread {
    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(getName() + " has finished execution.");
    }

    public static void main(String[] args) {
        threadExtends t1 = new threadExtends();
        threadExtends t2 = new threadExtends();

        t1.setName("HighPriorityThread");
        t2.setName("LowPriorityThread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}