package map;


/**
 * Write a description of class Entry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Entry<K extends Comparable,V> implements Comparable<Entry<K,V>> //what is this?
{
    K key;
    V value;
    
    Entry(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
    
    public K getKey()
    {
        return key;
    }
    
    public V getValue()
    {
        return value;
    }
    
    public int compareTo(Entry<K,V> other)
    {
        return key.compareTo(other.key);
    }
    
    public int hashCode()
    {
        return key.hashCode();
    }
    
    public boolean equals(Object obj)
    {
        try
        {
            Entry<K,V> other = (Entry)obj;
            return key.equals(other.key);
        }
        catch(ClassCastException cce)
        {
            return false;
        }
    }
    
    public String toString()
    {
        return key.toString() + "=" + value.toString();
    }
}
