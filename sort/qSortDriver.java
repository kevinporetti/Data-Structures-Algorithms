package sort;
import list.*;

/**
 * Write a description of class qSortDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class qSortDriver
{
    public static void main()
    {
        ArrayList <Integer> list = new ArrayList <Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        
        QuickSort<Integer> quickSort = new QuickSort<Integer>(list);
        quickSort.sort();
        System.out.println(quickSort.list);
        System.out.println(quickSort.count);
    }
}
