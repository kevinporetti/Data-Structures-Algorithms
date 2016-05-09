 
import hash.*;
import list.*;
import java.io.*;
import java.util.Random;

/**
 * Test the HashTable
 * 
 * @author (sdb) 
 * @version (Mar 2012)
 */
public class HashDriverFall2014
{
    public static void main()
    {   
        HashTable <Integer> nums = new HashTable <Integer> (3);
        
        for (int i=0; i<20; i = i + 2)
                nums.put(i);
                 
        System.out.println (nums.get(16));
        System.out.println (nums.get(15));
        if (!nums.remove(16))
            System.out.println ("Not correct");
        if (nums.remove(16))
            System.out.println ("Not correct");
        
        Iterator <Integer> itty = nums.iterator();
        int tmp;
        while (itty.hasNext())
            {   tmp = itty.next();
                if (tmp > 10)
                    itty.remove();
                else
                    System.out.print (tmp + " ");
             }
        System.out.println ();
        System.out.println (nums.get(6));
        System.out.println (nums.get(5));
        System.out.println ("size is " + nums.size());
        
        nums.clear();
        System.out.println ("Table has been cleared: " + nums);
 
}
  
}
