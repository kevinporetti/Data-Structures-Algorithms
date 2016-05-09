package queue;


/**
 * A FIFO list
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface QueueADT<E>
{
    /**
     * Add given value to the back of this Queue
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    void add(E value);
    
    /**
     * Remove the value at the front of this Queue
     * @return the value removed.
     * PRE:  This QUEUE is not empty
     * 
     */
    E remove();
    
    /**
     * @return the value at front of this Queue, or null if this Queue is empty
     */
    E peek();
    
    boolean isEmpty();
    
    int size();

    void removeAll();

    boolean equals(Object obj);

    String toString();
}
