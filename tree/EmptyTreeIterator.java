package tree;
import list.Iterator;

/**
 * Write a description of class EmptyTreeIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmptyTreeIterator<E extends Comparable> implements Iterator<E> 
{
    /**
     * Constructor for objects of class EmptyTreeIterator
     */
    public EmptyTreeIterator()
    {
    }

    public boolean hasNext()
    {
        return false;
    }
    
    public boolean hasTwoMore()
    {
        return false;
    }
    
    public E next()
    {
        return null;
    }
    
    public void remove()
    {
    }
    
    public void remove2()
    {
    }
}
