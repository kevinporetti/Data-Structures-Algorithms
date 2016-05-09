package list;

/**
 * Write a description of interface Iterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Iterator<E>
{
    /**
     * @return true only if there are more elements
     */
    boolean hasNext();
    
    /**
     * @return true only if there are two more elements
     */
    boolean hasTwoMore();
    
    /**
     * Pre: hasNext is true
     * @return value of the next element
     */
    E next();
    
    /** 
     * Pre: next has been called, and remove has not 
     * been called since the last call to next
     */
    void remove();
    
    
    /**
     * Pre: There are two such elements which
     * can be removed.
     * Remove two elements from the List,
     * the most recent obtained by a call to
     * next() and the element following that.
     */
    void remove2(); 
}
