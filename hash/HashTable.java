package hash;
import list.*;

/**
 * Write a description of class HashTable here.
 * May have duplicates
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashTable<K>
{
    List<List<K>> list;
    int keyCount = 0;
    
    /**
     * Constructor for objects of class HashTable
     */
    public HashTable(int size)
    {
        this.list = new ArrayList<List<K>>();
        for(int i = 0; i < size; i++)
            list.add(new LinkedList<K>());
    }
    
    public HashTable()
    {
        this(10);
    }

    public int size()
    {
        return keyCount;
    }
    
    public void put(K key)
    {
        int idx = getCode(key);
        list.get(idx).add(key);
        keyCount++;
    }
    
    private int getCode(K key)
    {
        return Math.abs(key.hashCode()) % list.size();
    }
    
    public boolean containsKey(Object obj)
    {
        try
        {
            K key = (K)obj;
            int idx = getCode(key);
            return (list.get(idx)).contains(key);
        }
        catch(ClassCastException cce)
        {
            return false;
        }
    }
    
    /** 
     * @return the key from this HashTable, or null if not found
     */
    public K get(K key)
    {
        int code = getCode(key);
        List<K> lst = list.get(code);   //Selected LinkedList (ref to linked list)
        int idx = lst.indexOf(key);     //There should probably be a getObject in list interface
        
        if(idx < 0) 
            return null;
        
        return lst.get(idx);
    }
    
    /**
     * Remove the given obj from this HashTable
     * @return true if it was removed
     */
    public boolean remove(Object obj)
    {
        try
        {
            K key = (K)obj;
            int code = getCode(key);
            List<K> lst = list.get(code);
           
            int idx = lst.indexOf(key);
            if (idx < 0) 
                return false;
            
            lst.remove(idx);
            keyCount--;
            
            return true;
        }
        catch(ClassCastException cce)
        {
            return false;
        }
    }
    
    public void clear()
    {
        for(int i = 0; i < list.size(); i++)
            list.get(i).clear();
        keyCount = 0;
    }
    
    public boolean isEmpty()
    {
        return keyCount == 0;
    }
    
    public String toString()
    {
        Iterator<K> iter = this.iterator();
        
        String hashString = "[";
        while(iter.hasNext())
        {
            hashString += (iter.next()).toString();
            if(iter.hasNext())
                hashString += ", ";
        }
        hashString += "]";
        
        return hashString;
    }
    
    public Iterator<K> iterator()
    {
        return new TableIterator<K>(this);
    }
}