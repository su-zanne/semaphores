/**
 * This is a subclass of the Semaphore class. A binary semaphore takes 
 * only two values: 1 when the critical code section is free, and 0 when the
 * critical section is in use.  
 *
 * @author Susanne Christensen
 * @version 30/04/2018
 */
public class BinarySemaphore extends Semaphore
{
    /**
     * Create a binary semaphore, initialised to either 1 or 0.
     * @param available Set to true to initialise the semaphore to 1. Set
     * to false to initialise the semaphore to 0.
     */
    public BinarySemaphore(boolean available)
    {
        super(available ? 1 : 0);
    }

    /**
     * Overrides the V method of the superclass in order to assure that
     * binary semaphores can never increase their value beyond 1. 
     */
    @Override
    public void V()
    {
        if(value!=1) {
            super.V();
        }
    }
}