package list;

public class LinkedList<E> implements List<E>
{
    int size = 0;
    Node<E> head = new Node<E>(null, null, null);
    Node<E> tail = new Node<E>(null, null, head);
    
    private Node<E> ref;
    
    public LinkedList()
    {
        head.next = tail;
    }
    
    public LinkedList(List<E> copy)
    {
        Iterator<E> iter = copy.iterator();
        
        while(iter.hasNext())
        {
            this.add(iter.next());
        }
    }
    
    public int size()
    {
        return size;
    }
    
    public void add(E value)
    {
        Node<E> temp = new Node<E>(value, tail, tail.prev);
        
        tail.prev.next = temp;
        tail.prev = temp;
        
        size++;
    }
    
    public void add(int idx, E value)
    {
        setRef(idx);    //ref refers to position idx
        
        Node<E> temp = new Node<E>(value, ref, ref.prev);
        
        ref.prev.next = temp;
        ref.prev = temp;
        
        size++;
    }
    
    public E get(int idx)
    {
        setRef(idx);    // ref refers to Node at positon idx
        return ref.value;
    }
    
    public E set(int idx, E value)
    {
        setRef(idx);    //ref refers to Node at position idx
        E result = ref.value;
        ref.value = value;
        return result;
    }
    
    public E remove(int idx)
    {
        E result;
        setRef(idx);
        
        ref.prev.next = ref.next;
        ref.next.prev = ref.prev;
        
        size--;
        
        result = ref.value;
        return result;
    }
    
    public void clear()
    {
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    
    public boolean isEmpty()
    {
        return (size == 0);
    }
    
    public int indexOf(Object value)
    {
        ref = head.next;
        for(int i = 0; i < size; i++)
        {
            if(ref.value.equals(value))
                return i;
            ref = ref.next;
        }
        
        return -1;
    }
    
    public boolean contains(Object value)
    {
        return !(indexOf(value) == -1);
    }
    
    public String toString()
    {
        Node<E> ref = head.next;
        String listString = "[";
        for(int i = 0; i < size; i++)
        {
            if(i != size - 1)
                listString += (ref.value + ", ");
            else
                listString += ref.value;
            ref = ref.next;
        }
        listString += "]";
        
        return listString;
    }

    public boolean equals(Object other)
    {
        List compareList;
        Iterator<E> currIter = iterator();
        Iterator<E> compIter;
        E current;
        E compare;
        if(other instanceof List)
        {
            compareList = (List)other;
            compIter = compareList.iterator();
        }
        else
            return false;
        if(size != compareList.size())
            return false;
        else 
            while(currIter.hasNext())
            {
                current = currIter.next();
                compare = compIter.next();
                if(!current.equals(compare))
                    return false;
            }      
        return true;
    }
    
    public Iterator<E> iterator()
    {
        return new RefIterator(this);
    }
    
    public ListIterator<E> listIterator()
    {
        return new RefListIterator(this);
    }
    
    public ListIterator<E> listIterator(int idx)
    {
        return new RefListIterator(this, idx);
    }
    
    private void setRef(int idx)
    {
        // set ref to the given position
        if(idx < (size / 2))
        {
            ref = head.next;
        
            for(int i = 0; i < idx; i++)
                ref = ref.next;
        }
        else
        {
            ref = tail.prev;
            
            for(int i = size-1; i > idx; i--)
                ref = ref.prev;
        }
    }
    
    /** Pre: E is comparable */
    public void bubbleSort()
    {
        Node<E> ref;
        int cmp;
        
        for(int i = 0; i < size()-1; i++)
        {
            ref = head.next;
            for(int j = 0; j < size()-1-i; j++)
            {
                cmp = ((Comparable)ref.value).compareTo(ref.next.value);
                if(cmp > 0)
                    swap(ref);
                ref = ref.next;
            }
        }
    }
    
    /** Swap ref with its next neighbor */
    private void swap(Node<E> ref)
    {
        E temp = ref.value;
        
        ref.value = ref.next.value;
        ref.next.value = temp;
    }
}