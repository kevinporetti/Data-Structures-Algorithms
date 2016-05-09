 
import sort.*;
import list.*;
import java.util.Random;

/**
 * Test the HeapSort algorithm.
 * 
 * @author (sdb)  
 * @version (Oct 2014)
 */
public class DriverFall2014
{   static final int MAX = 10;
    
    public static void main()
    {
        Random rand = new Random();         // random number generator
        List <Integer> numbers = new ArrayList <Integer> ();
        HeapSort <Integer> sorter = new HeapSort (numbers);
        
        // Test HeapSort with random input
        for (int i=0; i<MAX; i++)
            numbers.add (rand.nextInt(50));   // random int in [0..49]
        
        System.out.println ("Before sorting:");
        System.out.println (numbers);
        sorter.sort ( );
        System.out.println ("After sorting:");
        System.out.println (numbers);
        
    }
}
