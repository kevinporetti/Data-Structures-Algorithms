package tree;
import list.Iterator;
import queue.*;

/**
 * Write a description of class TreeIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeIterator<E> implements Iterator<E>
{
    BinaryTree<E> tree;
    QueueADT<E> q;
    E last;     //reference to last value obtained by next
    
    /**
     * Constructor for objects of class TreeIterator
     */
    public TreeIterator(BinaryTree<E> tree)
    {
        this.tree = tree;
        q = new Queue<E>();
        buildQ(tree);
    }
    
    public TreeIterator()
    {
    }

    private void buildQ(BinaryTree<E> tree)
    {
        // build queue in preorder 
        q.add(tree.getValue());
        if(tree.getLeft() instanceof BinarySearchTree)
            buildQ(tree.getLeft());
        if(tree.getRight() instanceof BinarySearchTree)
            buildQ(tree.getRight());
    }
    
    public boolean hasNext()
    {
        return !q.isEmpty();
    }
    
    public boolean hasTwoMore()
    {
        return false;
    }
    
    public E next()
    {
        last = q.remove();
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
