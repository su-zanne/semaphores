/**
 * This class has a main method to test the program. It will create and
 * start each thread, and then go to sleep for 20000 miliseconds while the
 * other threads are running. Finally, it will call System.exit(0) to stop
 * all threads.
 *
 * @author Susanne Christensen
 * @version 30/04/2018
 */ 

public class Test {
	public static void main(String[] args) throws InterruptedException {
		ThreadX x = new ThreadX();
		ThreadY y = new ThreadY();
		ThreadZ z = new ThreadZ();
		x.start();
		y.start();
		z.start();
		Thread.sleep(20000);
		System.exit(0);
	}
}