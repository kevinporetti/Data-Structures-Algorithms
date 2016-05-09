 
import java.util.*;

/** Maintain email addresses, with aliases.
 * @author (sdb)
 * @author (PUT YOUR NAME HERE)
 */
public class EmailAddresses
{
    private Map <String, Set <String>>  book;

    public EmailAddresses ()
    {  book = new HashMap <String, Set <String>> ();  }

    /** Associate the given alias with the given people */
    public void add (String alias, Set <String> people)
    // Add this entry to the map
    { 
        // PUT YOUR CODE HERE
        book.put(alias, people);
    }

    /** @return All the email addresses corresponding to
      * the given alias, in a Set.
      */
    public Set <String> expandAlias (String alias)
    { 
        Set <String> result = new HashSet<String>();
        Set <String> temp = new HashSet<String>();
       
        if(!book.containsKey(alias))
        {
            temp.add(alias);
            return temp;
        }
        else
        {
            for(String s : book.get(alias))
            {
                result.addAll(expandAlias(s));
            }
        }
        
        return result;
    }
}
