package queue;

import list.*;
/**
 * Write a description of class ArrayQueue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayQueue<E> implements QueueADT<E>
{
    List<E> values = new ArrayList<E>();
    int front = 0;  // Position of front 
    int back = 0;   // Next available position
    int size = 0;   // Size of the Queue
    
    public ArrayQueue()
    {
    }

    public void add(E value)
    {
        if(size == values.size())   // List is full
        {
            values.add(back, value);
            front = (front + 1) % values.size();
        }
        else    // List is not full
        {
            values.set(back, value);
        }
        back = (back + 1) % values.size();
        size++;
    }
    
    public E remove()
    {
        size--;
        E result = values.get(front);
        front = (front + 1) % values.size();
        return result;
    }
    
    public E peek()
    {
        if(size == 0)
            return null;
        return values.get(front);
    }
    
    public boolean isEmpty()
    {
        return true;
    }
    
    public int size()
    {
        return 0;
    }
    
    public void removeAll()
    {
    }

    public boolean equals(Object obj)
    {
        return false;
    }

    public String toString()
    {
        return "";
    }
}

