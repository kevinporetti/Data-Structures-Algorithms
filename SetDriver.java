 
import set.*;
import list.Iterator;

/**
 * Test both TreeSet and HashSet.
 * 
 * @author (sdb) 
 * @version (Nov 2014
 */
public class SetDriver
{
  
    
    public static void main()
    {  
        Set <String> friends = new TreeSet <String> ();
        initialize (friends);
        
        Set <String> relatives = new HashSet <String> ();
        if (! relatives.isEmpty())
            System.out.println ("Not Correct1");
        initialize (relatives);
        if (relatives.isEmpty())
            System.out.println ("Not Correct2");
        System.out.println ("We have " + friends.size() + " friends");
        System.out.println ("We have " + relatives.size() + " relatives");
        System.out.println ("friends are " + friends);
        System.out.println ("relatives are " + relatives);
        
        if (! friends.equals (relatives))
            System.out.println ("Not Correct3");
        if (! relatives.equals (friends))
            System.out.println ("Not Correct4");
        friends.add ("susie");
        if (friends.equals (relatives))
            System.out.println ("Not Correct5");
        if (relatives.equals (friends))
            System.out.println ("Not Correct6");
        if (friends.equals ("oops"))
            System.out.println ("Not Correct7");
    }
    
    
    
    private  static void initialize(Set<String> set)
    {   set.add ("sue");
        set.add ("jim");
        set.add ("sue");
        set.add ("harry");
        set.add ("sue");
        set.add ("mary");
        
    }
}
