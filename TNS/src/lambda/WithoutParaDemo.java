package lambda;

public class WithoutParaDemo {
	  public static void main(String[] args) {
	        // Lambda Runnable
	        Runnable task = () -> System.out.println("Background task executed by: " + Thread.currentThread().getName());

	        Thread t1 = new Thread(task, "Task-Thread-1");
	        Thread t2 = new Thread(task, "Task-Thread-2");

	        t1.start();
	        t2.start();
	    }
	}

