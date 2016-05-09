package hash;
import list.Iterator;

/**
 * Iterator through HashTable
 * 
 * @author Kevin Poretti
 * @version November 6th 2014
 */
public class TableIterator<K> implements Iterator<K>
{
    HashTable<K> table;
    int idx = 0;    //Which linked list?
    Iterator<K> iter; //Where in that list?
    
    /**
     * Constructor for objects of class TableIterator
     */
    public TableIterator(HashTable<K> table)
    {
        this.table = table;
        setIter(idx);
    }
    
    private void setIter(int idx)
    {
        iter = table.list.get(idx).iterator();
    }
    
    public boolean hasNext()
    {
        if(iter.hasNext())
            return true;
        for(idx++; idx < table.list.size(); idx++)
        {
            if(!(table.list.get(idx).isEmpty()))
            {
                setIter(idx);
                return true;
            }
        }
        return false;
    }
    
    public boolean hasTwoMore()
    {
        return false;
    }
    
    public K next()
    {
        hasNext();  //don't think you really need this
        return iter.next();
    }
    
    public void remove()
    {
    }
    
    public void remove2()
    {
    }
}
