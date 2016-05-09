package stack;

/**
 * LIFO data structure
 * 
 * @author Kevin Poretti 
 */
public interface StackADT<E>
{
    /**
     * Put a value on "top" of this stack
     * @return the value pushed
     */
    E push(E value);
    
    /** 
     * Pre: Stack is not empty
     * Remove the "top" value from this stack
     * @return the value removed
     */
    E pop();
    
    /**
     * Pre: Stack is not empty
     * @return top element of this stack
     */
    E peek();
    
    /** 
     * @return true only if this Stack is empty
     */
    boolean isEmpty();

    /** 
     * Clear this stack, to make it an empty stack 
     */
    void clear();

    /** 
     * @return This Stack as a String
     */
    String toString();

    /** 
     * @return true only if this Stack is equal to the given obj
     */
    boolean equals (Object obj);
}
