/**
 * This is a subclass of the Thread class. It is designed to repeatedly 
 * print the letter "Y".
 *
 * @author Susanne Christensen
 * @version 30/04/2018
 */
public class ThreadY extends MyThread {
    /**
     * Overrides the run method of the Thread superclass. 
     */
    @Override
    public void run() {
        int count = 0;	
        while(true) {
            try {
                X.P(); //Waits until available space is opened up in the X binary semaphore
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                countingSemaphore.P(); //Waits until available space is opened up in shared counting semaphore
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep((long)(Math.random() * 1000)); //Makes the thread sleep random number of milliseconds.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println("Y (printed " + count + " times)"); 
            Y.V(); //Increment the shared Y binary semaphore
        }
    }
}
