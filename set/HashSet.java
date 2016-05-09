package set;
import hash.*;
import list.*;

/**
 * Use a HashTable to implement the Set interface
 * Use a HashTable to store the elements of a Set
 * 
 * @author Kevin Poretti 
 * @version November 13th 2014
 */
public class HashSet<E> implements Set<E>
{
    HashTable<E> table = new HashTable<E>();
    
    /**
     * Constructor for objects of class HashSet
     */
    public HashSet()
    {
    }
    
    public boolean add(E value)
    {
        if(table.containsKey(value))
            return false;
        
        table.put(value);
        return true;
    }
    
    public int size()
    {
        return table.size();
    }
    
    public void clear()
    {
        table.clear();
    }
    
    public boolean isEmpty()
    {
        return table.isEmpty();
    }
    
    public boolean contains(Object obj)
    {
        return table.containsKey(obj);
    }
    
    public boolean remove(Object obj)
    {
        return table.remove(obj);
    }
    
    public String toString()
    {
        return table.toString();
    }
    
    public boolean equals(Object obj)
    {
        Set<E> cmpSet = null;
        E tempObj;
        Iterator<E> iter = this.iterator();
        
        if(obj instanceof Set)
            cmpSet = (Set)obj;
        else
            return false;
        
        if(this.size() != cmpSet.size())
            return false;
            
        while(iter.hasNext())
        {
            tempObj = iter.next();
            if(!(cmpSet.contains(tempObj)))
                return false;
        }
        return true;
    }
    
    public List<E> asList()
    {
        List<E> listSet = new LinkedList<E>();
        Iterator<E> iter = this.iterator();
        
        while(iter.hasNext())
        {
            listSet.add(iter.next());
        }
        
        return listSet;
    }
    
    public Set<E> intersection(Set<E> other)
    {
        Set<E> intersection = new HashSet<E>();
        E temp;
        
        Iterator<E> iter = this.iterator();
        
        while(iter.hasNext())
        {
            temp = iter.next();
            if(other.contains(temp))
                intersection.add(temp);
        }
        
        return intersection;
    }
    
    public Iterator<E> iterator()
    {
        return table.iterator();
    }
}
