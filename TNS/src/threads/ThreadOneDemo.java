package threads;

public class ThreadOneDemo {
	  public static void main(String[] args) {
	        Thread t1 = new Thread();
	        Thread t2 = new Thread();
	        Thread t3 = new Thread();

	        t1.setName("Alpha");
	        t2.setName("Beta");
	        t3.setName("Gamma");

	        t1.start();
	        t2.start();
	        t3.start();
	    }

}
