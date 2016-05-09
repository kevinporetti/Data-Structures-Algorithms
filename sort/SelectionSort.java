package sort;
import list.*;
import java.lang.*;

/**
 * Write a description of class SelectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionSort<E>
{
    List<E> list;

    public SelectionSort(List<E> list)
    {
        this.list = list;
    }
    
    public void sort()
    {
        for(int p = 0; p < list.size()-1; p++)
            swap(p, posSmallest(p));
    }
    
    private int posSmallest(int start)
    {
        // retunr position of smallest value, beginning @ position start
        int result = start;
        
        for(int i = start; i < list.size(); i++)
            if(((Comparable)(list.get(i))).compareTo((Comparable)(list.get(result))) < 0)
                result = i;
        return result;
    }
    
    private void swap(int x, int y)
    {
        E temp;
        temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }
}
