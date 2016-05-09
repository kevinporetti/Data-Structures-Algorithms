package set;
import tree.*;
import list.*;

/**
 * Write a description of class TreeSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeSet<E> implements Set<E>
{
    BinaryTree<E> tree;
    int size = 0;
    
    /**
     * Constructor for objects of class TreeSet
     */
    public TreeSet()
    {
        tree = new EmptyBinarySearchTree();
    }
    
    public boolean add(E value)
    {
        if(tree.containsKey(value))
            return false;
        
        tree = tree.add(value);
        size++;
        
        return true;
    }
    
    public int size()
    {
        return size;
    }
    
    public void clear()
    {
        tree = new EmptyBinarySearchTree();
        size = 0;
    }
    
    public boolean isEmpty()
    {
        return false;
    }
    
    public boolean contains(Object obj)
    {
        try
        {
            E value = (E)obj;
            return tree.containsKey(value);
        }
        catch(ClassCastException cce)
        {
            return false;
        }
    }
    
    public boolean remove(Object obj)
    {
        if(!contains(obj))
            return false;
            
        tree = tree.remove(obj);
        size--;
        
        return true;
    }
    
    public String toString()
    {
        return tree.toString();
    }
    
    public boolean equals(Object obj)
    {
        Set<E> cmpSet = null;
        E tempObj;
        Iterator<E> iter = this.iterator();
        
        if(obj instanceof Set)
            cmpSet = (Set)obj;
        else
            return false;
        
        if(this.size() != cmpSet.size())
            return false;
            
        while(iter.hasNext())
        {
            tempObj = iter.next();
            if(!(cmpSet.contains(tempObj)))
                return false;
        }
        return true;
    }
    
    public int hashCode()
    {
        return 99;
    }
    
    public List<E> asList()
    {
        List<E> listSet = new LinkedList<E>();
        Iterator<E> iter = this.iterator();
        
        while(iter.hasNext())
        {
            listSet.add(iter.next());
        }
        
        return listSet;
    }
    
    public Set<E> intersection(Set<E> other)
    {
        Set<E> intersection = new TreeSet<E>();
        E temp;
        
        Iterator<E> iter = this.iterator();
        
        while(iter.hasNext())
        {
            temp = iter.next();
            if(other.contains(temp))
                intersection.add(temp);
        }
        
        return intersection;
    }
    
    public Iterator<E> iterator()
    {
        return new TreeSetIterator(this);
    }
}
