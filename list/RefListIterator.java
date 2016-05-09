package list;

/**
 * cursor refers to the last node returned by next() or previous()
 */
public class RefListIterator<E> extends RefIterator<E> implements ListIterator<E>
{
    // if forward is true direction is ->
    // if forward is false direction is <-
    boolean forward = true;   
    
    public RefListIterator(LinkedList<E> theList)
    {
        super(theList);
    }
    
    public RefListIterator(LinkedList<E> theList, int idx)
    {
        super(theList);
        for(int i = 0; i < idx; i++)
            cursor = cursor.next;
    }
    
    public boolean hasNext()
    {
        if (forward)
            return cursor.next != theList.tail;
        return theList.size() > 0;
    }
    
    public E next()
    {
        if(forward)
            cursor = cursor.next;
        forward = true;
        return cursor.value;
    }
    
    public boolean hasPrevious()
    {
        if(!forward)
            return cursor.prev != theList.head;
        return theList.size() > 0;
    }
    
    public E previous()
    {
        if(!forward)
            cursor = cursor.prev;
        forward = false;
        return cursor.value;
    }
    
    public void remove()
    {
        super.remove();
        if(!forward)
            cursor = cursor.next;
    }
    
    public void add(E value)
    {
        Node<E> temp;
        
        if(forward)
        {
            temp = new Node<E>(value, cursor.next, cursor);
            cursor.next.prev = temp;
            cursor.next = temp;
            cursor = cursor.next;
        }
        else
        {
            temp = new Node<E>(value, cursor, cursor.prev);
            cursor.prev.next = temp;
            cursor.prev = temp;
        }
        
        theList.size++;
    }
}
