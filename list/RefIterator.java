package list;

/* Kevin Poretti */

/**
 * Write a description of class RefIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RefIterator<E> implements Iterator<E>
{
    // instance variables - replace the example below with your own
    Node<E> cursor;  //cursor refers to the last value returned by next
    LinkedList<E> theList;
    
    /**
     * Constructor for objects of class RefIterator
     */
    public RefIterator(LinkedList<E> theList)
    {
        // initialise instance variables
        this.theList = theList;
        cursor = theList.head;
    }
    
    /**
     * Should not be used
     */
    public RefIterator()
    {}

    public boolean hasNext()
    {
        return cursor.next != theList.tail;
    }
    
    public boolean hasTwoMore()
    {
        if(cursor.next != theList.tail)
            return false;
        else
            return cursor.next.next != theList.tail;
    }
    
    public E next()
    {
        cursor = cursor.next;
        //cursor.next.prev = cursor.prev;
        return cursor.value;
    }
    
    public void remove()
    {
        cursor.prev.next = cursor.next;
        cursor.next.prev = cursor.prev;
        cursor = cursor.prev;
        theList.size--;
    }
    
    public void remove2()
    {
        cursor.prev.next = cursor.next.next;
        cursor.next.next.prev = cursor.prev;
        cursor = cursor.prev;
        theList.size -= 2;
    }
}
