/**
 * This is a subclass of the Thread class. It is designed to repeatedly 
 * print the letter "Z".
 *
 * @author Susanne Christensen
 * @version 30/04/2018
 */
public class ThreadZ extends MyThread {
    /**
     * Overrides the run method of the Thread superclass. 
     */
    @Override
    public void run() {
        int count = 0;
        while(true) {
            try {
                Thread.sleep((long)(Math.random() * 1000)); //Makes the thread sleep random number of milliseconds.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }   
            count++;
            System.out.println("Z (printed " + count + " times)"); 
            countingSemaphore.V(); //Increments the shared counting semaphore
        }
    }
}
