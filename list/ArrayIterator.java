package list;


/**
 * Iterator for ArrayLists
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayIterator<E> implements Iterator<E>
{
    int idx = -1;   // Position of last element obtained

    List<E> theList;    //the ArrayList which is being iterator through
    
    /**
     * Constructor for objects of class ArrayIterator
     */
    public ArrayIterator(List<E> theList)
    {
        // initialise instance variables
        this.theList = theList;
    }
    
    /**
     * Should not be called
     */
    public ArrayIterator()  
    {}
    
    public boolean hasNext()
    {
        return idx < theList.size()-1;
    }
    
    public boolean hasTwoMore()
    {
        return idx < theList.size()-2;
    }
    
    public E next()
    {
        idx++;
        return theList.get(idx);
    }
    
    public void remove()
    {
        theList.remove(idx);
        idx--;
    }
    
    public void remove2()
    {
    }
}
