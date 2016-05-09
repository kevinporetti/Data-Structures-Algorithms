package map;
import hash.*;
import set.*;
import list.Iterator;

/**
 * Write a description of class HashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashMap<K extends Comparable,V> implements Map<K,V>
{
    HashTable<Entry<K,V>> table = new HashTable<Entry<K,V>>();
    
    /**
     * Constructor for objects of class HashMap
     */
    public HashMap()
    {
    }
    
    public V put (K key, V value)
    {
        Entry<K,V> newEntry = new Entry<K,V>(key, value);
        Entry<K,V> oldEntry = table.get(newEntry);
        
        if(oldEntry == null)
        {
            table.put(newEntry);
            return null;
        }
        
        V result = oldEntry.value;
        oldEntry.value = value;
        return result;
    }
    
    public V get(K key)
    {
        Entry<K,V> entry = new Entry<K,V>(key, null);
        entry = table.get(entry);
        
        if(entry == null)
            return null;
        
        return entry.value;
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
    
    public boolean containsKey(K key)
    {
        Entry<K,V> entry = new Entry<K,V>(key, null);
        
        return table.containsKey(entry);
    }
    
    public V remove(K key)
    {
        Entry<K,V> entry = new Entry<K,V>(key, null);
        entry = table.get(entry);
        
        if(entry == null)
            return null;
            
        V result = entry.value;
        table.remove(entry);
        return result;
    }
    
    public String toString()
    {
        return table.toString();
    }
    
    public Set<K> keySet()
    {
        Set<K> keySet = new HashSet<K>();
        Iterator<Entry<K,V>> iter = table.iterator();
        
        while(iter.hasNext())
        {
            keySet.add((iter.next()).getKey());
        }
        
        return keySet;
    }
}
