 

import list.*;

/**
 * Test the List ADT.
 * 
 * @author (sdb) 
 * @version (Jan 2012)
 */
public class DriverFall14_Lab3
{
    public static void main()
    {   
    List <String> names;
    System.out.println ("Testing ListIterarors for ArrayLists");
    testItty (new ArrayList<String> ());
    System.out.println ("\nTesting ListIterarors for LinkedLists");
    testItty (new LinkedList<String> ());
}
   private static void testItty (List<String> names)
   {
   names.add ("jim");
   names.add ("mary");
   names.add ("joe");
   names.add ("sue");
   System.out.println (names);
    
   System.out.println ("Print the list backwards:");
    ListIterator<String> itty = names.listIterator(names.size());
    
    while (itty.hasPrevious())
        System.out.print (itty.previous() + " ");
    System.out.println();
    itty = names.listIterator();            // reset iterator
    System.out.println (itty.next());       // "jim"
    System.out.println (itty.next());       // "mary"
    System.out.println (itty.previous());       // "mary"
    System.out.println (itty.next());       // "mary"
    System.out.println (itty.previous());       // "mary"
    itty.remove();
    System.out.println (names);             // jim, joe, sue
    System.out.println (itty.next());       // "joe"
    System.out.println (itty.next());       // "sue"
    if (itty.hasNext())
        System.out.println ("Not correct");

    }
}
