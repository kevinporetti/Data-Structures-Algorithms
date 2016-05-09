package set;
import list.*;

/**
 * Write a description of interface Set here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Set<E>
{
    /**
     * Add the given valye to this set
     * 
     * @param  value  value to be added to this Set
     * @return        true if given value is added  
     */
    boolean add(E value);
    
    /**
     * Gives the size of this set
     * 
     * @return number of values in this Set  
     */
    int size();
    
    /**
     * Makes this Set empty
     */
    void clear();
    
    /**
     * @return true if this Set is empty  
     */
    boolean isEmpty();
    
    /**
     * @return true if given obj is in this Set
     */
    boolean contains(Object obj);
    
    /**
     * Obj is removed, if possible
     * 
     * @return true if removed 
     */
    boolean remove(Object obj);
    
    /**
     * @return this Set as a String
     */
    String toString();
    
    /**
     * Compare with some other object to determine equivalency
     * 
     * @return true if object is equal to this Set
     */
    boolean equals(Object obj);
    
    /**
     * Gives the hashCode for this Set
     * 
     * @return the hashCode
     */
    int hashCode();
    
    /**  
     * @return a List consisting of all the elements in this Set
     */
    List<E> asList();
    
    /** 
     * @return  A Set consisting of all values which are in both this Set and the other Set
     */
    Set<E> intersection(Set<E> other);
    
    /**
     * @return an iterator for this Set
     */
    Iterator<E> iterator();
}
