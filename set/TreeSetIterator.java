package set;
import list.Iterator;
import tree.TreeIterator;

/**
 * Write a description of class TreeSetIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeSetIterator<E extends Comparable> extends TreeIterator<E>
{
    TreeSet<E> set;

    /**
     * Constructor for objects of class TreeSetIterator
     */
    public TreeSetIterator(TreeSet<E> set)
    {
        super(set.tree);
        this.set = set;
    }
    
    public void remove()
    {
        super.remove();
        set.size--;
    }
}
