package tree;
import list.Iterator;

/**
 * Write a description of class EmptyBinarySearchTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmptyBinarySearchTree<E extends Comparable> implements BinaryTree<E>
{
    //these should not be called

    public BinaryTree<E> getLeft()
    {
        return null;
    }
   
    public BinaryTree<E> getRight()
    {
        return null;
    }
    
    public E getValue()
    {
        return null;
    }
    
    public void setLeft(BinaryTree<E> left)
    {
    }
    
    public void setRight(BinaryTree<E> right)
    {
    }
    
    public void setValue(E value)
    {
    }
    
    public BinaryTree<E> add(E value)
    {
        return new BinarySearchTree(value);
    }
    
    public boolean containsKey(E value)
    {
        return false;
    }
    
    public E get(E value)
    {
        return null;
    }
    
    public BinaryTree<E> remove(Object obj)
    {
        return this;
    }
    
    public boolean isEmpty()
    {
        return true;
    }
    
    public boolean equals(Object obj)
    {
        EmptyBinarySearchTree<E> compTree; 
        if(obj instanceof EmptyBinarySearchTree)
        {
            return true;
        }
        return false;
    }

    public int getHeight()
    {
        return 0;
    }
    
    public boolean isBalanced ()
    {
        return true;
    }
    
    public Iterator<E> iterator()
    {  
        return new EmptyTreeIterator();
    }
    
    public Iterator<E> iteratorReverse()
    {
        return new EmptyTreeIterator();
    }
    
    public String toString()
    {
        return "";
    }
}
