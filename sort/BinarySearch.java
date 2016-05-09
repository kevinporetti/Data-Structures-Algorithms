package sort;
import list.*;

/**
 * Search a sorted list.  
 * Should be an ArrayList.
 * 
 * @author Kevin Poretti    
 * @version 10/16/2014
 */
public class BinarySearch<E extends Comparable>
{
    List<E> list;
    /**
     * Constructor for objects of class BinarySearch
     */
    public BinarySearch(List<E> list)
    {
        this.list = list;
    }

    /**
     * Searches for the target in list
     * 
     * @param  target   thing to be found in list 
     * @return          position of target in list, or -1 if not found 
     */
    public int search(E target)
    {
        return binSearch(target, 0, list.size()-1);
    }
    
    private int binSearch(E target, int start, int end)
    {
        if(start > end)
            return -1;
            
        int mid = (start + end)/2;
        int cmp = target.compareTo(list.get(mid));
        
        if(cmp == 0)
            return mid;
        if(cmp < 0)
            return binSearch(target, start, mid-1);
        return binSearch(target, mid+1, end);
    }
}
