package list;

/** Kevin Poretti */

public class ArrayList<E> implements List<E>
{
    int size = 0;   //size of ArrayList
    E[] values;
    
    public ArrayList()
    {
        //values = ( E[] ) new Object[10];
        this(10);
    }
    
    public ArrayList(int capacity)
    {
        values = ( E[] ) new Object[capacity];
    }
    
    public int size()
    {
        return size;
    }
    
    public void add(E value)
    {
        add(size, value);
    }
    
    public void add(int idx, E value)
    {
        if(size == values.length)
            alloc();
        for(int i = size - 1; i >= idx; i--)
            values[i+1] = values[i];
        
        values[idx] = value;
        
        size++;
    }
    
    private void alloc()
    {
        E[] temp = ( E[] ) new Object[values.length * 2];
        
        for(int i = 0; i < size; i++)
            temp[i] = values[i];
        values = temp;
    }
    
    public E get(int idx)
    {
        return values[idx];
    }
    
    public E set(int idx, E value)
    {
        E result = values[idx];
        values[idx] = value;
        return result;
    }
    
    public E remove(int idx)
    {
        E result = values[idx];
        for(int i = idx; i < size - 1; i++)
            values[i] = values [i+1];
        //values[size] = null;
        size--;
        return result;
    }
    
    public void clear()
    {
        size = 0;
    }
    
    public boolean isEmpty()
    {
       return size == 0;
    }
    
    public int indexOf(Object value)
    {
        for(int i = 0; i < size; i++)
        {
            if(values[i].equals(value))
                return i;
        }
        
        return -1;
    }
    
    public boolean contains (Object value)
    {
        return !(indexOf(value) == -1);
    }
    
    public String toString()
    {
        String listString = "[";
        for(int i = 0; i < size; i++)
        {
            if(i != size - 1)
                listString += (values[i] + ", ");
            else
                listString += values[i];
        }
        listString += "]";
        
        return listString;
    }
    
    public boolean equals(Object other)
    {
        List compareList;
        if(other instanceof List)
            compareList = (List)other;
        else
            return false;
        if(size != compareList.size())
            return false;
        else 
            for(int i = 0; i < size; i++)
                if(values[i] != compareList.get(i))
                    return false;
                    
        return true;
    }
    
    public boolean hasDuplicate()
    {
        for(int i = 0; i < size; i++)
                if(contains(values[i]) && i != indexOf(values[i]))
                    return true;
        return false;
    }
    
    public Iterator<E> iterator()
    {
        return new ArrayIterator(this);
    }
    
    public ListIterator<E> listIterator()
    {
        return new ArrayListIterator(this);
    }
    
    public ListIterator<E> listIterator(int idx)
    {
        return new ArrayListIterator(this, idx);
    }
}