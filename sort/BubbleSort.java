package sort;
import list.*;

/**
 * Arrange a list in ascending order
 * Pre:  The list should be an ArrayList
 * 
 * 1. Let end be the position of the last element
 * 2. Compare neighboring parirs of elements, from first position to end and swap if necessary
 * 3. Repeat step 2, for end-1, until end is poition 1
 * 
 * O(n*(n-1)/2) = O(n^2-n) = O(n^2)
 * 
 * @author Kevin Poretti 
 * @version 10/9/2014
 */
public class BubbleSort<E extends Comparable>
{
    List<E> list;
    
    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort(List<E> list)
    {
        this.list = list;
    }

    /**
     *  
     */
    public void sort()
    {
        int cmp;
        for(int i = 0; i < list.size()-1; i++)
            for(int j = 0; j < list.size()-1-i; j++)
            {
                cmp = list.get(j).compareTo(list.get(j+1));
                if(cmp > 0)
                    swap(j, j+1);
            }
    }
    
    private void swap(int x, int y)
    {
        E temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }
}
