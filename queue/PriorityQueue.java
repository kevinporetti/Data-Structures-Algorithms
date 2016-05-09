package queue;
import list.*;

/**
 * Write a description of class PriorityQueue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PriorityQueue<E extends Comparable> implements QueueADT<E>
{
    List<E> values = new ArrayList<E>();
    
    int size = 0;   //size of this PriorityQueue
    
    /**
     * Constructor for objects of class PriorityQueue
     */
    public PriorityQueue()
    {
    }

    public E remove()
    {
        E result = values.get(0);
        
        size--;
        
        int avail = 0;
        int bigger = biggerChild(0);
        
        while((2*avail+1 < size) && greater(bigger, size))
        {
            values.set(avail, values.get(bigger));
            avail = bigger;
            bigger = biggerChild(avail);
        }
        
        values.set(avail, values.get(size));    //stuff right most leaf into the available 
                                                //position if it is greater than bigger child
        return result;
    }
    
    public void add(E value)
    {
        if(size == values.size())
            values.add(value);
        else
            values.set(size, value);
            
        int added = size;
        int parent = (added-1)/2;
        
        while(added>0 && greater(added, parent))
        {
            swap(parent, added);
            added = parent;
            parent = (added-1)/2;
        }
        
        size++;
    }
    
    private int biggerChild(int parent)
    {
        int left = 2*parent+1;
        int right = left + 1;
        
        if(right > size)
            return left;
            
        if(greater(left, right))
            return left;
        return right;
    }
    
    // return true iff value at pos x > value at pos y
    private boolean greater(int x, int y)
    {
        return (values.get(x)).compareTo(values.get(y)) > 0;
    }
    
    private void swap(int x, int y)
    {
        E temp = values.get(x);
        values.set(x, values.set(y, temp));
    }

    public E peek()
    {
        if(size > 0)
            return values.get(0);
        else 
            return null;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public int size()
    {
        return size;
    }

    public void removeAll()
    {
        size = 0;
    }

    public boolean equals(Object obj)
    {
        PriorityQueue<E> tempPriorQueue = null;
        List<E> tempList = null;
        
        if(obj instanceof PriorityQueue)
            tempPriorQueue = (PriorityQueue)obj;
        else
            return false;
            
        tempList = tempPriorQueue.values;
        
        return values.equals(tempList);
    }

    public String toString()
    {
        String listString = "[";
        for(int i = 0; i < size; i++)
        {
            if(i != size - 1)
                listString += (values.get(i) + ", ");
            else
                listString += values.get(i);
        }
        listString += "]";
        
        return listString;
    }
}
