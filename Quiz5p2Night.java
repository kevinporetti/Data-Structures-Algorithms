 
import tree.*;
import list.Iterator;


/**
 * Quiz 5 Problem 2
 * ReverseTreeIterator
 * 
 * @author (sdb) 
 
 */
public class Quiz5p2Night
{
    public static void main()
    {   BinaryTree <String> zoo = new EmptyBinarySearchTree <String> ();
        
        zoo = zoo.add ("moose");
        zoo = zoo.add ("donkey");
        zoo = zoo.add ("orangutan");
        zoo = zoo.add ("monkey");
        
        Iterator<String> itty = zoo.iteratorReverse();
        while (itty.hasNext())
            System.out.print (itty.next() + " ");
          
            
        System.out.println ('\n');
        
        itty = zoo.iteratorReverse();
        while (itty.hasNext())
            if (itty.next().equals ("moose"))
                    itty.remove();
        
       
        System.out.println ("zoo is: " + zoo);
    
    
    }
}
