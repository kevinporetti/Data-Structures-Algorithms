 
import stack.*;

/**
 * Test the Stack implementation.
 * 
 * @author (sdb 
 * @version (Sep 2014)
 */
public class StackDriver
{
    public static void main()
    {    StackADT <String> names = new Stack<String>();
        names.push ("mary");
        names.push ("joe");
        names.push ("jim");
        names.push ("joe");
        
        System.out.println (names);
        System.out.println (names.peek());      // joe
        System.out.println (names.pop());       // joe
        System.out.println (names);             // mary joe jim
        names.push (names.push (names.push ("al")));            
        System.out.println (names);             // mary joe jim al al al
    }
        
}
