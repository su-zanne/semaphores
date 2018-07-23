/**
 * This is a subclass of the Thread class. It is designed to repeatedly 
 * print the letter "X".
 *
 * @author Susanne Christensen
 * @version 30/04/2018
 */
public class ThreadX extends MyThread {
    /**
     * Overrides the run method of the Thread superclass. 
     */
    @Override
    public void run() {
        int count = 0;  
        while(true) {
            try {
                Y.P(); //Waits until available space is opened up in the Y binary semaphore. In first loop it can go ahead as there is one space, ensuring X prints before Y.
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
            System.out.println("X (printed " + count + " times)"); 
            X.V(); //Increment the shared X binary semaphore, which allows Y thread to print
        }

    }
}