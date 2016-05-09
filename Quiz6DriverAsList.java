 
import set.*;
import list.*;


/**
 * Quiz 6
 * Test the addAll method for sets.
 * 
 * @author (sdb) 
 * @version (Nov 2014)
 */
public class Quiz6DriverAsList
{
    public static void main()
    {
        Set <Integer> grades;
        new TreeSet <Integer> ();
        grades = new HashSet <Integer> ();
        List <Integer> myList;
        
        grades.add (99);
        grades.add (98);
        grades.add (99);
        grades.add(100);
        grades.add (88);
        
        myList = grades.asList();
        System.out.println (myList);
        
        grades = new TreeSet <Integer> ();
        grades.add (99);
        grades.add (98);
        grades.add (99);
        grades.add(100);
        grades.add (88);
        
        myList = grades.asList();
        System.out.println (myList);
         }
}
