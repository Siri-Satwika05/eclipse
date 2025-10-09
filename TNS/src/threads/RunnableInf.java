package threads;

public class RunnableInf {
	 public static void main(String[] args) {
	        Runnable task = () -> {
	            String name = Thread.currentThread().getName();
	            for (int i = 1; i <= 3; i++) {
	                System.out.println(name + " is running iteration " + i);
	                try {
	                    Thread.sleep(400);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        };

	        Thread t1 = new Thread(task, "Thread-A");
	        Thread t2 = new Thread(task, "Thread-B");

	        t1.start();
	        t2.start();
	    }
}
