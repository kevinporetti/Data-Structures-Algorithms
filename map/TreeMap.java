package map;
import tree.*;
import set.*;

/**
 * Write a description of class TreeMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeMap<K extends Comparable,V> implements Map<K,V>
{
    BinaryTree<Entry<K,V>> tree = new EmptyBinarySearchTree<Entry<K,V>>();
    int size = 0;
    
    /**
     * Constructor for objects of class TreeMap
     */
    public TreeMap()
    {
    }
    
    public V put(K key, V value)
    {
        Entry<K,V> newEntry = new Entry<K,V>(key, value);
        Entry<K,V> oldEntry = tree.get(newEntry);
        
        if(oldEntry == null)
        {
            tree = tree.add(newEntry);
            size++;
            return null;
        }
        
        V result = oldEntry.value;
        oldEntry.value = value;
        return result;
    }
    
    public V get(K key)
    {
        Entry<K,V> entry = new Entry<K,V>(key, null);
        entry = tree.get(entry);
        
        if(entry == null)
            return null;
            
        return entry.value;
    }
    
    public int size()
    {
        return size;
    }
    
    public void clear()
    {
        tree = new EmptyBinarySearchTree<Entry<K,V>>();
        size = 0;
    }
    
    public boolean isEmpty()
    {
        return tree.isEmpty();
    }
    
    public boolean containsKey(K key)
    {
        Entry<K,V> entry = new Entry<K,V>(key, null);
        return tree.containsKey(entry);
    }    
    
    public V remove(K key)
    {
        Entry<K,V> entry = new Entry<K,V>(key, null);
        entry = tree.get(entry);
        
        if(entry == null)
            return null;
        
        tree = tree.remove(entry);
        size--;
        
        return entry.value;
    }
    
    public String toString()
    {
        return tree.toString();
    }
    
    public Set<K> keySet()
    {
        return null;
    }
}
