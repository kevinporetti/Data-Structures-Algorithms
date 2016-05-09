package airline;


/**
 * Write a description of class Airport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Airport
{
    String name;
    boolean visited = false;
    
    public Airport(String n)
    {
        name = n;
    }
    
    public boolean equals (Object obj)
    {
        if(!(obj instanceof Airport))
            return false;
        Airport a = (Airport) obj;
        
        return name.equals(a.name);
    }
    
    public String toString()
    {
        return name;
    }
}
