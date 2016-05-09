package list;

public class ArrayListIterator<E> extends ArrayIterator<E> implements ListIterator<E>
{
    /**
     * idx is cursor position between positions idx-1 and idx of the array
     *  1 2 3 4
     *  a b c d
     * 0 1 2 3 4 
     */
       
    // if forward is true direction is ->
    // if forward is false direction is <-
    boolean forward = true;     
    
    public ArrayListIterator(List<E> theList)
    {
        // initialise instance variables
        super(theList);
        super.idx = 0;
    }
    
    /**
     * Pre 0 <= idx <= list size
     * idx is the cursor starting position
     */
    public ArrayListIterator(List<E> theList, int idx)
    {
        super(theList);
        super.idx = idx;
    }
 
    public boolean hasNext()
    {
        return idx < theList.size();
    }
    
    public E next()
    {
        idx++;
        forward = true;
        return theList.get(idx-1);
    }
    
    public boolean hasPrevious()
    {
        return idx > 0;
    }
    
    public E previous()
    {
        idx--;
        forward = false;
        return theList.get(idx);
    }
    
    public void remove()
    {
        if(forward)
        {
            idx--;
            theList.remove(idx);
        }
        else
            theList.remove(idx);
    }
    
    public void add(E value)
    {
        theList.add(idx, value);
        idx++;
    }
}
