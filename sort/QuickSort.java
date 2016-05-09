package sort;
import list.*;

/**
 * Arrange a list is ascending order
 * 
 * QuickSort
 * 1. Partition the list about a pivot element, p.  Call its value the pivotValue.
 *    All values left of p are smaller than pivotValue, all elements right of 
 *    p are great or equal to pivot value.
 * 2. Invoke QuickSort on the left half     }until size of the list is 1
 * 3. Invoke QuickSort on the right half    }
 * 
 * Partition
 * 1. Given start position and end position
 * 2. Choose pivot position, p = start
 * 3. Save value at pivot position, pivotValue
 * 4. for each position in theList, i, from start+1 to end, 
 *    if pivotValue > list[i]
 *      a. list[p] = list[i]
 *      b. Increment p
 *      c. list[i] = list[p]
 *    LoopInvariant: All values left of p are smaller than pivotValue
 *                   All values right of pos p thru pos i, >= pivotValue
 * 5. list[p] = pivotValue
 * 6. Result is p
 * 
 * @author Kevin Poretti 
 * @version 9 Oct 2014
 */
public class QuickSort<E extends Comparable>
{
    List<E> list;
    
    int count;
    
    /**
     * Constructor for objects of class QuickSort
     */
    public QuickSort(List<E> list)
    {
        this.list = list;
    }

    public List<E> getList()
    {
        return list;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sort()
    {
        qSort(0, list.size()-1);
    }
    
    private void qSort(int start, int end)
    {
        count++;
        if(start >= end)    //is size 1?
            return;
        int p = partition(start, end);
        qSort(start, p-1);
        qSort(p+1, end);
    }
    
    /**
     * @ return pivot position, p
     * Post: All values left of p are < pivotValue, 
     *       All values right of p are >= pivotValue
     */
    private int partition(int start, int end)
    {
        int p = start + (end-start)/2;
        int cmp;
        E pivotValue = list.get(p);
        
        list.set(p, list.get(start));
        p = start;
        list.set(p, pivotValue);
        
        for(int i = start+1; i <= end; i++)
        {
            cmp = pivotValue.compareTo(list.get(i));
            if(cmp > 0)
            {
                list.set(p, list.get(i));
                p++;
                list.set(i, list.get(p));
            }
        }
        list.set(p, pivotValue);
        
        return p;
    }
    
    public int count()
    {
        return count;
    }
}
