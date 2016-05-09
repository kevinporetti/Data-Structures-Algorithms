package tree;
import list.Iterator;
import stack.*;

/**
 * Write a description of class TreeIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReverseTreeIterator<E> implements Iterator<E>
{
    BinaryTree<E> tree;
    StackADT<E> s;
    E last;     //reference to last value obtained by next
    
    /**
     * Constructor for objects of class TreeIterator
     */
    public ReverseTreeIterator(BinaryTree<E> tree)
    {
        this.tree = tree;
        s = new Stack<E>();
        buildS(tree);
    }
    
    public ReverseTreeIterator()
    {
    }

    private void buildS(BinaryTree<E> tree)
    {
        // build queue in preorder 
        if(tree.getLeft() instanceof BinarySearchTree)
            buildS(tree.getLeft());
        s.push(tree.getValue());
        if(tree.getRight() instanceof BinarySearchTree)
            buildS(tree.getRight());
    }
    
    public boolean hasNext()
    {
        return !s.isEmpty();
    }
    
    public boolean hasTwoMore()
    {
        return false;
    }
    
    public E next()
    {
        last = s.pop();
        return last;
    }
    
    public void remove()
    {
        if(last.equals(tree.getValue()))
        {
            BinaryTree<E> temp = tree.remove(last);
            tree.setValue(temp.getValue());
            tree.setLeft(temp.getLeft());
            tree.setRight(temp.getRight());
        }
        else
            tree = tree.remove(last);
    }
    
    public void remove2()
    {
    }
}
