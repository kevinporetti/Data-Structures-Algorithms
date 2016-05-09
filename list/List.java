package list;

  

/** List ADT is an ordered collection of values;
duplicates are ok */

public interface List <E>
{
    /** @return size of this List. */
    int size();
    
    /** Add a value at the end of this List */
    void add(E value);

    /** Insert a value at position ndx in this List 
        @param 0 <= idx <= size */
    void add(int idx, E value);
    
    /** @return value at given position
        @param 0 <= idx < size */
    E get(int idx);
    
    /** Change value at position idx to given value.
        @return old value at idx
        @param */
    E set(int idx, E value);
    
    /** Remove value at given position
        @return value removed
        @param 0 <= idx < size */
    E remove(int idx);
    
    /** Make this List empty */
    void clear();
    
    /** @return true only if this List is empty */
    boolean isEmpty();
    
    /** @return the postion of the first occurrence of the value in this List, or -1 if not found */
    int indexOf(Object value);
    
    /** @return true only if value is contained in this List */
    boolean contains (Object value);
    
    /** @return the elements of this List as a String  enclosed in square brackets:
     *  [a,b,c]
     */
    String toString();
    
    /** @return true only if this List is equal to the parameter, other */
    boolean equals(Object other);
    
    /** @return an iterator for this List */
    Iterator<E> iterator();
    
    /** @return a ListIterator for this List */
    ListIterator<E> listIterator();
    
    /** 
     * Pre 0 <= idx <= size
     * @return a ListIterator with idx as the cursor start position 
     */
    ListIterator<E> listIterator(int idx);
}