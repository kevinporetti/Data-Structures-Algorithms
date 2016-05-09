package tree;
import list.*;

/**
 * A BinaryTree has a value and two children, each of which is a BinaryTree
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface BinaryTree<E>
{
    /**
     * Get the left child of this BinaryTree
     * 
     * @return  the left child
     */
    BinaryTree<E> getLeft();
   
    /**
     * Get the right child of this BinaryTree
     * 
     * @return  the right child
     */
    BinaryTree<E> getRight();
    
    /**
     * Get the value of this BinaryTree
     * 
     * @return  the value of this BinaryTree
     */
    E getValue();
    
    /**
     * Change the left child of this BinaryTree
     * 
     * @param  left  the left child
     */
    void setLeft(BinaryTree<E> left);
    
    /**
     * Change the right child of this BinaryTree
     * 
     * @param  right  the right child
     */
    void setRight(BinaryTree<E> right);
    
    /**
     * Set the value of this BinaryTree
     * 
     * @paran  value  the value of this BinaryTree
     */
    void setValue(E value);
    
    /** 
     * Add the given value to this BinaryTree
     * 
     * @return the resulting BinaryTree
     */
    BinaryTree<E> add(E value);
    
    /**
     * @return true only if given value is found in this BinaryTree
     */
    boolean containsKey(E value);
    
    /**
     * Search for the given value, return it, or null if not found
     */
    E get(E value);
    
    /**
     * remove the given obj from this BinaryTree
     * 
     * @return the updated tree
     */
    BinaryTree<E> remove(Object obj);
    
    /** 
     * Checks if BinaryTree is empty
     * 
     * @return true only if this BinaryTree is empty 
     */
    boolean isEmpty();
    
    /**
     * Checks if a BinaryTree is equal to given Object
     * 
     * @return true only if this BinaryTree is equal to obj
     */
    boolean equals(Object obj);
    
    /** 
     * @return the height of this BinaryTree
     */
    int getHeight();

    /** 
     * @return true only if this BinaryTree is balanced
     */
    boolean isBalanced ();
    
    /** 
     * @return an Iterator for this BinaryTree
     */
    Iterator<E> iterator();
    
    /**
     * @return an Iterator for this BinaryTree that traverses in reverse order
     */
    Iterator<E> iteratorReverse();
    
    /**
     * @return this BinaryTree as a string
     */
    String toString();
}
