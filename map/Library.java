package map;


/**
 * A Library has a Map in which the keys are Books, 
 * and the values are Integers.  The value indicates 
 * the number of times the Book has been borrowed.  The 
 * Library should have a method named 'borrow' which 
 * allows a client to tell the Library that a given 
 * book is being borrowed
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Library
{
    Map<Book, Integer> library = new TreeMap<Book, Integer>();

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
    }

    /** The given Book is being borrowed; update its entry in the Map */
    public void borrow(Book b)
    {
        int timesBorrowed = 0;
        if(!(library.containsKey(b)))
            library.put(b, 1);
        else
        {
            timesBorrowed = library.get(b);
            timesBorrowed++;
            library.put(b, timesBorrowed);
        }
    }
    
    public String toString()
    {
        return library.toString();
    }
}
