/**
 * Abstract superclass class, which stores and creates static semaphores
 * that are shared for all subclasses.
 *
 * @author Susanne Christensen
 * @version 30/04/2018
 */
public abstract class MyThread extends Thread {
    protected static final BinarySemaphore X = new BinarySemaphore(false);
    protected static final BinarySemaphore Y = new BinarySemaphore(true);
    protected static final Semaphore countingSemaphore = new Semaphore(0);
    }