package queue;

import list.*;
/**
 * Implement QueueADT using LinkedList
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queue<E> implements QueueADT<E>
{
    List<E> values = new LinkedList<E>();

    public void add(E value)
    {
        values.add(value);
    }
   
    public E remove()
    {
        return values.remove(0);
    }
   
    public E peek()
    {
        if(values.size() > 0)
            return values.get(0);
        return null;
    }
    
    public boolean isEmpty()
    {
        return values.isEmpty();
    }
    
    public int size()
    {
        return values.size();
    }
    
    public void removeAll()
    {
        values.clear();
    }

    public boolean equals(Object obj)
    {
        Queue<E> tempQueue;
        if(!(obj instanceof QueueADT) || obj == null)
            return false;
        tempQueue = (Queue)obj;
        return values.equals(tempQueue.values);
    }

    public String toString()
    {
        return values.toString();
    }
}
