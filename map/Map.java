package map;
import set.*;

/**
 * Store a mapping from keys to values
 * 
 * @author Kevin Poretti
 * @version November 13th 2014
 */
public interface Map<K extends Comparable, V>
{
    /**
     * Add the given key-value pair to this map
     * If key is already in this map, change its value
     * 
     * @param key   the key to be added with a specified value
     * @param value the value to be added with a specified key
     * @return  the old value, or null if not in this Map 
     */
    V put(K key, V value);
    
    /**
     * @return the value for the given key, or null if not in this map
     */
    V get(K key);
   
    /**
     * @return the number of entries in this Map
     */
    int size();
    
    /**
     * clears this Map of all key, value pairs
     */
    void clear();
    
    /**
     * @return true if this Map contains no entries
     */
    boolean isEmpty();
    
    /**
     * @return true only if this Map contains an entry with the given key
     */
    boolean containsKey(K key);
    
    /**
     * Remove the entry with the given key from this Map, if possible
     * 
     * @return its value, or null if not in this Map
     */
    V remove(K key);
    
    /**
     * Convert this Map to a string, listing all entries in this Map
     * 
     * @return a String of all entries in this Map
     */
    String toString();
    
    /**
     * @return a set of all keys in this map
     */
    Set<K> keySet();
}
