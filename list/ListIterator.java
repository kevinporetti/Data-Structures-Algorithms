package list;


/**
 * Iterate forward and backward
 *  a b c d
 * ^ ^ ^ ^ ^
 * cursor is between two list elements
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ListIterator<E> extends Iterator<E>
{
    /**
     * @return true if there is a previous element 
     */
    boolean hasPrevious();
    
    /**
     * Pre: hasPrevious is true
     * @return the value before the cursor
     * update cursor
     */
    E previous();
    
    /**
     * May be called one per call to next() or remove().
     * Removes the last element returned by a call to next() or previous()
     */
    void remove();
    
    /** Add the given value at the cursor position in the List being 
     * iterated through. A subsequent call to next( ) would be unaffected,
     * and a subsequent call to previous( ) would return the new element.*/
    void add (E value);
}
