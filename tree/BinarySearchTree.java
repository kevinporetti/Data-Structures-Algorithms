package tree;
import list.*;
import java.math.*;

/**
 * Left children are smaller
 * Right children are larger
 * 
 * @author Kevin Poretti 
 * @version 10/16/2014
 */
public class BinarySearchTree<E extends Comparable> implements BinaryTree<E>
{
    BinaryTree<E> left = new EmptyBinarySearchTree<E>();
    BinaryTree<E> right = new EmptyBinarySearchTree<E>();
    E value;
    
    /**
     * Constructor for objects of class BinarySearchTree
     */
    public BinarySearchTree(E value)
    {
        this.value = value;
    }

    public BinaryTree<E> getLeft()
    {
        return left; 
    }
    
    public BinaryTree<E> getRight()
    {
        return right;
    }
    
    public E getValue()
    {
        return value;
    }
    
    public void setLeft(BinaryTree<E> left)
    {
        this.left = left;
    }
    
    public void setRight(BinaryTree<E> right)
    {
        this.right = right;
    }
    
    public void setValue(E value)
    {
        this.value = value;
    }
    
    public BinaryTree<E> add(E value)
    {
        int cmp = value.compareTo(this.value);
        if(cmp < 0)
            left = left.add(value);
        if(cmp > 0)
            right = right.add(value);
        return this;
    }
    
    public boolean containsKey(E value)
    {
        int cmp = value.compareTo(this.value);
        if(cmp == 0)
            return true;
        if(cmp < 0)
            return left.containsKey(value);
        return right.containsKey(value);
    }
    
    public E get(E value)
    {
        int cmp = value.compareTo(this.value);
        if(cmp < 0)
            return left.get(value);
        if(cmp > 0)
            return right.get(value);
        //found it
        return this.value;
    }
    
    public BinaryTree<E> remove(Object obj)
    {
        try
        {
            E value = (E)obj;
            int cmp = value.compareTo(this.value);
            if(cmp == 0)
            {
                List<BinaryTree<E>> kids;
                kids = children();
                if(kids.size() == 0)
                    return new EmptyBinarySearchTree<E>();
                if(kids.size() == 1)
                    return kids.get(0);
                //2 kids
                BinaryTree<E> successor = ((BinarySearchTree)right).smallest();
                BinaryTree<E> result = remove(successor.getValue());
                result.setValue(successor.getValue());
                return result;
            }
            if(cmp < 0)
                left = left.remove(value);
            if(cmp > 0)
                right = right.remove(value);
        }
        catch(ClassCastException cce)
        { 
        }
        
        return this;
    }
    
    private List<BinaryTree<E>> children()
    {
        List<BinaryTree<E>> result = new ArrayList<BinaryTree<E>>();
        if(left instanceof BinarySearchTree)
            result.add(left);
        if(right instanceof BinarySearchTree)
            result.add(right);
        return result;
    }
    
    private BinaryTree<E> smallest()
    {
        if(left instanceof BinarySearchTree)
            return ((BinarySearchTree)left).smallest();
        return this;
    }
    
    public boolean isEmpty()
    {
        return false;
    }
    
    public boolean equals(Object obj)
    {
        BinaryTree<E> compTree = new EmptyBinarySearchTree<E>(); 
        if(obj instanceof BinarySearchTree)
        {
            compTree = (BinarySearchTree) obj;
        }
        
        if(!value.equals(compTree.getValue()))
            return false;
        if(!this.left.equals(compTree.getLeft()))
            return false;
        if(!this.right.equals(compTree.getRight()))
            return false;
        return true;
    }
    
    public int getHeight()
    {
        return Math.max((this.getLeft()).getHeight(), (this.getRight()).getHeight()) + 1;
    }
    
    public boolean isBalanced ()
    {
        if((Math.abs(left.getHeight() - right.getHeight()) <= 1) && left.isBalanced() && right.isBalanced())
            return true;
        return false;
    } 
    
    public Iterator<E> iterator()
    {  
        return new TreeIterator<E>(this);
    }
    
    public Iterator<E> iteratorReverse()
    {
        return new ReverseTreeIterator<E>(this);
    }
    
    public String toString()
    {
        //InOrder traversal
        Iterator<E> iter = this.iterator();
        
        String treeString = "[";
        while(iter.hasNext())
        {
            treeString += (iter.next()).toString();
            if(iter.hasNext())
                treeString += ", ";
        }
        treeString += "]";
        
        return treeString;
    }
}
